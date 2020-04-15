﻿using Microsoft.Win32;
using System;
using System.IO;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace SCI_Translator
{
    public partial class FormSelectDir : Form
    {
        class EncodingWrapper
        {
            private readonly EncodingInfo _info;

            public EncodingWrapper(EncodingInfo info)
            {
                _info = info;
            }

            public override string ToString() => $"{_info.CodePage}: {_info.DisplayName}";

            public Encoding Encoding => _info.GetEncoding();
        }

        public FormSelectDir()
        {
            InitializeComponent();

            cbEncoding.DataSource = Encoding.GetEncodings().Select(e => new EncodingWrapper(e)).ToList();
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

        public Encoding Encoding
        {
            get => ((EncodingWrapper)cbEncoding.SelectedItem).Encoding;
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
