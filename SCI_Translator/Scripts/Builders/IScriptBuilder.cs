using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.Scripts.Builders
{
    interface IScriptBuilder
    {
        string Decompile(Script script);
    }
}
