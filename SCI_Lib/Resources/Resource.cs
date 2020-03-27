using SCI_Translator.Decompression;
using System;
using System.IO;

namespace SCI_Translator.Resources
{
    public class Resource
    {
        private ResourceFileInfo _info;

        public void Load(SCIPackage package, ResType type, ushort number, byte resNum, int offset)
        {
            Package = package;
            Type = type;
            Number = number;
            ResourceFileNumber = resNum;
            Offset = offset;
        }

        public SCIPackage Package { get; private set; }

        public ResType Type { get; private set; }

        public ushort Number { get; private set; }

        public byte ResourceFileNumber { get; private set; }

        public int Offset { get; private set; }

        public string ResourceFileName => $"RESOURCE.{ResourceFileNumber:D3}";

        public string FileName => Package.GetResFileName(this);

        public string TranslateDir => Package.TranslateDirectory;

        public ResourceFileInfo GetInfo() => _info ?? (_info = Package.LoadResourceInfo(ResourceFileName, Offset));

        public override string ToString() => FileName;

        public byte[] GetContent(bool translated)
        {
            if (translated)
            {
                return ReadContent(TranslateDir);
            }
            else
            {
                return ReadContent(Package.GameDirectory);
            }
        }


        private byte[] ReadContent(string dir)
        {
            var info = GetInfo();
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

            if (info.Method == 0) // Uncompressed
            {
                byte[] data = new byte[info.DecompSize];
                using (FileStream fs = File.OpenRead(Path.Combine(dir, ResourceFileName)))
                {
                    fs.Position = Offset + info.HeadSize;
                    fs.Read(data, 0, data.Length);
                }
                return data;
            }

            Decompressor decomp = info.GetDecompressor();
            using (FileStream fs = File.OpenRead(Path.Combine(dir, ResourceFileName)))
            {
                fs.Position = Offset + info.HeadSize;
                return decomp.Unpack(fs, info.CompSize, info.DecompSize);
            }
        }

        public void Translate(string en, string tr)
        {
            var sources = GetStrings(false);
            if (sources == null)
                throw new NotImplementedException();

            var translates = GetStrings(true);

            for (int i = 0; i < sources.Length; i++)
            {
                if (sources[i] == en)
                {
                    translates[i] = tr;
                }
            }

            SetTranslate(translates);
        }

        public void SaveTranslate(byte[] data)
        {
            var lower = Path.Combine(TranslateDir, FileName.ToLower());
            if (File.Exists(lower))
                File.Delete(lower);

            using (FileStream fs = File.Create(Path.Combine(TranslateDir, FileName)))
            {
                fs.WriteByte((byte)Type);
                fs.WriteByte(0);
                fs.Write(data, 0, data.Length);
            }
        }

        public virtual string[] GetStrings(bool translate)
        {
            return null;
        }

        public virtual void SetTranslate(string[] strings)
        {
            throw new NotImplementedException();
        }
    }
}
