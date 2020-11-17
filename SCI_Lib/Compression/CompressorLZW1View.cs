using System.IO;

namespace SCI_Translator.Compression
{
    class CompressorLZW1View : CompressorLZW1
    {
        public override void Pack(byte[] data, Stream stream)
        {
            base.Pack(ViewEncoder.EncodeView(data), stream);
        }
    }
}
