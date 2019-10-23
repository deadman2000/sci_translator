using SCI_Translator.Scripts.Elements;
using SCI_Translator.Scripts.Sections;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.Scripts.Builders
{
    public class CompanionBuilder : IScriptBuilder
    {
        StringBuilder sb = new StringBuilder();

        public string Decompile(Script script)
        {
            sb.AppendFormat("(script {0})", script.Resource.Number).AppendLine();
            sb.AppendLine();

            script.Get<StringSection>().ForEach(s => WriteStrings(s));
            // TODO said
            script.Get<LocalVariablesSection>().ForEach(s => WriteLocals(s));
            script.Get<ClassSection>(SectionType.Class).ForEach(s => WriteClass(s));
            script.Get<ObjectSection>().ForEach(s => WriteClass(s));

            return sb.ToString().TrimEnd();
        }

        private void WriteLocals(LocalVariablesSection locals)
        {
            sb.AppendLine("(local");
            if (locals != null)
            {
                foreach (var r in locals.Refs)
                    sb.AppendFormat("    local{0} = ${1:x4}", r.Index, r.TargetOffset).AppendLine();
            }
            sb.AppendLine(")");
            sb.AppendLine();
        }

        private void WriteStrings(StringSection section)
        {
            sb.AppendLine("(string");
            if (section != null)
            {
                foreach (var str in section.Strings)
                    sb.AppendFormat("    string_{0:x4} \"{1}\"", str.Address, str.GetValue(false)).AppendLine();
            }
            sb.AppendLine(")");
            sb.AppendLine();
        }

        private void WriteClass(ClassSection s)
        {
            sb.AppendFormat("// {0:x4}", s.Offset + 2).AppendLine();
            var super = s.SuperClass;
            sb.AppendFormat("({0} {1} of {2}",
                s.Type == SectionType.Class ? "class" : "instance",
                s.Name,
                super != null ? super.Name : "").AppendLine();

            sb.AppendLine("    (properties");
            var pack = s.Package;
            for (int i = 4; i < s.Selectors.Length; i++)
                sb.AppendFormat("        {0} ${1:x}", pack.GetName(s.Varselectors[i]), s.Selectors[i]).AppendLine();
            sb.AppendLine("    )");

            for (int i = 0; i < s.FuncNames.Length; i++)
            {
                sb.AppendFormat("    (method ({0}) // method_{1:x4}",
                    pack.GetName(s.FuncNames[i]),
                    s.FuncCode[i].TargetOffset).AppendLine();

                Code code = s.Script.GetElement(s.FuncCode[i].TargetOffset) as Code;
                while (code != null)
                {
                    if (code.XRefs.Count > 0)
                        sb.Append($"        {code.Label}").AppendLine();

                    sb.AppendFormat("  {0:x4}:{1:x2} {2,-13} {3,5} {4}", code.Address, code.Type, ArgsHexToString(code), code.Name, ArgsToString(code)).AppendLine();
                    
                    if (code.IsReturn && code.Next != null)
                        sb.AppendLine();

                    code = code.Next;
                }

                sb.AppendLine("    )");
            }

            sb.AppendLine(")");
            sb.AppendLine();
        }

        private string ArgsHexToString(Code code)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < code.Arguments.Count; i++)
            {
                object a = code.Arguments[i];
                if (a is byte)
                    sb.Append($"{a:x2}");
                else if (a is ushort)
                    sb.Append($"{a:x4}");
                else if (a is RefToElement r)
                    sb.Append($"{r.Value:x4}");
                else if (a is LinkToExport l)
                    sb.AppendFormat("{0:x4} {1:x4}", l.ScriptNumber, l.ExportNumber);
                else
                    sb.Append(a.ToString());
                sb.Append(" ");
            }
            return sb.ToString().Trim();
        }

        private string ArgsToString(Code code)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < code.Arguments.Count; i++)
            {
                object a = code.Arguments[i];
                if (a is byte)
                    sb.Append($"{a:x}");
                else if (a is ushort)
                    sb.Append($"{a:x}");
                else if (a is RefToElement r)
                {
                    if (r.Reference != null)
                        sb.Append(r.Reference.Label);
                    else
                        sb.Append($"ref_{r.TargetOffset:x4}");
                }
                else if (a is LinkToExport l)
                    sb.AppendFormat("{0:x} procedure_{1:x4}", l.ScriptNumber, l.ExportNumber);
                else
                    sb.Append(a.ToString());
                sb.Append(" ");
            }
            return sb.ToString().Trim();
        }
    }
}
