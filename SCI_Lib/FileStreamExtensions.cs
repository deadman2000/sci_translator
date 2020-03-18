using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SCI_Translator
{
    public static class FileStreamExtensions
    {
        public static ushort ReadUShortBE(this FileStream fs)
        {
            return (ushort)(fs.ReadByte() | (fs.ReadByte() << 8));
        }

        public static ushort ReadUShortLE(this FileStream fs)
        {
            return (ushort)((fs.ReadByte() << 8) | fs.ReadByte());
        }


        public static int ReadIntBE(this FileStream fs)
        {
            return fs.ReadByte() | (fs.ReadByte() << 8) | (fs.ReadByte() << 16) | (fs.ReadByte() << 24);
        }

        public static uint ReadUIntBE(this FileStream fs)
        {
            return (uint)(fs.ReadByte() | (fs.ReadByte() << 8) | (fs.ReadByte() << 16) | (fs.ReadByte() << 24));
        }

        public static uint ReadUIntLE(this FileStream fs)
        {
            return  (uint)((fs.ReadByte() << 24) | (fs.ReadByte() << 16) | (fs.ReadByte() << 8) | fs.ReadByte());
        }

    }
}
