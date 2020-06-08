using SCI_Translator.Resources;

namespace Tests
{
    static class Utils
    {
        public const string ConquestPath = "../../../../Conquest/";

        public static SCIPackage LoadPackage()
        {
            return SCIPackage.Load(ConquestPath);
        }
    }
}
