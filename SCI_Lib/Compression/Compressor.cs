using System.IO;

namespace SCI_Translator.Compression
{
    public abstract class Compressor
    {
        public static bool DEBUG = false;
   
        protected byte[] _data;
        protected Stream _stream;

        public int Pack(byte[] data, Stream stream)
        {
            var start = stream.Position;
            _data = data;
            _stream = stream;
            GoPack();

            return (int)(stream.Position - start);
        }

        protected abstract void GoPack();
    }
}
