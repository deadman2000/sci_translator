using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.Scripts.Elements
{
    public abstract class BaseElement
    {
        protected ushort _address;
        protected Script _script;

        public BaseElement(Script script)
        {
            _script = script;
        }

        public List<RefToElement> XRefs { get; } = new List<RefToElement>();

        public ushort Address
        {
            get { return _address; }
            set { _address = value; }
        }

        public virtual string Label => $"{GetType().Name.ToLower()}_{_address:x4}";

        public virtual void SetupByOffset() { }
        
        public abstract void Write(ByteBuilder bb);

        public abstract void WriteOffset(ByteBuilder bb);

    }
}
