using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.Scripts.Elements
{
    public class ShortElement : BaseElement
    {
        public ShortElement(Script script, ushort address, ushort val)
            : base(script, address)
        {
            Value = val;
        }

        public ushort Value { get; set; }

        public override void Write(ByteBuilder bb)
        {
            Address = bb.Position;
            bb.AddShortBE(Value);
        }

        public override void WriteOffset(ByteBuilder bb)
        {
        }

        public override string ToString()
        {
            return String.Format("{0}; [0x{1:X4}]", Value, Address);
        }
    }
}
