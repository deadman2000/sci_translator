using SCI_Translator.Scripts;
using SCI_Translator.Scripts.Elements;
using SCI_Translator.Scripts.Sections;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace SCI_Translator
{
    public class SCIPackage
    {
        public static ushort ReadUShortBE(FileStream fs)
        {
            return (ushort)(fs.ReadByte() | (fs.ReadByte() << 8));
        }

        public static int ReadIntBE(FileStream fs)
        {
            return fs.ReadByte() | (fs.ReadByte() << 8) | (fs.ReadByte() << 16) | (fs.ReadByte() << 24);
        }

        public SCIPackage(string directory)
        {
            List<ResMapOffset> resourses = new List<ResMapOffset>();
            GameDirectory = directory;

            using (FileStream fs = File.OpenRead(Path.Combine(GameDirectory, "RESOURCE.MAP")))
            {
                ResMapOffset res = null;
                while (true)
                {
                    ResType t = (ResType)fs.ReadByte();
                    ushort o = ReadUShortBE(fs);
                    if (res != null) res.RecordsCount = (o - res.Offset) / 6;

                    if (t == ResType.End) break;

                    res = new ResMapOffset(this, t, o);

                    resourses.Add(res);
                }

                for (int i = 0; i < resourses.Count; i++)
                {
                    fs.Position = resourses[i].Offset;
                    for (int j = 0; j < resourses[i].RecordsCount; j++)
                    {
                        ushort num = ReadUShortBE(fs);
                        int address = ReadIntBE(fs);
                        Resource rec = new Resource(resourses[i], num, address);
                        resourses[i].Resources.Add(rec);
                    }
                }
            }

            Resources = resourses;
        }

        public bool HasTranslate() => Directory.Exists(Path.Combine(GameDirectory, "TRANSLATE"));

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

        public void ExportText(string path)
        {
            using (StreamWriter stream = new StreamWriter(path))
            {
                foreach (var res in Resources)
                {
                    if (res.Type == ResType.Text)
                    {
                        foreach (var r in res.Resources)
                        {
                            var lines = r.GetText(false);
                            foreach (var line in lines)
                            {
                                stream.WriteLine(line);
                                stream.WriteLine();
                            }
                        }
                    }
                }
            }
        }

        public string GameDirectory { get; }

        public List<ResMapOffset> Resources { get; }

        public IEnumerable<Resource> Texts => Resources.FindAll(r => r.Type == ResType.Text).SelectMany(r => r.Resources);

        public IEnumerable<Resource> Scripts => Resources.FindAll(r => r.Type == ResType.Script).SelectMany(r => r.Resources);


        private Dictionary<byte, OpCode> _opcodes;

        public string GetOpCodeName(byte type)
        {
            if (_opcodes == null) _opcodes = LoadOpCodes();
            return _opcodes[type]?.Name;
        }

        private Dictionary<byte, OpCode> LoadOpCodes()
        {
            return GetResouce(ResType.Vocabulary, 998).GetVocabOpcodes();
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
            return GetResouce(ResType.Vocabulary, 999).GetText(false);
        }

        private string[] _names;

        public string GetName(int ind)
        {
            if (_names == null) _names = LoadNames();
            return _names[ind];
        }

        private string[] LoadNames()
        {
            return GetResouce(ResType.Vocabulary, 997).GetVocabNames();
        }

        public Resource GetResouce(ResType type, ushort number)
        {
            return Resources.Where(r => r.Type == type).SelectMany(r => r.Resources).FirstOrDefault(r => r.Number == number);
        }
    }
}
