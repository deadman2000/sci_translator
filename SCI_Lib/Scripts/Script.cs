﻿using SCI_Translator.Resources;
using SCI_Translator.Scripts.Elements;
using SCI_Translator.Scripts.Sections;
using System.Collections.Generic;
using System.Linq;

namespace SCI_Translator.Scripts
{
    public class Script
    {
        private Dictionary<ushort, BaseElement> _elements = new Dictionary<ushort, BaseElement>();
        private readonly StringSection _strings;

        const bool SCI1_1 = false;

        public Script(Resource res, byte[] data)
        {
            Resource = res;
            SourceData = data;

            if (SCI1_1)
            {
                // https://github.com/scummvm/scummvm/blob/master/engines/sci/engine/script.cpp#L390
                // https://github.com/icefallgames/SCICompanion/blob/master/SCICompanionLib/Src/Compile/CompiledScript.cpp#L226
                int i = 0;
                var endOfStringOffset = Helpers.GetUShortBE(data, i);
                var objectStartOffset = Helpers.GetUShortBE(data, i + 2) * 2 + 4;
                i = objectStartOffset;
                while (i < data.Length)
                {
                    SectionType type = (SectionType)Helpers.GetUShortBE(data, i);
                    if (type == SectionType.None) break;
                    i += 2;
                }
            }
            else
            {
                ushort i = 0;
                while (i < data.Length)
                {
                    SectionType type = (SectionType)Helpers.GetUShortBE(data, i);
                    if (type == SectionType.None) break;

                    ushort size = (ushort)(Helpers.GetUShortBE(data, i + 2) - 4);
                    i += 4;

                    Section sec = Section.Create(this, type, data, i, size);
                    Sections.Add(sec);
                    i += size;

                    if (sec is StringSection)
                        _strings = (StringSection)sec;
                }
            }

            foreach (var sec in Sections)
                sec.SetupByOffset();
        }

        public void Register(BaseElement el) => _elements[el.Address] = el;

        public void Unregister(BaseElement el) => _elements.Remove(el.Address);

        public SCIPackage Package { get { return Resource.Package; } }

        public Resource Resource { get; }

        public byte[] SourceData { get; }

        public List<Section> Sections { get; } = new List<Section>();

        public IEnumerable<StringConst> AllStrings => Sections.OfType<StringSection>().SelectMany(s => s.Strings);

        public IEnumerable<BaseElement> AllElements => _elements.Values.Where(e => !(e is StringPart));

        public IEnumerable<RefToElement> AllRefs => _elements.Values.OfType<RefToElement>();

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

        public StringPart GetStringPart(ushort value)
        {
            if (_strings == null) return null;

            foreach (var s in _strings.Strings)
                if (s.Address < value && value < s.Address + s.Bytes.Length)
                    return new StringPart(s, s.Address - value);
            return null;
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

        public string GetOpCodeName(byte type) => Package.GetOpCodeName(type);
    }
}
