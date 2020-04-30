using Microsoft.Extensions.Options;
using MongoDB.Driver;
using Notabenoid;
using RobinHoodWeb.Model;
using SCI_Translator.Resources;
using System;
using System.Collections.Generic;
using System.IO;
using System.IO.Compression;
using System.Linq;
using System.Threading.Tasks;

namespace RobinHoodWeb.Services
{
    public class TranslateService
    {
        public static readonly string DOWNLOAD_DIR = Path.Combine(Directory.GetCurrentDirectory(), @"downloads");

        public static readonly string TRANSLATED_ZIP_PATH = Path.Combine(DOWNLOAD_DIR, "CONQUESTS.ZIP");


        const string GameId = "robin";

        private readonly IMongoCollection<NotaCache> _notaCache;

        private readonly TranslateStoreService _store;

        private readonly string _gameDir;

        private readonly string _translateDir;

        private bool _firstBuild = true;


        public NbBook Book { get; }

        public string UpdateDate { get; internal set; }

        public bool IsBuild { get; private set; }

        public int BuildProgress { get; private set; }

        public int Total { get; private set; }

        public event Action<int> ReportProgress;

        public TranslateService(IOptions<TranslateOptions> op, MongoService mongo, TranslateStoreService store)
        {
            Book = new NbBook(op.Value.NotabenoidLogin, op.Value.NotabenoidPassword, op.Value.BookId);

            _gameDir = op.Value.GameDir;
            _translateDir = op.Value.TranslateDir;
            _notaCache = mongo.Database.GetCollection<NotaCache>("NotaCache");
            _store = store;

            UpdateDate = UpdateCreateDate();
        }

        public SCIPackage GetPackage()
        {
            return SCIPackage.Load(_gameDir, _translateDir);
        }

        public async Task AddTranslate(string volume, string en, string tr)
        {
            await Book.AddTranslate(volume, en, tr);

            var strings = await _store.GetStrings(GameId, volume);
            foreach (var s in strings.FindAll(s => s.En == en))
            {
                await _store.Update(s, s => s.Tr, tr);
            }

            var package = GetPackage();
            Resource res = package.GetResouce(volume);
            res.Translate(en, tr);
        }

        public async Task Build()
        {
            if (IsBuild) return;

            var updated = await SyncNotabenoid();

            if (updated || _firstBuild)
                await SyncPackage();

            if (updated || !File.Exists(TRANSLATED_ZIP_PATH))
            {
                PackageZIP();
            }

            _firstBuild = false;
        }

        /// <summary>
        /// Применяет перевод из Mongo к игровым ресурсам
        /// </summary>
        /// <returns></returns>
        private async Task SyncPackage()
        {
            var package = GetPackage();
            var dbAllStrings = await _store.GetStrings(GameId);

            foreach (var res in package.GetTextResources())
            {
                var resStrings = dbAllStrings.FindAll(s => s.Res == res.ToString());

                var strings = res.GetStrings(true);
                bool changed = false;

                for (int i = 0; i < strings.Length; i++)
                {
                    var dbStr = resStrings.Find(r => r.Index == i);

                    if (strings[i] != dbStr.Tr)
                    {
                        Console.WriteLine($"Apply {res} {i}");
                        strings[i] = dbStr.Tr;
                        changed = true;
                    }
                }

                if (changed)
                    res.SetTranslate(strings);
            }
        }


        /// <summary>
        /// Собирает текст из Notabenoid и сохраняет в Mongo
        /// </summary>
        /// <returns></returns>
        private async Task<bool> SyncNotabenoid()
        {
            IsBuild = true;
            try
            {
                if (Book.Volumes == null)
                    await Book.ReadVolumes();
                else
                    await Book.UpdateDates();

                var cache = await (await _notaCache.FindAsync(c => c.BookId == Book.BookId)).ToListAsync();
                var cacheDict = cache.ToDictionary(c => c.Res, c => c.Date);

                var volumes = Book.Volumes.FindAll(v => !String.IsNullOrEmpty(v.DateChange) && (!cacheDict.ContainsKey(v.Name) || v.DateChange != cacheDict[v.Name]));
                if (volumes.Count == 0) return false;

                BuildProgress = 0;
                Total = Book.Volumes.Count;

                foreach (var vol in volumes)
                {
                    Console.WriteLine($"Update {vol.Name}");
                    try
                    {
                        var translates = await Book.GetTranslates(vol.URL);
                        var strings = await _store.GetStrings(GameId, vol.Name);
                        foreach (var s in strings)
                        {
                            if (translates.TryGetValue(s.En, out var tr) && tr != s.Tr)
                            {
                                await _store.Update(s, s => s.Tr, tr);
                            }
                        }

                        if (cacheDict.ContainsKey(vol.Name))
                            await _notaCache.UpdateOneAsync(c => c.BookId == Book.BookId && c.Res == vol.Name,
                                Builders<NotaCache>.Update.Set(c => c.Date, vol.DateChange));
                    }
                    catch (Exception ex)
                    {
                        Console.WriteLine(ex);
                    }
                    finally
                    {
                        BuildProgress++;
                        ReportProgress?.Invoke(BuildProgress * 100 / Total);
                    }
                }

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
            }
        }

        public void PackageZIP()
        {
            File.Delete(TRANSLATED_ZIP_PATH);
            ZipFile.CreateFromDirectory(_translateDir, TRANSLATED_ZIP_PATH, CompressionLevel.Optimal, false);
            UpdateCreateDate();
        }

        private string UpdateCreateDate()
        {
            if (!File.Exists(TRANSLATED_ZIP_PATH))
                return null;
            return UpdateDate = new FileInfo(TRANSLATED_ZIP_PATH).CreationTimeUtc.ToString();
        }
    }
}
