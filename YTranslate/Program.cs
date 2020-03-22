using McMaster.Extensions.CommandLineUtils;
using Newtonsoft.Json;
using Notabenoid_Patch;
using RestSharp;
using RestSharp.Serializers.NewtonsoftJson;
using SCI_Translator.Resources;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace YTranslate
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

        [Option(Description = "Login for notabenoid", ShortName = "nl")]
        public string NotabenoidLogin { get; set; }

        [Option(Description = "Password for notabenoid", ShortName = "np")]
        public string NotabenoidPassword { get; set; }

        private RestClient rest;

        private GlossaryConfig glossary;

        public async Task<string[]> Translate(string[] texts)
        {
            Console.WriteLine($"Translate {texts.Length}");

            var data = new YTranslateRequest
            {
                SourceLanguageCode = "en",
                TargetLanguageCode = "ru",
                Format = "PLAIN_TEXT",
                Texts = texts,
                GlossaryConfig = glossary
            };
            var request = new RestRequest(Method.POST);
            request.AddJsonBody(data);
            var response = await rest.PostAsync<YTranslateResponse>(request);
            //var response = rest.Post<YTranslateResponse>(request);
            return response.Translations.Select(t => t.Text).ToArray();
        }

        public async Task<string> Translate(string s)
        {
            if (s.Trim().Length == 0) return "";

            return (await Translate(new string[] { s }))[0];
        }

        private async Task OnExecute()
        {
            var builder = new TranslateBuilder(NotabenoidLogin, NotabenoidPassword, GameDir);
            var dict = await builder.GetDict();
            glossary = new GlossaryConfig
            {
                GlossaryData = new GlossaryData
                {
                    GlossaryPairs = dict.Select(kv => new GlossaryPair { SourceText = kv.Key, TranslatedText = kv.Value }).ToArray()
                }
            };

            rest = new RestClient("https://translate.api.cloud.yandex.net/translate/v2/translate");
            rest.UseNewtonsoftJson();
            rest.AddDefaultHeader("Authorization", "Api-Key " + YandexApiKey);

            //var test = await Translate("That was foolish of me and good of Tuck.");
            //Console.WriteLine(test);

            string destFile = "ytrans.json";

            List<GameTranslate> translatedList = new List<GameTranslate>();
            Dictionary<string, string> translations = new Dictionary<string, string>();
            if (File.Exists(destFile))
            {
                translatedList = GameTranslate.Load(destFile);
                translations = translatedList.ToDictionary(t => t.en, t => t.ru);
            }

            SCIPackage package = SCIPackage.Load(GameDir);
            var texts = package.Texts;
            var scripts = package.Scripts;

            Console.WriteLine("Gathering english");

            HashSet<string> toTranslate = new HashSet<string>(); // Множество всех оригинальных фраз
            foreach (var r in texts)
            {
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
                    if (en.Contains("%")) continue; // Системные сообщения
                    //if (!ru.Equals(en)) continue; // Пропускаем уже готовый перевод

                    if (!translations.ContainsKey(en) && !toTranslate.Contains(en))
                        toTranslate.Add(en);
                }
            }

            foreach (var r in scripts)
            {
                var enScr = r.GetScript(false);
                var ruScr = r.GetScript(true);

                var enStrings = enScr.AllStrings.Where(s => !s.IsClassName).ToArray();
                var ruStrings = ruScr.AllStrings.Where(s => !s.IsClassName).ToArray();

                for (int i = 0; i < enStrings.Length; i++)
                {
                    var en = enStrings[i].Value;
                    var ru = ruStrings[i].Value;

                    if (en.Trim().Length == 0) continue; // Пустые строки
                    if (en.Contains("%")) continue; // Системные сообщения
                    //if (!ru.Equals(en)) continue; // Пропускаем уже готовый перевод

                    if (!translations.ContainsKey(en) && !toTranslate.Contains(en))
                        toTranslate.Add(en);
                }
            }

            Console.WriteLine("Translate");

            async Task TranslatePart(List<string> txt)
            {
                var tr = await Translate(txt.ToArray());
                if (txt.Count != tr.Length)
                {
                    Console.WriteLine("Translate Error");
                }
                for (int n = 0; n < tr.Length; n++)
                {
                    translations[txt[n]] = tr[n];
                    translatedList.Add(new GameTranslate { en = txt[n], ru = tr[n] });
                }
            }

            var arr = toTranslate.ToArray();
            int len = 0;
            List<string> txt = new List<string>();
            for (int i = 0; i < arr.Length; i++)
            {
                var val = arr[i].Trim();
                //var escaped = JsonConvert.ToString(val);

                if (len + val.Length > 10000)
                {
                    await TranslatePart(txt);
                    txt.Clear();
                    len = 0;
                }

                len += val.Length;
                txt.Add(val);

                if (i == arr.Length - 1)
                    await TranslatePart(txt);
            }
            

            /*Console.WriteLine("Apply translate");

            foreach (var r in texts)
            {
                bool isChanged = false;
                var enLines = r.GetText(false); // Оригинальный текст
                var ruLines = r.GetText(true);  // Уже переведенный текст

                if (enLines.Length != ruLines.Length)
                    continue;

                for (int i = 0; i < enLines.Length; i++)
                {
                    var en = enLines[i];
                    var ru = ruLines[i];

                    if (en.Trim().Length == 0) continue; // Пустые строки
                    if (en.Contains("%")) continue; // Системные сообщения
                    if (!ru.Equals(en)) continue; // Пропускаем уже готовый перевод

                    if (translations.TryGetValue(en, out string tr))
                    {
                        ruLines[i] = tr;
                        isChanged = true;
                    }
                }

                if (isChanged)
                    r.SetText(ruLines);
            }

            foreach (var r in scripts)
            {
                bool isChanged = false;
                var enScr = r.GetScript(false);
                var ruScr = r.GetScript(true);

                var enStrings = enScr.AllStrings.Where(s => !s.IsClassName).ToArray();
                var ruStrings = ruScr.AllStrings.Where(s => !s.IsClassName).ToArray();

                for (int i = 0; i < enStrings.Length; i++)
                {
                    var en = enStrings[i].Value;
                    var ru = ruStrings[i].Value;

                    if (en.Trim().Length == 0) continue; // Пустые строки
                    if (en.Contains("%")) continue; // Системные сообщения
                    if (!ru.Equals(en)) continue; // Пропускаем уже готовый перевод

                    if (translations.TryGetValue(en, out string tr))
                    {
                        ruStrings[i].Value = tr;
                        isChanged = true;
                    }
                }

                if (isChanged)
                    r.SaveTranslate(ruScr.GetBytes());
            }*/

            File.WriteAllText(destFile, JsonConvert.SerializeObject(translatedList, Formatting.None));

            Console.WriteLine("Completed");
        }

    }
}
