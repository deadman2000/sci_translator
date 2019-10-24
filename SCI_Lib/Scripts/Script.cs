﻿using SCI_Translator.Scripts.Elements;
using SCI_Translator.Scripts.Sections;
using System.Collections.Generic;
using System;
using System.Linq;

namespace SCI_Translator.Scripts
{
    public class Script
    {
        private Dictionary<ushort, BaseElement> _elements = new Dictionary<ushort, BaseElement>();
        private readonly StringSection _strings;

        public Script(Resource res, byte[] data)
        {
            Resource = res;
            SourceData = data;

            ushort i = 0;
            while (i < data.Length)
            {
                ushort type = (ushort)(data[i] | (data[i + 1] << 8));
                if (type == 0) break;

                ushort size = (ushort)((data[i + 2] | (data[i + 3] << 8)) - 4);
                i += 4;

                Section sec = Section.Create(this, (SectionType)type, data, i, size);
                Sections.Add(sec);
                i += size;

                if (sec is StringSection)
                    _strings = (StringSection)sec;
            }

            foreach (var sec in Sections)
                sec.SetupByOffset();
        }

        public void Register(BaseElement el)
        {
            _elements.Add(el.Address, el);
        }

        public SCIPackage Package { get { return Resource.Package; } }

        public Resource Resource { get; }

        public byte[] SourceData { get; }

        public List<Section> Sections { get; } = new List<Section>();

        public IEnumerable<StringConst> AllStrings => Sections.Where(s => s.Type == SectionType.String).SelectMany(s => ((StringSection)s).Strings).Where(s => !s.IsClassName);

        public BaseElement GetElement(ushort offset)
        {
            BaseElement el;
            if (_elements.TryGetValue(offset, out el)) return el;
            return null;
        }

        public byte[] GetBytes()
        {
            ByteBuilder bb = new ByteBuilder();

            foreach (Section sec in Sections)
            {
                bb.AddShortBE((ushort)sec.Type);
                int sizePos = bb.Position;
                bb.AddShortBE(0);
                sec.Write(bb);
                int endPos = bb.Position;
                bb.SetShortBE(sizePos, (ushort)(endPos - sizePos + 2));
            }

            foreach (Section sec in Sections)
                sec.WriteOffsets(bb);

            bb.AddShortBE(0);
            return bb.GetArray();
        }

        public List<T> Get<T>() where T : Section
        {
            List<T> list = new List<T>();

            foreach (Section sec in Sections)
            {
                if (sec is T)
                    list.Add((T)sec);
            }

            return list;
        }

        internal List<T> Get<T>(SectionType type) where T : Section
        {
            List<T> list = new List<T>();

            foreach (Section sec in Sections)
            {
                if (sec.Type == type && sec is T)
                    list.Add((T)sec);
            }

            return list;
        }

        public ClassSection GetClass(ushort id)
        {
            return Get<ClassSection>(SectionType.Class).Find(c => c.Id == id);
        }

        private Dictionary<byte, OpCode> _opcodes;

        public string GetOpCodeName(byte type)
        {
            if (_opcodes == null)
                _opcodes = Package.GetOpCodes();

            return _opcodes[type].Name;
        }
    }
}
