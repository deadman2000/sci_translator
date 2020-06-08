﻿using System.IO;

namespace SCI_Translator.Resources.Picture
{
    class PicPriorityBars : PicExtCommand
    {
        private byte[] bars;

        public PicPriorityBars(MemoryStream stream) : base(0x4)
        {
            bars = stream.ReadBytes(14);
        }

        protected override void WriteExt(ByteBuilder bb)
        {
            bb.AddBytes(bars);
        }
    }
}
