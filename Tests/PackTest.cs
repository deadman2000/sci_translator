using NUnit.Framework;
using SCI_Translator.Resources;
using System;
using System.IO;

namespace Tests
{
    class PackTest
    {
        string tmp;

        [SetUp]
        public void Setup()
        {
            tmp = Path.Combine(Path.GetTempPath(), Guid.NewGuid().ToString());
            Console.WriteLine(tmp);
            Directory.CreateDirectory(tmp);
        }

        [Test]
        public void Pack()
        {
            var package = Utils.LoadPackage();
            package.Pack(tmp);

            package = Utils.LoadPackage();
            var packed = SCIPackage.Load(tmp);

            foreach (var r in package.Resources)
            {
                var r2 = packed.GetResouce(r.FileName);
                Assert.IsNotNull(r2);

                Assert.AreEqual(r.Number, r2.Number, $"{r.FileName}");

                var i = r.GetInfo();
                var i2 = r2.GetInfo();

                Assert.AreEqual(i.ResT, i2.ResT, $"{r.FileName}");
                Assert.AreEqual(i.ResNr, i2.ResNr, $"{r.FileName}");
                Assert.AreEqual(i.Method, i2.Method, $"{r.FileName}");
                //Assert.AreEqual(i.DecompSize, i2.DecompSize, $"{r.FileName}");

                var data = r.GetContent(false);
                var data2 = r2.GetContent(false);

                Assert.AreEqual(data, data2, $"{r.FileName}");
            }
        }

        [TearDown]
        public void CleanUp()
        {
            Directory.Delete(tmp, true);
        }
    }
}
