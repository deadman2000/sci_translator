using Microsoft.Win32;
using System;
using System.IO;
using System.Windows.Forms;

namespace SCI_Translator
{
    public partial class FormSelectDir : Form
    {
        public FormSelectDir()
        {
            InitializeComponent();
        }

        public string GameDir
        {
            get => tbGameDir.Text;
            set => tbGameDir.Text = value;
        }

        public string TranslateDir
        {
            get => tbTranslateDir.Text;
            set => tbTranslateDir.Text = value;
        }

        private void btOpen_Click(object sender, EventArgs e)
        {
            if (GameDir.Length == 0) return;
            
            RegistryKey key = Registry.CurrentUser.CreateSubKey("SCI_Translator");
            key.SetValue("LastGameDir", GameDir);
            key.SetValue("LastTranslateDir", TranslateDir);
            key.Close();

            DialogResult = DialogResult.OK;
            Close();
        }

        private void btSelectOriginal_Click(object sender, EventArgs e)
        {
            if (ofdResMap.ShowDialog() == DialogResult.OK)
                tbGameDir.Text = Path.GetDirectoryName(ofdResMap.FileName);
        }

        private void btSelectTranslate_Click(object sender, EventArgs e)
        {
            if (ofdResMap.ShowDialog() == DialogResult.OK)
                tbTranslateDir.Text = Path.GetDirectoryName(ofdResMap.FileName);
        }
    }
}
