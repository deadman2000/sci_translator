using SCI_Translator.Scripts;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SCI_Translator.Resources
{
    public abstract class ResScript : Resource
    {
        public abstract Script GetScript(bool translate);
    }
}
