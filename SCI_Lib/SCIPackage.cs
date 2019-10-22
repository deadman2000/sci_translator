using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Xml;
using SCI_Translator.Scripts.Sections;
using SCI_Translator.Scripts;

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

        private List<ResMapOffset> _resources;
        private string _dir;


        public SCIPackage(string directory)
        {
            List<ResMapOffset> resourses = new List<ResMapOffset>();
            _dir = directory;

            using (FileStream fs = File.OpenRead(_dir + "\\RESOURCE.MAP"))
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

            _resources = resourses;
        }

        public bool HasTranslate() => Directory.Exists(Path.Combine(_dir, "TRANSLATE"));


        public ClassSection GetClass(ushort id)
        {
            ClassSection cls;
            foreach (ResMapOffset map in _resources)
            {
                foreach (Resource res in map.Resources)
                {
                    if (res.Type == ResType.Script)
                    {
                        Script s = res.GetScript(false);
                        cls = s.GetClass(id);
                        if (cls != null) return cls;
                    }
                }
            }
            return null;
        }

        public Dictionary<string, string> ExtractTranslate()
        {
            Dictionary<string, string> translate = new Dictionary<string, string>();

            foreach (var res in _resources)
            {
                if (res.Type != ResType.Text) continue;

                foreach (var r in res.Resources)
                {
                    var en = r.GetText(false, false, false);
                    var ge = r.GetText(false, true, false);
                    var ru = r.GetText(true, true, false);

                    for (int i = 0; i < en.Length; i++)
                    {
                        if (ge[i].Equals(ru[i])) continue;

                        translate[en[i]] = ru[i];
                    }
                }
            }
            return translate;
        }

        public void ExportText(string path)
        {
            using (StreamWriter stream = new StreamWriter(path))
            {
                foreach (var res in _resources)
                {
                    if (res.Type == ResType.Text)
                    {
                        foreach (var r in res.Resources)
                        {
                            var lines = r.GetText(false, false, false);
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

        public List<ResMapOffset> Resources { get { return _resources; } }

        public string GameDirectory { get { return _dir; } }


        private Dictionary<byte, OpCode> _opcodes;

        public Dictionary<byte, OpCode> GetOpCodes()
        {
            if (_opcodes != null) return _opcodes;

            foreach (var res in _resources)
            {
                if (res.Type == ResType.Vocabulary)
                {
                    foreach (var r in res.Resources)
                    {
                        if (r.Number == 998)
                        {
                            return _opcodes = r.GetVocabOpcodes();
                        }
                    }
                }
            }

            return null;
        }

        private string[] _names;

        public object GetName(int ind)
        {
            if (_names != null) return _names[ind];

            foreach (var res in _resources)
            {
                if (res.Type == ResType.Vocabulary)
                {
                    foreach (var r in res.Resources)
                    {
                        if (r.Number == 997)
                        {
                            _names = r.GetVocabNames();
                        }
                    }
                }
            }

            return _names[ind];
        }
    }
}
