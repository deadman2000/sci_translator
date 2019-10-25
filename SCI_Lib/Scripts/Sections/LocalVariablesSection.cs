using SCI_Translator.Scripts.Elements;
using System;
using System.Text;

namespace SCI_Translator.Scripts.Sections
{
    class LocalVariablesSection : Section
    {
        public override void Read(byte[] data, ushort offset, int length)
        {
            Refs = new RefToElement[length / 2];

            for (int i = 0; i < Refs.Length; i++)
            {
                ushort addr = offset;
                var val = ReadShortBE(data, ref offset);

                if (val != 0)
                {
                    Refs[i] = new RefToElement(_script, addr, val)
                    {
                        Index = i,
                        Source = this,
                    };
                }
            }
        }

        public RefToElement[] Refs { get; private set; }

        public override void SetupByOffset()
        {
            foreach (RefToElement r in Refs)
                r?.SetupByOffset();
        }

        public override void Write(ByteBuilder bb)
        {
            foreach (RefToElement r in Refs)
            {
                if (r != null)
                    r.Write(bb);
                else
                    bb.AddShortBE(0);
            }
        }

        public override void WriteOffsets(ByteBuilder bb)
        {
            foreach (RefToElement r in Refs)
                r?.WriteOffset(bb);
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append(String.Format("[Local variables (0x{0:X4})]\r\n", _offset));
            foreach (RefToElement r in Refs)
                sb.Append(String.Format("\t{0}\r\n", r));
            return sb.ToString();
        }
    }
}
