using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.ImageEditor
{
    class Sprite
    {
        List<SpriteFrame> _frames = new List<SpriteFrame>();

        public SpriteFrame this[int index] { get { return _frames[index]; } }

        public List<SpriteFrame> Frames { get { return _frames; } }
    }
}
