using SCI_Translator.Resources.Picture;

namespace SCI_Translator.Resources
{
    public class ResPicture : Resource
    {
        public SCIPicture GetPicture(bool translated)
        {
            var data = GetContent(translated);
            return new SCIPicture(data);
        }

        public void SetPicture(SCIPicture pic)
        {
            var data = pic.GetBytes();
            SaveTranslate(data);
        }
    }
}
