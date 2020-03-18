using SCI_Translator.Resources;
using System;
using System.Collections.Generic;
using System.IO;

namespace SCI_Translator.Resources.SCI1
{
    public class SCI1Package : SCIPackage
    {
        public SCI1Package(string directory, string translate = null)
            : base(directory, translate)
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


        const bool SCI_11 = false;
        int EntriesSize = SCI_11 ? 5 : 6;

        // https://wiki.scummvm.org/index.php?title=SCI/Specifications/Resource_files/SCI1_resources
        // http://sci.sierrahelp.com/Documentation/SCISpecifications/09-SCI1Resources.html
        protected override void ReadMap(FileStream fs)
        {
            List<ResMapOffset> offsets = new List<ResMapOffset>();

            ResMapOffset off = null;
            while (true)
            {
                int t = fs.ReadByte();
                if ((t < 0x80 || t > 0x91) && t != 0xff)
                    throw new Exception("Wrong format");

                ResType type = (ResType)t;
                ushort offset = fs.ReadUShortBE();
                if (off != null) off.RecordsCount = (offset - off.Offset) / EntriesSize; // Высчитываем количество записей исходя из границ блоков

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

                    if (SCI_11)
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

                    Resource res = LoadRes(offsets[i].Type);
                    res.Load(this, offsets[i].Type, num, resNum, offset);
                    Resources.Add(res);
                }
            }
        }

        private Resource LoadRes(ResType type)
        {
            switch (type)
            {
                case ResType.Text: return new ResText();
                case ResType.Vocabulary: return new ResVocab();
                case ResType.Script: return new ResScript1();
                case ResType.Font: return new ResFont();
                case ResType.Message: return new ResMessage();
                default: return new Resource();
            }
        }

        public override ResourceFileInfo LoadResourceInfo(string resourceFileName, int offset)
        {
            return new ResourceFileInfo1(Path.Combine(GameDirectory, resourceFileName), offset);
        }

        public override string GetResFileName(Resource resource) => $"{resource.Number}.{GetExtension(resource.Type)}";

        private string GetExtension(ResType type)
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
                case ResType.Patch: return "PAT";
                default: throw new NotImplementedException();
            }
        }
    }
}
