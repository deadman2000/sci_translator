using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.Scripts.Elements
{
    class StringConst : BaseElement
    {
        byte[] _value;

        public StringConst(Script script, byte[] data, ushort offset, int length)
            : base(script)
        {
            _value = Helpers.GetBytes(data, offset, length);
            _offset = offset;
        }

        public string Value
        {
            get { return Helpers.GetString(_value); }
            set { _value = Helpers.GetBytes(value); }
        }

        public void SetValue(string val, bool escape = true)
        {
            _value = Helpers.GetBytes(val, !escape);
        }

        public string GetValue(bool escape = true)
        {
            if (escape)
                return Helpers.GetString(_value);
            else
                return Helpers.GetStringUnescape(_value);
        }

        public override string ToString()
        {
            return String.Format("string_{0:x4} = {1}", _offset, GetValue());
        }

        public override void Write(ByteBuilder bb)
        {
            _offset = bb.Position;
            bb.AddBytes(_value);
            bb.AddByte(0);
        }

        public override void WriteOffset(ByteBuilder bb)
        {
        }
    }
}
