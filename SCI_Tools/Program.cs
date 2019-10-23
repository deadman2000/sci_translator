using SCI_Translator;
using SCI_Translator.Scripts;
using SCI_Translator.Scripts.Builders;
using System;
using System.Linq;
using System.IO;

namespace SCI_Tools
{
    internal class Program
    {
        private static string GAME_DIR;

        private static void Main(string[] args)
        {
            GAME_DIR = args[0];

            SCIPackage package = new SCIPackage(GAME_DIR);
            var scr = package.Resources
                .SelectMany(r=>r.Resources)
                .First(r => r.ToString().Equals("990.scr"));

            var builder = new CompanionBuilder();
            var text = builder.Decompile(scr.GetScript(false));

            File.WriteAllText(@"..\..\..\Sandbox\990_en.comp", text);

            Console.WriteLine("Completed");
            //Console.ReadLine();
        }

        private static void CompareTexts(SCIPackage package)
        {
            foreach (var r in package.Texts)
            {
                var enLines = r.GetText(false, false, false); // Оригинальный текст
                var ruLines = r.GetText(true, false, false);  // Уже переведенный текст

                if (enLines.Length != ruLines.Length)
                    Console.WriteLine($"{r} line diff");

                for (int i = 0; i < enLines.Length; i++)
                {
                    if (!enLines[i].Equals(ruLines[i]))
                    {
                        Console.WriteLine($"{r}: {i}");
                        Console.WriteLine(ruLines[i]);
                        Console.WriteLine();
                    }
                }
            }
        }

        private static void ExportRuTex(SCIPackage package)
        {
            Directory.CreateDirectory("ru");
            foreach (var r in package.Texts)
            {
                var file = "ru/" + r.ToString();
                var hasTranslate = false;
                using (StreamWriter stream = new StreamWriter(file))
                {
                    var enLines = r.GetText(false, false, false);
                    var ruLines = r.GetText(true, false, false);

                    for (int i = 0; i < enLines.Length; i++)
                    {
                        if (enLines[i].Trim().Length == 0) continue;

                        if (!enLines[i].Equals(ruLines[i]))
                        {
                            stream.WriteLine(ruLines[i]);
                            hasTranslate = true;
                        }
                        else
                            stream.WriteLine('-');
                        stream.WriteLine();
                    }
                }
                if (!hasTranslate)
                    File.Delete(file);
            }
        }

        private static void ExportEnTex(SCIPackage package)
        {
            Directory.CreateDirectory("en");
            foreach (var r in package.Texts)
            {
                using (StreamWriter stream = new StreamWriter("en/" + r.ToString()))
                {
                    var lines = r.GetText(false, false, false);
                    foreach (var line in lines)
                    {
                        stream.Write(line + "\n\n");
                    }
                }
            }
        }

        private static void PrepareTranslate()
        {
            Linguist l = new Linguist();

            SCIPackage pEn = new SCIPackage(GAME_DIR);
            l.FillSource(pEn);

            SCIPackage pGer = new SCIPackage(@"../../../ConquestG/");
            var tr = pGer.ExtractTranslate();
            //pGer.FillTranslate(l);

            l.Translate(tr);

            l.Save("D:/translate_ru.ts");
        }

        private static void ApplyTranslate()
        {
            SCIPackage pEn = new SCIPackage(GAME_DIR);
            Linguist l = new Linguist("translate_ru.ts");
            l.ApplyTranslate(pEn);
        }
    }
}
