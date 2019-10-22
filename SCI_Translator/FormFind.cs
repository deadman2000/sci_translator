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

        string pattern;

        public FormFind(FormMain main, SCIPackage package)
        {
            InitializeComponent();
            _package = package;
            _main = main;
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
            byte[] data = res.GetContent(false);
            if (data == null) return;

            int s = 0;
            int ind = 0;

            for (int i = 0; i < data.Length; i++)
            {
                if (data[i] == 0x00)
                {
                    string str = Helpers.GetString(data, s, i - s);
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
            var script = res.GetScript(false);

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
            private string _fileName;

            public string FileName
            {
                get { return _fileName; }
            }

            private int _index;

            public int Index
            {
                get { return _index; }
            }

            private string _value;

            public string Value
            {
                get { return _value; }
            }

            public SearchResult(string fileName, int index, string value)
            {
                _fileName = fileName;
                _index = index;
                _value = value;
            }

            public override string ToString()
            {
                return String.Format("{0}\t{1}\t{2}", _fileName, _index, _value);
            }
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
