using McMaster.Extensions.CommandLineUtils;
using Newtonsoft.Json;
using SCI_Translator;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace YandexTranslate
{
    [Command(Name = "YandexTranslate", Description = "Translate game resources via Yandex-Translate", ThrowOnUnexpectedArgument = false)]
    //[Subcommand(typeof(Pack), typeof(Push), typeof(Server))]
    class Program
    {
        public static int Main(string[] args)
            => CommandLineApplication.Execute<Program>(args);

        [Option(Description = "Game path", ShortName = "d")]
        public string GameDir { get; set; }

        [Option(Description = "Key for Yandex Transkate", ShortName = "k")]
        public string YandexApiKey { get; set; }

        /*[Option(Description = "Login for notabenoid", ShortName = "l")]
        public string NotabenoidLogin { get; set; }

        [Option(Description = "Password for notabenoid", ShortName = "p")]
        public string NotabenoidPassword { get; set; }*/

        // https://vscode.ru/prog-lessons/rabota-s-api-yandex-perevodchika.html

        class Translation
        {
            public string code { get; set; }
            public string lang { get; set; }
            public string[] text { get; set; }
        }

        public string Translate(string s)
        {
            if (s.Length == 0) return "";

            WebRequest request = WebRequest.Create("https://translate.yandex.net/api/v1.5/tr.json/translate?"
                + "key=" + YandexApiKey
                + "&text=" + s
                + "&lang=ru");

            WebResponse response = request.GetResponse();

            using (StreamReader stream = new StreamReader(response.GetResponseStream()))
            {
                string line;

                if ((line = stream.ReadLine()) != null)
                {
                    Translation translation = JsonConvert.DeserializeObject<Translation>(line);

                    s = "";

                    foreach (string str in translation.text)
                    {
                        s += str;
                    }
                }
            }

            return s;
        }

        class GameTranslate
        {
            public string en { get; set; }

            public string ru { get; set; }
        }

        private void OnExecute()
        {
            string destFile = "ytrans.json";

            List<GameTranslate> translatedList = new List<GameTranslate>();
            Dictionary<string, string> translations = new Dictionary<string, string>();
            if (File.Exists(destFile))
            {
                translatedList = JsonConvert.DeserializeObject<List<GameTranslate>>(File.ReadAllText(destFile));
                translations = translatedList.ToDictionary(t => t.en, t => t.ru);
            }

            SCIPackage package = new SCIPackage(GameDir);
            var texts = package.Texts;
            var scripts = package.Scripts;

            foreach (var r in texts)
            {
                Console.WriteLine(r);

                bool isChanged = false;
                var enLines = r.GetText(false); // Оригинальный текст
                var ruLines = r.GetText(true);  // Уже переведенный текст

                if (enLines.Length != ruLines.Length)
                {
                    Console.WriteLine($"{r} Lines count error");
                    continue;
                }

                for (int i = 0; i < enLines.Length; i++)
                {
                    var en = enLines[i];
                    var ru = ruLines[i];

                    if (en.Trim().Length == 0) continue; // Пустые строки
                    if (!ru.Equals(en)) continue; // Пропускаем уже готовый перевод

                    if (!translations.TryGetValue(en, out string tr))
                    {
                        try
                        {
                            Console.WriteLine($"ERR: {en}");
                            tr = Translate(en);
                        }
                        catch
                        {
                            continue;
                        }
                        translatedList.Add(new GameTranslate { en = en, ru = tr });
                        translations.Add(en, tr);
                    }

                    ruLines[i] = tr;
                    isChanged = true;
                }

                if (isChanged)
                    r.SetText(ruLines, false);
            }

            foreach (var r in scripts)
            {
                Console.WriteLine(r);

                bool isChanged = false;
                var enScr = r.GetScript(false);
                var ruScr = r.GetScript(true);

                var enStrings = enScr.AllStrings.Where(s => !s.IsClassName).ToArray();
                var ruStrings = ruScr.AllStrings.Where(s => !s.IsClassName).ToArray();

                for (int i = 0; i < enStrings.Length; i++)
                {
                    var en = enStrings[i].Value;
                    if (en.Trim().Length == 0) continue; // Пустые строки

                    var ru = ruStrings[i].Value;
                    if (!ru.Equals(en)) continue; // Пропускаем уже готовый перевод

                    if (!translations.TryGetValue(en, out string tr))
                    {
                        try
                        {
                            tr = Translate(en);
                        }
                        catch
                        {
                            Console.WriteLine($"ERR: {en}");
                            continue;
                        }
                        translatedList.Add(new GameTranslate { en = en, ru = tr });
                        translations.Add(en, tr);
                    }

                    ruStrings[i].Value = tr;
                    isChanged = true;
                }

                if (isChanged)
                    r.SaveTranslate(ruScr.GetBytes());
            }
            File.WriteAllText(destFile, JsonConvert.SerializeObject(translatedList, Formatting.None));

            Console.WriteLine("Completed");
        }
    }
}
