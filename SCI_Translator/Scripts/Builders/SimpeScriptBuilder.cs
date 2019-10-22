using SCI_Translator.Scripts.Sections;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.Scripts.Builders
{
    class SimpeScriptBuilder : IScriptBuilder
    {
        StringBuilder sb = new StringBuilder();

        public string Decompile(Script script)
        {
            foreach (Section sec in script.Sections)
            {
                WriteSection(sec);
            }

            return sb.ToString().TrimEnd();
        }

        private void WriteSection(Section sec)
        {
            sb.Append(sec.ToString()).AppendLine();
        }
    }
}
