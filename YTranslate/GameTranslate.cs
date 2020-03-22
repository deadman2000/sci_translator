using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

namespace YTranslate
{
    public class GameTranslate
    {
        public string en { get; set; }

        public string ru { get; set; }

        public static List<GameTranslate> Load(string destFile) => JsonConvert.DeserializeObject<List<GameTranslate>>(File.ReadAllText(destFile));
    }
}
