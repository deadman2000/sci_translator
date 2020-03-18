using SCI_Translator.Resources;
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
        private System.Windows.Forms.DataGridView dgvText;

        public TextViewer()
        {
            InitializeComponent();
        }

        protected override void SaveContent()
        {
            dgvText.CommitEdit(DataGridViewDataErrorContexts.Commit);

            string[] lines = new string[dgvText.Rows.Count];
            for (int r = 0; r < dgvText.Rows.Count; r++)
            {
                lines[r] = (string)dgvText[1, r].Value;
            }

            ((ResText)_res).SetText(lines);
        }

        protected override void ShowResource(Resource res, bool translated)
        {
            ResText txt = (ResText)res;
            var lines = txt.GetText(translated);

            dgvText.Rows.Clear();

            for (int i = 0; i < lines.Length; i++)
            {
                dgvText.Rows.Add(i, lines[i]);
            }
        }

        private void InitializeComponent()
        {
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle3 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle2 = new System.Windows.Forms.DataGridViewCellStyle();
            this.dgvText = new System.Windows.Forms.DataGridView();
            this.colTexID = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colTexVal = new System.Windows.Forms.DataGridViewTextBoxColumn();
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
            this.colTexVal});
            dataGridViewCellStyle3.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle3.BackColor = System.Drawing.SystemColors.Window;
            dataGridViewCellStyle3.Font = new System.Drawing.Font("Consolas", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            dataGridViewCellStyle3.ForeColor = System.Drawing.SystemColors.ControlText;
            dataGridViewCellStyle3.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle3.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle3.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.dgvText.DefaultCellStyle = dataGridViewCellStyle3;
            this.dgvText.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dgvText.EditMode = System.Windows.Forms.DataGridViewEditMode.EditOnEnter;
            this.dgvText.Location = new System.Drawing.Point(0, 0);
            this.dgvText.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.dgvText.MultiSelect = false;
            this.dgvText.Name = "dgvText";
            this.dgvText.RowHeadersVisible = false;
            this.dgvText.RowHeadersWidth = 51;
            this.dgvText.Size = new System.Drawing.Size(1628, 1206);
            this.dgvText.TabIndex = 1;
            // 
            // colTexID
            // 
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleRight;
            this.colTexID.DefaultCellStyle = dataGridViewCellStyle1;
            this.colTexID.HeaderText = "TextID";
            this.colTexID.MinimumWidth = 6;
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
            this.colTexVal.MinimumWidth = 6;
            this.colTexVal.Name = "colTexVal";
            this.colTexVal.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            this.colTexVal.Width = 300;
            // 
            // TextViewer
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.Controls.Add(this.dgvText);
            this.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.Name = "TextViewer";
            this.Size = new System.Drawing.Size(1628, 1206);
            ((System.ComponentModel.ISupportInitialize)(this.dgvText)).EndInit();
            this.ResumeLayout(false);

        }
    }
}
