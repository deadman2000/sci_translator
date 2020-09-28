﻿using SCI_Translator.Compression;
using SCI_Translator.Decompression;
using System;
using System.IO;

namespace SCI_Translator.Resources.SCI0
{
    public class ResourceFileInfo0 : ResourceFileInfo
    {
        public ResourceFileInfo0(string path, int offset)
        {
            using (FileStream fs = File.OpenRead(path))
            {
                fs.Position = offset;
                var id = fs.ReadUShortBE();
                ResT = id >> 11;
                ResNr = id & 0x7ff;
                CompSize = fs.ReadUShortBE();
                DecompSize = fs.ReadUShortBE();
                Method = fs.ReadUShortBE();
            }
        }

        public override int HeadSize => 8;

        public override Decompressor GetDecompressor()
        {
            switch (Method)
            {
                case 1: return new DecompressorLZW0();
                case 2: return new DecompressorHuffman();
                default: throw new NotImplementedException();
            }
        }

        public override Compressor GetCompressor()
        {
            switch (Method)
            {
                case 1: return new CompressorLZW0();
                case 2: return new CompressorHuffman();
                default: throw new NotImplementedException();
            }
        }
    }
}
