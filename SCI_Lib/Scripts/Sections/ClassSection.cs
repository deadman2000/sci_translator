using SCI_Translator.Scripts.Elements;
using System;
using System.Collections.Generic;
using System.Text;

namespace SCI_Translator.Scripts.Sections
{
    public class ClassSection : Section
    {
        ushort funcList;

        ushort[] selectors;
        ushort[] varselectors;

        ushort[] funcNames;
        RefToElement[] funcCode;

        public override void Read(byte[] data, ushort offset, int length)
        {
            ushort o = (ushort)(offset + 4);

            funcList = ReadShortBE(data, ref o);
            int selectorsCount = ReadShortBE(data, ref o);

            selectors = new ushort[selectorsCount];
            for (int i = 0; i < selectorsCount; i++)
                selectors[i] = ReadShortBE(data, ref o);

            if (Type == SectionType.Class)
            {
                varselectors = new ushort[selectorsCount];
                for (int i = 0; i < selectorsCount; i++)
                    varselectors[i] = ReadShortBE(data, ref o);
            }

            int fs = ReadShortBE(data, ref o);
            funcNames = new ushort[fs];
            for (int i = 0; i < fs; i++)
                funcNames[i] = ReadShortBE(data, ref o);

            o += 2;

            funcCode = new RefToElement[fs];
            for (int i = 0; i < fs; i++)
                funcCode[i] = new RefToElement(_script, ReadShortBE(data, ref o));
        }

        public ushort Id => selectors[0];

        public string Name => _script.GetString(selectors[3]);

        public ushort[] Selectors => selectors;

        public ushort[] Varselectors => varselectors ?? SuperClass.Varselectors;

        public ushort[] FuncNames => funcNames;

        public RefToElement[] FuncCode => funcCode;

        private ClassSection _superClass;

        public ClassSection SuperClass
        {
            get
            {
                if (_superClass != null) return _superClass;
                return _superClass = Package.GetClass(selectors[1]);
            }
        }

        public override void Write(ByteBuilder bb)
        {
            bb.AddShortBE(0x1234);
            bb.AddShortBE(0);
            bb.AddShortBE(funcList);
            bb.AddShortBE((ushort)(selectors.Length));

            for (int i = 0; i < selectors.Length; i++)
                bb.AddShortBE(selectors[i]);

            if (Type == SectionType.Class)
            {
                foreach (ushort vs in varselectors)
                    bb.AddShortBE(vs);
            }

            bb.AddShortBE((ushort)funcNames.Length);
            foreach (ushort val in funcNames)
                bb.AddShortBE(val);

            bb.AddShortBE(0);

            foreach (RefToElement r in funcCode)
                r.Write(bb);
        }

        public override void WriteOffsets(ByteBuilder bb)
        {
            foreach (RefToElement r in funcCode)
                r.WriteOffset(bb);
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append(String.Format("[{0} section (0x{1:X4})]\r\n", Type, _offset));
            sb.Append(String.Format("\tname = {0}\r\n", Name));
            sb.Append(String.Format("\tspecies = {0:x4}\r\n", Id));
            for (int i = 0; i < selectors.Length; i++)
                sb.Append(String.Format("\tsel[{0}] = {1:x}\r\n", i, selectors[i]));

            if (Type == SectionType.Class)
            {
                sb.AppendLine();
                for (int i = 0; i < varselectors.Length; i++)
                    sb.Append(String.Format("\tvarsel[{0}] = {1:x4}\t\r\n", i, varselectors[i]));
            }

            if (funcNames.Length > 0)
            {
                sb.AppendLine();
                for (int i = 0; i < funcNames.Length; i++)
                    sb.Append(String.Format("\tfunc[{0}] = {1} {2:x4}\r\n", i, Package.GetName(funcNames[i]), funcCode[i]));
            }

            return sb.ToString();
        }
    }
}
