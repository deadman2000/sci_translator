using System;
using System.Windows.Forms;
using System.IO;
using SCI_Translator.ResView;
using SCI_Translator.Resources;
using System.Linq;

namespace SCI_Translator
{
    partial class FormMain : Form
    {
        SCIPackage _package;

        HexViewer hexViewer;
        TextViewer textViewer;
        FontView fontView;
        ScriptView scriptView;
        VocabView vocabView;
        MsgView msgView;

        private int? SelectRow;

        public FormMain(SCIPackage package)
        {
            _package = package;

            InitializeComponent();

            Text = package.GameDirectory;

            SetStyle(ControlStyles.OptimizedDoubleBuffer, true);

            sc.Panel2.Controls.Add(hexViewer = new HexViewer());
            sc.Panel2.Controls.Add(textViewer = new TextViewer());
            sc.Panel2.Controls.Add(fontView = new FontView());
            sc.Panel2.Controls.Add(scriptView = new ScriptView());
            sc.Panel2.Controls.Add(vocabView = new VocabView());
            sc.Panel2.Controls.Add(msgView = new MsgView());

            foreach (ResType resType in Enum.GetValues(typeof(ResType)))
            {
                var resources = package.GetResouces(resType);
                if (!resources.Any()) continue;

                TreeNode tnRes = tv.Nodes.Add(ResTypeName(resType));
                tnRes.ImageKey = "folder";
                tnRes.SelectedImageKey = tnRes.ImageKey;

                foreach (var res in resources)
                {
                    TreeNode tnRec = tnRes.Nodes.Add(res.ToString());
                    tnRec.ImageKey = ResTypeKey(resType);
                    tnRec.SelectedImageKey = tnRec.ImageKey;
                    tnRec.Tag = res;
                }
            }

            if (!_package.HasTranslate())
            {
                tsbTranslated.Checked = false;
                tsbTranslated.Visible = false;
                tsbSave.Visible = false;
            }
        }

        string ResTypeName(ResType type)
        {
            switch (type)
            {
                case ResType.AudioPath: return "Audio path";
                case ResType.CDAudio: return "CD Audio";
                default: return type.ToString();
            }
        }

        string ResTypeKey(ResType type)
        {
            switch (type)
            {
                case ResType.View: return "character";
                case ResType.Picture: return "image";
                case ResType.Script: return "script";
                case ResType.Text: return "book";
                case ResType.Sound: return "music";
                case ResType.Audio:
                case ResType.AudioPath:
                case ResType.CDAudio: return "sound";
                case ResType.Font: return "font";
                case ResType.Cursor: return "cursor";
                case ResType.Palette: return "palette";
                default: return "file";
            }
        }

        private void tv_AfterSelect(object sender, TreeViewEventArgs e)
        {
            if (e.Node.Tag is Resource)
            {
                ShowResource((Resource)e.Node.Tag, tsbTranslated.Checked);
            }
            else
            {
                tsslResourceInfo.Text = "";
            }
        }

        ResViewer _currentViewer;
        private void ShowResource(Resource res, bool translated)
        {
            var info = res.GetInfo();
            tsslResourceInfo.Text = String.Format("{0}  {1} ({2:X8}h)  {3}", res.Type, res.ResourceFileName, res.Offset, info);

            switch (res.Type)
            {
                case ResType.Text: _currentViewer = textViewer; break;
                case ResType.Font: _currentViewer = fontView; break;
                case ResType.Script: _currentViewer = scriptView; break;
                case ResType.Vocabulary: _currentViewer = vocabView; break;
                case ResType.Message: _currentViewer = msgView; break;
                default: _currentViewer = hexViewer; break;
            }

            _currentViewer.Activate(res, translated);
            if (SelectRow.HasValue)
            {
                _currentViewer.FocusRow(SelectRow.Value);
                SelectRow = null;
            }
            _currentViewer.BringToFront();
        }

        private void tsbSave_Click(object sender, EventArgs e)
        {
            if (_currentViewer != null)
                _currentViewer.Save();
        }

        private void tsbTranslated_CheckedChanged(object sender, EventArgs e)
        {
            if (_currentViewer != null && _currentViewer.DiffTranslate)
            {
                _currentViewer.Save();
                ShowResource(_currentViewer.Resource, tsbTranslated.Checked);
            }

            tsbSave.Enabled = tsbTranslated.Checked;
        }

        private void tsbFind_Click(object sender, EventArgs e)
        {
            FormFind fmFind = new FormFind(this, _package);
            fmFind.Show();
        }

        public void SelectFile(string fileName, int rowNum)
        {
            if (_currentViewer != null && _currentViewer.Resource.FileName == fileName)
            {
                _currentViewer.FocusRow(rowNum);
                return;
            }

            foreach (TreeNode tn in tv.Nodes)
            {
                foreach (TreeNode tnFile in tn.Nodes)
                {
                    if (tnFile.Text.Equals(fileName))
                    {
                        if (tv.SelectedNode == tnFile)
                        {
                            _currentViewer.FocusRow(rowNum);
                        }
                        else
                        {
                            SelectRow = rowNum;
                            tv.SelectedNode = tnFile;
                        }
                        return;
                    }
                }
            }
        }

        private void tcmiExportToFile_Click(object sender, EventArgs e)
        {
            if (tv.SelectedNode == null) return;
            Resource res = tv.SelectedNode.Tag as Resource;
            var bytes = res.GetContent(false);
            File.WriteAllBytes("D:/" + res.FileName, bytes);
        }

        private void tv_NodeMouseClick(object sender, TreeNodeMouseClickEventArgs e)
        {
            if (e.Button == MouseButtons.Right)
            {
                tv.SelectedNode = e.Node;
                if (e.Node.Tag is Resource)
                {
                    cmsResource.Show(tv, e.Location);
                }
            }
        }
    }
}
