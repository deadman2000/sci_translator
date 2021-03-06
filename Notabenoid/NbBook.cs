﻿using AngleSharp;
using AngleSharp.Dom;
using AngleSharp.Html.Dom;
using AngleSharp.Io;
using Newtonsoft.Json;
using SCI_Translator.Resources;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Threading.Tasks;

namespace Notabenoid
{
    public class NbBook
    {
        private IBrowsingContext context;

        private string _notabenoidLogin;
        private string _notabenoidPassword;
        private string _bookUrl;

        public string BookId { get; }

        public NbBook(string notabenoidLogin, string notabenoidPassword, string bookId)
        {
            _notabenoidLogin = notabenoidLogin;
            _notabenoidPassword = notabenoidPassword;
            BookId = bookId;

            _bookUrl = $"http://notabenoid.org/book/{bookId}/";
        }

        private async Task<IDocument> GetDocumentAsync(string url)
        {
            IDocument document = null;
            for (int i = 0; i < 50; i++)
            {
                document = await context.OpenAsync(url);
                if (document.StatusCode != HttpStatusCode.OK)
                {
                    await Task.Delay(200);
                    continue;
                }
                return document;
            }
            Console.WriteLine($"{url} returns {document.StatusCode}");
            return null;
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
                var queryDocument = await GetDocumentAsync("http://notabenoid.org/");
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

            var document = await GetDocumentAsync(_bookUrl);
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
                    Id = id.Substring(2),
                    Name = name,
                    URL = a.Href,
                    DateChange = changed
                });
            }

            Volumes = volumes;
        }

        /// <summary>
        /// Обновление дат изменения для томов
        /// </summary>
        /// <returns></returns>
        public async Task UpdateDates()
        {
            if (Volumes == null) return;
            Console.WriteLine("Notabenoid Update dates");

            var document = await GetDocumentAsync(_bookUrl);
            if (!document.BaseUri.Equals(_bookUrl))
                throw new Exception("Проблемы с авторизацией");

            var rows = document.QuerySelectorAll("td.t>a");
            foreach (IHtmlAnchorElement a in rows)
            {
                var id = (a.Parent.Parent as IHtmlElement).Id;
                var changed = (document.QuerySelector($"tr#{id} td:nth-child(3) span") as IHtmlElement)?.Title;
                var name = a.Text.ToUpper();
                var vol = Volumes.Find(v => v.Name.Equals(name, StringComparison.OrdinalIgnoreCase));
                if (vol != null)
                    vol.DateChange = changed;
            }
        }

        /// <summary>
        /// Выгружает все переводы из главы
        /// </summary>
        /// <param name="url"></param>
        /// <param name="withNotCompleted">Добавить строки без перевода</param>
        /// <returns></returns>
        public async Task<Dictionary<string, string>> GetTranslates(string url, bool withNotCompleted = false)
        {
            var translates = new Dictionary<string, string>();

            var document = await GetDocumentAsync(url);

            while (true)
            {
                foreach (var td in document.QuerySelectorAll("td.o")) // Ячейки с оригинальным текстом
                {
                    var id = ((IHtmlElement)td.Parent).Id;

                    var enEl = td.QuerySelector("p.text");
                    var en = UnreplaceSpaces(enEl.Text());

                    var ruEl = document.QuerySelectorAll($"tr#{id} td.t p.text").LastOrDefault();
                    if (ruEl == null)
                    {
                        if (withNotCompleted && !translates.ContainsKey(en)) translates.Add(en, null);
                        continue;
                    }

                    var ru = UnreplaceSpaces(ruEl.Text());
                    translates[en] = ru;
                }

                var a = document.QuerySelector("#pages-bottom p.n a") as IHtmlAnchorElement;
                if (a == null)
                    break;

                document = await GetDocumentAsync(a.Href);
            }

            return translates;
        }

        public async Task<List<NbPart>> GetParts(NbVolume vol)
        {
            var parts = new List<NbPart>();

            var document = await GetDocumentAsync(vol.URL);

            while (true)
            {
                foreach (var td in document.QuerySelectorAll("td.o")) // Ячейки с оригинальным текстом
                {
                    var id = ((IHtmlElement)td.Parent).Id;

                    var enEl = td.QuerySelector("p.text");

                    var part = new NbPart
                    {
                        Volume = vol,
                        Id = id.Substring(1),
                        En = UnreplaceSpaces(enEl.Text()),
                        Url = td.QuerySelector("a.ord").GetAttribute("href")
                    };

                    var ruEl = document.QuerySelectorAll($"tr#{id} td.t p.text").LastOrDefault();
                    if (ruEl != null)
                        part.Tr = UnreplaceSpaces(ruEl.Text());

                    parts.Add(part);
                }

                var a = document.QuerySelector("#pages-bottom p.n a") as IHtmlAnchorElement;
                if (a == null)
                    break;

                document = await GetDocumentAsync(a.Href);
            }

            return parts;
        }

        public async Task<Dictionary<string, string>> GetDict()
        {
            await CreateContext();

            var dict = new Dictionary<string, string>();

            var document = await GetDocumentAsync(_bookUrl + "dict?ajax=1");
            foreach (var div in document.QuerySelectorAll("div"))
            {
                var en = div.QuerySelector("span.o").Text();
                var ru = div.QuerySelector("span.t").Text();
                dict.Add(en, ru);
            }

            return dict;
        }

        /// <summary>
        /// Добавляет в главу перевод
        /// </summary>
        /// <param name="volumeName"></param>
        /// <param name="en"></param>
        /// <param name="tr"></param>
        /// <returns></returns>
        public async Task AddTranslate(string volumeName, string en, string tr)
        {
            await CreateContext();
            await ReadVolumes();

            var volume = Volumes.Find(v => v.Name.Equals(volumeName, StringComparison.OrdinalIgnoreCase));

            var document = await GetDocumentAsync(volume.URL);

            while (true)
            {
                foreach (var td in document.QuerySelectorAll("td.o")) // Ячейки с оригинальным текстом
                {
                    var id = ((IHtmlElement)td.Parent).Id.Substring(1);

                    var enEl = td.QuerySelector("p.text");
                    var enRow = UnreplaceSpaces(enEl.Text());
                    if (enRow.Equals(en))
                    {
                        await TranslateRow(document, id, tr);
                    }
                }

                var a = document.QuerySelector("#pages-bottom p.n a") as IHtmlAnchorElement;
                if (a == null)
                    break;

                document = await GetDocumentAsync(a.Href);
            }
        }

        private async Task TranslateRow(IDocument document, string id, string tr)
        {
            var form = document.CreateElement<IHtmlFormElement>();
            form.Method = "POST";
            form.Action = document.BaseUri + "/" + id + "/translate";
            document.Body.AppendElement(form);

            var input = document.CreateElement("input") as IHtmlInputElement;
            input.Name = "Translation[body]";
            input.Value = tr;
            form.AppendElement(input);

            var resultDocument = await form.SubmitAsync();
            if (resultDocument.StatusCode != HttpStatusCode.OK)
            {
                Console.WriteLine(resultDocument.Body.Text());
                throw new Exception("Status: " + resultDocument.StatusCode);
            }

        }

        #region Links

        public Dictionary<string, Dictionary<string, string>> Links { get; internal set; } = new Dictionary<string, Dictionary<string, string>>();

        private async Task GatherLinks(string res, string url)
        {
            Console.WriteLine($"{res} - {url}");
            res = res.ToLower();

            var document = await GetDocumentAsync(url);
            if (document == null)
                Console.WriteLine($"Can't get {url}");

            Console.WriteLine($"{document.StatusCode} {document.Title}");

            Dictionary<string, string> links;

            lock (Links)
            {
                if (!Links.TryGetValue(res, out links))
                {
                    links = new Dictionary<string, string>();
                    Links.Add(res, links);
                }
            }

            while (true)
            {
                foreach (var td in document.QuerySelectorAll("td.o")) // Ячейки с оригинальным текстом
                {
                    var id = ((IHtmlElement)td.Parent).Id;

                    var enEl = td.QuerySelector("p.text");
                    var en = UnreplaceSpaces(enEl.Text());

                    var link = td.QuerySelector("a.ord").GetAttribute("href");

                    links[EscapeNewLine(en)] = link;
                }

                var a = document.QuerySelector("#pages-bottom p.n a") as IHtmlAnchorElement;
                if (a == null)
                    break;

                document = await GetDocumentAsync(a.Href);
            }
        }

        /// <summary>
        /// Возвращает ссылку на перевод
        /// </summary>
        /// <param name="resource"></param>
        /// <param name="en"></param>
        /// <returns></returns>
        public async Task<string> GetLink(string resource, string en)
        {
            await ReadVolumes();

            if (!Links.ContainsKey(resource.ToLower()))
            {
                var vol = GetVolume(resource);
                if (vol == null) return null;

                await GatherLinks(resource, vol.URL);
            }

            if (Links.TryGetValue(resource.ToLower(), out var rows))
                if (rows.TryGetValue(EscapeNewLine(en), out var link))
                    return link;
            return null;
        }

        private string EscapeNewLine(string str)
        {
            return str.Replace("\r", "").Replace("\n", "\\n");
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

            var document = await GetDocumentAsync(_bookUrl);

            Console.WriteLine("Getting strings");
            var resources = package.GetTextResources();

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
        /// Загружает исходный текст с переводом в кингу
        /// </summary>
        /// <param name="package"></param>
        /// <returns></returns>
        public async Task Upload(SCIPackage package, string resourceName)
        {
            await CreateContext();

            await ReadVolumes();

            var document = await GetDocumentAsync(_bookUrl);

            Console.WriteLine("Getting strings");
            var res = package.GetResouce(resourceName);

            List<ResStrings> resStrings = new List<ResStrings>();
            var en = res.GetStrings(false);
            if (en == null || en.Length == 0) return;
            if (!en.Any(s => s.Length > 0)) return; // Full empty resource

            var tr = res.GetStrings(true);
            var str = new ResStrings { Resource = res, En = en, Tr = tr };
            resStrings.Add(str);

            Console.WriteLine($"Create {resStrings.Count} volumes");
            var vol = Volumes.FirstOrDefault(v => v.Name.Equals(res.FileName, StringComparison.OrdinalIgnoreCase));
            if (vol != null)
                str.Url = vol.URL;
            else
                str.Url = await CreateVolume(document, res.FileName);

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

            if (resultDocument.StatusCode != HttpStatusCode.OK)
            {
                Console.WriteLine(resultDocument.StatusCode);
            }

            document = await GetDocumentAsync(_bookUrl);

            var a = document.QuerySelectorAll("td.t>a").First(e => e.Text().Equals(volumeName)) as IHtmlAnchorElement;
            if (a == null)
                throw new Exception($"Part {volumeName} create error");

            return a.Href;
        }

        private async Task UploadRes(ResStrings r)
        {
            Console.WriteLine($"Upload strings for {r.Resource.FileName}");

            var document = await GetDocumentAsync(r.Url);

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

            if (resultDocument.StatusCode != HttpStatusCode.OK)
                Console.WriteLine($"{document.Url} {resultDocument.StatusCode}");
        }

        /*private async Task ApplyTranslate(ResStrings r)
        {
            var document = await GetDocumentAsync(r.Url);

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

                document = await GetDocumentAsync(a.Href);
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
                        if (resultDocument.StatusCode != HttpStatusCode.OK)
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

        private string UnreplaceSpaces(string str) => str.Replace('_', ' ').Replace("\n", "\r\n");

        #endregion

        public async Task Remove(NbPart part)
        {
            var cookie = context.GetCookie(new Url(_bookUrl));
            var url = $"{_bookUrl}{part.Volume.Id}/{part.Id}/remove";

            WebRequest request = WebRequest.Create(url);
            request.Method = "POST";
            request.Headers[HttpRequestHeader.Cookie] = cookie;
            await request.GetResponseAsync();

            part.Removed = true;
        }
    }
}
