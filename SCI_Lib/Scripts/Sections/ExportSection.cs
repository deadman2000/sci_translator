using SCI_Translator.Scripts.Elements;
using System;
using System.Collections.Generic;
using System.Text;

namespace SCI_Translator.Scripts.Sections
{
    class ExportSection : Section
    {
        private RefToElement[] exports;

        public override void Read(byte[] data, ushort offset, int length)
        {
            int cnt = ReadShortBE(data, ref offset);
            exports = new RefToElement[cnt];
            for (int i = 0; i < cnt; i++)
            {
                exports[i] = new RefToElement(_script, ReadShortBE(data, ref offset)); // Helpers.GetShortBE(data, offset + 2 + i * 4)
                offset += 2;
            }
        }

        public RefToElement[] Exports { get { return exports; } }

        public override void SetupByOffset()
        {
            foreach (RefToElement exp in exports)
                exp.SetupByOffset();
        }

        public override void Write(ByteBuilder bb)
        {
            bb.AddShortBE((ushort)exports.Length);
            foreach (RefToElement exp in exports)
            {
                exp.Write(bb);
                bb.AddShortBE(0);
            }
        }

        public override void WriteOffsets(ByteBuilder bb)
        {
            foreach (RefToElement exp in exports)
                exp.WriteOffset(bb);
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("[Exports section]\r\n");
            for (int i = 0; i < exports.Length; i++)
            {
                sb.Append(String.Format("\texport_{0} = {1}\r\n", i, exports[i]));
            }
            return sb.ToString();
        }
    }
}
