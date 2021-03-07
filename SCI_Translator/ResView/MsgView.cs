using System.Windows.Forms;
using SCI_Translator.Resources;

namespace SCI_Translator.ResView
{
    class MsgView : ResViewer
    {
        private DataGridViewTextBoxColumn colTexID;
        private DataGridViewTextBoxColumn colTexVal;
        private DataGridViewTextBoxColumn colTranslate;
        private System.Windows.Forms.DataGridView dgvText;

        public MsgView()
        {
            InitializeComponent();
        }
        public override bool DiffTranslate => false;

        protected override void ShowResource(Resource res, bool translated)
        {
            dgvText.Rows.Clear();

            ResMessage msg = (ResMessage)res;
            var messages = msg.GetMessages(false);

            if (msg.Package.HasTranslate)
            {
                var tr = msg.GetMessages(true);

                for (int i = 0; i < messages.Count; i++)
                    dgvText.Rows.Add(i, messages[i].Text, tr[i].Text);
            }
            else
            {
                for (int i = 0; i < messages.Count; i++)
                    dgvText.Rows.Add(i, messages[i].Text, "");
            }
        }

        public override void FocusRow(int value)
        {
            dgvText.CurrentCell = dgvText.Rows[value].Cells[0];
        }

        protected override void SaveContent()
        {
            dgvText.CommitEdit(DataGridViewDataErrorContexts.Commit);

            var tr = ((ResMessage)_res).GetMessages(true);
            for (int i = 0; i < tr.Count; i++)
            {
                tr[i].Text = (string)dgvText[2, i].Value;
            }

            ((ResMessage)_res).SetMessages(tr);
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
            this.dgvText.Margin = new System.Windows.Forms.Padding(4);
            this.dgvText.MultiSelect = false;
            this.dgvText.Name = "dgvText";
            this.dgvText.RowHeadersVisible = false;
            this.dgvText.RowHeadersWidth = 51;
            this.dgvText.Size = new System.Drawing.Size(1384, 1206);
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
            this.colTexVal.ReadOnly = true;
            this.colTexVal.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            this.colTexVal.Width = 300;
            // 
            // colTranslate
            // 
            dataGridViewCellStyle3.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.colTranslate.DefaultCellStyle = dataGridViewCellStyle3;
            this.colTranslate.HeaderText = "Translate";
            this.colTranslate.MinimumWidth = 6;
            this.colTranslate.Name = "colTranslate";
            this.colTranslate.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            this.colTranslate.Width = 300;
            // 
            // MsgView
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.Controls.Add(this.dgvText);
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "MsgView";
            this.Size = new System.Drawing.Size(1384, 1206);
            ((System.ComponentModel.ISupportInitialize)(this.dgvText)).EndInit();
            this.ResumeLayout(false);

        }
    }
}
