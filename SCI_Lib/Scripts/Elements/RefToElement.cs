using System;

namespace SCI_Translator.Scripts.Elements
{
    public class RefToElement : BaseElement
    {
        /// <summary>
        /// Конструктор для относительной ссылки
        /// </summary>
        /// <param name="script"></param>
        /// <param name="value"></param>
        /// <param name="targetOffset"></param>
        /// <param name="size"></param>
        public RefToElement(Script script, ushort addr, ushort value, ushort targetOffset, byte size)
            : base(script, addr)
        {
            Value = value;
            TargetOffset = targetOffset;
            Size = size;
            Relative = true;
        }

        /// <summary>
        /// Конструктор для абсолютной ссылки
        /// </summary>
        /// <param name="script"></param>
        /// <param name="value"></param>
        public RefToElement(Script script, ushort addr, ushort value)
            : this(script, addr, value, value, 2)
        {
            Relative = false;
        }

        public ushort Value { get; }

        public ushort TargetOffset { get; private set; }

        public bool Relative { get; }

        public byte Size { get; }

        public int Index { get; set; }

        public BaseElement Reference { get; set; }

        public bool IsSetup { get; private set; }

        public bool IsWrited { get; private set; }

        public bool IsOffsetWrited { get; private set; }

        public object Source { get; set; }

        public override string ToString()
        {
            string type = "ref";
            string comment = "";

            switch (Reference)
            {
                case Code c:
                    type = "code";
                    comment = ";  " + c.Name;
                    break;
                case StringConst s:
                    type = "string";
                    comment = ";  '" + s.GetStringEscape() + "'";
                    break;
                case ShortElement _:
                    type = "obj";
                    break;
                case RefToElement r:
                    type = "ref_ref";
                    if (r == this)
                        comment = ";  self";
                    else
                        comment = ";  " + r.Address;
                    break;
                case null:
                    break;
                default:
                    type = "ref_el";
                    break;

            }

            return String.Format("{0}_{1:X4}{2}", type, TargetOffset, comment);
        }

        public override void SetupByOffset()
        {
            IsSetup = true;
            Reference = Script.GetElement(TargetOffset);
            if (Reference != null)
                Reference.XRefs.Add(this);
        }

        public override void Write(ByteBuilder bb)
        {
            IsWrited = true;
            Address = bb.Position;
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
            IsOffsetWrited = true;

            if (Reference != null)
                TargetOffset = Reference.Address;

            int val;
            if (!Relative)
                val = TargetOffset;
            else
                val = TargetOffset - rel;

            switch (Size)
            {
                case 1: bb.SetByte(Address, (byte)val); break;
                case 2: bb.SetShortBE(Address, (ushort)val); break;
                default: throw new NotImplementedException();
            }
        }
    }
}
