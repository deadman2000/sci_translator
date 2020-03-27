
using SCI_Translator.Scripts;
using System;
using System.Linq;

namespace SCI_Translator.Resources
{
    public class ResScript : Resource
    {
        private Script _script;
        private Script _scriptTrans;

        public Script GetScript(bool translate)
        {
            if (Package.SeparateHeapResources)
                return null;

            if (translate)
            {
                if (_scriptTrans != null) return _scriptTrans;
                return _scriptTrans = new Script(this, true);
            }
            else
            {
                if (_script != null) return _script;
                return _script = new Script(this, false);
            }
        }

        public override string[] GetStrings(bool translate)
        {
            return GetScript(translate)?.AllStrings.Select(s => s.Value).ToArray();
        }

        public override void SetTranslate(string[] strings)
        {
            var trScr = GetScript(true);
            var scriptStrings = trScr.AllStrings.ToArray();

            if (strings.Length != scriptStrings.Length)
                throw new Exception("Line count mismatch");

            for (int i = 0; i < strings.Length; i++)
                scriptStrings[i].Value = strings[i];

            SaveTranslate(trScr.GetBytes());
        }
    }
}
