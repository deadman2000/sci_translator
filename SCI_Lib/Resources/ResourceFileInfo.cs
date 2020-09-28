using SCI_Translator.Compression;
using SCI_Translator.Decompression;
using System;

namespace SCI_Translator.Resources
{
    public abstract class ResourceFileInfo
    {
        public int ResT { get; protected set; }

        public int ResNr { get; protected set; }

        public int CompSize { get; set; }

        public int DecompSize { get; set; }

        public int Method { get; protected set; }

        public abstract int HeadSize { get; }

        public override string ToString() => String.Format("res_t:{0:X2} res_nr:{1} comp_size:{2} decomp_size:{3} method:{4}", ResT, ResNr, CompSize, DecompSize, Method);

        public abstract Decompressor GetDecompressor();

        public abstract Compressor GetCompressor();
    }
}
