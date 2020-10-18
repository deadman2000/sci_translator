using SCI_Translator.Decompression;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SCI_Translator.Compression
{
    class CompressorLZW1View : CompressorLZW1
    {
        public override int Pack(byte[] data, Stream stream)
        {
            var mem = new MemoryStream();
            _stream = mem;
            _data = data;
            GoPack();

            var encoded = ViewReorder.EncodeView(mem.ToArray());

            var start = stream.Position;
            stream.Write(encoded, 0, encoded.Length);
            return (int)(stream.Position - start);
        }
    }
}
