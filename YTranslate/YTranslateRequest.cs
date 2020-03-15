using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace YTranslate
{
    /*
{
  "sourceLanguageCode": "en",
  "targetLanguageCode": "ru",
  "format": "PLAIN_TEXT",
  "texts": [
    "Tuck is right. I've no need to wind my horn right now.",
    "Oh, and Tuck caught up to me to give you your horn.",
    "Friar Tuck",
    "Aye, Tuck?"
  ],
  "glossaryConfig": {
    "glossaryData": {
      "glossaryPairs": [
        {
          "sourceText": "Tuck",
          "translatedText": "Тук"
        },
        {
          "sourceText": "wind my horn",
          "translatedText": "дуть в мой рог"
        }
      ]
    }
  }
} */
    class YTranslateRequest
    {
        public string SourceLanguageCode { get; set; }

        public string TargetLanguageCode { get; set; }

        public string Format { get; set; }

        public string[] Texts { get; set; }

        public GlossaryConfig GlossaryConfig { get; set; }
    }

    public class GlossaryConfig
    {
        public GlossaryData GlossaryData { get; set; }
    }

    public class GlossaryData
    {
        public GlossaryPair[] GlossaryPairs { get; set; }
    }

    public class GlossaryPair
    {
        public string SourceText { get; set; }
        public string TranslatedText { get; set; }
    }
}
