using SCI_Translator.Utils;
using System;
using System.Collections.Generic;
using System.Linq;

namespace SCI_Translator.Decompression
{
    class DecompressorLZW1View : DecompressorLZW1
    {
        protected override void GoUnpack()
        {
            base.GoUnpack();
            _dest = ViewReorder.DecodeView(_dest);
        }
    }
}
