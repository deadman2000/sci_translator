using System;
using System.Collections.Generic;
using System.Text;

namespace SCI_Translator
{
    public static class Helpers
    {
        static Helpers()
        {
            byte[] bytes = new byte[256];
            for (int i = 0; i < 256; i++)
                bytes[i] = (byte)i;
            chars866 = enc866.GetChars(bytes);
        }

        public static byte[] GetBytes(byte[] data, int offset, int length)
        {
            byte[] result = new byte[length];
            Array.Copy(data, offset, result, 0, length);
            return result;
        }

        public static int GetIntBE(byte[] data, int offset)
        {
            return data[offset] | (data[offset + 1] << 8) | (data[offset + 2] << 16) | (data[offset + 3] << 24);
        }

        public static ushort GetShortBE(byte[] data, int offset)
        {
            return (ushort)(data[offset] | (data[offset + 1] << 8));
        }

        public static Encoding enc866 = Encoding.GetEncoding(866);
        static char[] chars866;

        public static char[] Chars866 { get { return chars866; } }

        public static Encoding Enc866 { get { return enc866; } }

        public static string ByteToHexTable(byte[] data)
        {
            int i = 0;
            StringBuilder sb = new StringBuilder();
            while (i < data.Length)
            {
                sb.Append(String.Format("{0:X8}: {1,-24} {2,-24}  {3}\r\n", i, Helpers.ByteToHex(data, i, 8), Helpers.ByteToHex(data, i + 8, 8), Helpers.PrintableString(data, i, 16)));
                i += 16;
            }
            return sb.ToString().TrimEnd();
        }

        private static Escaper escaper = new DollarEscaper();

        public static byte[] GetBytes(string text, bool unescape = true)
        {
            byte[] str866 = enc866.GetBytes(text);
            if (unescape)
                return escaper.Unescape(str866);
            return str866;
        }

        public static string GetString(byte[] data)
        {
            char[] str866 = enc866.GetChars(data);
            return escaper.Escape(str866);
        }

        public static string GetString(byte[] data, int from, int length)
        {
            char[] str866 = enc866.GetChars(data, from, length);
            return escaper.Escape(str866);
        }

        public static string GetStringUnescape(byte[] data)
        {
            char[] str866 = enc866.GetChars(data);
            return new string(str866);
        }

        public static string GetStringUnescape(byte[] data, int from, int length)
        {
            char[] str866 = enc866.GetChars(data, from, length);
            return new string(str866);
        }


        abstract class Escaper
        {
            public abstract string Escape(char[] str866);
            public abstract byte[] Unescape(byte[] str866);
        }

        class DollarEscaper : Escaper
        {
            public override string Escape(char[] str866)
            {
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < str866.Length; i++)
                {
                    if (Char.IsControl(str866[i]))
                    {
                        sb.AppendFormat("${0:X2}", (byte)str866[i]);
                    }
                    else if (str866[i] == '$')
                        sb.Append("$$");
                    else
                        sb.Append(str866[i]);
                }
                return sb.ToString();
            }

            public override byte[] Unescape(byte[] str866)
            {
                List<byte> bb = new List<byte>();
                for (int c = 0; c < str866.Length; c++)
                {
                    if (str866[c] == 0) continue;

                    if (str866[c] == '$')
                    {
                        if (str866[c + 1] == '$')
                        {
                            bb.Add((byte)'$');
                            c++;
                        }
                        else
                        {
                            string hex = String.Concat((char)str866[c + 1], (char)str866[c + 2]);
                            bb.Add(Convert.ToByte(hex, 16));
                            c += 2;
                        }
                    }
                    else
                    {
                        bb.Add(str866[c]);
                    }
                }

                return bb.ToArray();
            }

            private static char GetEscape(byte val)
            {
                switch (val)
                {
                    case 9: return 't';
                    case 0xa: return 'n';
                    case 0xd: return 'r';
                    default: throw new NotImplementedException();
                }
            }

            private static byte GetUnescape(char val)
            {
                switch (val)
                {
                    case 't': return 9;
                    case 'n': return 0xa;
                    case 'r': return 0xd;
                    default: throw new NotImplementedException();
                }
            }
        }

        class SlashEscaper : Escaper
        {
            public override string Escape(char[] str866)
            {
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < str866.Length; i++)
                {
                    if (Char.IsControl(str866[i]))
                    {
                        sb.Append('\\').Append(GetEscape((byte)str866[i]));
                    }
                    else if (str866[i] == '\\')
                        sb.Append("\\\\");
                    else
                        sb.Append(str866[i]);
                }
                return sb.ToString();
            }

            public override byte[] Unescape(byte[] str866)
            {
                List<byte> bb = new List<byte>();
                for (int c = 0; c < str866.Length; c++)
                {
                    if (str866[c] == 0) continue;

                    if (str866[c] == '\\')
                    {
                        if (str866[c + 1] == '\\')
                        {
                            bb.Add((byte)'\\');
                            c++;
                        }
                        else
                        {
                            bb.Add(GetUnescape((char)str866[c + 1]));
                            c += 1;
                        }
                    }
                    else
                    {
                        bb.Add(str866[c]);
                    }
                }

                return bb.ToArray();
            }

            private static char GetEscape(byte val)
            {
                switch (val)
                {
                    case 9: return 't';
                    case 0xa: return 'n';
                    case 0xd: return 'r';
                    default: throw new NotImplementedException();
                }
            }

            private static byte GetUnescape(char val)
            {
                switch (val)
                {
                    case 't': return 9;
                    case 'n': return 0xa;
                    case 'r': return 0xd;
                    default: throw new NotImplementedException();
                }
            }
        }


        public static string ByteToHex(byte[] data)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < data.Length; i++)
            {
                sb.Append(String.Format("{0:X2} ", data[i]));
            }
            return sb.ToString().TrimEnd();
        }

        public static string ByteToHex(byte[] data, int offset, int len)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = offset; i < offset + len && i < data.Length; i++)
            {
                sb.Append(String.Format("{0:X2} ", data[i]));
            }
            return sb.ToString().TrimEnd();
        }

        static char CharToPrint(char c, char def)
        {
            if (!Char.IsControl(c))
                return c;
            else
                return def;
        }

        public static string PrintableString(byte[] data, int offset, int len)
        {
            StringBuilder sb = new StringBuilder();
            char[] str866;
            if (data.Length > offset + len)
                str866 = Helpers.Enc866.GetChars(data, offset, len);
            else
                str866 = Helpers.Enc866.GetChars(data, offset, data.Length - offset);

            for (int i = offset; i < offset + len && i < data.Length; i++)
            {
                sb.Append(CharToPrint(str866[i - offset], '.'));
            }
            return sb.ToString().TrimEnd();
        }
    }
}
