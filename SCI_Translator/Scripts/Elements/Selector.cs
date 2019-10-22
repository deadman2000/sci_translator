using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.Scripts.Elements
{
    /*class Selector : BaseElement
    {
        private RefToElement _val;

        public Selector(int offset, ushort val)
        {
            _offset = offset;
            _val = new RefToElement(val);
        }

        public RefToElement Value
        {
            get { return _val; }
            set { _val = value; }
        }

        public override string ToString()
        {
            return String.Format("{0:x4}", _val);
        }

        public override void SetupByOffset(List<BaseElement> elements)
        {
            _val.SetupByOffset(elements);
        }

        public override void Write(ByteBuilder bb)
        {
            _val.Write(bb);
        }

        public override void WriteOffset(ByteBuilder bb)
        {
            _val.WriteOffset(bb);
        }
    }*/
}
