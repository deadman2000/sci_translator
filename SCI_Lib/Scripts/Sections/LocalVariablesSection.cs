using SCI_Translator.Scripts.Elements;
using System;
using System.Collections.Generic;
using System.Text;

namespace SCI_Translator.Scripts.Sections
{
    class LocalVariablesSection : Section
    {
        List<RefToElement> refs;

        public override void Read(byte[] data, ushort offset, int length)
        {
            refs = new List<RefToElement>();

            for (int i = 0; i < length / 2; i++)
            {
                ushort o = offset;
                RefToElement r = new RefToElement(_script, ReadShortBE(data, ref offset));
                r.Index = i;
                r.Address = o;
                refs.Add(r);
                _script.Register(r);
            }
        }

        public List<RefToElement> Refs { get { return refs; } }

        public override void SetupByOffset()
        {
            foreach (RefToElement r in refs)
                r.SetupByOffset();
        }

        public override void Write(ByteBuilder bb)
        {
            foreach (RefToElement r in refs)
                r.Write(bb);
        }

        public override void WriteOffsets(ByteBuilder bb)
        {
            foreach (RefToElement r in refs)
                r.WriteOffset(bb);
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append(String.Format("[Local variables (0x{0:X4})]\r\n", _offset));
            foreach (RefToElement r in refs)
                sb.Append(String.Format("\t{0}\r\n", r));
            return sb.ToString();
        }
    }
}
