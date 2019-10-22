using AngleSharp;
using AngleSharp.Dom;
using AngleSharp.Html.Dom;
using SCI_Translator;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Notabenoid
{
    internal class Program
    {
        private const string GAME_DIR = @"D:\Dos\GAMES\Conquest\";
        static string Login;
        static string Password;

        private static void Main(string[] args)
        {
            Login = args[0];
            Password = args[1];

            Work().Wait();

            Console.WriteLine("Completed");
            Console.ReadKey();
        }

        private static async Task Test()
        {
            var context = BrowsingContext.New(Configuration.Default.WithDefaultLoader().WithDefaultCookies());

            // Login
            {
                var queryDocument = await context.OpenAsync("http://notabenoid.org/");
                var form = queryDocument.QuerySelector<IHtmlFormElement>("form");
                var resultDocument = await form.SubmitAsync(new Dictionary<string, string> {
                    { "login[login]", Login },
                    { "login[pass]", Password },
                });
                Console.WriteLine(resultDocument.StatusCode);
            }

            {
                var url = "http://notabenoid.org/book/77918/453633/";
                var document = await context.OpenAsync(url);

                Dictionary<string, string> enIds = new Dictionary<string, string>();
                foreach (var e in document.QuerySelectorAll("td.o p.text"))
                {
                    var id = ((IHtmlElement)e.Parent.Parent.Parent).Id.TrimStart('o');
                    enIds[e.Text()] = id;
                }
            }
        }

        private static async Task Work()
        {
            var context = BrowsingContext.New(Configuration.Default.WithDefaultLoader().WithDefaultCookies());

            // Login
            {
                var queryDocument = await context.OpenAsync("http://notabenoid.org/");
                var form = queryDocument.QuerySelector<IHtmlFormElement>("form");
                var resultDocument = await form.SubmitAsync(new Dictionary<string, string> {
                    { "login[login]", Login },
                    { "login[pass]", Password },
                });
                Console.WriteLine(resultDocument.StatusCode);
            }

            // List
            Dictionary<string, string> partsLinks = new Dictionary<string, string>();
            {
                var queryDocument = await context.OpenAsync("http://notabenoid.org/book/77918");
                var parts = queryDocument.QuerySelectorAll("td.t>a");
                foreach (IHtmlAnchorElement a in parts)
                {
                    partsLinks[a.Text] = a.Href;
                }
            }

            // Translate
            Dictionary<string, string> translate = new Dictionary<string, string>();
            SCIPackage package = new SCIPackage(GAME_DIR);
            var resources = package.Resources.FindAll(r => r.Type == ResType.Text).SelectMany(res => res.Resources);
            foreach (var r in resources)
            {
                translate.Clear();
                var enLines = r.GetText(false, false, false);
                var ruLines = r.GetText(true, false, false);

                for (int i = 0; i < enLines.Length; i++)
                {
                    if (enLines[i].Trim().Length == 0) continue;

                    if (!enLines[i].Equals(ruLines[i]))
                    {
                        translate[enLines[i].Trim()] = ruLines[i];
                    }
                }

                if (translate.Count > 0)
                {
                    var url = partsLinks[r.ToString()];
                    var document = await context.OpenAsync(url + "/");

                    Dictionary<string, string> enIds = new Dictionary<string, string>();
                    foreach (var e in document.QuerySelectorAll("td.o p.text"))
                    {
                        var id = ((IHtmlElement)e.Parent.Parent.Parent).Id.TrimStart('o');
                        enIds[e.Text()] = id;
                    }

                    foreach (var kv in translate)
                    {
                        if (!enIds.TryGetValue(kv.Key, out string id))
                        {
                            Console.WriteLine($"Id not found {kv}");
                            continue;
                        }

                        var form = document.CreateElement<IHtmlFormElement>();
                        form.Method = "POST";
                        form.Action = id + "/translate";
                        document.Body.AppendElement(form);

                        var input = document.CreateElement("input") as IHtmlInputElement;
                        input.Name = "Translation[body]";
                        form.AppendElement(input);

                        var resultDocument = await form.SubmitAsync(new Dictionary<string, string> {
                            { "Translation[body]", kv.Value },
                        });

                        if (resultDocument.StatusCode != System.Net.HttpStatusCode.OK)
                        {
                            Console.WriteLine(resultDocument.StatusCode);
                        }
                    }
                }
            }
        }
    }
}
