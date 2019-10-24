using SCI_Translator.Decompression;
using SCI_Translator.Scripts;
using System;
using System.Collections.Generic;
using System.IO;

namespace SCI_Translator
{
    public class Resource
    {
        private readonly byte res_t;
        private readonly ushort res_nr;
        private readonly ushort comp_size;
        private readonly ushort decomp_size;
        private readonly ushort method;

        public Resource(ResMapOffset map, ushort number, int address)
        {
            Map = map;
            Number = number;
            Address = address;

            using (FileStream fs = File.OpenRead(Path.Combine(Map.Package.GameDirectory, ResourceFileName)))
            {
                fs.Position = Offset;
                res_t = (byte)fs.ReadByte();
                res_nr = SCIPackage.ReadUShortBE(fs);
                comp_size = SCIPackage.ReadUShortBE(fs);
                decomp_size = SCIPackage.ReadUShortBE(fs);
                method = SCIPackage.ReadUShortBE(fs);
            }
        }

        public SCIPackage Package => Map.Package;

        public ResMapOffset Map { get; }

        public ushort Number { get; }

        public int Address { get; }

        public byte ResourceFileNumber => (byte)((Address >> 28) & 0x0F);

        public string ResourceFileName => $"RESOURCE.{ResourceFileNumber:D3}";

        public int Offset => Address & 0x0FFFFFFF;


        public int ResT => res_t;

        public int ResNr => res_nr;

        public int CompSize => comp_size;

        public int DecompSize => decomp_size;

        public int Method => method;

        public string FileName => $"{Number}.{Extension}";

        public string TranslateDir => Path.Combine(Map.Package.GameDirectory, "TRANSLATE");

        public string Extension
        {
            get
            {
                switch (Map.Type)
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

        public ResType Type { get { return Map.Type; } }

        public override string ToString() => $"{Number}.{Extension}";

        public byte[] GetContent(bool translated)
        {
            if (translated)
            {
                return ReadContent(TranslateDir);
            }
            else
            {
                return ReadContent(Map.Package.GameDirectory);
            }
        }

        private static DecompressorLZW dLWZ1 = new DecompressorLZW(LZWCompression.CompLZW1);
        private static DecompressorLZW dLWZ = new DecompressorLZW(LZWCompression.CompLZW);
        private static Decompressor dHuffman = new DecompressorHuffman();


        private byte[] ReadContent(string dir)
        {
            var path = Path.Combine(dir, FileName);
            if (File.Exists(path)) // Если есть внешний файл, используем его
            {
                using (FileStream fs = File.OpenRead(path))
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
                using (FileStream fs = File.OpenRead(Path.Combine(dir, ResourceFileName)))
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

            using (FileStream fs = File.OpenRead(Path.Combine(dir, ResourceFileName)))
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
            using (FileStream fs = File.Create(Path.Combine(TranslateDir, FileName)))
            {
                fs.WriteByte((byte)Map.Type);
                fs.WriteByte(0);
                fs.Write(data, 0, data.Length);
            }
        }

        // TODO В отдельные классы
        // TEXT

        public string[] GetText(bool translateDir, bool translatePart = false, bool escape = false)
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
