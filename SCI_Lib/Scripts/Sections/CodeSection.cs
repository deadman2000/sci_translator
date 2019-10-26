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
                Code c = new Code(_script, i, prev);
                c.Read(data, ref i);
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
    }
}
