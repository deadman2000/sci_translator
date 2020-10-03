using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using SCI_Translator;

namespace Tests
{
    class StreamTest
    {
        [Test]
        public void IntTest()
        {
            const int V = 0x01020304;

            MemoryStream mem = new MemoryStream();
            mem.WriteIntBE(V);

            mem.Position = 0;
            var val = mem.ReadIntBE();

            Assert.AreEqual(V, val);
        }

        [Test]
        public void UShortBETest()
        {
            MemoryStream mem = new MemoryStream();
            mem.WriteUShortBE(1);

            mem.Position = 0;
            var val = mem.ReadUShortBE();

            Assert.AreEqual(1, val);
        }

        [Test]
        public void UShortLETest()
        {
            MemoryStream mem = new MemoryStream();
            mem.WriteUShortLE(1);

            mem.Position = 0;
            var val = mem.ReadUShortLE();

            Assert.AreEqual(1, val);
        }
    }
}
