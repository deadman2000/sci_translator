using SCI_Translator.Resources.View;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SCI_Translator.Resources
{
    public class ResView : Resource
    {
        public SCIView GetView(bool translated)
        {
            var data = GetContent(translated);
            return new SCIView(data);
        }
    }
}
