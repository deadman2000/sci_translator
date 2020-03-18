﻿using SCI_Translator.Resources;
using SCI_Translator.Resources.SCI1;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace SCI_Translator.ResView
{
    class VocabView : ResViewer
    {
        private TabControl tc;

        private TextBox tbHex;
        private TextBox tbVocab;

        public VocabView()
        {
            tc = new TabControl();
            tc.Dock = DockStyle.Fill;
            Controls.Add(tc);

            tc.TabPages.Add("Vocab");
            tbVocab = new TextBox();
            tbVocab.BackColor = System.Drawing.Color.White;
            tbVocab.Dock = System.Windows.Forms.DockStyle.Fill;
            tbVocab.Font = new System.Drawing.Font("Consolas", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            tbVocab.Multiline = true;
            tbVocab.ReadOnly = true;
            tbVocab.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            tbVocab.WordWrap = false;
            tc.TabPages[0].Controls.Add(this.tbVocab);

            tc.TabPages.Add("HEX");
            tbHex = new TextBox();
            tbHex.BackColor = System.Drawing.Color.White;
            tbHex.Dock = System.Windows.Forms.DockStyle.Fill;
            tbHex.Font = new System.Drawing.Font("Consolas", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            tbHex.Multiline = true;
            tbHex.ReadOnly = true;
            tbHex.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            tbHex.WordWrap = false;
            tc.TabPages[1].Controls.Add(this.tbHex);
        }

        protected override void ShowResource(Resource res, bool translated)
        {
            var data = res.GetContent(translated);

            var vocab = (ResVocab)res;

            tbHex.Text = Helpers.ByteToHexTable(data);

            if (res.Number == 997)
            {
                var strings = vocab.GetVocabNames();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < strings.Length; i++)
                    sb.AppendFormat("{0:x3}: {1}", i, strings[i]).AppendLine();
                tbVocab.Text = sb.ToString();
            }
            else if (res.Number == 998)
            {
                var opcodes = vocab.GetVocabOpcodes();
                StringBuilder sb = new StringBuilder();
                foreach (var kv in opcodes)
                    sb.AppendFormat("{0:x2}: {1} {2}", kv.Key, kv.Value.Type, kv.Value.Name).AppendLine();
                tbVocab.Text = sb.ToString();
            }
            else if (res.Number == 999)
            {
                var lines = vocab.GetText();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < lines.Length; i++)
                    sb.AppendLine($"{i,-3}: {lines[i]}");
                tbVocab.Text = sb.ToString();
            }
            else
            {
                tbVocab.Text = "";
            }
        }

    }
}
