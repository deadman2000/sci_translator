using Notabenoid_Patch;
using SCI_Translator;
using System;
using System.Collections.Generic;
using System.IO;
using System.IO.Compression;
using System.Linq;
using System.Threading.Tasks;

namespace RobinHoodWeb
{
    public static class Global
    {
        public static readonly string DOWNLOAD_DIR = Path.Combine(Directory.GetCurrentDirectory(), @"downloads");
        public static readonly string TRANSLATED_ZIP_PATH = Path.Combine(DOWNLOAD_DIR, "CONQUESTS.ZIP");

        public static readonly TranslateBuilder Builder = new TranslateBuilder();

        public static string UPDATE_DATE = UpdateCreateDate();

        public static List<StringRes> AllStrings = new List<StringRes>();

        public static void PackageZIP()
        {
            File.Delete(TRANSLATED_ZIP_PATH);
            ZipFile.CreateFromDirectory(TranslateBuilder.TRANSLATE_GAME_DIR, TRANSLATED_ZIP_PATH, CompressionLevel.Optimal, true);
            UpdateCreateDate();
        }

        private static string UpdateCreateDate()
        {
            if (!File.Exists(TRANSLATED_ZIP_PATH))
                return null;
            return UPDATE_DATE = new FileInfo(TRANSLATED_ZIP_PATH).CreationTimeUtc.ToString();
        }

        public class StringRes
        {
            public string Resource;
            public string En;
            public string Ru;
        }

        static IEnumerable<StringRes> ExtractStringsText(SCIPackage package)
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

        static IEnumerable<StringRes> ExtractStringsScript(SCIPackage package)
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

        public static void UpdateStrings()
        {
            SCIPackage package = new SCIPackage(TranslateBuilder.GAME_DIR);

            AllStrings = ExtractStringsText(package)
                .Union(ExtractStringsScript(package))
                .ToList();
        }
    }
}
