using System;
using System.Text;

namespace SCI_Translator.Scripts.Builders
{
    public class HexBuilder : IScriptBuilder
    {
        StringBuilder sb = new StringBuilder();

        public string Decompile(Script script)
        {
            foreach (var sec in script.Sections)
            {
                sb.Append(String.Format("Type: {0} Size: {1}\r\n", sec.Type, sec.Size));
                AddHex(script.SourceData, sec.Address, sec.Size);
                sb.Append("\r\n");
            }

            return sb.ToString().TrimEnd();
        }

        void AddHex(byte[] data, int offset, int length)
        {
            int i = offset;
            int l;
            while (i < offset + length)
            {
                if (i + 16 > offset + length)
                    l = offset + length - i;
                else
                    l = 16;

                string str = String.Format("{0:X8}: {1,-48}  {2}\r\n", i, Helpers.ByteToHex(data, i, l), Helpers.PrintableString(data, i, l));
                sb.Append(str);
                i += 16;
            }
        }

    }
}
