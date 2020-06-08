using SCI_Translator.Resources.SCI0;
using SCI_Translator.Resources.SCI1;
using SCI_Translator.Scripts;
using SCI_Translator.Scripts.Elements;
using SCI_Translator.Scripts.Sections;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;

namespace SCI_Translator.Resources
{
    public abstract class SCIPackage
    {
        public static SCIPackage Load(string directory, string translate = null, Encoding enc = null)
        {
            string mapFile = Path.Combine(directory, "RESOURCE.MAP");
            if (IsSCI0(mapFile))
                return new SCI0Package(directory, translate, enc);
            else
                return new SCI1Package(directory, translate, enc);
        }

        private static bool IsSCI0(string mapFile)
        {
            using (FileStream fs = File.OpenRead(mapFile))
            {
                var test = new byte[6];
                fs.Seek(-6, SeekOrigin.End);
                fs.Read(test, 0, 6);
                fs.Seek(0, SeekOrigin.Begin);
                return test.All(b => b == 0xff);
            }
        }

        public abstract string GetResFileName(Resource resource);

        public SCIPackage(string directory, string translate, Encoding enc)
        {
            if (enc == null)
            {
#if NETSTANDARD
                Encoding.RegisterProvider(CodePagesEncodingProvider.Instance);
#endif
                enc = Encoding.GetEncoding(866);
            }
            GameEncoding = new GameEncoding(enc);

            GameDirectory = directory;
            TranslateDirectory = translate ?? Path.Combine(GameDirectory, "TRANSLATE");

            string mapFile = Path.Combine(GameDirectory, "RESOURCE.MAP");

            using (FileStream fs = File.OpenRead(mapFile))
            {
                ReadMap(fs);
            }

            Resources = Resources.OrderBy(r => r.Type).ThenBy(r => r.Number).ToList();
            SeparateHeapResources = Resources.Any(r => r.Type == ResType.Heap);
        }

        public abstract ResourceFileInfo LoadResourceInfo(string resourceFileName, int offset);

        protected abstract void ReadMap(FileStream fs);

        protected virtual Resource LoadRes(ResType type)
        {
            switch (type)
            {
                case ResType.Text: return new ResText();
                case ResType.Vocabulary: return new ResVocab();
                case ResType.Script: return new ResScript();
                case ResType.Font: return new ResFont();
                case ResType.Message: return new ResMessage();
                case ResType.Picture: return new ResPicture();
                default: return new Resource();
            }
        }

        private bool? _hasTranslate;
        public bool HasTranslate()
        {
            if (!_hasTranslate.HasValue)
                _hasTranslate = Directory.Exists(TranslateDirectory);
            return _hasTranslate.Value;
        }

        private IEnumerable<Script> _scriptsCache;

        public ClassSection GetClass(ushort id)
        {
            if (_scriptsCache == null)
                _scriptsCache = Scripts.Select(r => r.GetScript(false));

            foreach (var s in _scriptsCache)
            {
                var cls = s.GetClass(id);
                if (cls != null) return cls;
            }
            return null;
        }

        public GameEncoding GameEncoding { get; private set; }

        public string GameDirectory { get; }

        public string TranslateDirectory { get; }

        public List<Resource> Resources { get; } = new List<Resource>();

        public IEnumerable<ResText> Texts => GetResouces<ResText>();

        public IEnumerable<ResScript> Scripts => GetResouces<ResScript>();

        public IEnumerable<ResMessage> Messages => GetResouces<ResMessage>();

        public bool SeparateHeapResources { get; set; }

        public IEnumerable<Resource> GetResouces(ResType resType) => Resources.FindAll(r => r.Type == resType);

        public IEnumerable<T> GetResouces<T>() where T : Resource => Resources.FindAll(r => r is T).Cast<T>();

        public Resource GetResouce(ResType type, ushort number) => Resources.FirstOrDefault(r => r.Type == type && r.Number == number);

        public Resource GetResouce(string fileName) => Resources.FirstOrDefault(r => r.FileName.Equals(fileName, StringComparison.OrdinalIgnoreCase));

        public T GetResouce<T>(ushort number) where T : Resource => Resources.FirstOrDefault(r => r is T && r.Number == number) as T;

        private Dictionary<byte, OpCode> _opcodes;

        public string GetOpCodeName(byte type)
        {
            if (_opcodes == null) _opcodes = LoadOpCodes();
            return _opcodes[type]?.Name;
        }

        private Dictionary<byte, OpCode> LoadOpCodes()
        {
            return GetResouce<ResVocab>(998).GetVocabOpcodes();
        }

        private string[] _funcNames;

        public string GetFuncName(int ind)
        {
            if (_funcNames == null) _funcNames = LoadFuncs();
            if (ind >= _funcNames.Length) return $"kernel_{ind}";
            return _funcNames[ind];
        }

        private string[] LoadFuncs()
        {
            return GetResouce<ResVocab>(999).GetText();
        }

        private string[] _names;

        public string GetName(int ind)
        {
            if (_names == null) _names = LoadNames();
            return _names[ind];
        }

        private string[] LoadNames()
        {
            return GetResouce<ResVocab>(997).GetVocabNames();
        }

        public IEnumerable<Resource> GetTextResources()
        {
            return GetResouces(ResType.Text)
                .Union(GetResouces(ResType.Script))
                .Union(GetResouces(ResType.Message));
        }
    }
}
