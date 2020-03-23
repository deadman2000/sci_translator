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
                    lines.Add(Helpers.GetString(data, s, i - s));

                    ind++;
                    s = i + 1;
                }
            }

            return lines.ToArray();
        }

        public void SetText(string[] lines)
        {
            ByteBuilder bb = new ByteBuilder();

            for (int r = 0; r < lines.Length; r++)
            {
                var bytes = Helpers.GetBytes(lines[r]);
                bb.AddBytes(bytes);
                bb.AddByte(0);
            }

            SaveTranslate(bb.GetArray());
        }
    }
}
