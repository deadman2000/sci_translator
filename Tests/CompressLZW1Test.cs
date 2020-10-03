using NUnit.Framework;
using SCI_Translator.Resources;
using System;
using System.IO;

namespace Tests
{
    class CompressLZW1Test
    {
        [Test]
        public void SuccessUncompress()
        {
            var package = Utils.LoadPackage();

            //var r = package.GetResouce("95.p56");
            foreach (var r in package.Resources)
            {
                var info = r.GetInfo();

                if (info.Method != 2 && info.Method != 3 && info.Method != 4) continue;

                var unpack = r.GetContent(false);

                var mem = new MemoryStream();
                info.GetCompressor().Pack(unpack, mem);
                var compressed = mem.ToArray();

                var uncompressed = info.GetDecompressor().Unpack(new MemoryStream(compressed), compressed.Length, unpack.Length);

                Assert.AreEqual(unpack, uncompressed, $"Decompress error in {r.FileName}");
            }
        }

        //[Test]
        public void CompressedEqual()
        {
            var package = Utils.LoadPackage();

            //var r = package.GetResouce("95.p56");
            foreach (var r in package.Resources)
            {
                var info = r.GetInfo();

                if (info.Method != 2 && info.Method != 3 && info.Method != 4) continue;

                var orig = r.GetCompressed();

                var mem = new MemoryStream();
                info.GetCompressor().Pack(r.GetContent(false), mem);
                var compressed = mem.ToArray();

                Assert.IsTrue(compressed.Length <= orig.Length, $"Decompress error in {r.FileName}");
                Array.Resize(ref orig, compressed.Length);

                Assert.AreEqual(orig, compressed, $"Decompress error in {r.FileName}");
            }
        }
    }
}
