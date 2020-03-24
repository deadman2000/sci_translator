using SCI_Translator.Resources;
using SCI_Translator.Scripts.Builders;
using System;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace SCI_Tools
{
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

        protected override async Task Do()
        {
            throw new NotImplementedException();
        }
    }
}
