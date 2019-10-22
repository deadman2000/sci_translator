using SCI_Translator.Scripts.Elements;
using System;
using System.Collections.Generic;
using System.Text;

namespace SCI_Translator.Scripts.Sections
{
    class RelocationSection : Section
    {
        ushort[] _pointers; // TODO Превращение адреса в код

        public override void Read(byte[] data, ushort offset, int length)
        {
            int cnt = ReadShortBE(data, ref offset);
            _pointers = new ushort[cnt];

            offset += 2;
            for (int i = 0; i < cnt; i++)
            {
                ushort addr = ReadShortBE(data, ref offset);
                _pointers[i] = addr;
            }
        }

        public override void Write(ByteBuilder bb)
        {
            _offset = bb.Position;
            bb.AddShortBE((ushort)_pointers.Length);
            bb.AddShortBE(0);
            for (int i = 0; i < _pointers.Length; i++)
                bb.AddShortBE(0);
        }

        public override void WriteOffsets(ByteBuilder bb)
        {
            for (int i = 0; i < _pointers.Length; i++)
            {
                bb.SetShortBE(_offset + 4 + i * 2, _pointers[i]);
            }
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append(String.Format("[Relocation section (0x{0:X4})]\r\n", _offset));
            for (int i = 0; i < _pointers.Length; i++)
                sb.Append(String.Format("\tpointer[{0}] = {1}\r\n", i, _pointers[i]));
            return sb.ToString();
        }
    }
}
