using SCI_Translator.Scripts.Elements;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.Scripts.Sections
{
    class ObjectSection : Section
    {
        ushort funcList;
        ushort id;
        ushort superClassId;
        ushort info;
        ushort[] selectors;

        List<ushort> functions;
        List<RefToElement> fCode;

        RefToElement name;

        public override void Read(byte[] data, ushort offset, int length)
        {
            ushort o = (ushort)(offset + 4);

            funcList = ReadShortBE(data, ref o);
            ushort vs = ReadShortBE(data, ref o);

            id = ReadShortBE(data, ref o);

            superClassId = ReadShortBE(data, ref o);
            info = ReadShortBE(data, ref o);

            ushort nameOffs = o;
            name = new RefToElement(_script, o, ReadShortBE(data, ref o));
            name.Offset = nameOffs;
            _script.Register(name);

            selectors = new ushort[vs - 4];
            for (int i = 0; i < vs - 4; i++)
                selectors[i] = ReadShortBE(data, ref o);

            functions = new List<ushort>();
            int fs = ReadShortBE(data, ref o);
            for (int i = 0; i < fs; i++)
                functions.Add(ReadShortBE(data, ref o));

            o += 2;

            fCode = new List<RefToElement>();
            for (int i = 0; i < fs; i++)
                fCode.Add(new RefToElement(_script, o, ReadShortBE(data, ref o)));
        }

        public ushort Id { get { return id; } }

        public string Name { get { return ((StringConst)name.Reference).Value; } }

        public ushort[] Selectors { get { return selectors; } }

        private ClassSection _superClass;

        public ClassSection SuperClass
        {
            get
            {
                if (_superClass != null) return _superClass;
                return _superClass = Package.GetClass(superClassId);
            }
        }
        
        public override void SetupByOffset()
        {
            name.SetupByOffset();
            foreach (RefToElement r in fCode)
                r.SetupByOffset();
        }

        public override void Write(ByteBuilder bb)
        {
            bb.AddShortBE(0x1234);
            bb.AddShortBE(0);
            bb.AddShortBE(funcList);
            bb.AddShortBE((ushort)(selectors.Length + 4));
            bb.AddShortBE(id);
            bb.AddShortBE(superClassId);
            bb.AddShortBE(info);
            name.Write(bb);

            for (int i = 0; i < selectors.Length; i++)
                bb.AddShortBE(selectors[i]);

            bb.AddShortBE((ushort)functions.Count);
            foreach (ushort val in functions)
                bb.AddShortBE(val);

            bb.AddShortBE(0);

            foreach (RefToElement r in fCode)
                r.Write(bb);
        }

        public override void WriteOffsets(ByteBuilder bb)
        {
            name.WriteOffset(bb);
            foreach (RefToElement r in fCode)
                r.WriteOffset(bb);
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append(String.Format("[Object section (0x{0:X4})]\r\n", _offset));
            sb.Append(String.Format("\tname = {0:x4}\r\n", name));
            sb.Append(String.Format("\tfunc = {0:x4}\r\n", funcList));
            sb.Append(String.Format("\tspecies = {0:x4}\r\n", id));
            sb.Append(String.Format("\tsuperClass = {0:x4}\r\n", superClassId));
            sb.Append(String.Format("\tinfo = {0:x4}\r\n", info));
            for (int i = 0; i < selectors.Length; i++)
                sb.Append(String.Format("\tsel[{0}] = {1:x4}\r\n", i + 3, selectors[i]));

            if (functions.Count > 0)
            {
                sb.Append("\r\n");
                for (int i = 0; i < functions.Count; i++)
                    sb.Append(String.Format("\tfunc[{0}] = {1:x4} {2:x4}\r\n", i, functions[i], fCode[i]));
            }

            return sb.ToString();
        }
    }
}
