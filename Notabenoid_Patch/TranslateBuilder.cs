using AngleSharp;
using AngleSharp.Dom;
using AngleSharp.Html.Dom;
using AngleSharp.Io;
using SCI_Translator;
using SCI_Translator.Resources;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Notabenoid_Patch
{
    public class TranslateBuilder
    {
        private const string BOOK_URL = "http://notabenoid.org/book/77921/";

        const string CACHE_FILE = "parts.cache";

        public static string GAME_DIR = Environment.GetEnvironmentVariable("GAME_DIR") ?? "../Conquest/";
        public static string NN_LOGIN = Environment.GetEnvironmentVariable("NN_LOGIN");
        public static string NN_PASSWORD = Environment.GetEnvironmentVariable("NN_PASSWORD");

        public static string TRANSLATE_GAME_DIR => Path.Combine(GAME_DIR, "TRANSLATE");

        private IBrowsingContext context;
        internal static bool NO_CACHE;

        public event Action<int> ReportProgress;
        public event Action Completed;

        public bool IsBuild { get; private set; }

        private async Task CreateContext()
        {
            if (context != null) return;

            var requester = new DefaultHttpRequester();
            requester.Headers["User-Agent"] = "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:69.0) Gecko/20100101 Firefox/69.0";

            context = BrowsingContext.New(Configuration.Default.With(requester).WithDefaultLoader().WithDefaultCookies());

            // Login
            {
                var queryDocument = await context.OpenAsync("http://notabenoid.org/");
                var form = queryDocument.QuerySelector<IHtmlFormElement>("form");
                await form.SubmitAsync(new Dictionary<string, string> {
                    { "login[login]", NN_LOGIN },
                    { "login[pass]", NN_PASSWORD },
                });
            }
        }

        public async Task<bool> Build()
        {
            IsBuild = true;
            try
            {
                await CreateContext();
                var parts = await GetParts();
                if (parts == null)
                    return false;

                Dictionary<string, string> cache;
                if (File.Exists(CACHE_FILE) && !NO_CACHE)
                    cache = File.ReadAllLines(CACHE_FILE)
                        .Select(l => l.Split(':', 2))
                        .ToDictionary(p => p[0], p => p[1]);
                else
                    cache = new Dictionary<string, string>();

                SCIPackage package = SCIPackage.Load(GAME_DIR, TRANSLATE_GAME_DIR);
                var texts = package.Texts;
                var scripts = package.Scripts;

                int total = texts.Count() + scripts.Count() + 2;
                int progress = 0;

                bool hasChanges = false;

                foreach (var r in texts)
                {
                    progress++;
                    ReportProgress?.Invoke(progress * 100 / total);

                    if (!parts.TryGetValue(r.ToString(), out Part part)) // Ресурс без перевода
                        continue;

                    if (String.IsNullOrEmpty(part.DateChange)) // Пропускаем части без перевода
                        continue;

                    if (cache.TryGetValue(r.ToString(), out string changed) && changed.Equals(part.DateChange))
                        continue;

                    var enLines = r.GetText(false); // Оригинальный текст
                    var ruLines = r.GetText(true);  // Уже переведенный текст

                    if (enLines.Length != ruLines.Length)
                    {
                        Console.WriteLine($"{r} Lines count error");
                        continue;
                    }

                    var translates = await GetTranslates(part.URL);
                    bool hasTranslate = false;

                    for (int i = 0; i < enLines.Length; i++)
                    {
                        var en = enLines[i];
                        if (String.IsNullOrEmpty(en)) continue;

                        if (!translates.TryGetValue(en, out string tr))
                            en = en.Replace("\n", "\r\n");

                        if (!translates.TryGetValue(en, out tr))
                        {
                            //Console.WriteLine($"Missing tex {r} - {en}");
                            continue;
                        }
                        if (tr == null) continue;

                        var ru = ruLines[i];
                        if (tr.Equals(ru)) // Пропускаем старый перевод
                            continue;

                        hasTranslate = true;

                        ruLines[i] = tr;
                    }

                    if (hasTranslate)
                    {
                        Console.WriteLine(r);
                        r.SetText(ruLines);
                        hasChanges = true;
                    }
                }

                foreach (var r in scripts)
                {
                    progress++;
                    ReportProgress?.Invoke(progress * 100 / total);

                    if (!parts.TryGetValue(r.ToString(), out Part part)) // Ресурс без перевода
                        continue;

                    if (String.IsNullOrEmpty(part.DateChange)) // Пропускаем части без перевода
                        continue;

                    if (cache.TryGetValue(r.ToString(), out string changed) && changed.Equals(part.DateChange))
                        continue;

                    var enScr = r.GetScript(false);
                    var ruScr = r.GetScript(true);

                    var enStrings = enScr.AllStrings.Where(s => !s.IsClassName).ToArray();
                    var ruStrings = ruScr.AllStrings.Where(s => !s.IsClassName).ToArray();

                    var translates = await GetTranslates(part.URL);
                    bool hasTranslate = false;

                    for (int i = 0; i < enStrings.Length; i++)
                    {
                        var en = enStrings[i].Value;
                        if (String.IsNullOrEmpty(en)) continue;

                        if (!translates.TryGetValue(en, out string tr))
                        {
                            //Console.WriteLine($"Missing scr {r} - {en}");
                            continue;
                        }
                        if (tr == null) continue;
                        
                        var ru = ruStrings[i].Value;
                        if (tr.Equals(ru)) // Пропускаем старый перевод
                            continue;

                        hasTranslate = true;

                        ruStrings[i].Value = tr;
                    }

                    if (hasTranslate)
                    {
                        Console.WriteLine(r);
                        r.SaveTranslate(ruScr.GetBytes());
                        hasChanges = true;
                    }
                }

                if (!hasChanges)
                    return false;

                SaveCache(parts.Values.AsEnumerable());
                return true;
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex);
                throw ex;
            }
            finally
            {
                IsBuild = false;
                Completed?.Invoke();
            }
        }

        private void SaveCache(IEnumerable<Part> parts)
        {
            using (StreamWriter fs = new StreamWriter(CACHE_FILE, false, Encoding.UTF8))
            {
                foreach (var p in parts)
                {
                    fs.WriteLine($"{p.Name}:{p.DateChange}");
                }
            }
        }

        class Part
        {
            public string Id;
            public string Name;
            public string URL;
            public string DateChange;
        }


        private async Task<Dictionary<string, Part>> GetParts()
        {
            var partsLinks = new Dictionary<string, Part>();

            var document = await context.OpenAsync(BOOK_URL);
            if (!document.BaseUri.Equals(BOOK_URL))
                throw new Exception("Проблемы с авторизацией");

            var parts = document.QuerySelectorAll("td.t>a");
            foreach (IHtmlAnchorElement a in parts)
            {
                var id = (a.Parent.Parent as IHtmlElement).Id;
                var changed = (document.QuerySelector($"tr#{id} td:nth-child(3) span") as IHtmlElement).Title;
                var name = a.Text.ToUpper();

                partsLinks[name] = new Part
                {
                    Id = id,
                    Name = name,
                    URL = a.Href,
                    DateChange = changed
                };
            }

            return partsLinks;
        }

        private async Task<Dictionary<string, string>> GetTranslates(string url)
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
                    {
                        //translates[en] = null;
                        continue;
                    }

                    var en = e.Text().Replace('_', ' ').Replace("\n", "\r\n");
                    var ru = ruEl.Text().Replace('_', ' ').Replace("\n", "\r\n");

                    translates[en] = ru;
                }

                var a = document.QuerySelector("#pages-bottom p.n a") as IHtmlAnchorElement;
                if (a == null)
                    break;

                document = await context.OpenAsync(a.Href);
            }

            return translates;
        }

        public async Task<Dictionary<string, string>> GetDict()
        {
            await CreateContext();

            var dict = new Dictionary<string, string>();

            var document = await context.OpenAsync(BOOK_URL + "dict?ajax=1");
            foreach (var div in document.QuerySelectorAll("div"))
            {
                var en = div.QuerySelector("span.o").Text();
                var ru = div.QuerySelector("span.t").Text();
                dict.Add(en, ru);
            }

            return dict;
        }
    }
}
