using SCI_Translator.Scripts;
using SCI_Translator.Scripts.Sections;
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


        public ClassSection GetClass(ushort id)
        {
            ClassSection cls;
            foreach (ResMapOffset map in Resources)
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

        public Dictionary<byte, OpCode> GetOpCodes()
        {
            if (_opcodes != null) return _opcodes;

            foreach (var res in Resources)
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

            foreach (var res in Resources)
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
