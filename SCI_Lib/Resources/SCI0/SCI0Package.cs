using System;
using System.IO;

namespace SCI_Translator.Resources.SCI0
{
    public class SCI0Package : SCIPackage
    {
        public SCI0Package(string directory, string translate = null)
            : base(directory, translate)
        {
        }

        static ResType[] SCI0_ResMap = new ResType[] {
            ResType.View, ResType.Picture, ResType.Script, ResType.Text,      // 0x00-0x03
            ResType.Sound, ResType.Memory, ResType.Vocabulary, ResType.Font,  // 0x04-0x07
            ResType.Cursor, ResType.Patch, ResType.Bitmap, ResType.Palette,   // 0x08-0x0B
            ResType.CDAudio, ResType.Audio, ResType.Sync, ResType.Message,    // 0x0C-0x0F
            ResType.Map, ResType.Heap, ResType.Audio36, ResType.Sync36,       // 0x10-0x13
            ResType.Translation, ResType.Rave                                 // 0x14-0x15
        };

        // https://wiki.scummvm.org/index.php?title=SCI/Specifications/Resource_files/SCI0_resources
        // http://sci.sierrahelp.com/Documentation/SCISpecifications/08-ResourceFiles.html
        // https://github.com/scummvm/scummvm/blob/master/engines/sci/resource.cpp#L1779
        protected override void ReadMap(FileStream fs)
        {
            while (true)
            {
                ushort typeNum = fs.ReadUShortBE();
                uint fnOffset = fs.ReadUIntBE();
                if (typeNum == 0xffff && fnOffset == 0xffffffff) break;

                var type = SCI0_ResMap[typeNum >> 11];
                var num =(ushort)(typeNum & 0x7ff);
                var resNum = (byte)(fnOffset >> 26);
                var offset = (int)(fnOffset & 0x3ffffff);

                var res = LoadRes(type);
                res.Load(this, type, num, resNum, offset);
                Resources.Add(res);
            }
        }

        public override ResourceFileInfo LoadResourceInfo(string resourceFileName, int offset)
        {
            return new ResourceFileInfo0(Path.Combine(GameDirectory, resourceFileName), offset);
        }

        public override string GetResFileName(Resource resource) => $"{GetResName(resource.Type)}.{resource.Number:D3}";

        private string GetResName(ResType type)
        {
            switch (type)
            {
                case ResType.View: return "view";
                case ResType.Picture: return "pic";
                case ResType.Script: return "script";
                case ResType.Text: return "text";
                case ResType.Sound: return "sound";
                case ResType.Vocabulary: return "vocab";
                case ResType.Font: return "font";
                case ResType.Cursor: return "cursor";
                case ResType.Patch: return "patch";
                default: throw new NotImplementedException();
            }
        }
    }
}
