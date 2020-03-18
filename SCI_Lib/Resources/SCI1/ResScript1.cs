using SCI_Translator.Scripts;

namespace SCI_Translator.Resources.SCI1
{
    public class ResScript1 : ResScript
    {
        private Script _script;
        private Script _scriptTrans;

        public override Script GetScript(bool translate)
        {
            if (translate)
            {
                if (_scriptTrans != null) return _scriptTrans;
                return _scriptTrans = new Script(this, GetContent(true));
            }
            else
            {
                if (_script != null) return _script;
                return _script = new Script(this, GetContent(false));
            }
        }
    }
}
