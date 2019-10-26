using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
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

            foreach (ResMapOffset fld in _package.Resources)
            {
                foreach (Resource res in fld.Resources)
                {
                    if (res.Type == ResType.Text)
                    {
                        FindText(res);
                    }
                    else if (res.Type == ResType.Script)
                    {
                        FindScript(res);
                    }
                }
            }
        }

        void FindText(Resource res)
        {
            byte[] data = res.GetContent(_translate);
            if (data == null) return;

            int s = 0;
            int ind = 0;

            for (int i = 0; i < data.Length; i++)
            {
                if (data[i] == 0x00)
                {
                    string str = Helpers.GetStringEscape(data, s, i - s);
                    if (str.ToLower().Contains(pattern))
                    {
                        lbResults.Items.Add(new SearchResult(res.FileName, ind, str));
                    }

                    ind++;
                    s = i + 1;
                }
            }
        }

        private void FindScript(Resource res)
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
