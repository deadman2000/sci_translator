using System.IO;

namespace SCI_Translator
{
    public static class StreamExtensions
    {
        public static ushort ReadUShortBE(this Stream fs)
        {
            return (ushort)(fs.ReadByte() | (fs.ReadByte() << 8));
        }

        public static ushort ReadUShortLE(this Stream fs)
        {
            return (ushort)((fs.ReadByte() << 8) | fs.ReadByte());
        }

        public static int Read3ByteBE(this Stream fs)
        {
            return fs.ReadByte() | (fs.ReadByte() << 8) | (fs.ReadByte() << 16);
        }

        public static int ReadIntBE(this Stream fs)
        {
            return fs.ReadByte() | (fs.ReadByte() << 8) | (fs.ReadByte() << 16) | (fs.ReadByte() << 24);
        }

        public static uint ReadUIntBE(this Stream fs)
        {
            return (uint)(fs.ReadByte() | (fs.ReadByte() << 8) | (fs.ReadByte() << 16) | (fs.ReadByte() << 24));
        }

        public static uint ReadUIntLE(this Stream fs)
        {
            return (uint)((fs.ReadByte() << 24) | (fs.ReadByte() << 16) | (fs.ReadByte() << 8) | fs.ReadByte());
        }

    }
}
