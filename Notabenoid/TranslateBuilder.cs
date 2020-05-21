using SCI_Translator.Resources;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Notabenoid
{
    public class TranslateBuilder
    {
        const string CACHE_FILE = "parts.cache";
        public static bool NO_CACHE = false;

        public string GameDir { get; internal set; }
        public string TranslateDir { get; internal set; }

        public TranslateBuilder(string notabenoidLogin, string notabenoidPassword, string bookId, string gameDir, string translateDir)
        {
            Book = new NbBook(notabenoidLogin, notabenoidPassword, bookId);
            GameDir = gameDir;
            TranslateDir = translateDir ?? Path.Combine(GameDir, "TRANSLATE");
        }

        public NbBook Book { get; }

        private Dictionary<string, string> _cache;

        public event Action<int> ReportProgress;
        public event Action Completed;

        public bool IsBuild { get; private set; }

        private int _progress;
        private int _total;
        private bool _hasChanges = false;

        public SCIPackage GetPackage()
        {
            return SCIPackage.Load(GameDir, TranslateDir);
        }

        public async Task<bool> Build()
        {
            IsBuild = true;
            try
            {
                if (Book.Volumes == null)
                    await Book.ReadVolumes();
                else
                    await Book.UpdateDates();
                ReadCache();

                var package = GetPackage();
                var texts = package.Texts;
                var scripts = package.Scripts;

                _progress = 0;
                _total = texts.Count() + scripts.Count() + 2;

                _hasChanges = false;

                await Task.WhenAll(texts.Select(r => ApplyTranslate(r))
                          .Union(scripts.Select(r => ApplyTranslate(r))));

                if (!_hasChanges)
                    return false;

                SaveCache();
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

        public async Task Build(string resourceName)
        {
            await Book.ReadVolumes();

            var package = GetPackage();
            var res = package.GetResouce(resourceName);
            if (res is ResText t)
                await ApplyTranslate(t);
            else if (res is ResScript s)
                await ApplyTranslate(s);
        }

        private async Task ApplyTranslate(ResText r)
        {
            try
            {
                var part = Book.GetVolume(r.ToString());
                if (part == null) // Ресурс без перевода
                    return;

                if (String.IsNullOrEmpty(part.DateChange)) // Пропускаем части без перевода
                    return;

                if (_cache != null && _cache.TryGetValue(r.ToString(), out string changed) && changed.Equals(part.DateChange)) // Пропускаем неизмененные части
                    return;

                var enLines = r.GetText(false); // Оригинальный текст
                var ruLines = r.GetText(true);  // Уже переведенный текст

                if (enLines.Length != ruLines.Length)
                {
                    Console.WriteLine($"{r} Lines count error");
                    return;
                }

                var translates = await Book.GetTranslates(part.URL);
                bool hasTranslate = false;

                var notaEn = translates.Keys.ToHashSet();

                for (int i = 0; i < enLines.Length; i++)
                {
                    var en = enLines[i];
                    if (String.IsNullOrEmpty(en)) continue;

                    if (!translates.TryGetValue(en, out var tr))
                    {
                        en = en.Replace("\n", "\r\n");
                        if (!translates.TryGetValue(en, out tr))
                        {
                            //Console.WriteLine($"Missing tex {r} - {en}");
                            continue;
                        }
                    }

                    if (tr == null) continue;

                    notaEn.Remove(en);

                    var ru = ruLines[i];
                    if (tr.Equals(ru)) // Пропускаем старый перевод
                        continue;

                    hasTranslate = true;

                    ruLines[i] = tr;
                }

                if (notaEn.Count > 0)
                {
                    Console.WriteLine($"Not found nota in {r.FileName}");
                    foreach (var nota in notaEn)
                    {
                        Console.WriteLine(nota);
                    }
                }

                if (hasTranslate)
                {
                    Console.WriteLine(r);
                    r.SetTranslate(ruLines);
                    _hasChanges = true;
                }
            }
            finally
            {
                _progress++;
                ReportProgress?.Invoke(_progress * 100 / _total);
            }
        }

        private async Task ApplyTranslate(ResScript r)
        {
            try
            {
                var vol = Book.GetVolume(r.ToString());
                if (vol == null) // Ресурс без перевода
                    return;

                if (String.IsNullOrEmpty(vol.DateChange)) // Пропускаем части без перевода
                    return;

                if (_cache != null && _cache.TryGetValue(r.ToString(), out string changed) && changed.Equals(vol.DateChange)) // Пропускаем неизмененные части
                    return;

                var enScr = r.GetScript(false);
                var ruScr = r.GetScript(true);

                var enStrings = enScr.AllStrings.Where(s => !s.IsClassName).ToArray();
                var ruStrings = ruScr.AllStrings.Where(s => !s.IsClassName).ToArray();

                var translates = await Book.GetTranslates(vol.URL);
                bool hasTranslate = false;

                var notaEn = translates.Keys.ToHashSet();

                for (int i = 0; i < enStrings.Length; i++)
                {
                    var en = enStrings[i].Value;
                    if (String.IsNullOrEmpty(en)) continue;

                    if (!translates.TryGetValue(en, out var tr))
                    {
                        en = en.Replace("\n", "\r\n");
                        if (!translates.TryGetValue(en, out tr))
                        {
                            //Console.WriteLine($"Missing tex {r} - {en}");
                            continue;
                        }
                    }

                    notaEn.Remove(en);

                    var ru = ruStrings[i].Value;
                    if (tr.Equals(ru)) // Пропускаем старый перевод
                        continue;

                    hasTranslate = true;

                    ruStrings[i].Value = tr;
                }

                if (notaEn.Count > 0)
                {
                    Console.WriteLine($"Not found nota in {r.FileName}");
                    foreach (var nota in notaEn)
                    {
                        Console.WriteLine(nota);
                    }
                }

                if (hasTranslate)
                {
                    Console.WriteLine(r);
                    r.SaveTranslate(ruScr.GetBytes());
                    _hasChanges = true;
                }
            }
            finally
            {
                _progress++;
                ReportProgress?.Invoke(_progress * 100 / _total);
            }
        }

        private void SaveCache()
        {
            using (StreamWriter fs = new StreamWriter(CACHE_FILE, false, Encoding.UTF8))
            {
                foreach (var p in Book.Volumes)
                {
                    fs.WriteLine($"{p.Name}:{p.DateChange}");
                }
            }
        }

        private void ReadCache()
        {
            if (!NO_CACHE && File.Exists(CACHE_FILE))
            {
                _cache = File.ReadAllLines(CACHE_FILE)
                    .Select(l => l.Split(':', 2))
                    .ToDictionary(p => p[0], p => p[1]);
            }
            else
                _cache = new Dictionary<string, string>();
        }
    }
}
