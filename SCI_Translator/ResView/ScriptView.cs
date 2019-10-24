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
        private TabPage tabPage1;
        private TabPage tabPage2;
        private TabPage tabPage3;
        private TabPage tabPage4;
        private DataGridViewTextBoxColumn colInd;
        private DataGridViewTextBoxColumn colString;
        private DataGridViewTextBoxColumn colTranslate;
        private Script script;

        public ScriptView()
        {
            InitializeComponent();
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
                string str = sc.GetStringEscape();
                //str = str.Replace("$0D", "\r").Replace("$0A", "\n");
                string[] parts = str.Split(new string[] { "#G" }, StringSplitOptions.None);

                int row;
                if (parts.Length > 1)
                    row = dgvStrings.Rows.Add(i++, parts[0], parts[1]);
                else
                    row = dgvStrings.Rows.Add(i++, str);

                dgvStrings.Rows[row].Tag = sc;
                if (sc.IsClassName)
                    dgvStrings.Rows[row].DefaultCellStyle.BackColor = System.Drawing.Color.LightGray;
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

                ((StringConst)row.Tag).SetValueUnescape(val);
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
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            this.tc = new System.Windows.Forms.TabControl();
            this.tabPage1 = new System.Windows.Forms.TabPage();
            this.dgvStrings = new System.Windows.Forms.DataGridView();
            this.colInd = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colString = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colTranslate = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.tabPage2 = new System.Windows.Forms.TabPage();
            this.tbASM = new System.Windows.Forms.TextBox();
            this.tabPage3 = new System.Windows.Forms.TabPage();
            this.tbASMC = new System.Windows.Forms.TextBox();
            this.tabPage4 = new System.Windows.Forms.TabPage();
            this.tbHex = new System.Windows.Forms.TextBox();
            this.tc.SuspendLayout();
            this.tabPage1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgvStrings)).BeginInit();
            this.tabPage2.SuspendLayout();
            this.tabPage3.SuspendLayout();
            this.tabPage4.SuspendLayout();
            this.SuspendLayout();
            // 
            // tc
            // 
            this.tc.Controls.Add(this.tabPage1);
            this.tc.Controls.Add(this.tabPage2);
            this.tc.Controls.Add(this.tabPage3);
            this.tc.Controls.Add(this.tabPage4);
            this.tc.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tc.Location = new System.Drawing.Point(0, 0);
            this.tc.Name = "tc";
            this.tc.SelectedIndex = 0;
            this.tc.Size = new System.Drawing.Size(849, 932);
            this.tc.TabIndex = 0;
            // 
            // tabPage1
            // 
            this.tabPage1.Controls.Add(this.dgvStrings);
            this.tabPage1.Location = new System.Drawing.Point(4, 22);
            this.tabPage1.Name = "tabPage1";
            this.tabPage1.Size = new System.Drawing.Size(841, 906);
            this.tabPage1.TabIndex = 0;
            this.tabPage1.Text = "Strings";
            this.tabPage1.Visible = false;
            // 
            // dgvStrings
            // 
            this.dgvStrings.AllowUserToAddRows = false;
            this.dgvStrings.AllowUserToDeleteRows = false;
            this.dgvStrings.AutoSizeRowsMode = System.Windows.Forms.DataGridViewAutoSizeRowsMode.AllCells;
            this.dgvStrings.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.colInd,
            this.colString,
            this.colTranslate});
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle1.BackColor = System.Drawing.SystemColors.Window;
            dataGridViewCellStyle1.Font = new System.Drawing.Font("Consolas", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            dataGridViewCellStyle1.ForeColor = System.Drawing.SystemColors.ControlText;
            dataGridViewCellStyle1.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle1.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle1.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.dgvStrings.DefaultCellStyle = dataGridViewCellStyle1;
            this.dgvStrings.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dgvStrings.Location = new System.Drawing.Point(0, 0);
            this.dgvStrings.Name = "dgvStrings";
            this.dgvStrings.RowHeadersVisible = false;
            this.dgvStrings.Size = new System.Drawing.Size(841, 906);
            this.dgvStrings.TabIndex = 0;
            // 
            // colInd
            // 
            this.colInd.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.AllCells;
            this.colInd.HeaderText = "#";
            this.colInd.Name = "colInd";
            this.colInd.ReadOnly = true;
            this.colInd.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            this.colInd.Width = 20;
            // 
            // colString
            // 
            this.colString.HeaderText = "String";
            this.colString.Name = "colString";
            this.colString.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            this.colString.Width = 300;
            // 
            // colTranslate
            // 
            this.colTranslate.HeaderText = "Translate";
            this.colTranslate.Name = "colTranslate";
            this.colTranslate.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            this.colTranslate.Width = 300;
            // 
            // tabPage2
            // 
            this.tabPage2.Controls.Add(this.tbASM);
            this.tabPage2.Location = new System.Drawing.Point(4, 22);
            this.tabPage2.Name = "tabPage2";
            this.tabPage2.Size = new System.Drawing.Size(841, 906);
            this.tabPage2.TabIndex = 1;
            this.tabPage2.Text = "ASM";
            this.tabPage2.Visible = false;
            // 
            // tbASM
            // 
            this.tbASM.BackColor = System.Drawing.Color.White;
            this.tbASM.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tbASM.Font = new System.Drawing.Font("Consolas", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.tbASM.Location = new System.Drawing.Point(0, 0);
            this.tbASM.Multiline = true;
            this.tbASM.Name = "tbASM";
            this.tbASM.ReadOnly = true;
            this.tbASM.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.tbASM.Size = new System.Drawing.Size(841, 906);
            this.tbASM.TabIndex = 0;
            this.tbASM.WordWrap = false;
            // 
            // tabPage3
            // 
            this.tabPage3.Controls.Add(this.tbASMC);
            this.tabPage3.Location = new System.Drawing.Point(4, 22);
            this.tabPage3.Name = "tabPage3";
            this.tabPage3.Size = new System.Drawing.Size(841, 906);
            this.tabPage3.TabIndex = 2;
            this.tabPage3.Text = "ASM Comp";
            this.tabPage3.Visible = false;
            // 
            // tbASMC
            // 
            this.tbASMC.BackColor = System.Drawing.Color.White;
            this.tbASMC.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tbASMC.Font = new System.Drawing.Font("Consolas", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.tbASMC.Location = new System.Drawing.Point(0, 0);
            this.tbASMC.Multiline = true;
            this.tbASMC.Name = "tbASMC";
            this.tbASMC.ReadOnly = true;
            this.tbASMC.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.tbASMC.Size = new System.Drawing.Size(841, 906);
            this.tbASMC.TabIndex = 0;
            this.tbASMC.WordWrap = false;
            // 
            // tabPage4
            // 
            this.tabPage4.Controls.Add(this.tbHex);
            this.tabPage4.Location = new System.Drawing.Point(4, 22);
            this.tabPage4.Name = "tabPage4";
            this.tabPage4.Size = new System.Drawing.Size(841, 906);
            this.tabPage4.TabIndex = 3;
            this.tabPage4.Text = "HEX";
            this.tabPage4.Visible = false;
            // 
            // tbHex
            // 
            this.tbHex.BackColor = System.Drawing.Color.White;
            this.tbHex.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tbHex.Font = new System.Drawing.Font("Consolas", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.tbHex.Location = new System.Drawing.Point(0, 0);
            this.tbHex.Multiline = true;
            this.tbHex.Name = "tbHex";
            this.tbHex.ReadOnly = true;
            this.tbHex.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.tbHex.Size = new System.Drawing.Size(841, 906);
            this.tbHex.TabIndex = 0;
            this.tbHex.WordWrap = false;
            // 
            // ScriptView
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.Controls.Add(this.tc);
            this.Name = "ScriptView";
            this.Size = new System.Drawing.Size(849, 932);
            this.tc.ResumeLayout(false);
            this.tabPage1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dgvStrings)).EndInit();
            this.tabPage2.ResumeLayout(false);
            this.tabPage2.PerformLayout();
            this.tabPage3.ResumeLayout(false);
            this.tabPage3.PerformLayout();
            this.tabPage4.ResumeLayout(false);
            this.tabPage4.PerformLayout();
            this.ResumeLayout(false);

        }

    }
}
