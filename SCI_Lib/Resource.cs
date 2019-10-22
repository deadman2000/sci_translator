using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using SCI_Translator.Decompression;
using SCI_Translator.Scripts;
using SCI_Translator.Scripts.Sections;

namespace SCI_Translator
{
    public class Resource
    {
        private ResMapOffset _map;
        private ushort _number;
        private int _address;

        private byte res_t;
        private ushort res_nr;
        private ushort comp_size;
        private ushort decomp_size;
        private ushort method;

        public Resource(ResMapOffset map, ushort number, int address)
        {
            _map = map;
            _number = number;
            _address = address;

            using (FileStream fs = File.OpenRead(_map.Package.GameDirectory + "\\" + ResourceFileName))
            {
                fs.Position = Offset;
                res_t = (byte)fs.ReadByte();
                res_nr = SCIPackage.ReadUShortBE(fs);
                comp_size = SCIPackage.ReadUShortBE(fs);
                decomp_size = SCIPackage.ReadUShortBE(fs);
                method = SCIPackage.ReadUShortBE(fs);
            }
        }

        public SCIPackage Package { get { return _map.Package; } }

        public ResMapOffset Map { get { return _map; } }

        public ushort Number { get { return _number; } }

        public int Address { get { return _address; } }

        public byte ResourceFileNumber { get { return (byte)((_address >> 28) & 0x0F); } }

        public string ResourceFileName { get { return String.Format("RESOURCE.{0:D3}", ResourceFileNumber); } }

        public int Offset { get { return _address & 0x0FFFFFFF; } }


        public int ResT { get { return res_t; } }

        public int ResNr { get { return res_nr; } }

        public int CompSize { get { return comp_size; } }

        public int DecompSize { get { return decomp_size; } }

        public int Method { get { return method; } }
        
        public string FileName { get { return String.Format("{0}.{1}", _number, Extension); } }
        
        //public string FilePath { get { return String.Format("{0}\\{1}", _map.Package.Directory, FileName); } }

        public string TranslateDir { get { return _map.Package.GameDirectory + "\\TRANSLATE"; } }

        public string Extension
        {
            get
            {
                switch (_map.Type)
                {
                    case ResType.View: return "v56";
                    case ResType.Picture: return "p56";
                    case ResType.Script: return "scr";
                    case ResType.Text: return "tex";
                    case ResType.Sound: return "snd";
                    case ResType.Vocabulary: return "voc";
                    case ResType.Font: return "fon";
                    case ResType.Cursor: return "cur";
                    case ResType.AudioPath: return "pat";
                    case ResType.Bitmap: return "bit";
                    case ResType.Palette: return "pal";
                    case ResType.CDAudio: return "cda";
                    case ResType.Audio: return "aud";
                    case ResType.Sync: return "syn";
                    case ResType.Message: return "msg";
                    case ResType.Map: return "map";
                    case ResType.Heap: return "hep";
                    default: throw new NotImplementedException();
                }
            }
        }

        public ResType Type { get { return _map.Type; } }

        public override string ToString()
        {
            return String.Format("{0}.{1}", _number, Extension);
        }

        public byte[] GetContent(bool translated)
        {
            if (translated)
            {
                return GetContext(TranslateDir);
            }
            else
            {
                return GetContext(_map.Package.GameDirectory);
            }
        }

        static DecompressorLZW dLWZ1 = new DecompressorLZW(LZWCompression.CompLZW1);

        static DecompressorLZW dLWZ = new DecompressorLZW(LZWCompression.CompLZW);

        static Decompressor dHuffman = new DecompressorHuffman();


        private byte[] GetContext(string dir)
        {
            if (File.Exists(dir + "\\" + FileName)) // Если есть внешний файл, используем его
            {
                using (FileStream fs = File.OpenRead(dir + "\\" + FileName))
                {
                    byte[] data = new byte[fs.Length - 2];
                    fs.Position = 2;
                    fs.Read(data, 0, data.Length);
                    return data;
                }
            }

            if (method == 0)
            {
                byte[] data = new byte[decomp_size];
                using (FileStream fs = File.OpenRead(dir + "\\" + ResourceFileName))
                {
                    fs.Position = Offset + 9;
                    fs.Read(data, 0, data.Length);
                }
                return data;
            }

            Decompressor decomp;
            switch (method)
            {
                case 2:
                case 3: decomp = dLWZ1; break;
                default: return null;
            }

            using (FileStream fs = File.OpenRead(dir + "\\" + ResourceFileName))
            {
                fs.Position = Offset + 9;
                return decomp.Unpack(fs, comp_size, decomp_size);
            }
        }

        public void SaveTranslate()
        {
            SaveTranslate(GetContent(true));
        }

        public void SaveTranslate(byte[] data)
        {
            using (FileStream fs = File.Create(TranslateDir + "\\" + FileName))
            {
                fs.WriteByte((byte)_map.Type);
                fs.WriteByte(0);
                fs.Write(data, 0, data.Length);
            }
        }

        // TODO В отдельные классы
        // TEXT

        public string[] GetText(bool translateDir, bool translatePart, bool escape)
        {
            List<string> lines = new List<string>();
            var data = GetContent(translateDir);

            int s = 0;
            int ind = 0;
            for (int i = 0; i < data.Length; i++)
            {
                if (data[i] == 0x00)
                {
                    string strRes = escape ? Helpers.GetString(data, s, i - s) : Helpers.GetStringUnescape(data, s, i - s);
                    string str = strRes;
                    string[] parts = str.Split(new string[] { "#G" }, StringSplitOptions.None);
                    if (parts.Length > 1)
                    {
                        if (translatePart)
                            lines.Add(parts[1]);
                        else
                            lines.Add(parts[0]);
                    }
                    else
                        lines.Add(strRes);

                    ind++;
                    s = i + 1;
                }
            }

            return lines.ToArray();
        }

        public void SetText(string[] lines, bool unescape)
        {
            ByteBuilder bb = new ByteBuilder();

            for (int r = 0; r < lines.Length; r++)
            {
                bb.AddBytes(Helpers.GetBytes(lines[r], unescape));
                bb.AddByte(0);
            }

            SaveTranslate(bb.GetArray());
        }

        // SCRIPT

        private Script _script;
        private bool _scriptTranslated;

        public Script GetScript(bool translate)
        {
            if (_script != null && _scriptTranslated == translate) return _script;

            _scriptTranslated = translate;
            byte[] data = GetContent(translate);
            return _script = new Script(this, data);
        }

        private string[] _vocabNames;
        public string[] GetVocabNames()
        {
            if (_vocabNames != null)
                return _vocabNames;

            var data = GetContent(false);

            ushort count = Helpers.GetShortBE(data, 0);
            string[] names = new string[count];

            for (int i = 0; i < count; i++)
            {
                ushort addr = Helpers.GetShortBE(data, i * 2 + 2);
                ushort len = Helpers.GetShortBE(data, addr);
                string name = Helpers.GetString(data, addr + 2, len);
                names[i] = name;
            }

            return _vocabNames = names;
        }

        private Dictionary<byte, OpCode> _opcodes;

        public Dictionary<byte, OpCode> GetVocabOpcodes()
        {
            if (_opcodes != null) return _opcodes;

            var data = GetContent(false);

            ushort count = Helpers.GetShortBE(data, 0);
            Dictionary<byte, OpCode> opcodes = new Dictionary<byte, OpCode>();
            for (byte i = 0; i < count; i++)
            {
                ushort addr = Helpers.GetShortBE(data, i * 2 + 2);
                ushort len = Helpers.GetShortBE(data, addr);
                ushort type = Helpers.GetShortBE(data, addr + 2);
                string name = Helpers.GetString(data, addr + 4, len - 2);
                opcodes.Add(i, new OpCode(type, name));
            }

            return _opcodes = opcodes;
        }

    }
}
