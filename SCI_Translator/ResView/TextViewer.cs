using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace SCI_Translator.ResView
{
    class TextViewer : ResViewer
    {
        private DataGridViewTextBoxColumn colTexID;
        private DataGridViewTextBoxColumn colTexVal;
        private DataGridViewTextBoxColumn colTranslate;
        private System.Windows.Forms.DataGridView dgvText;

        public TextViewer()
        {
            InitializeComponent();
        }

        public override void Save()
        {
            dgvText.CommitEdit(DataGridViewDataErrorContexts.Commit);

            ByteBuilder bb = new ByteBuilder();

            for (int r = 0; r < dgvText.Rows.Count; r++)
            {
                string s1 = (string)dgvText[1, r].Value;
                string s2 = (string)dgvText[2, r].Value;
                string str;
                if (!String.IsNullOrEmpty(s2))
                    str = s1 + "#G" + s2;
                else
                    str = s1;

                bb.AddBytes(Helpers.GetBytes(str));
                bb.AddByte(0);
            }

            _res.SaveTranslate(bb.GetArray());
        }

        protected override void ShowResource(Resource res, bool translated)
        {
            byte[] data = res.GetContent(translated);

            dgvText.Rows.Clear();
            
            if (data == null) return;

            int s = 0;
            int ind = 0;

            for (int i = 0; i < data.Length; i++)
            {
                if (data[i] == 0x00)
                {
                    string strRes = Helpers.GetStringEscape(data, s, i - s);
                    string str = strRes;
                    //string str = str.Replace("$0D", "\r").Replace("$0A", "\n");
                    string[] parts = str.Split(new string[] {"#G"}, StringSplitOptions.None);
                    if (parts.Length > 1)
                        dgvText.Rows.Add(ind, parts[0], parts[1]);
                    else
                        dgvText.Rows.Add(ind, strRes);

                    ind++;
                    s = i + 1;
                }
            }
        }

        private void InitializeComponent()
        {
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle4 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle2 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle3 = new System.Windows.Forms.DataGridViewCellStyle();
            this.dgvText = new System.Windows.Forms.DataGridView();
            this.colTexID = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colTexVal = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colTranslate = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.dgvText)).BeginInit();
            this.SuspendLayout();
            // 
            // dgvText
            // 
            this.dgvText.AllowUserToAddRows = false;
            this.dgvText.AllowUserToDeleteRows = false;
            this.dgvText.AutoSizeRowsMode = System.Windows.Forms.DataGridViewAutoSizeRowsMode.AllCells;
            this.dgvText.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.dgvText.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvText.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.colTexID,
            this.colTexVal,
            this.colTranslate});
            dataGridViewCellStyle4.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle4.BackColor = System.Drawing.SystemColors.Window;
            dataGridViewCellStyle4.Font = new System.Drawing.Font("Consolas", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            dataGridViewCellStyle4.ForeColor = System.Drawing.SystemColors.ControlText;
            dataGridViewCellStyle4.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle4.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle4.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.dgvText.DefaultCellStyle = dataGridViewCellStyle4;
            this.dgvText.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dgvText.EditMode = System.Windows.Forms.DataGridViewEditMode.EditOnEnter;
            this.dgvText.Location = new System.Drawing.Point(0, 0);
            this.dgvText.MultiSelect = false;
            this.dgvText.Name = "dgvText";
            this.dgvText.RowHeadersVisible = false;
            this.dgvText.Size = new System.Drawing.Size(849, 932);
            this.dgvText.TabIndex = 1;
            // 
            // colTexID
            // 
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleRight;
            this.colTexID.DefaultCellStyle = dataGridViewCellStyle1;
            this.colTexID.HeaderText = "TextID";
            this.colTexID.Name = "colTexID";
            this.colTexID.ReadOnly = true;
            this.colTexID.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            this.colTexID.Width = 50;
            // 
            // colTexVal
            // 
            dataGridViewCellStyle2.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.colTexVal.DefaultCellStyle = dataGridViewCellStyle2;
            this.colTexVal.HeaderText = "String";
            this.colTexVal.Name = "colTexVal";
            this.colTexVal.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            this.colTexVal.Width = 300;
            // 
            // colTranslate
            // 
            dataGridViewCellStyle3.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.colTranslate.DefaultCellStyle = dataGridViewCellStyle3;
            this.colTranslate.HeaderText = "Translate";
            this.colTranslate.Name = "colTranslate";
            this.colTranslate.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            this.colTranslate.Width = 300;
            // 
            // TextViewer
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.Controls.Add(this.dgvText);
            this.Name = "TextViewer";
            this.Size = new System.Drawing.Size(849, 932);
            ((System.ComponentModel.ISupportInitialize)(this.dgvText)).EndInit();
            this.ResumeLayout(false);

        }
    }
}
