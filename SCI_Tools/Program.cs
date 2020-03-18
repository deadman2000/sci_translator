using McMaster.Extensions.CommandLineUtils;
using SCI_Translator;
using SCI_Translator.Resources;
using SCI_Translator.Scripts;
using SCI_Translator.Scripts.Builders;
using SCI_Translator.Scripts.Elements;
using SCI_Translator.Scripts.Sections;
using System;
using System.ComponentModel.DataAnnotations;
using System.IO;
using System.Linq;

namespace SCI_Tools
{
    [Subcommand(typeof(CompareTranslates), typeof(Test))]
    class Program
    {
        // https://natemcmaster.github.io/CommandLineUtils/

        public static int Main(string[] args)
            => CommandLineApplication.Execute<Program>(args);

        private int OnExecute(CommandLineApplication app)
        {
            Console.WriteLine("You must specify at a subcommand.");
            app.ShowHelp();
            return 1;
        }

        class PackageCommand
        {
            [Option(Description = "Original game directory", ShortName = "d", LongName = "dir")]
            [Required]
            public string GameDir { get; set; }

            [Option(Description = "Translated game directory", ShortName = "t", LongName = "trans")]
            public string TranslateDir { get; set; }

            protected SCIPackage package;

            protected virtual void OnExecute()
            {
                package = SCIPackage.Load(GameDir, TranslateDir);
            }
        }

        // test -d D:\Dos\GAMES\QG_EGA\
        [Command("test", Description = "for testing")]
        class Test : PackageCommand
        {
            protected override void OnExecute()
            {
                base.OnExecute();

                var mess = package.GetResouce<ResMessage>(1);
                mess.Read(false);

                Console.ReadKey();
            }
        }

        // compare -d D:\Dos\GAMES\QG_VGA\ -t D:\Dos\GAMES\QG_VGA_RUS\ -d2 D:\Dos\GAMES\QG_EGA\
        [Command("compare", Description = "Compare two translated games")]
        class CompareTranslates : PackageCommand
        {
            [Option(Description = "Second original game directory", ShortName = "d2", LongName = "dir2")]
            [Required]
            public string SecondGameDir { get; set; }

            [Option(Description = "Second translated game directory", ShortName = "t2", LongName = "trans2")]
            public string SecondTranslateDir { get; set; }

            protected SCIPackage package2;

            protected override void OnExecute()
            {
                base.OnExecute();

                package2 = SCIPackage.Load(SecondGameDir, SecondTranslateDir);

                Console.ReadKey();
            }
        }

        
        
        
        
        
        class Unsorted : PackageCommand // TODO разбить все необходимое на комманды, лишнее удалить
        {
            void CompareNewLines()
            {
                foreach (var res in package.Texts)
                {
                    Console.WriteLine(res);
                    var en = res.GetText(false);
                    var ru = res.GetText(true);
                    for (int i = 0; i < en.Length; i++)
                    {
                        if (en[i].Contains("\r\n") && !ru[i].Contains("\r\n") && ru[i].Contains("\n"))
                        {
                            Console.WriteLine(ru[i]);
                        }


                        if (ru[i].Contains("\r\n") && !en[i].Contains("\r\n") && en[i].Contains("\n"))
                        {
                            Console.WriteLine(ru[i]);
                        }
                    }
                }

            }

            private void ExportAll(ushort number)
            {
                ExportScript<CompanionBuilder>(number, false, $@"mycompnion\en_{number}.scr");
                ExportScript<CompanionBuilder>(number, true, $@"mycompnion\ru_{number}.scr");
                ExportScript<SimpeScriptBuilder>(number, false, $@"simple\en_{number}.scr");
                ExportScript<SimpeScriptBuilder>(number, true, $@"simple\ru_{number}.scr");
            }

            // ExportScript<SimpeScriptBuilder>(990, false, "990.scr")
            void ExportScript<T>(ushort number, bool translate, string filename)
                where T : IScriptBuilder, new()
            {
                var scr = package.GetResouce<ResScript>(number);
                var text = new T().Decompile(scr.GetScript(translate));
                File.WriteAllText(@"..\..\..\Sandbox\" + filename, text);
            }

            void FindSpaces()
            {
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

            private string ReplaceSpaces(string str)
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

            void TranslateOne()
            {
                var res = package.GetResouce<ResScript>(990);
                var scr = res.GetScript(false);
                var strings = scr.Sections.FindAll(s => s is StringSection).SelectMany(s => ((StringSection)s).Strings);
                var save = strings.First(s => s.Value.Equals("  Save  "));
                save.Value = "  Сохра  ";
                res.SaveTranslate(scr.GetBytes());
            }

            private void FindTranslates()
            {
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

            private void ExportRuTex()
            {
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

            private void ExportEnTex()
            {
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

            private void ExportEnScr()
            {
                Directory.CreateDirectory("en");
                foreach (var r in package.Scripts)
                {
                    var strings = r.GetScript(false).AllStrings.Where(s => !s.IsClassName).Where(s => s.Value.Length > 0);
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
}
