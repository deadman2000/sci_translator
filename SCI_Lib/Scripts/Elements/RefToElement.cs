using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.Scripts.Elements
{
    public class RefToElement : BaseElement
    {
        private ushort _targetOffset;
        private BaseElement _ref;
        private bool _relative;
        private byte _size;

        public RefToElement(Script script, ushort pos, ushort offset, bool relative, byte size)
            : base(script)
        {
            _offset = pos;
            _targetOffset = offset;
            _relative = relative;
            _size = size;
        }

        public RefToElement(Script script, ushort pos, ushort offset)
            : this(script, pos, offset, false, 2)
        {
        }

        public ushort TargetOffset
        {
            get { return _targetOffset; }
        }

        public bool Relative { get { return _relative; } }

        public byte Size { get { return _size; } }

        public int Index { get; set; }

        public BaseElement Reference
        {
            get { return _ref; }
        }

        public override string ToString()
        {
            string type = "ref";
            string comment = "";
            if (_ref != null)
            {
                if (_ref is Code)
                {
                    type = "code";
                    comment = ";  " + ((Code)_ref).Name;
                }
                else if (_ref is StringConst)
                {
                    type = "string";
                    comment = ";  '" + ((StringConst)_ref).Value + "'";
                }
                else if (_ref is ShortElement)
                {
                    type = "obj";
                }
                else if (_ref is RefToElement)
                {
                    type = "ref_to";
                    if (_ref == this)
                        comment = "; self";
                    else if (((RefToElement)_ref)._ref == this)
                        comment = "; self.self";
                    else
                        comment = "; " + _ref.ToString();
                }
                else
                {
                    type = "ref_el";
                }
            }

            return String.Format("{0}_{1:X4}{2}", type, _targetOffset, comment);
        }

        public override void SetupByOffset()
        {
            _ref = _script.GetElement(_targetOffset);
        }

        public override void Write(ByteBuilder bb)
        {
            _offset = bb.Position;
            switch (_size)
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
            if (_ref != null)
                _targetOffset = (ushort)_ref.Offset;

            int val;
            if (!_relative)
                val = _targetOffset;
            else
                val = _targetOffset - rel;

            switch (_size)
            {
                case 1: bb.SetByte(_offset, (byte)val); break;
                case 2: bb.SetShortBE(_offset, (ushort)val); break;
                default: throw new NotImplementedException();
            }
        }
    }
}
