using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.Scripts.Sections
{
    class PreloadTextSection : Section
    {
        public override string ToString()
        {
            return String.Format("[Preload section (0x{0:X4})]\r\n", _offset);
        }

        public override void Read(byte[] data, ushort offset, int length)
        {
        }
    }
}
