using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.Scripts.Elements
{
    public abstract class BaseElement
    {
        protected ushort _offset;
        protected Script _script;

        public BaseElement(Script script)
        {
            _script = script;
        }

        public ushort Offset
        {
            get { return _offset; }
            set { _offset = value; }
        }

        public virtual void SetupByOffset() { }
        
        public abstract void Write(ByteBuilder bb);

        public abstract void WriteOffset(ByteBuilder bb);
    }
}
