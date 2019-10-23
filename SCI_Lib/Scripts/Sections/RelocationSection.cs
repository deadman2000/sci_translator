using SCI_Translator.Scripts.Elements;
using System.Text;

namespace SCI_Translator.Scripts.Sections
{
    class RelocationSection : Section
    {
        RefToElement[] _refs;

        public override void Read(byte[] data, ushort offset, int length)
        {
            int cnt = ReadShortBE(data, ref offset);
            _refs = new RefToElement[cnt];

            offset += 2;
            for (int i = 0; i < cnt; i++)
            {
                var addr = offset;
                ushort val = ReadShortBE(data, ref offset);
                _refs[i] = new RefToElement(_script, addr, val);
            }
        }

        public override void SetupByOffset()
        {
            foreach (var r in _refs)
                r.SetupByOffset();
        }

        public override void Write(ByteBuilder bb)
        {
            _offset = bb.Position;
            bb.AddShortBE((ushort)_refs.Length);
            bb.AddShortBE(0);
            for (int i = 0; i < _refs.Length; i++)
                _refs[i].Write(bb);
        }

        public override void WriteOffsets(ByteBuilder bb)
        {
            foreach (var r in _refs)
                r.WriteOffset(bb);
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.AppendLine($"[Relocation section (0x{_offset:X4})]");
            for (int i = 0; i < _refs.Length; i++)
                sb.AppendLine($"\tpointer[{i}] = {_refs[i].Value:x4}; {_refs[i]}");
            return sb.ToString();
        }
    }
}
