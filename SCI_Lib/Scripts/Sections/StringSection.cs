﻿using SCI_Translator.Scripts.Elements;
using System.Collections.Generic;

namespace SCI_Translator.Scripts.Sections
{
    public class StringSection : Section
    {
        public override void Read(byte[] data, ushort offset, int length)
        {
            Strings = new List<StringConst>();

            ushort s = offset;
            ushort e;
            while (s < offset + length)
            {
                e = s;
                while (data[e] != 0x00) e++;

                StringConst str = new StringConst(_script, data, s, e - s);
                _script.Register(str);
                Strings.Add(str);

                /*if (s != e && (data[s] == '.' || data[s] == 7))
                {
                    _script.Register(new StringPart(str, 1));
                }*/

                s = (ushort)(e + 1);
            }
        }

        public List<StringConst> Strings { get; private set; }

        public override void Write(ByteBuilder bb)
        {
            foreach (StringConst str in Strings)
                str.Write(bb);
        }

        public override void WriteOffsets(ByteBuilder bb)
        {
            foreach (StringConst str in Strings)
                str.WriteOffset(bb);
        }
    }
}
