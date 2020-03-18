using SCI_Translator.Decompression;
using System;
using System.IO;

namespace SCI_Translator.Resources.SCI1
{
    public class ResourceFileInfo1 : ResourceFileInfo
    {
        public ResourceFileInfo1(string path, int offset)
        {
            using (FileStream fs = File.OpenRead(path))
            {
                fs.Position = offset;
                ResT = (byte)fs.ReadByte();
                ResNr = fs.ReadUShortBE();
                CompSize = fs.ReadUShortBE();
                DecompSize = fs.ReadUShortBE();
                Method = fs.ReadUShortBE();
            }
        }

        public override int HeadSize => 9;

        public override Decompressor GetDecompressor()
        {
            switch (Method)
            {
                case 2:
                case 3: return Decompressor.LZW1;
                default: throw new NotImplementedException();
            }
        }
    }
}
