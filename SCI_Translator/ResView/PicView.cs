using SCI_Translator.Resources;

namespace SCI_Translator.ResView
{
    partial class PicView : ResViewer
    {
        public PicView()
        {
            InitializeComponent();
        }

        protected override void ShowResource(Resource res, bool translated)
        {
            try
            {
                var resPic = (ResPicture)res;
                var pic = resPic.GetPicture(translated);
                var img = pic.GetBackground();
                pictureBox1.Width = img.Width;
                pictureBox1.Height = img.Height;
                pictureBox1.Image = img;
            }
            catch
            {
                pictureBox1.Image = null;
            }
        }
    }
}
