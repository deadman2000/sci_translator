using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator
{
    public class OpCode
    {
        private ushort _type;
        private string _name;

        public OpCode(ushort type, string name)
        {
            _type = type;
            _name = name;
        }

        public ushort Type { get { return _type; } }

        public string Name { get { return _name; } }
    }
}
