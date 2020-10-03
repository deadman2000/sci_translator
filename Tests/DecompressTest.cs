using NUnit.Framework;
using SCI_Translator.Resources;
using System;
using System.IO;
using System.Threading.Tasks;

namespace Tests
{
    public class DecompressTest
    {
        const string ASSETS = "../../../../assets";

        [Test]
        public async Task DecompressQG_VGA()
        {
            await CheckDecompress(Path.Combine(ASSETS, "QG_VGA"), Path.Combine(ASSETS, "QG_VGA_res"));
        }

        [Test]
        public async Task DecompressConquest()
        {
            await CheckDecompress(Utils.ConquestPath, Path.Combine(ASSETS, "Conquest_res"));
        }

        private async Task CheckDecompress(string mapPath, string uncompDir)
        {
            var package = SCIPackage.Load(mapPath);
            foreach (var r in package.Resources)
            {
                if (r.Type == ResType.Picture) continue; // Unsupported

                var unpack = r.GetContent(false);

                var filePath = Path.Combine(uncompDir, r.FileName);
                var target = await File.ReadAllBytesAsync(filePath);

                int offset = Resource.GetResourceOffsetInFile(target[1]);

                // Первые 2 байта - тип ресурса
                var trimmed = new byte[target.Length - 2 - offset];
                Array.Copy(target, 2 + offset, trimmed, 0, trimmed.Length);

                Assert.AreEqual(trimmed, unpack, $"Decompress error in {r.FileName}");
            }
        }
    }
}
