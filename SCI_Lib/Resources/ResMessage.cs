using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SCI_Translator.Resources
{
    public class ResMessage : Resource
    {
        public List<MessageRecord> GetMessages(bool translate)
        {
            var data = GetContent(translate);
            List<MessageRecord> records;

            using (var stream = new MemoryStream(data.Length))
            {
                stream.Write(data, 0, data.Length);
                stream.Seek(0, SeekOrigin.Begin);

                var ver = stream.ReadUIntBE() / 1000;

                switch (ver)
                {
                    case 3:
                        records = ReadV3(stream);
                        break;
                    default:
                        throw new NotImplementedException();
                }
            }
            foreach (var r in records)
            {
                r.ReadText(data);
            }
            return records;
        }

        class RecordV3 : MessageRecord
        {
            public byte Noun { get; set; }

            public byte Verb { get; set; }

            public byte Cond { get; set; }

            public byte Seq { get; set; }

            public byte Talker { get; set; }

            public int Unknown { get; set; }

            public RecordV3(Stream stream)
            {
                Noun = (byte)stream.ReadByte();
                Verb = (byte)stream.ReadByte();
                Cond = (byte)stream.ReadByte();
                Seq = (byte)stream.ReadByte();
                Talker = (byte)stream.ReadByte();
                TextOffset = stream.ReadUShortBE();
                Unknown = stream.Read3ByteBE();
            }

            public override string ToString() => $"noun: {Noun} verb:{Verb} cond:{Cond} seq:{Seq} talker:{Talker} unknown:{Unknown} text: {Text}";
        }

        private List<MessageRecord> ReadV3(Stream stream)
        {
            ushort end = stream.ReadUShortBE();
            ushort count = stream.ReadUShortBE();

            List<MessageRecord> records = new List<MessageRecord>();
            for (int i = 0; i < count; i++)
                records.Add(new RecordV3(stream));
            return records;
        }
    }
}
