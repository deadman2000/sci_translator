using NUnit.Framework;
using SCI_Translator.Resources;
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using System.Threading.Tasks;

namespace Tests
{
    class CompressTest
    {
        [Test]
        public void CompressConquest()
        {
            CheckCompress(Utils.ConquestPath);
        }

        private void CheckCompress(string mapPath)
        {
            var package = SCIPackage.Load(mapPath);

            //var r = package.GetResouce("95.p56");
            foreach (var r in package.Resources)
            {
                //if (r.Type == ResType.View || r.Type == ResType.Picture) continue; // Unsupported
                var info = r.GetInfo();

                if (info.Method != 2) continue;

                var unpack = r.GetContent(false);

                var mem = new MemoryStream();
                info.GetCompressor().Pack(unpack, mem);
                var compressed = mem.ToArray();

                var uncompressed = info.GetDecompressor().Unpack(new MemoryStream(compressed), compressed.Length, unpack.Length);

                //Assert.IsTrue(compressed.Length <= orig.Length, $"Decompress error in {r.FileName}");
                //Array.Resize(ref orig, compressed.Length);

                Assert.AreEqual(unpack, uncompressed, $"Decompress error in {r.FileName}");
            }
        }
    }
}
