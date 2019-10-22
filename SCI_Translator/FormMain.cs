using System;
using System.Windows.Forms;
using System.IO;
using SCI_Translator.ResView;

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

        public FormMain(SCIPackage package)
        {
            _package = package;

            InitializeComponent();
            SetStyle(ControlStyles.OptimizedDoubleBuffer, true);

            sc.Panel2.Controls.Add(hexViewer = new HexViewer());
            sc.Panel2.Controls.Add(textViewer = new TextViewer());
            sc.Panel2.Controls.Add(fontView = new FontView());
            sc.Panel2.Controls.Add(scriptView = new ScriptView());
            sc.Panel2.Controls.Add(vocabView = new VocabView());

            foreach (ResMapOffset fldr in package.Resources)
            {
                TreeNode tnRes = tv.Nodes.Add(fldr.ToString());
                tnRes.ImageKey = "folder";
                tnRes.SelectedImageKey = tnRes.ImageKey;
                tnRes.Tag = fldr;

                foreach (Resource res in fldr.Resources)
                {
                    TreeNode tnRec = tnRes.Nodes.Add(res.ToString());
                    tnRec.ImageKey = res.Map.GetTypeKey();
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

        private void tv_AfterSelect(object sender, TreeViewEventArgs e)
        {
            if (e.Node.Tag is Resource)
            {
                ShowResource((Resource)e.Node.Tag);
            }
            else
            {
                tsslResourceInfo.Text = "";
            }
        }

        ResViewer _currentViewer;
        private void ShowResource(Resource res)
        {
            tsslResourceInfo.Text = String.Format("{0}  {1} ({2:X8}h)  res_t:{3:X2} res_nr:{4} comp_size:{5} decomp_size:{6} method:{7}", res.Map.Type, res.ResourceFileName, res.Offset, res.ResT, res.ResNr, res.CompSize, res.DecompSize, res.Method);

            switch (res.Map.Type)
            {
                case ResType.Text: _currentViewer = textViewer; break;
                case ResType.Font: _currentViewer = fontView; break;
                case ResType.Script: _currentViewer = scriptView; break;
                case ResType.Vocabulary: _currentViewer = vocabView; break;
                default: _currentViewer = hexViewer; break;
            }

            _currentViewer.Activate(res, tsbTranslated.Checked);
            _currentViewer.BringToFront();
        }

        private void tsbSave_Click(object sender, EventArgs e)
        {
            if (_currentViewer != null)
                _currentViewer.Save();
        }

        private void tsbTranslated_CheckedChanged(object sender, EventArgs e)
        {
            tsbSave.Enabled = tsbTranslated.Checked;
            if (_currentViewer != null)
                ShowResource(_currentViewer.Resource);
        }

        private void tsbFind_Click(object sender, EventArgs e)
        {
            FormFind fmFind = new FormFind(this, _package);
            fmFind.Show();
        }

        public void SelectFile(string fileName)
        {
            foreach (TreeNode tn in tv.Nodes)
            {
                foreach (TreeNode tnFile in tn.Nodes)
                {
                    if (tnFile.Text.Equals(fileName))
                    {
                        tv.SelectedNode = tnFile;
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
