using SCI_Translator.Compression;
using SCI_Translator.Decompression;
using System;
using System.Collections.Generic;
using System.IO;

namespace SCI_Translator.Resources
{
    public class Resource
    {
        private ResourceFileInfo _info;

        public void Init(SCIPackage package, ResType type, ushort number, byte resNum, int offset)
        {
            Package = package;
            Type = type;
            Number = number;
            Resources.Add(new ResOffset { Num = resNum, Offset = offset });
        }

        public void Init(SCIPackage package, ResType type, ushort number, byte resNum, ResourceFileInfo info)
        {
            Package = package;
            Type = type;
            Number = number;
            Resources.Add(new ResOffset { Num = resNum, Offset = -1 });
            _info = info;
        }

        public SCIPackage Package { get; private set; }

        public GameEncoding GameEncoding => Package.GameEncoding;

        public ResType Type { get; private set; }

        public ushort Number { get; private set; }

        public struct ResOffset
        {
            public byte Num;
            public int Offset;

            public string FileName => $"RESOURCE.{Num:D3}";
        }

        public List<ResOffset> Resources { get; } = new List<ResOffset>();

        public string FileName => Package.GetResFileName(this);

        public string TranslateDir => Package.TranslateDirectory;

        public ResourceFileInfo GetInfo() => _info ?? (_info = Package.LoadResourceInfo(Resources[0].FileName, Resources[0].Offset));

        public override string ToString() => FileName;

        public byte[] GetContent(bool translated)
        {
            if (translated)
            {
                return ReadContent(TranslateDir);
            }
            else
            {
                return ReadContent(Package.GameDirectory);
            }
        }


        private byte[] ReadContent(string dir)
        {
            var info = GetInfo();
            var path = Path.Combine(dir, FileName);
            if (File.Exists(path)) // Если есть внешний файл, используем его
            {
                using (FileStream fs = File.OpenRead(path))
                {
                    fs.Seek(1, SeekOrigin.Current);
                    var second = fs.ReadB();
                    int offset = GetResourceOffsetInFile(second);
                    fs.Seek(offset, SeekOrigin.Current);

                    byte[] data = new byte[fs.Length - fs.Position];
                    fs.Read(data, 0, data.Length);
                    return data;
                }
            }

            var resOff = Resources[0];

            using (FileStream fs = File.OpenRead(Path.Combine(dir, resOff.FileName)))
            {
                fs.Position = resOff.Offset + info.HeadSize;

                if (info.Method == 0) // Uncompressed
                {
                    byte[] data = new byte[info.DecompSize];
                    fs.Read(data, 0, data.Length);
                    return data;
                }
                else
                {
                    Decompressor decomp = info.GetDecompressor();
                    return decomp.Unpack(fs, info.CompSize, info.DecompSize);
                }
            }
        }

        public static int GetResourceOffsetInFile(byte secondHeaderByte)
        {
            // The upper byte appears to indicate where the data starts.
            // Some isolated resource files have random data stuffed at the beginning (e.g. name and such)

            // In SQ5 though, we need to special case:
            if ((secondHeaderByte & 0x80) != 0)
            {
                switch (secondHeaderByte & 0x7f)
                {
                    case 0:
                        return 24;
                    case 1:
                        return 2;
                    case 4:
                        return 8;
                }
            }
            return secondHeaderByte;
        }

        public byte[] GetCompressed()
        {
            var info = GetInfo();

            var resOff = Resources[0];

            byte[] data = new byte[info.CompSize];
            using (FileStream fs = File.OpenRead(Path.Combine(Package.GameDirectory, resOff.FileName)))
            {
                fs.Position = resOff.Offset + info.HeadSize;
                fs.Read(data, 0, data.Length);
            }
            return data;
        }

        public void Translate(string en, string tr)
        {
            var sources = GetStrings(false);
            if (sources == null)
                throw new NotImplementedException();

            var translates = GetStrings(true);

            for (int i = 0; i < sources.Length; i++)
            {
                if (sources[i] == en)
                {
                    translates[i] = tr;
                }
            }

            SetTranslate(translates);
        }

        public void SaveTranslate(byte[] data)
        {
            var lower = Path.Combine(TranslateDir, FileName.ToLower());
            if (File.Exists(lower))
                File.Delete(lower);

            using (FileStream fs = File.Create(Path.Combine(TranslateDir, FileName)))
            {
                Save(fs, data);
            }
        }

        public byte[] Export(bool translate = false)
        {
            var data = GetContent(translate);

            MemoryStream mem = new MemoryStream();
            Save(mem, data);
            return mem.ToArray();
        }

        private void Save(Stream stream, byte[] data)
        {
            stream.WriteByte((byte)Type);
            stream.WriteByte(0);
            stream.Write(data, 0, data.Length);
        }

        public virtual string[] GetStrings(bool translate)
        {
            return null;
        }

        public virtual void SetTranslate(string[] strings)
        {
            throw new NotImplementedException();
        }

        public void Pack(Stream stream, byte resNum)
        {
            var info = GetInfo();
            var path = Path.Combine(Package.GameDirectory, FileName);

            var begin = stream.Position;
            stream.Seek(info.HeadSize, SeekOrigin.Current);

            var ri = Resources.FindIndex(r => r.Num == resNum);
            var res = Resources[ri];

            if (!File.Exists(path)) // Файл не был распакован, считываем запакованный и так же складываем
            {
                var data = GetCompressed();
                stream.Write(data, 0, data.Length);
            }
            else
            {
                byte[] data = ReadContent(Package.GameDirectory);

                if (info.Method != 0)
                {
                    Compressor comp = info.GetCompressor();
                    int size = comp.Pack(data, stream);

                    info.DecompSize = (ushort)data.Length;
                    info.CompSize = (ushort)size;
                }
                else
                {
                    stream.Write(data, 0, data.Length);
                }
            }

            Resources[ri] = new ResOffset { Num = resNum, Offset = (int)begin };

            var end = stream.Position;
            stream.Seek(begin, SeekOrigin.Begin);
            info.Write(stream);
            stream.Seek(end, SeekOrigin.Begin);
        }
    }
}
