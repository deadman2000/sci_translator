using SCI_Translator.Compression;
using SCI_Translator.Decompression;
using System;
using System.Collections.Generic;
using System.IO;

namespace SCI_Translator.Resources
{
    public class Resource
    {
        private ResourceFileInfo _info;

        public void Init(SCIPackage package, ResType type, ushort number, byte resNum, int offset)
        {
            Package = package;
            Type = type;
            Number = number;
            if (type == ResType.Message && package.ExternalMessages)
                Volumes.Add(new VolumeOffset(resNum, offset, "RESOURCE.MSG"));
            else
                Volumes.Add(new VolumeOffset(resNum, offset));
        }

        public void Init(SCIPackage package, ResType type, ushort number, byte resNum, ResourceFileInfo info)
        {
            Package = package;
            Type = type;
            Number = number;
            if (type == ResType.Message && package.ExternalMessages)
                Volumes.Add(new VolumeOffset(resNum, -1, "RESOURCE.MSG"));
            else
                Volumes.Add(new VolumeOffset(resNum, -1));
            _info = info;
        }

        public SCIPackage Package { get; private set; }

        public GameEncoding GameEncoding => Package.GameEncoding;

        public ResType Type { get; private set; }

        public ushort Number { get; private set; }

        public struct VolumeOffset
        {
            public byte Num;
            public int Offset;
            public string FileName;

            public VolumeOffset(byte num, int offset)
            {
                Num = num;
                Offset = offset;
                FileName = $"RESOURCE.{Num:D3}";
            }

            public VolumeOffset(byte num, int offset, string fileName)
            {
                Num = num;
                Offset = offset;
                FileName = fileName;
            }
        }

        public List<VolumeOffset> Volumes { get; } = new List<VolumeOffset>();

        public string FileName => Package.GetResFileName(this);

        public string TranslateDir => Package.TranslateDirectory;

        public ResourceFileInfo GetInfo() => _info ??= Package.LoadResourceInfo(Volumes[0].FileName, Volumes[0].Offset);

        public override string ToString() => FileName;

        public byte[] GetContent(bool translated, int volume = 0)
        {
            if (translated)
            {
                return ReadContent(TranslateDir, volume);
            }
            else
            {
                return ReadContent(Package.GameDirectory, volume);
            }
        }


        private byte[] ReadContent(string dir, int volume = 0)
        {
            var vol = Volumes[volume];

            var info = GetInfo();

            var path = Path.Combine(dir, FileName);
            if (File.Exists(path)) // Если есть внешний файл, используем его
            {
                using FileStream fs = File.OpenRead(path);

                fs.Seek(1, SeekOrigin.Current);
                var second = fs.ReadB();
                int offset = GetResourceOffsetInFile(second);
                fs.Seek(offset, SeekOrigin.Current);

                return fs.ReadBytes((int)(fs.Length - fs.Position));
            }


            using (FileStream fs = File.OpenRead(Path.Combine(dir, vol.FileName)))
            {
                fs.Position = vol.Offset + info.HeadSize;

                if (info.Method == 0) // Uncompressed
                {
                    return fs.ReadBytes(info.DecompSize);
                }
                else
                {
                    Decompressor decomp = info.GetDecompressor();
                    return decomp.Unpack(fs, info.CompSize, info.DecompSize);
                }
            }
        }

        public static int GetResourceOffsetInFile(byte secondHeaderByte)
        {
            // The upper byte appears to indicate where the data starts.
            // Some isolated resource files have random data stuffed at the beginning (e.g. name and such)

            // In SQ5 though, we need to special case:
            if ((secondHeaderByte & 0x80) != 0)
            {
                switch (secondHeaderByte & 0x7f)
                {
                    case 0:
                        return 24;
                    case 1:
                        return 2;
                    case 4:
                        return 8;
                }
            }
            return secondHeaderByte;
        }

        byte[] _compressed = null;

        public byte[] GetCompressed(int volume = 0)
        {
            if (_compressed != null) return _compressed;

            var resOff = Volumes[volume];

            var info = volume == 0 ? GetInfo() : Package.LoadResourceInfo(resOff.FileName, resOff.Offset);

            using FileStream fs = File.OpenRead(Path.Combine(Package.GameDirectory, resOff.FileName));

            fs.Position = resOff.Offset + info.HeadSize;
            return _compressed = fs.ReadBytes(info.CompSize);
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
                Save(fs, data);
            }
        }

        public byte[] Export(bool translate = false)
        {
            var data = GetContent(translate);

            MemoryStream mem = new MemoryStream();
            Save(mem, data);
            return mem.ToArray();
        }

        private void Save(Stream stream, byte[] data)
        {
            stream.WriteByte((byte)Type);
            stream.WriteByte(0);
            stream.Write(data, 0, data.Length);
        }

        public virtual string[] GetStrings(bool translate)
        {
            return null;
        }

        public virtual void SetTranslate(string[] strings)
        {
            throw new NotImplementedException();
        }

        public void Pack(Stream stream, byte volNum)
        {
            var info = GetInfo();
            var path = Path.Combine(Package.GameDirectory, FileName);

            var begin = stream.Position;
            stream.Seek(info.HeadSize, SeekOrigin.Current);

            var ri = Volumes.FindIndex(r => r.Num == volNum);
            var res = Volumes[ri];

            if (!File.Exists(path)) // Файл не был распакован, считываем запакованный и так же складываем
            {
                var data = GetCompressed();
                stream.Write(data);
            }
            else
            {
                byte[] data = ReadContent(Package.GameDirectory);
                info.DecompSize = (ushort)data.Length;

                if (info.Method != 0)
                {
                    Compressor comp = info.GetCompressor();
                    comp.Pack(data, stream);
                    info.CompSize = (ushort)comp.CompSize;
                    info.DecompSize = (ushort)comp.DecompSize;
                }
                else
                {
                    stream.Write(data);
                    info.CompSize = (ushort)data.Length;
                }
            }

            Volumes[ri] = new VolumeOffset { Num = volNum, Offset = (int)begin };

            var end = stream.Position;
            stream.Seek(begin, SeekOrigin.Begin);
            info.Write(stream);
            stream.Seek(end, SeekOrigin.Begin);
        }
    }
}
