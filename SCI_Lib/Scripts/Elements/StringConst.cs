using System;

namespace SCI_Translator.Scripts.Elements
{
    public class StringConst : BaseElement
    {
        byte[] _value;

        public StringConst(Script script, byte[] data, ushort offset, int length)
            : base(script)
        {
            _value = Helpers.GetBytes(data, offset, length);
            _address = offset;
        }

        public string Value
        {
            get { return Helpers.GetString(_value); }
            set { _value = Helpers.GetBytes(value); }
        }

        public bool IsClassName { get; set; } = false;

        public void SetValueUnescape(string val) => _value = Helpers.Unescape(Helpers.GetBytes(val));

        public string GetStringEscape() => Helpers.GetStringEscape(_value);

        public override string ToString() => $"string_{_address:x4} = {Value}";

        public override void Write(ByteBuilder bb)
        {
            _address = bb.Position;
            bb.AddBytes(_value);
            bb.AddByte(0);
        }

        public override void WriteOffset(ByteBuilder bb)
        {
        }
    }
}
