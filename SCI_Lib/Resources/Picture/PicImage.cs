using System;
using System.IO;

namespace SCI_Translator.Resources.Picture
{
    class PicImage : PicExtCommand
    {
        private PointShort _coord;
        private byte _transpCol;

        public ushort Width { get; set; }
        public ushort Height { get; set; }
        public byte[] Image { get; set; }

        private static bool LOG = false;

        public PicImage(Stream stream) : base(0x01)
        {
            _coord = stream.ReadPicAbsCoord();
            ushort size = stream.ReadUShortBE();
            var startPos = stream.Position;

            Width = stream.ReadUShortBE();
            Height = stream.ReadUShortBE();
            stream.Seek(2, SeekOrigin.Current);
            _transpCol = stream.ReadB();
            stream.Seek(1, SeekOrigin.Current);

            Image = new byte[Width * Height];

            ReadImageData(stream);
            var readSize = stream.Position - startPos;

            if (size != readSize)
                throw new FormatException();
        }

        private void ReadImageData(Stream stream)
        {
            int ind = 0;
            int addCount = 0;
            while (ind < Image.Length)
            {
                var d = stream.ReadB();
                var cnt = (d & 0x3f) + addCount; // 2 бита - код, 6 - количество
                var code = d >> 6;
                if (LOG) Console.Write($"{code} x{cnt} ");

                switch (code)
                {
                    case 0: // Разные пиксели
                        if (LOG) Console.Write("[");
                        for (var i = 0; i < cnt; i++)
                        {
                            Image[ind + i] = stream.ReadB();
                            if (LOG) Console.Write($"{Image[ind + i]:X2} ");
                        }
                        ind += cnt;
                        addCount = 0;
                        if (LOG) Console.WriteLine("]");
                        break;

                    case 1: // Увеличиваем счетчик
                        addCount += 64;
                        if (LOG) Console.WriteLine();
                        break;

                    case 2: // Одинаковые пиксели подряд
                        var c = stream.ReadB();
                        if (LOG) Console.WriteLine($"{c:X2}");
                        for (var i = 0; i < cnt; i++)
                            Image[ind + i] = c;
                        ind += cnt;
                        addCount = 0;
                        break;

                    case 3: // Прозрачные пиксели подряд
                        if (LOG) Console.WriteLine("T");
                        for (var i = 0; i < cnt; i++)
                            Image[ind + i] = _transpCol;
                        ind += cnt;
                        addCount = 0;
                        break;

                    default:
                        throw new NotImplementedException($"Image code {code:X2} not implemented");
                }
            }
        }

        protected override void WriteExt(ByteBuilder bb)
        {
            bb.WritePicAbsCoord(ref _coord);
            var sizePos = bb.Position;
            bb.AddShortBE(0); // Потом вернемся, чтобы записать размер данных

            bb.AddShortBE(Width);
            bb.AddShortBE(Height);
            bb.AddShortBE(0);
            bb.AddByte(_transpCol);
            bb.AddByte(0);
            WriteImageData(bb);

            var endPos = bb.Position;
            var size = (ushort)(endPos - sizePos - 2);

            bb.SetShortBE(sizePos, size);
        }

        static bool USE_ADD_COUNT = false;

        private void WriteImageData(ByteBuilder bb)
        {
            for (int i = 0; i < Image.Length; i++) // Current pixel
            {
                var curr = Image[i];

                if (i + 1 < Image.Length) // Это не последний пиксель 
                {
                    if (Image[i + 1] == curr) // ... и есть повторения
                    {
                        var end = i + 1;
                        while (end + 1 < Image.Length && Image[end + 1] == curr && (USE_ADD_COUNT || end - i + 1 < 0x3f)) end++; // Двигаемся вперед пока пиксели совпадают
                        // На выходе end - указатель на последний повторяющийся пиксель, который мы будем записывать

                        int cnt = end - i + 1;

                        if (end >= Image.Length)
                            throw new Exception();

                        if (curr == _transpCol)
                        {
                            WriteCode(bb, 3, cnt);
                            if (LOG) Console.WriteLine("T");
                        }
                        else
                        {
                            WriteCode(bb, 2, cnt);
                            bb.AddByte(curr);
                            if (LOG) Console.WriteLine($"{curr:X}");
                        }

                        i = end;
                    }
                    else // ... пиксели разные
                    {
                        // Ищем количество неповторений
                        // Двигаемся вперед пока пиксели меняются
                        var end = i + 1;
                        int cnt = 2;
                        while (end + 1 < Image.Length
                            //&& (end + 2 == Image.Length - 1 || Image[end + 2] != Image[end + 1]) // Мы на краю или следующий пиксель другой
                            && (!IsEquals(end + 1, cnt < 3 ? 2 : 3))
                            && (USE_ADD_COUNT || end - i + 1 < 0x3f))
                        {
                            end++;
                            cnt++;
                        }

                        WriteCode(bb, 0, cnt);
                        if (LOG) Console.Write("[");
                        for (int n = i; n <= end; n++)
                        {
                            bb.AddByte(Image[n]);
                            if (LOG) Console.Write($"{Image[n]:X2} ");
                        }
                        if (LOG) Console.WriteLine("]");

                        i = end;
                    }
                }
                else // Последний пиксель
                {
                    WriteCode(bb, 0, 1);
                    bb.AddByte(curr);
                }
            }
        }

        private void WriteCode(ByteBuilder bb, int code, int count)
        {
            if (LOG) Console.Write($"{code} x{count} ");
            while (count > 0x3f)
            {
                bb.AddByte(0x40);
                count -= 64;
            }
            bb.AddByte((byte)((code << 6) | count));
        }

        /// <summary>
        /// Возвращает true, если с указанного индекса идут count одинаковых пикселей
        /// </summary>
        /// <param name="index"></param>
        /// <param name="count"></param>
        /// <returns></returns>
        private bool IsEquals(int index, int count)
        {
            if (index + count >= Image.Length) return false;
            var c = Image[index];
            for (int i = index + 1; i < index + count; i++)
                if (Image[i] != c) return false;

            return true;
        }

        public byte[] GetBytes()
        {
            ByteBuilder bb = new ByteBuilder();
            WriteExt(bb);
            return bb.GetArray();
        }
    }
}
