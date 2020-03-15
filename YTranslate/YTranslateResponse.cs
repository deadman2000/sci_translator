using System;
using System.Collections.Generic;
using System.Text;

namespace YTranslate
{
    /*
{
    "translations": [
        {
            "text": "Тук прав. Мне сейчас не нужно дуть в мой рог."
        },
        {
            "text": "О, и тук догнал меня, чтобы отдать тебе твой Рог."
        },
        {
            "text": "Брат Тук"
        },
        {
            "text": "Да, Тук?"
        }
    ]
} */
    class YTranslateResponse
    {
        public Translate[] Translations { get; set; }
    }

    public class Translate
    {
        public string Text { get; set; }
    }
}
