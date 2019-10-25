using SCI_Translator.Scripts.Elements;
using System;
using System.Text;

namespace SCI_Translator.Scripts.Sections
{
    class ExportSection : Section
    {
        public override void Read(byte[] data, ushort offset, int length)
        {
            int cnt = ReadShortBE(data, ref offset);
            Exports = new RefToElement[cnt];
            for (int i = 0; i < cnt; i++)
            {
                var addr = offset;
                var val = ReadShortBE(data, ref offset);
                var zero = ReadShortBE(data, ref offset);
                if (zero != 0)
                    throw new Exception();

                if (val != 0)
                    Exports[i] = new RefToElement(_script, addr, val) { Source = this };
            }
        }

        public RefToElement[] Exports { get; private set; }

        public override void SetupByOffset()
        {
            foreach (RefToElement exp in Exports)
                exp?.SetupByOffset();
        }

        public override void Write(ByteBuilder bb)
        {
            bb.AddShortBE((ushort)Exports.Length);
            foreach (RefToElement exp in Exports)
            {
                if (exp != null)
                    exp.Write(bb);
                else
                    bb.AddShortBE(0);
                bb.AddShortBE(0);
            }
        }

        public override void WriteOffsets(ByteBuilder bb)
        {
            foreach (RefToElement exp in Exports)
                exp?.WriteOffset(bb);
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("[Exports section]\r\n");
            for (int i = 0; i < Exports.Length; i++)
            {
                sb.Append(String.Format("\texport_{0} = {1}\r\n", i, Exports[i]));
            }
            return sb.ToString();
        }
    }
}
