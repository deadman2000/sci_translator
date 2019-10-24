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
            public bool Ru;
            public string Resource;
            public string Text;
        }

        static IEnumerable<StringRes> ExtractStringsText(IEnumerable<Resource> texts, bool translate)
        {
            return texts.SelectMany(s => s.GetText(translate).Select(l => new StringRes { Ru = translate, Resource = s.ToString(), Text = l }));
        }

        static IEnumerable<StringRes> ExtractStringsScript(IEnumerable<Resource> scripts, bool translate)
        {
            return scripts.SelectMany(s => s.GetScript(translate).AllStrings.Select(c => new StringRes { Ru = translate, Resource = s.ToString(), Text = c.Value }));
        }

        public static void UpdateStrings()
        {
            SCIPackage package = new SCIPackage(TranslateBuilder.GAME_DIR);
            var texts = package.Texts;
            var scripts = package.Scripts;

            AllStrings = ExtractStringsText(texts, false)
                .Union(ExtractStringsText(texts, true))
                .Union(ExtractStringsScript(scripts, false))
                .Union(ExtractStringsScript(scripts, true))
                .ToList();
        }
    }
}
