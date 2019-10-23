using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.Scripts.Elements
{
    class ShortElement : BaseElement
    {
        private ushort _val;

        public ShortElement(Script script, ushort offset, ushort val)
            : base(script)
        {
            _address = offset;
            _val = val;
        }

        public ushort Value
        {
            get { return _val; }
            set { _val = value; }
        }

        public override void Write(ByteBuilder bb)
        {
            _address = bb.Position;
            bb.AddShortBE(_val);
        }

        public override void WriteOffset(ByteBuilder bb)
        {
        }

        public override string ToString()
        {
            return String.Format("{0}; [0x{1:X4}]", _val, _address);
        }
    }
}
