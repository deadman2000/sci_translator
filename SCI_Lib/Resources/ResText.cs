using System;
using System.Collections.Generic;

namespace SCI_Translator.Resources
{
    public class ResText : Resource
    {
        public string[] GetText(bool translateDir)
        {
            List<string> lines = new List<string>();
            var data = GetContent(translateDir);

            int s = 0;
            int ind = 0;
            for (int i = 0; i < data.Length; i++)
            {
                if (data[i] == 0x00)
                {
                    lines.Add(GameEncoding.GetString(data, s, i - s));

                    ind++;
                    s = i + 1;
                }
            }

            return lines.ToArray();
        }

        public override string[] GetStrings(bool translate)
        {
            return GetText(translate);
        }

        public override void SetTranslate(string[] strings)
        {
            var oldStrings = GetStrings(true);

            if (strings.Length != oldStrings.Length)
                throw new Exception("Line count mismatch");

            ByteBuilder bb = new ByteBuilder();

            for (int r = 0; r < strings.Length; r++)
            {
                var bytes = GameEncoding.GetBytes(strings[r]);
                bb.AddBytes(bytes);
                bb.AddByte(0);
            }

            SaveTranslate(bb.GetArray());
        }
    }
}
