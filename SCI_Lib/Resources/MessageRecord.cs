using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SCI_Translator.Resources
{
    public class MessageRecord
    {
        public int TextOffset { get; set; }

        public string Text { get; set; }

        public void ReadText(byte[] data)
        {
            for (int i = TextOffset; i < data.Length; i++)
            {
                if (data[i] == 0)
                {
                    Text = Helpers.GetString(data, TextOffset, i - TextOffset);
                    return;
                }
            }
        }
    }
}
