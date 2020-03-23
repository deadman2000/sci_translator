using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using SCI_Translator.Resources;
using SCI_Translator.Resources.SCI1;
using SCI_Translator.Scripts;
using SCI_Translator.Scripts.Elements;
using SCI_Translator.Scripts.Sections;

namespace SCI_Translator
{
    partial class FormFind : Form
    {
        SCIPackage _package;
        FormMain _main;
        bool _translate;

        string pattern;

        public FormFind(FormMain main, SCIPackage package, bool translate)
        {
            InitializeComponent();
            _package = package;
            _main = main;
            _translate = translate;
        }

        private void btFind_Click(object sender, EventArgs e)
        {
            lbResults.Items.Clear();
            pattern = tbPattern.Text.ToLower();

            foreach (var txt in _package.Texts)
                try
                {
                    FindText(txt);
                }
                catch { }

            foreach (var scr in _package.Scripts)
                try
                {
                    FindScript(scr);
                }
                catch { }

            foreach (var msg in _package.Messages)
                try
                {
                    FindMessage(msg);
                }
                catch { }
        }

        private void FindText(ResText txt)
        {
            var lines = txt.GetText(_translate);
            for (int i = 0; i < lines.Length; i++)
            {
                if (IsPass(lines[i]))
                    AddResult(txt, i, lines[i]);
            }
        }

        private void FindScript(ResScript res)
        {
            var script = res.GetScript(_translate);
            if (script == null) return;
            var sections = script.Get<StringSection>();
            foreach (var sec in sections)
                for (int ind = 0; ind < sec.Strings.Count; ind++)
                {
                    StringConst str = sec.Strings[ind];
                    if (IsPass(str.Value))
                        AddResult(res, ind, str.Value);
                }
        }

        private void FindMessage(ResMessage msg)
        {
            var messages = msg.GetMessages(_translate);
            for (int i = 0; i < messages.Count; i++)
            {
                if (IsPass(messages[i].Text))
                    AddResult(msg, i, messages[i].Text);
            }
        }

        private bool IsPass(string txt) => txt.ToLower().Contains(pattern);

        private void AddResult(Resource res, int ind, string txt)
        {
            lbResults.Items.Add(new SearchResult(res.FileName, ind, txt));
        }

        class SearchResult
        {
            public string FileName { get; }

            public int Index { get; }

            public string Value { get; }

            public SearchResult(string fileName, int index, string value)
            {
                FileName = fileName;
                Index = index;
                Value = value;
            }

            public override string ToString() => $"{FileName}\t{Index}\t{Value}";
        }

        private void lbResults_MouseDoubleClick(object sender, MouseEventArgs e)
        {
            if (lbResults.SelectedItem != null)
            {
                SearchResult sr = (SearchResult)lbResults.SelectedItem;
                _main.SelectFile(sr.FileName, sr.Index);
            }
        }

    }
}
