using SCI_Translator.Pictures;

namespace SCI_Translator.Resources
{
    public class ResFont : Resource
    {
        public SCIFont GetFont(bool translated)
        {
            byte[] data = GetContent(translated);
            if (data == null) return null;

            ushort charCount = (ushort)(data[1] * 256 + data[2]);
            var spr = new SCIFont();
            spr.FontHeight = (ushort)(data[3] * 256 + data[4]);

            byte bit;
            byte c;

            for (byte i = 0; i < charCount; i++)
            {
                ushort offset = (ushort)(data[6 + i * 2] + data[6 + i * 2 + 1] * 256);
                byte w = data[offset];
                byte h = data[offset + 1];

                offset += 2;

                SpriteFrame frm = new SpriteFrame(w, h);
                for (int y = 0; y < h; y++)
                {
                    bit = 0;

                    for (byte x = 0; x < w; x++)
                    {
                        if ((data[offset] & (1 << (7 - bit))) > 0)
                            c = 1;
                        else
                            c = 0;

                        frm[x, y] = c;

                        bit++;
                        if (bit == 8)
                        {
                            bit = 0;
                            offset++;
                        }
                    }

                    if (bit != 0)
                        offset++;
                }

                spr.Frames.Add(frm);

            }

            return spr;
        }

        public void SetFont(SCIFont spr)
        {
            ushort cnt = (ushort)(spr.Frames.Count & 0xFFFF);

            ByteBuilder bb = new ByteBuilder();
            bb.AddByte(0);
            bb.AddShortLE(cnt);
            bb.AddShortLE(spr.FontHeight);
            bb.AddByte(0);

            for (int i = 0; i < cnt; i++)
                bb.AddShortLE(0);

            byte bit;
            byte bitMask;
            for (int i = 0; i < cnt; i++)
            {

                SpriteFrame frm = spr[i];
                byte w = (byte)frm.Width;
                byte h = (byte)frm.Height;
                ushort offset = (ushort)bb.Position;

                bb.SetShortBE(6 + i * 2, offset);

                bb.AddByte(w);
                bb.AddByte(h);
                for (int y = 0; y < frm.Height; y++)
                {
                    bit = 0;
                    bitMask = 0;
                    for (int x = 0; x < frm.Width; x++)
                    {
                        if (frm[x, y] == 1)
                            bitMask |= (byte)(1 << (7 - bit));

                        bit++;
                        if (bit == 8)
                        {
                            bit = 0;
                            bb.AddByte(bitMask);
                            bitMask = 0;
                        }
                    }

                    if (bit != 0)
                        bb.AddByte(bitMask);
                }
            }

            SaveTranslate(bb.GetArray());
        }

    }
}
