using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SCI_Translator.Scripts1_1
{
    class LocalVar
    {
        public ushort Value { get; set; }

        public bool IsObjectOrString { get; set; }

        public override string ToString() => $"value = {Value}; IsObjectOrString = {IsObjectOrString}";
    }
}
