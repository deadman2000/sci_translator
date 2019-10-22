using System;
using System.IO;
using System.Reflection;
using System.Windows.Forms;

namespace SCI_Translator
{
    internal static class Program
    {
        /// <summary>
        /// Главная точка входа для приложения.
        /// </summary>
        [STAThread]
        private static void Main(string[] args)
        {
            string dir = Path.GetDirectoryName(Assembly.GetExecutingAssembly().Location);
            if (args.Length > 0) dir = args[0];

            //PrepareTranslate();
            //ApplyTranslate();

            SCIPackage package;
            try
            {
                package = new SCIPackage(dir);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
                return;
            }

            //ExportRuTex(package);
            //package.ExportText("D:/longbow.txt");
            //package.ExtractTranslate("D:/translate_ru.ts");

            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new FormMain(package));
        }

        private static void ExportRuTex(SCIPackage package)
        {
            Directory.CreateDirectory("ru");
            package.Resources.FindAll(r => r.Type == ResType.Text).ForEach(res =>
            {
                foreach (var r in res.Resources)
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
            });
        }

        private static void ExportEnTex(SCIPackage package)
        {
            Directory.CreateDirectory("en");
            package.Resources.FindAll(r => r.Type == ResType.Text).ForEach(res =>
            {
                foreach (var r in res.Resources)
                {
                    using (StreamWriter stream = new StreamWriter("en/" + r.ToString()))
                    {
                        var lines = r.GetText(false, false, false);
                        foreach (var line in lines)
                        {
                            stream.WriteLine(line);
                            stream.WriteLine();
                        }
                    }
                }
            });
        }

        private static void PrepareTranslate()
        {
            Linguist l = new Linguist();

            SCIPackage pEn = new SCIPackage("D:\\Dos\\GAMES\\Conquest\\");
            pEn.FillSource(l);

            SCIPackage pGer = new SCIPackage("D:\\Dos\\GAMES\\ConquestG\\");
            var tr = pGer.ExtractTranslate();
            //pGer.FillTranslate(l);

            l.Translate(tr);

            l.Save("D:/translate_ru.ts");
        }

        private static void ApplyTranslate()
        {
            SCIPackage pEn = new SCIPackage("D:\\Dos\\GAMES\\Conquest\\");
            Linguist l = new Linguist("D:/translate_ru.ts");
            pEn.ApplyTranslate(l);
        }
    }
}
