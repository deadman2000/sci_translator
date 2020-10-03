using SCI_Translator.Compression;
using SCI_Translator.Decompression;
using System;
using System.IO;

namespace SCI_Translator.Resources
{
    public abstract class ResourceFileInfo
    {
        public byte ResT { get; protected set; }

        public ushort ResNr { get; protected set; }

        public ushort CompSize { get; set; }

        public ushort DecompSize { get; set; }

        public ushort Method { get; protected set; }

        public abstract int HeadSize { get; }

        public override string ToString() => String.Format("res_t:{0:X2} res_nr:{1} comp_size:{2} decomp_size:{3} method:{4}", ResT, ResNr, CompSize, DecompSize, Method);

        public abstract Decompressor GetDecompressor();

        public abstract Compressor GetCompressor();

        public abstract void Write(Stream stream);

    }
}
