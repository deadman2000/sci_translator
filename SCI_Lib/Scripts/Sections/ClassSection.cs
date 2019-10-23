using SCI_Translator.Scripts.Elements;
using System;
using System.Text;

namespace SCI_Translator.Scripts.Sections
{
    public class ClassSection : Section
    {
        ushort funcList;
        ushort[] varselectors;
        RefToElement [] propRefs;

        public override void Read(byte[] data, ushort offset, int length)
        {
            ushort o = (ushort)(offset + 4);

            funcList = ReadShortBE(data, ref o);
            int selectorsCount = ReadShortBE(data, ref o);

            Selectors = new ushort[selectorsCount];
            propRefs = new RefToElement[selectorsCount];
            for (int i = 0; i < selectorsCount; i++)
            {
                var addr = o;
                Selectors[i] = ReadShortBE(data, ref o);

                propRefs[i] = new RefToElement(_script, addr, Selectors[i]);
            }

            if (Type == SectionType.Class)
            {
                varselectors = new ushort[selectorsCount];
                for (int i = 0; i < selectorsCount; i++)
                    varselectors[i] = ReadShortBE(data, ref o);
            }

            int fs = ReadShortBE(data, ref o);
            FuncNames = new ushort[fs];
            for (int i = 0; i < fs; i++)
                FuncNames[i] = ReadShortBE(data, ref o);

            o += 2;

            FuncCode = new RefToElement[fs];
            for (int i = 0; i < fs; i++)
            {
                var addr = o;
                FuncCode[i] = new RefToElement(_script, addr, ReadShortBE(data, ref o));
            }
        }

        public override void SetupByOffset()
        {
            for (int i = 0; i < propRefs.Length; i++)
            {
                propRefs[i].SetupByOffset();
                if (propRefs[i].Reference == null)
                    propRefs[i] = null;
            }

            if (propRefs[3]?.Reference is StringConst str)
                str.IsClassName = true;

            foreach (var r in FuncCode)
                r.SetupByOffset();
        }

        public ushort Id => Selectors[0];

        public string Name => (propRefs[3]?.Reference as StringConst)?.Value;

        public ushort[] Selectors { get; private set; }

        public ushort[] Varselectors => varselectors ?? SuperClass.Varselectors;

        public ushort[] FuncNames { get; private set; }

        public RefToElement[] FuncCode { get; private set; }

        private ClassSection _superClass;

        public ClassSection SuperClass
        {
            get
            {
                if (_superClass != null) return _superClass;
                return _superClass = Package.GetClass(Selectors[1]);
            }
        }

        public override void Write(ByteBuilder bb)
        {
            bb.AddShortBE(0x1234);
            bb.AddShortBE(0);
            bb.AddShortBE(funcList);
            bb.AddShortBE((ushort)(Selectors.Length));

            for (int i = 0; i < Selectors.Length; i++)
                bb.AddShortBE(Selectors[i]);

            if (Type == SectionType.Class)
            {
                foreach (ushort vs in varselectors)
                    bb.AddShortBE(vs);
            }

            bb.AddShortBE((ushort)FuncNames.Length);
            foreach (ushort val in FuncNames)
                bb.AddShortBE(val);

            bb.AddShortBE(0);

            foreach (RefToElement r in FuncCode)
                r.Write(bb);
        }

        public override void WriteOffsets(ByteBuilder bb)
        {
            for (int i = 0; i < propRefs.Length; i++)
                propRefs[i]?.WriteOffset(bb);

            foreach (RefToElement r in FuncCode)
                r.WriteOffset(bb);
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append(String.Format("[{0} section (0x{1:X4})]\r\n", Type, _offset));
            sb.Append(String.Format("\tname = {0}\r\n", Name));
            sb.Append(String.Format("\tspecies = {0:x4}\r\n", Id));
            for (int i = 0; i < Selectors.Length; i++)
                sb.Append(String.Format("\tsel[{0}] = {1:x}\r\n", i, Selectors[i]));

            if (Type == SectionType.Class)
            {
                sb.AppendLine();
                for (int i = 0; i < varselectors.Length; i++)
                    sb.Append(String.Format("\tvarsel[{0}] = {1:x4}\t\r\n", i, varselectors[i]));
            }

            if (FuncNames.Length > 0)
            {
                sb.AppendLine();
                for (int i = 0; i < FuncNames.Length; i++)
                    sb.Append(String.Format("\tfunc[{0}] = {1} {2:x4}\r\n", i, Package.GetName(FuncNames[i]), FuncCode[i]));
            }

            return sb.ToString();
        }
    }
}
