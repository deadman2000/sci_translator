using SCI_Translator.Scripts.Elements;
using System;
using System.Collections.Generic;
using System.Text;

namespace SCI_Translator.Scripts.Sections
{
    class CodeSection : Section
    {
        public override void Read(byte[] data, ushort offset, int length)
        {
            Operators = new List<Code>();
            ushort i = offset;

            Code prev = null;

            while (i < offset + length)
            {
                Code c = new Code(_script, prev);
                c.Read(data, ref i);
                _script.Register(c);
                Operators.Add(c);
                prev = c;
            }
        }

        public List<Code> Operators { get; private set; }

        public override void SetupByOffset()
        {
            foreach (Code c in Operators)
                c.SetupByOffset();
        }

        public override void Write(ByteBuilder bb)
        {
            foreach (Code c in Operators) 
                c.Write(bb);
        }

        public override void WriteOffsets(ByteBuilder bb)
        {
            foreach (Code c in Operators) 
                c.WriteOffset(bb);
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append(String.Format("[Code section (0x{0:X4})]\r\n", _offset));
            foreach (Code c in Operators) 
                sb.Append(String.Format("\t{0}\r\n", c));
            return sb.ToString();
        }
    }
}
