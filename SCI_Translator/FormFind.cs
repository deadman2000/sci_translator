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
                FindText(txt);

            foreach (var scr in _package.Scripts)
                FindScript(scr);
        }

        void FindText(ResText txt)
        {
            var lines = txt.GetText(_translate);
            for (int i = 0; i < lines.Length; i++)
            {
                var str = lines[i];
                if (str.ToLower().Contains(pattern))
                {
                    lbResults.Items.Add(new SearchResult(txt.FileName, i, str));
                }
            }
        }

        private void FindScript(ResScript res)
        {
            var script = res.GetScript(_translate);
            var sections = script.Get<StringSection>();
            foreach (var sec in sections)
                for (int ind = 0; ind < sec.Strings.Count; ind++)
                {
                    StringConst str = sec.Strings[ind];
                    if (str.Value.ToLower().Contains(pattern))
                        lbResults.Items.Add(new SearchResult(res.FileName, ind, str.Value));
                }
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
                _main.SelectFile(sr.FileName);
            }
        }

    }
}
