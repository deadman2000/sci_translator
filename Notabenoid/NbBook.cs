using AngleSharp;
using AngleSharp.Dom;
using AngleSharp.Html.Dom;
using AngleSharp.Io;
using Newtonsoft.Json;
using SCI_Translator.Resources;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
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
                var changed = (document.QuerySelector($"tr#{id} td:nth-child(3) span") as IHtmlElement)?.Title;
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

        #region Upload

        class ResStrings
        {
            public Resource Resource;
            public string[] En;
            public string[] Tr;
            public string Url;
        }


        /// <summary>
        /// Загружает исходный текст с переводом в кингу
        /// </summary>
        /// <param name="package"></param>
        /// <returns></returns>
        public async Task Upload(SCIPackage package)
        {
            await CreateContext();

            await ReadVolumes();

            var document = await context.OpenAsync(_bookUrl);

            Console.WriteLine("Getting strings");
            var resources = package.Texts.Cast<Resource>()
                .Union(package.Scripts.Cast<Resource>())
                .Union(package.Messages.Cast<Resource>());

            List<ResStrings> resStrings = new List<ResStrings>();
            foreach (var res in resources)
            {
                var en = res.GetStrings(false);
                if (en == null || en.Length == 0) continue;
                if (!en.Any(s => s.Length > 0)) continue; // Full empty resource

                var tr = res.GetStrings(true);
                resStrings.Add(new ResStrings { Resource = res, En = en, Tr = tr });
            }

            resStrings = resStrings.OrderBy(r => r.Resource.Type)
                                   .ThenBy(r => r.Resource.Number)
                                   .ToList();

            resStrings = resStrings.Take(10).ToList(); // DEBUG!!

            Console.WriteLine($"Create {resStrings.Count} volumes");
            foreach (var res in resStrings)
            {
                var vol = Volumes.FirstOrDefault(v => v.Name.Equals(res.Resource.FileName, StringComparison.OrdinalIgnoreCase));
                if (vol != null)
                    res.Url = vol.URL;
                else
                    res.Url = await CreateVolume(document, res.Resource.FileName);
            }

            var tasks = resStrings
                .Select(r => UploadRes(r))
                .ToArray();
            await Task.WhenAll(tasks);
        }

        /// <summary>
        /// Создает раздел в книге
        /// </summary>
        /// <param name="volumeName"></param>
        /// <returns>Ссылка на новый раздел</returns>
        private async Task<string> CreateVolume(IDocument document, string volumeName)
        {
            Console.WriteLine($"Create volume {volumeName}");

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
                { "Chapter[title]", volumeName },
                { "Chapter[status]", "0" }
            });

            if (resultDocument.StatusCode != System.Net.HttpStatusCode.OK)
            {
                Console.WriteLine(resultDocument.StatusCode);
            }

            document = await context.OpenAsync(_bookUrl);

            var a = document.QuerySelectorAll("td.t>a").First(e => e.Text().Equals(volumeName)) as IHtmlAnchorElement;
            if (a == null)
                throw new Exception($"Part {volumeName} create error");

            return a.Href;
        }

        private async Task UploadRes(ResStrings r)
        {
            Console.WriteLine($"Upload strings for {r.Resource.FileName}");

            var document = await context.OpenAsync(r.Url);

            var form = document.CreateElement<IHtmlFormElement>();
            form.Method = "POST";
            form.Action = r.Url + "/import_text_save";
            document.Body.AppendElement(form);

            var added = new HashSet<string>();

            int i = 0;
            foreach (var en in r.En)
            {
                if (added.Contains(en)) continue; // Пропускаем повторяющиеся строки в главе
                added.Add(en);

                var input = document.CreateElement("input") as IHtmlInputElement;
                input.Name = $"t[txt][{i}]";
                input.Value = ReplaceSpaces(en);
                form.AppendElement(input);
                i++;
            }

            var resultDocument = await form.SubmitAsync();

            if (resultDocument.StatusCode != System.Net.HttpStatusCode.OK)
                Console.WriteLine($"{document.Url} {resultDocument.StatusCode}");
        }

        /*private async Task ApplyTranslate(ResStrings r)
        {
            var document = await context.OpenAsync(r.Url);

            Dictionary<string, string> enIds = new Dictionary<string, string>();

            while (true)
            {
                foreach (var e in document.QuerySelectorAll("td.o p.text"))
                {
                    var id = ((IHtmlElement)e.Parent.Parent.Parent).Id.TrimStart('o');

                    var ruEl = document.QuerySelector($"tr#o{id} td.t p.text");
                    if (ruEl != null)
                        continue; // Skipping translated

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
        }*/

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

        #endregion
    }
}
