using System;
using System.Collections.Generic;

namespace SCI_Translator.Pictures
{
    public class Sprite
    {
        public SpriteFrame this[int index] { get { return Frames[index]; } }

        public List<SpriteFrame> Frames { get; } = new List<SpriteFrame>();
    }
}
