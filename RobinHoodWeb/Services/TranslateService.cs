using Microsoft.Extensions.Options;
using Notabenoid_Patch;
using RobinHoodWeb.Model;
using SCI_Translator.Resources;
using System;
using System.Collections.Generic;
using System.IO;
using System.IO.Compression;
using System.Linq;
using System.Threading.Tasks;
using YTranslate;

namespace RobinHoodWeb.Services
{
    public class TranslateService
    {
        public static readonly string DOWNLOAD_DIR = Path.Combine(Directory.GetCurrentDirectory(), @"downloads");

        public static readonly string TRANSLATED_ZIP_PATH = Path.Combine(DOWNLOAD_DIR, "CONQUESTS.ZIP");

        public TranslateBuilder Builder { get; internal set; }

        public List<StringRes> AllStrings { get; internal set; } = new List<StringRes>();

        public string UpdateDate { get; internal set; }

        private Dictionary<string, string> YTranslate;

        public TranslateService(IOptions<TranslateOptions> op)
        {
            Builder = new TranslateBuilder(op.Value.NotabenoidLogin, op.Value.NotabenoidPassword, op.Value.GameDir, op.Value.TranslateDir);
            UpdateDate = UpdateCreateDate();
            UpdateStrings();
        }


        public void PackageZIP()
        {
            File.Delete(TRANSLATED_ZIP_PATH);
            ZipFile.CreateFromDirectory(Builder.TranslateDir, TRANSLATED_ZIP_PATH, CompressionLevel.Optimal, false);
            UpdateCreateDate();
        }

        private string UpdateCreateDate()
        {
            if (!File.Exists(TRANSLATED_ZIP_PATH))
                return null;
            return UpdateDate = new FileInfo(TRANSLATED_ZIP_PATH).CreationTimeUtc.ToString();
        }

        private IEnumerable<StringRes> ExtractStringsText(SCIPackage package)
        {
            List<StringRes> list = new List<StringRes>();
            foreach (var t in package.Texts)
            {
                var en = t.GetText(false);
                var ru = t.GetText(true);

                for (int i = 0; i < en.Length; i++)
                {
                    list.Add(new StringRes
                    {
                        Resource = t.ToString(),
                        En = en[i],
                        Ru = ru[i]
                    });
                }
            }
            return list;
        }

        private IEnumerable<StringRes> ExtractStringsScript(SCIPackage package)
        {
            List<StringRes> list = new List<StringRes>();
            foreach (var s in package.Scripts)
            {
                var en = s.GetScript(false).AllStrings.Where(s => !s.IsClassName).ToArray();
                var ru = s.GetScript(true).AllStrings.Where(s => !s.IsClassName).ToArray();

                for (int i = 0; i < en.Length; i++)
                {
                    list.Add(new StringRes
                    {
                        Resource = s.ToString(),
                        En = en[i].Value,
                        Ru = ru[i].Value
                    });
                }
            }
            return list;
        }

        public void UpdateStrings()
        {
            SCIPackage package = SCIPackage.Load(Builder.GameDir, Builder.TranslateDir);

            if (YTranslate == null)
                LoadYTranslate();

            AllStrings = ExtractStringsText(package)
                .Union(ExtractStringsScript(package))
                .ToList();
            AllStrings.ForEach(s =>
            {
                s.YTrans = YTranslate.GetValueOrDefault(s.En.Trim());
                //if (s.YTrans == null) Console.WriteLine($"No YTrans: {s.En}");
            });

            Builder.LoadLinks();

            if (Builder.Links != null)
            {
                AllStrings.ForEach(s =>
                {
                    if (Builder.Links.TryGetValue(s.Resource.ToLower(), out var lines) && lines.TryGetValue(s.En, out var link))
                        s.Link = link;
                });
            }
        }

        private void LoadYTranslate()
        {
            var tranlations = GameTranslate.Load("ytrans.json");
            Dictionary<string, string> dict = new Dictionary<string, string>();
            tranlations.ForEach(t => dict[t.en] = t.ru);
            YTranslate = dict;
        }

        public async Task Build()
        {
            if (Builder.IsBuild) return;

            var updated = await Builder.Build();

            if (updated || !Builder.LinksCreated)
            {
                await Builder.PrepareLinks();
                UpdateStrings();
            }

            if (updated || !File.Exists(TRANSLATED_ZIP_PATH))
            {
                PackageZIP();
            }
        }
    }
}
