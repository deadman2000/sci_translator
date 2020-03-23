﻿using SCI_Translator.Scripts;

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
    }
}
