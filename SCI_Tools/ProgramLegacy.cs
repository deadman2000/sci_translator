using AngleSharp;
using AngleSharp.Dom;
using AngleSharp.Html.Dom;
using AngleSharp.Io;
using SCI_Translator.Resources;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Notabenoid
{
    internal class ProgramLegacy
    {
        private static string GAME_DIR = @"..\..\..\..\Conquest\";
        private static string Login;
        private static string Password;
        private const string BOOK_URL = "http://notabenoid.org/book/77921/";

        /*private static void Main(string[] args)
        {
            Login = args[0];
            Password = args[1];

            if (args.Length > 2)
                GAME_DIR = args[2];

            //ImportTranslate().Wait();
            Test2().Wait();

            Console.WriteLine("Completed");
            Console.ReadKey();
        }*/

        private static async Task<IBrowsingContext> CreateContext()
        {
            var requester = new DefaultHttpRequester();
            //requester.Headers["User-Agent"] = "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:69.0) Gecko/20100101 Firefox/69.0";

            var context = BrowsingContext.New(Configuration.Default.With(requester).WithDefaultLoader().WithDefaultCookies());

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

            return context;
        }

        /*private static async Task UploadPart(IBrowsingContext context, Resource r)
        {
            var document = await context.OpenAsync(BOOK_URL);

            var form = document.CreateElement<IHtmlFormElement>();
            form.Method = "POST";
            form.Action = "0/edit";
            document.Body.AppendElement(form);

            foreach (var n in new[] { "Chapter[title]", "Chapter[status]" })
            {
                var input = document.CreateElement("input") as IHtmlInputElement;
                input.Name = n;
                form.AppendElement(input);
            }

            var resultDocument = await form.SubmitAsync(new Dictionary<string, string> {
                { "Chapter[title]", r.ToString() },
                { "Chapter[status]", "0" }
            });

            if (resultDocument.StatusCode != System.Net.HttpStatusCode.OK)
            {
                Console.WriteLine(resultDocument.StatusCode);
            }

            document = await context.OpenAsync(BOOK_URL);

            var a = document.QuerySelectorAll("td.t a").First(e => e.Text().Equals(r.ToString())) as IHtmlAnchorElement;
            if (a == null)
                throw new Exception($"Part {r} create error");

            //a.Href + "/import"
        }

        private static async Task UploadOriginal()
        {
            var context = await CreateContext();

            SCIPackage package = new SCIPackage(GAME_DIR);
            var resources = package.Resources.FindAll(r => r.Type == ResType.Text).SelectMany(r => r.Resources);

            var res = resources.First(r => r.ToString().Equals("11.tex"));

            await UploadPart(context, res);
        }*/

        private static async Task ImportTranslate()
        {
            var context = await CreateContext();

            // List
            Dictionary<string, string> partsLinks = new Dictionary<string, string>();
            {
                var queryDocument = await context.OpenAsync(BOOK_URL);
                var parts = queryDocument.QuerySelectorAll("td.t>a");
                foreach (IHtmlAnchorElement a in parts)
                {
                    partsLinks[a.Text] = a.Href;
                }
            }

            // Translate
            Dictionary<string, string> translate = new Dictionary<string, string>();
            SCIPackage package = SCIPackage.Load(GAME_DIR);
            var resources = package.Texts;
            foreach (var r in resources)
            {
                Console.WriteLine(r);

                translate.Clear();
                var enLines = r.GetText(false);
                var ruLines = r.GetText(true);

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

                    while (true)
                    {
                        foreach (var e in document.QuerySelectorAll("td.o p.text"))
                        {
                            var id = ((IHtmlElement)e.Parent.Parent.Parent).Id.TrimStart('o');
                            enIds[e.Text()] = id;
                        }

                        var a = document.QuerySelector("#pages-bottom p.n a") as IHtmlAnchorElement;
                        if (a == null)
                            break;

                        document = await context.OpenAsync(a.Href);
                    }

                    foreach (var kv in translate)
                    {
                        if (!enIds.TryGetValue(kv.Key, out string id))
                        {
                            Console.WriteLine($"Id not found {kv}");
                            continue;
                        }

                        var ruEl = document.QuerySelector($"tr#o{id} td.t p.text");
                        if (ruEl != null)
                            continue; // Skipping translated

                        while (true)
                        {
                            var form = document.CreateElement<IHtmlFormElement>();
                            form.Method = "POST";
                            form.Action = id + "/translate";
                            document.Body.AppendElement(form);

                            var input = document.CreateElement("input") as IHtmlInputElement;
                            input.Name = "Translation[body]";
                            form.AppendElement(input);

                            try
                            {
                                var resultDocument = await form.SubmitAsync(new Dictionary<string, string> {
                                    { "Translation[body]", kv.Value },
                                });
                                if (resultDocument.StatusCode != System.Net.HttpStatusCode.OK)
                                {
                                    Console.WriteLine(resultDocument.StatusCode);
                                    continue;
                                }
                            }
                            catch (Exception ex)
                            {
                                Console.WriteLine(ex);
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}
