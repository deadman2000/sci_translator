using AngleSharp;
using AngleSharp.Dom;
using AngleSharp.Html.Dom;
using AngleSharp.Io;
using SCI_Translator;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Notabenoid_Patch
{
    internal class Program
    {
        private static string GAME_DIR = @"./Conquest/";

        private const string BOOK_URL = "http://notabenoid.org/book/77921/";

        private static IBrowsingContext context;

        private static void Main(string[] args)
        {
            if (args.Length > 2)
                GAME_DIR = args[2];

            Patch(args[0], args[1]).Wait();

            Console.WriteLine("Completed");
        }

        private static async Task Patch(string login, string password)
        {
            context = await CreateContext(login, password);
            var parts = await GetParts();

            SCIPackage package = new SCIPackage(GAME_DIR);

            foreach (var r in package.Texts)
            {
                if (!parts.TryGetValue(r.ToString(), out string url)) // Ресурс без перевода
                    continue;

                var enLines = r.GetText(false, false, false); // Оригинальный текст
                var ruLines = r.GetText(true, false, false);  // Уже переведенный текст

                if (enLines.Length != ruLines.Length)
                {
                    Console.WriteLine($"{r} Lines count error");
                    continue;
                }

                var translates = await GetTranslates(url);
                bool hasTranslate = false;

                for (int i = 0; i < enLines.Length; i++)
                {
                    var en = enLines[i];
                    var ru = ruLines[i];

                    if (!translates.TryGetValue(en.Trim(), out string tr))
                        continue;

                    if (tr.Trim().Equals(ru.Trim())) // Пропускаем старый перевод
                        continue;

                    hasTranslate = true;

                    // Восстанавливаем пробелы
                    var leftSpaces = en.Length - en.TrimStart(' ').Length;
                    var rightSpaces = en.Length - en.TrimEnd(' ').Length;

                    ruLines[i] = new string(' ', leftSpaces) + tr + new string(' ', rightSpaces);
                }

                if (hasTranslate)
                {
                    Console.WriteLine(r);
                    r.SetText(ruLines, false);
                }
            }
        }

        private static async Task<IBrowsingContext> CreateContext(string login, string password)
        {
            var requester = new DefaultHttpRequester();
            requester.Headers["User-Agent"] = "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:69.0) Gecko/20100101 Firefox/69.0";

            var context = BrowsingContext.New(Configuration.Default.With(requester).WithDefaultLoader().WithDefaultCookies());

            // Login
            {
                var queryDocument = await context.OpenAsync("http://notabenoid.org/");
                var form = queryDocument.QuerySelector<IHtmlFormElement>("form");
                var resultDocument = await form.SubmitAsync(new Dictionary<string, string> {
                    { "login[login]", login },
                    { "login[pass]", password },
                });
                Console.WriteLine($"Auth: {resultDocument.StatusCode}");
            }

            return context;
        }

        private static async Task<Dictionary<string, string>> GetParts()
        {
            var partsLinks = new Dictionary<string, string>();

            var document = await context.OpenAsync(BOOK_URL);
            var parts = document.QuerySelectorAll("td.t>a");
            foreach (IHtmlAnchorElement a in parts)
            {
                partsLinks[a.Text] = a.Href;
            }

            return partsLinks;
        }

        private static async Task<Dictionary<string, string>> GetTranslates(string url)
        {
            var translates = new Dictionary<string, string>();

            var document = await context.OpenAsync(url);

            while (true)
            {
                foreach (var e in document.QuerySelectorAll("td.o p.text"))
                {
                    var id = ((IHtmlElement)e.Parent.Parent.Parent).Id;

                    var ruEl = document.QuerySelectorAll($"tr#{id} td.t p.text").LastOrDefault();
                    if (ruEl == null)
                        continue;

                    translates[e.Text()] = ruEl.Text();
                }

                var a = document.QuerySelector("#pages-bottom p.n a") as IHtmlAnchorElement;
                if (a == null)
                    break;

                document = await context.OpenAsync(a.Href);
            }

            return translates;
        }
    }
}
