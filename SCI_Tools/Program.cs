using SCI_Translator;
using SCI_Translator.Scripts.Builders;
using SCI_Translator.Scripts.Sections;
using System;
using System.IO;
using System.Linq;

namespace SCI_Tools
{
    internal class Program
    {
        public static string GAME_DIR = @"..\..\..\Conquest\";

        private static void Main(string[] args)
        {
            if (args.Length > 0)
                GAME_DIR = args[0];

            ExportEnScr();

            Console.WriteLine("Completed");
            Console.ReadKey();
        }

        static void FindSpaces()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);
            Directory.CreateDirectory("en");

            foreach (var t in package.Texts)
            {
                var lines = t.GetText(false);
                for (int i = 0; i < lines.Length; i++)
                {
                    if (lines[i].StartsWith(" ") || lines[i].EndsWith(" "))
                    {
                        Console.WriteLine(t);

                        using (StreamWriter stream = new StreamWriter("en/" + t.ToString()))
                        {
                            foreach (var line in lines)
                            {
                                if (lines[i].StartsWith(" ") || lines[i].EndsWith(" "))
                                {
                                    var line_strip = ReplaceSpaces(line);
                                    stream.Write(line_strip + "\n\n");
                                }
                            }
                        }

                        break;
                    }
                }
            }

            /*foreach (var r in package.Scripts)
            {
                var scr = r.GetScript(false);
                foreach (var s in scr.Strings)
                {
                    if (s.Value.StartsWith(" ") || s.Value.EndsWith(" "))
                    {
                        Console.WriteLine(r);

                        using (StreamWriter stream = new StreamWriter("en/" + r.ToString()))
                        {
                            foreach (var line in lines)
                            {
                                var line_strip = ReplaceSpaces(line);
                                stream.Write(line_strip + "\n\n");
                            }
                        }

                        break;
                    }
                }
            }*/
        }

        private static string ReplaceSpaces(string str)
        {
            var chars = str.ToCharArray();
            for (int i = 0; i < chars.Length; i++)
            {
                if (chars[i] == ' ')
                    chars[i] = '_';
                else
                    break;
            }

            for (int i = chars.Length - 1; i >= 0; i--)
            {
                if (chars[i] == ' ')
                    chars[i] = '_';
                else
                    break;
            }

            return new string(chars);
        }

        static void TranslateOne()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);
            var res = package.Resources
                .SelectMany(r => r.Resources)
                .First(r => r.ToString().Equals("990.scr"));

            var scr = res.GetScript(false);
            var strings = scr.Sections.FindAll(s => s is StringSection).SelectMany(s => ((StringSection)s).Strings);
            var save = strings.First(s => s.Value.Equals("  Save  "));
            save.Value = "  Сохра  ";
            res.SaveTranslate(scr.GetBytes());
        }

        // ExportScript<SimpeScriptBuilder>(false)
        static void ExportScript<T>(bool translate) where T : IScriptBuilder, new()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);
            var scr = package.Resources
                .SelectMany(r => r.Resources)
                .First(r => r.ToString().Equals("990.scr"));

            var text = new T().Decompile(scr.GetScript(translate));
            var suffix = translate ? "ru" : "en";
            File.WriteAllText($@"..\..\..\Sandbox\990_{suffix}.scr", text);
        }

        private static void FindTranslates()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);
            foreach (var r in package.Texts)
            {
                var enLines = r.GetText(false); // Оригинальный текст
                var ruLines = r.GetText(true);  // Уже переведенный текст

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

        private static void ExportRuTex()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);
            Directory.CreateDirectory("ru");
            foreach (var r in package.Texts)
            {
                var file = "ru/" + r.ToString();
                var hasTranslate = false;
                using (StreamWriter stream = new StreamWriter(file))
                {
                    var enLines = r.GetText(false);
                    var ruLines = r.GetText(true);

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

        private static void ExportEnTex()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);
            Directory.CreateDirectory("en");
            foreach (var r in package.Texts)
            {
                using (StreamWriter stream = new StreamWriter("en/" + r.ToString()))
                {
                    var lines = r.GetText(false);
                    foreach (var line in lines)
                        stream.Write(line + "\n\n");
                }
            }
        }

        private static void ExportEnScr()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);
            Directory.CreateDirectory("en");
            foreach (var r in package.Scripts)
            {
                var strings = r.GetScript(false).AllStrings.Where(s => s.Value.Length > 0);
                if (strings.Count() == 0)
                    continue;

                Console.WriteLine(r);
                using (StreamWriter stream = new StreamWriter("en/" + r.ToString()))
                {
                    foreach (var s in strings)
                        stream.Write(ReplaceSpaces(s.Value) + "\n\n");
                }
            }
        }

    }
}
