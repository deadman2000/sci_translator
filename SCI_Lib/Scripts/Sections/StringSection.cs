using SCI_Translator.Scripts.Elements;
using System;
using System.Collections.Generic;
using System.Text;

namespace SCI_Translator.Scripts.Sections
{
    public class StringSection : Section
    {
        private List<StringConst> _strings;

        public override void Read(byte[] data, ushort offset, int length)
        {
            _strings = new List<StringConst>();

            ushort s = offset;
            ushort e;
            while (s < offset + length)
            {
                e = s;
                while (data[e] != 0x00) e++;
                
                StringConst str = new StringConst(_script, data, s, e - s);
                _script.Register(str);
                _strings.Add(str);

                s = (ushort)(e + 1);
            }
        }

        public List<StringConst> Strings { get { return _strings; } }

        public override void Write(ByteBuilder bb)
        {
            foreach (StringConst str in _strings)
                str.Write(bb);
        }

        public override void WriteOffsets(ByteBuilder bb)
        {
            foreach (StringConst str in _strings)
                str.WriteOffset(bb);
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append(String.Format("[String section (0x{0:X4})]\r\n", _offset));
            foreach (StringConst s in _strings)
            {
                sb.Append(String.Format("\tstring_{0:x4} = '{1}'\r\n", s.Offset, s.Value));
            }
            return sb.ToString();
        }
    }
}
