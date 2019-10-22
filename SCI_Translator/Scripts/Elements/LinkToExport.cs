using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.Scripts.Elements
{
    class LinkToExport
    {
        private ushort _scrNumb;
        private ushort _expNumb;

        public LinkToExport(ushort scrNumb, ushort expNumb)
        {
            _scrNumb = scrNumb;
            _expNumb = expNumb;
        }

        public ushort ScriptNumber => _scrNumb;

        public ushort ExportNumber => _expNumb;

        public override string ToString()
        {
            return String.Format("export{0}_{1}", _scrNumb, _expNumb);
        }

        public void Write(ByteBuilder bb)
        {
            bb.AddShortBE(_scrNumb);
            bb.AddShortBE(_expNumb);
        }
    }
}
