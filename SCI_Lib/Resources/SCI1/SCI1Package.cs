using SCI_Translator.Resources;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;

namespace SCI_Translator.Resources.SCI1
{
    public class SCI1Package : SCIPackage
    {
        public SCI1Package(string directory, string translate, Encoding enc)
            : base(directory, translate, enc)
        {
        }

        class ResMapOffset
        {
            public ResMapOffset(ResType type, ushort offset)
            {
                Type = type;
                Offset = offset;
            }

            public ResType Type { get; set; }

            public ushort Offset { get; set; }

            public int RecordsCount { get; set; }
        }

        bool? _isSCI_11;


        // https://wiki.scummvm.org/index.php?title=SCI/Specifications/Resource_files/SCI1_resources
        // http://sci.sierrahelp.com/Documentation/SCISpecifications/09-SCI1Resources.html
        protected override void ReadMap(FileStream fs)
        {
            if (!_isSCI_11.HasValue)
                DetectVersion(fs);

            fs.Position = 0;

            List<ResMapOffset> offsets = new List<ResMapOffset>();
            int entriesSize = _isSCI_11.Value ? 5 : 6;

            ResMapOffset off = null;
            while (true)
            {
                int t = fs.ReadByte();
                if ((t < 0x80 || t > 0x91) && t != 0xff)
                    throw new FormatException("Wrong format");

                ResType type = (ResType)t;
                ushort offset = fs.ReadUShortBE();
                if (off != null) off.RecordsCount = (offset - off.Offset) / entriesSize; // Высчитываем количество записей исходя из границ блоков

                if (type == ResType.End) break;

                off = new ResMapOffset(type, offset);

                offsets.Add(off);
            }

            for (int i = 0; i < offsets.Count; i++)
            {
                fs.Position = offsets[i].Offset;
                for (int j = 0; j < offsets[i].RecordsCount; j++)
                {
                    ushort num = fs.ReadUShortBE();
                    int offset;
                    byte resNum = 0;

                    if (_isSCI_11.Value)
                    {
                        offset = fs.ReadUShortBE();
                        offset |= fs.ReadByte() << 16;
                        offset <<= 1;
                    }
                    else
                    {
                        int address = fs.ReadIntBE();
                        resNum = (byte)((address >> 28) & 0x0F);
                        offset = address & 0x0FFFFFFF;
                    }

                    //Console.WriteLine($"{num,6} {offset:X08} {offsets[i].Type} {resNum}");

                    var ex = Resources.Find(r => r.Type == offsets[i].Type && r.Number == num);
                    if (ex != null)
                    {
                        ex.Volumes.Add(new Resource.VolumeOffset { Num = resNum, Offset = offset });
                    }
                    else
                    {
                        Resource res = CreateRes(offsets[i].Type);
                        res.Init(this, offsets[i].Type, num, resNum, offset);
                        Resources.Add(res);
                    }
                }
            }

            var allFiles = Directory.GetFiles(GameDirectory).Select(f => Path.GetFileName(f)).Select(f => f.ToUpper());
            foreach (ResType rt in Enum.GetValues(typeof(ResType)))
            {
                if ((byte)rt < 0x80 || (byte)rt > 0x91)
                    continue;

                var ext = GetExtension(rt);

                foreach (var f in allFiles.Where(f => f.EndsWith("." + ext)))
                {
                    if (!ushort.TryParse(Path.GetFileNameWithoutExtension(f), out var num))
                        continue;

                    if (GetResouce(f) == null)
                    {
                        ushort method = 0;
                        byte resNum = 0;

                        var first = Resources.FirstOrDefault(r => r.Type == rt);
                        if (first != null)
                        {
                            method = first.GetInfo().Method;
                            resNum = first.Volumes[0].Num;
                        }

                        var info = new ResourceFileInfo1((byte)rt, num, method);
                        var res = CreateRes(rt);
                        res.Init(this, rt, num, resNum, info);
                        Resources.Add(res);
                    }
                }
            }
        }

        private void DetectVersion(FileStream fs)
        {
            int t = fs.ReadByte();
            if ((t < 0x80 || t > 0x91) && t != 0xff)
                throw new FormatException("Wrong format");

            var offset = fs.ReadUShortBE();

            fs.Position = offset;

            var num1 = fs.ReadUShortBE();
            fs.Position += 3;
            var num2 = fs.ReadUShortBE();

            if (num1 == num2 - 1)
            {
                _isSCI_11 = true;
                return;
            }

            fs.Position = offset + 6;
            num2 = fs.ReadUShortBE();
            if (num1 == num2 - 1)
            {
                _isSCI_11 = false;
                return;
            }

            throw new FormatException("Unknown format");
        }

        const bool SAVE_MAP_DEBUG = false;

        protected override void SaveMap(FileStream fs)
        {
            var byType = Resources.GroupBy(r => r.Type);

            fs.Seek((byType.Count() + 1) * 3, SeekOrigin.Begin);

            ushort offset;
            int i = 0;
            foreach (var gr in byType)
            {
                offset = (ushort)fs.Position;
                if (SAVE_MAP_DEBUG) Console.WriteLine($"{gr.Key} {(byte)gr.Key:X2} {gr.Count()}");

                foreach (var r in gr)
                {
                    foreach (var resOffset in r.Volumes)
                    {
                        if (SAVE_MAP_DEBUG) Console.WriteLine($"{fs.Position:X4} > {r}  {r.Number} {resOffset.Offset:X4} {resOffset.Num}");
                        fs.WriteUShortBE(r.Number);
                        fs.WriteUIntBE((uint)(resOffset.Offset | (resOffset.Num << 28)));
                    }
                }

                var pos = fs.Position;

                fs.Seek(i * 3, SeekOrigin.Begin);
                if (SAVE_MAP_DEBUG) Console.WriteLine($"{fs.Position:X4} > {(byte)gr.Key:X2}  {offset:X4}");

                fs.WriteByte((byte)gr.Key);
                fs.WriteUShortBE(offset);

                fs.Seek(pos, SeekOrigin.Begin);
                i++;
            }
            offset = (ushort)fs.Position;

            fs.Seek(i * 3, SeekOrigin.Begin);
            if (SAVE_MAP_DEBUG) Console.WriteLine($"{fs.Position:X4} > 0xff  {offset:X4}");
            fs.WriteByte(0xff);
            fs.WriteUShortBE(offset);
        }

        public override ResourceFileInfo LoadResourceInfo(string resourceFileName, int offset)
        {
            return new ResourceFileInfo1(Path.Combine(GameDirectory, resourceFileName), offset);
        }

        public override string GetResFileName(Resource resource) => $"{resource.Number}.{GetExtension(resource.Type)}";

        private static string GetExtension(ResType type)
        {
            switch (type)
            {
                case ResType.View: return "V56";
                case ResType.Picture: return "P56";
                case ResType.Script: return "SCR";
                case ResType.Text: return "TEX";
                case ResType.Sound: return "SND";
                case ResType.Vocabulary: return "VOC";
                case ResType.Font: return "FON";
                case ResType.Cursor: return "CUR";
                case ResType.AudioPath: return "PAT";
                case ResType.Bitmap: return "BIT";
                case ResType.Palette: return "PAL";
                case ResType.CDAudio: return "CDA";
                case ResType.Audio: return "AUD";
                case ResType.Sync: return "SYN";
                case ResType.Message: return "MSG";
                case ResType.Map: return "MAP";
                case ResType.Heap: return "HEP";
                //case ResType.Patch: return "PAT";
                default: throw new NotImplementedException();
            }
        }

    }
}
