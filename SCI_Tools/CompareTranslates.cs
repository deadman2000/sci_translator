using McMaster.Extensions.CommandLineUtils;
using SCI_Translator.Resources;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Threading.Tasks;

namespace SCI_Tools
{
    // apply -d D:\Dos\GAMES\QG_VGA\ -t D:\Dos\GAMES\QG_VGA_RUS\ -d2 D:\Dos\GAMES\QG_EGA\ -t2 d:\Dos\Games\QG_EGA_RUS\
    [Command("apply", Description = "Apply translate from one game to another")]
    class CompareTranslates : PackageCommand
    {
        [Option(Description = "Second original game directory", ShortName = "d2", LongName = "dir2")]
        [Required]
        public string SecondGameDir { get; set; }

        [Option(Description = "Second translated game directory", ShortName = "t2", LongName = "trans2")]
        public string SecondTranslateDir { get; set; }

        protected SCIPackage package2;

        protected override async Task Do()
        {
            package2 = SCIPackage.Load(SecondGameDir, SecondTranslateDir);

            Console.WriteLine("Translate gathering...");

            Dictionary<string, string> translates = new Dictionary<string, string>();
            Dictionary<string, string> translatesSimple = new Dictionary<string, string>();
            foreach (var mess in package.Messages)
            {
                var enMess = mess.GetMessages(false);
                var ruMess = mess.GetMessages(true);
                if (enMess.Count != ruMess.Count)
                {
                    Console.WriteLine($"{mess.FileName} Lines mismatch");
                    continue;
                }

                for (int i = 0; i < enMess.Count; i++)
                {
                    var en = enMess[i].Text;
                    var ru = ruMess[i].Text;
                    if (en.Equals(ru))
                        continue; // Пропускаем строки без перевода

                    /*if (translates.TryGetValue(en, out var tr) && !tr.Equals(ru))
                    {
                        Console.WriteLine($"Multiple tr: {en} {mess.FileName}");
                        Console.WriteLine("====================");
                        Console.WriteLine(tr);
                        Console.WriteLine("====================");
                        Console.WriteLine(ru);
                        Console.WriteLine();
                    }*/

                    translates[en] = ru;
                    translatesSimple[Simple(en)] = ru;
                }
            }

            Console.WriteLine("Translating...");

            foreach (var txt in package2.Texts)
            {
                var enTxt = txt.GetText(false);
                var ruTxt = txt.GetText(true);

                bool hasTranslate = false;

                for (int i = 0; i < enTxt.Length; i++)
                {
                    var en = enTxt[i];

                    if (translates.TryGetValue(en, out var tr))
                    {
                        ruTxt[i] = tr;
                        hasTranslate = true;
                    }
                    else
                    {
                        // Пытаемся найти без учета регистра и пробелов по краям
                        if (translatesSimple.TryGetValue(Simple(en), out tr))
                        {
                            ruTxt[i] = tr;
                            hasTranslate = true;
                            /*Console.WriteLine($"{txt.FileName}");
                            Console.WriteLine(en);
                            Console.WriteLine("===============");
                            Console.WriteLine(res);
                            Console.WriteLine();*/
                        }
                    }
                }

                if (hasTranslate)
                {
                    txt.SetTranslate(ruTxt);
                }
            }
        }

        // Удаляет лишние пробелы, приводит к нижнему регистру
        private string Simple(string str)
        {
            int oldLen;
            do
            {
                oldLen = str.Length;
                str = str.Replace("  ", " ");
            }
            while (oldLen != str.Length);
            return str.ToLower();
        }
    }
}
