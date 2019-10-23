using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.Scripts.Elements
{
    public class RefToElement : BaseElement
    {
        public RefToElement(Script script, ushort address, ushort value, ushort targetOffset, bool relative, byte size)
            : base(script)
        {
            _address = address;
            Value = value;
            TargetOffset = targetOffset;
            Relative = relative;
            Size = size;
        }

        public RefToElement(Script script, ushort address, ushort value)
            : this(script, address, value, value, false, 2)
        {
        }

        public ushort Value { get; }

        public ushort TargetOffset { get; private set; }

        public bool Relative { get; }

        public byte Size { get; }

        public int Index { get; set; }

        public BaseElement Reference { get; private set; }

        public override string ToString()
        {
            string type = "ref";
            string comment = "";
            if (Reference != null)
            {
                if (Reference is Code c)
                {
                    type = "code";
                    comment = ";  " + c.Name;
                }
                else if (Reference is StringConst s)
                {
                    type = "string";
                    comment = ";  '" + s.Value + "'";
                }
                else if (Reference is ShortElement)
                {
                    type = "obj";
                }
                else if (Reference is RefToElement r)
                {
                    throw new Exception();
                    /*type = "ref_to";
                    if (Reference == this)
                        comment = "; self";
                    else if (r.Reference == this)
                        comment = "; self.self";
                    else
                        comment = "; " + Reference.ToString();*/
                }
                else
                {
                    type = "ref_el";
                }
            }

            return String.Format("{0}_{1:X4}{2}", type, TargetOffset, comment);
        }

        public override void SetupByOffset()
        {
            Reference = _script.GetElement(TargetOffset);
            if (Reference != null)
                Reference.XRefs.Add(this);
        }

        public override void Write(ByteBuilder bb)
        {
            _address = bb.Position;
            switch (Size)
            {
                case 1: bb.AddByte(0); break;
                case 2: bb.AddShortBE(0); break;
                default: throw new NotImplementedException();
            }
        }

        public override void WriteOffset(ByteBuilder bb)
        {
            WriteOffset(0, bb);
        }

        public void WriteOffset(int rel, ByteBuilder bb)
        {
            if (Reference != null)
                TargetOffset = Reference.Address;

            int val;
            if (!Relative)
                val = TargetOffset;
            else
                val = TargetOffset - rel;

            switch (Size)
            {
                case 1: bb.SetByte(_address, (byte)val); break;
                case 2: bb.SetShortBE(_address, (ushort)val); break;
                default: throw new NotImplementedException();
            }
        }
    }
}
