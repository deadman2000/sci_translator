using AngleSharp;
using AngleSharp.Dom;
using AngleSharp.Html.Dom;
using AngleSharp.Io;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace Notabenoid
{
    public class NbBook
    {
        private IBrowsingContext context;

        public string _notabenoidLogin;
        public string _notabenoidPassword;
        private string _bookUrl;

        public NbBook(string notabenoidLogin, string notabenoidPassword, string bookId)
        {
            _notabenoidLogin = notabenoidLogin;
            _notabenoidPassword = notabenoidPassword;
            _bookUrl = $"http://notabenoid.org/book/{bookId}/";
        }

        private async Task CreateContext()
        {
            if (context != null) return;

            Console.WriteLine("Notabenoid login");

            var requester = new DefaultHttpRequester();
            requester.Headers["User-Agent"] = "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:69.0) Gecko/20100101 Firefox/69.0";

            context = BrowsingContext.New(Configuration.Default.With(requester).WithDefaultLoader().WithDefaultCookies());

            // Login
            {
                var queryDocument = await context.OpenAsync("http://notabenoid.org/");
                var form = queryDocument.QuerySelector<IHtmlFormElement>("form");
                await form.SubmitAsync(new Dictionary<string, string> {
                    { "login[login]", _notabenoidLogin },
                    { "login[pass]", _notabenoidPassword },
                });
            }
        }

        public List<NbVolume> Volumes { get; set; }

        public NbVolume GetVolume(string name) => Volumes.FirstOrDefault(v => v.Name == name);

        /// <summary>
        /// Считывает все тома книги
        /// </summary>
        /// <returns></returns>
        public async Task ReadVolumes()
        {
            if (Volumes != null) return;

            await CreateContext();

            Console.WriteLine("Notabenoid Read volumes");
            var volumes = new List<NbVolume>();

            var document = await context.OpenAsync(_bookUrl);
            if (!document.BaseUri.Equals(_bookUrl))
                throw new Exception("Проблемы с авторизацией");

            var rows = document.QuerySelectorAll("td.t>a");
            foreach (IHtmlAnchorElement a in rows)
            {
                var id = (a.Parent.Parent as IHtmlElement).Id;
                var changed = (document.QuerySelector($"tr#{id} td:nth-child(3) span") as IHtmlElement).Title;
                var name = a.Text.ToUpper();

                volumes.Add(new NbVolume
                {
                    Id = id,
                    Name = name,
                    URL = a.Href,
                    DateChange = changed
                });
            }

            Volumes = volumes;
        }

        /// <summary>
        /// Выгружает все переводы из главы
        /// </summary>
        /// <param name="url"></param>
        /// <returns></returns>
        public async Task<Dictionary<string, string>> GetTranslates(string url)
        {
            var translates = new Dictionary<string, string>();

            var document = await context.OpenAsync(url);

            while (true)
            {
                foreach (var td in document.QuerySelectorAll("td.o")) // Ячейки с оригинальным текстом
                {
                    var id = ((IHtmlElement)td.Parent).Id;

                    var enEl = td.QuerySelector("p.text");
                    var en = enEl.Text().Replace('_', ' ').Replace("\n", "\r\n");

                    var ruEl = document.QuerySelectorAll($"tr#{id} td.t p.text").LastOrDefault();
                    if (ruEl == null)
                    {
                        continue;
                    }

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

            var document = await context.OpenAsync(_bookUrl + "dict?ajax=1");
            foreach (var div in document.QuerySelectorAll("div"))
            {
                var en = div.QuerySelector("span.o").Text();
                var ru = div.QuerySelector("span.t").Text();
                dict.Add(en, ru);
            }

            return dict;
        }

        #region Links

        private Dictionary<string, Dictionary<string, string>> _links;

        /// <summary>
        /// Считывает ссылки на ресурсы из JSON-файла
        /// </summary>
        /// <param name="file">Путь к загружаемому JSON-файлу</param>
        public void LoadLinks(string file)
        {
            if (File.Exists(file))
                _links = JsonConvert.DeserializeObject<Dictionary<string, Dictionary<string, string>>>(File.ReadAllText(file));
        }

        /// <summary>
        /// Собирает все ссылки на ресурсы из данной книги и сохраняет в файл
        /// </summary>
        /// <param name="file">Путь к сохраняемому JSON-файлу</param>
        /// <returns></returns>
        public async Task GatheringLinks(string file)
        {
            await CreateContext();
            await ReadVolumes();

            _links = new Dictionary<string, Dictionary<string, string>>();
            var tasks = Volumes.Select(v => GatherLinks(v.Name, v.URL));
            await Task.WhenAll(tasks.ToArray());

            File.WriteAllText(file, JsonConvert.SerializeObject(_links, Formatting.Indented));
        }

        private async Task GatherLinks(string res, string url)
        {
            Console.WriteLine(url);
            res = res.ToLower();

            var document = await context.OpenAsync(url);

            if (!_links.TryGetValue(res, out var links))
            {
                //lock (_links)
                {
                    links = new Dictionary<string, string>();
                    _links.Add(res, links);
                }
            }

            while (true)
            {
                foreach (var td in document.QuerySelectorAll("td.o")) // Ячейки с оригинальным текстом
                {
                    var id = ((IHtmlElement)td.Parent).Id;

                    var enEl = td.QuerySelector("p.text");
                    var en = enEl.Text().Replace('_', ' ');

                    var link = td.QuerySelector("a.ord").GetAttribute("href");

                    //lock (links)
                    {
                        links[Escape(en)] = link;
                    }
                }

                var a = document.QuerySelector("#pages-bottom p.n a") as IHtmlAnchorElement;
                if (a == null)
                    break;

                document = await context.OpenAsync(a.Href);
            }
        }

        /// <summary>
        /// Возвращает ссылку на перевод
        /// </summary>
        /// <param name="resource"></param>
        /// <param name="en"></param>
        /// <returns></returns>
        public string GetLink(string resource, string en)
        {
            if (_links.TryGetValue(resource.ToLower(), out var rows) && rows.TryGetValue(Escape(en), out var link))
                return link;
            return null;
        }

        private string Escape(string str)
        {
            return str.Replace("\r", "\\r").Replace("\n", "\\n");
        }

        #endregion
    }
}
