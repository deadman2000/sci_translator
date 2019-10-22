using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator
{
    public class ByteBuilder
    {
        private List<byte> _bytes = new List<byte>();

        public ushort Position { get { return (ushort)_bytes.Count; } }


        public byte[] GetArray()
        {
            return _bytes.ToArray();
        }


        public void AddBytes(byte[] bytes)
        {
            _bytes.AddRange(bytes);
        }

        public void AddByte(byte b)
        {
            _bytes.Add(b);
        }

        public void AddByte(char c)
        {
            _bytes.Add((byte)c);
        }

        public void AddShortLE(ushort val)
        {
            _bytes.Add((byte)(val >> 8));
            _bytes.Add((byte)(val & 0xFF));
        }

        public void AddShortBE(ushort val)
        {
            _bytes.Add((byte)(val & 0xFF));
            _bytes.Add((byte)(val >> 8));
        }


        public void SetByte(int offset, byte val)
        {
            _bytes[offset] = val;
        }

        public void SetShortBE(int offset, ushort val)
        {
            _bytes[offset] = (byte)(val & 0xFF);
            _bytes[offset + 1] = (byte)(val >> 8);
        }

    }
}
