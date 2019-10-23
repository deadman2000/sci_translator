using System;
using System.Text;
using System.Windows.Forms;
using SCI_Translator.Scripts;
using SCI_Translator.Scripts.Sections;
using SCI_Translator.Scripts.Builders;
using SCI_Translator.Scripts.Elements;

namespace SCI_Translator.ResView
{
    class ScriptView : ResViewer
    {
        private TabControl tc;
        private DataGridView dgvStrings;
        private TextBox tbHex;
        private TextBox tbASM, tbASMC;

        private Script script;

        public ScriptView()
        {
            tc = new TabControl();
            tc.Dock = DockStyle.Fill;
            Controls.Add(tc);

            tc.TabPages.Add("Strings");
            dgvStrings = new DataGridView();
            dgvStrings.RowHeadersVisible = false;
            dgvStrings.AllowUserToAddRows = false;
            dgvStrings.AllowUserToDeleteRows = false;
            dgvStrings.AllowUserToOrderColumns = false;
            dgvStrings.Dock = DockStyle.Fill;
            dgvStrings.AutoSizeRowsMode = DataGridViewAutoSizeRowsMode.AllCells;

            DataGridViewColumn colInd = new DataGridViewTextBoxColumn();
            colInd.HeaderText = "#";
            colInd.AutoSizeMode = DataGridViewAutoSizeColumnMode.AllCells;
            colInd.ReadOnly = true;
            colInd.SortMode = DataGridViewColumnSortMode.NotSortable;

            DataGridViewColumn colString = new DataGridViewTextBoxColumn();
            colString.HeaderText = "String";
            colString.Width = 300;
            colString.SortMode = DataGridViewColumnSortMode.NotSortable;

            DataGridViewColumn colTranslate = new DataGridViewTextBoxColumn();
            colTranslate.HeaderText = "Translate";
            colTranslate.Width = 300;
            colTranslate.SortMode = DataGridViewColumnSortMode.NotSortable;

            dgvStrings.Columns.AddRange(colInd, colString, colTranslate);
            tc.TabPages[0].Controls.Add(dgvStrings);

            tc.TabPages.Add("ASM");
            tbASM = new TextBox();
            tbASM.BackColor = System.Drawing.Color.White;
            tbASM.Dock = System.Windows.Forms.DockStyle.Fill;
            tbASM.Font = new System.Drawing.Font("Consolas", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            tbASM.Multiline = true;
            tbASM.ReadOnly = true;
            tbASM.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            tbASM.WordWrap = false;
            tc.TabPages[1].Controls.Add(this.tbASM);

            tc.TabPages.Add("ASM Comp");
            tbASMC = new TextBox();
            tbASMC.BackColor = System.Drawing.Color.White;
            tbASMC.Dock = System.Windows.Forms.DockStyle.Fill;
            tbASMC.Font = new System.Drawing.Font("Consolas", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            tbASMC.Multiline = true;
            tbASMC.ReadOnly = true;
            tbASMC.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            tbASMC.WordWrap = false;
            tc.TabPages[2].Controls.Add(this.tbASMC);

            tc.TabPages.Add("HEX");
            tbHex = new TextBox();
            tbHex.BackColor = System.Drawing.Color.White;
            tbHex.Dock = System.Windows.Forms.DockStyle.Fill;
            tbHex.Font = new System.Drawing.Font("Consolas", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            tbHex.Multiline = true;
            tbHex.ReadOnly = true;
            tbHex.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            tbHex.WordWrap = false;
            tc.TabPages[3].Controls.Add(this.tbHex);
        }

        protected override void ShowResource(Resource res, bool translated)
        {
            script = res.GetScript(translated);

            if (script == null)
            {
                tbHex.Text = "Unsupported compression method";
                return;
            }

            this.SuspendLayout();

            dgvStrings.Rows.Clear();
            tbASM.Clear();
            tbHex.Clear();
            
            foreach (var sec in script.Sections)
            {
                if (sec is StringSection)
                {
                    ShowStrings((StringSection)sec);
                }
            }

            tbHex.Text = new HexBuilder().Decompile(script);
            tbASM.Text = new SimpeScriptBuilder().Decompile(script);
            tbASMC.Text = new CompanionBuilder().Decompile(script);

            this.ResumeLayout();
            this.PerformLayout();
        }

        private void ShowStrings(StringSection stringSection)
        {
            int i = 0;
            foreach (StringConst sc in stringSection.Strings)
            {
                if (sc.IsClassName) continue;

                string str = sc.Value;
                str = str.Replace("$0D", "\r").Replace("$0A", "\n");
                string[] parts = str.Split(new string[] { "#G" }, StringSplitOptions.None);

                int row;
                if (parts.Length > 1)
                    row = dgvStrings.Rows.Add(i++, parts[0], parts[1]);
                else
                    row = dgvStrings.Rows.Add(i++, sc.Value);

                dgvStrings.Rows[row].Tag = sc;
            }
        }

        private void CommitStrings()
        {
            dgvStrings.CommitEdit(DataGridViewDataErrorContexts.Commit);
            foreach (DataGridViewRow row in dgvStrings.Rows)
            {
                string s1 = (string)row.Cells[1].Value;
                string s2 = (string)row.Cells[2].Value;

                string val;
                if (!String.IsNullOrEmpty(s2))
                    val = s1 + "#G" + s2;
                else
                    val = s1;

                ((StringConst)row.Tag).Value = val;
            }
        }

        public override void Save()
        {
            //_res.SaveTranslate(); return;
            CommitStrings();

            byte[] bytes = script.GetBytes();
            _res.SaveTranslate(bytes);
        }

        private void InitializeComponent()
        {
            this.SuspendLayout();
            // 
            // ScriptView
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.Name = "ScriptView";
            this.Size = new System.Drawing.Size(1492, 862);
            this.ResumeLayout(false);

        }

    }
}
