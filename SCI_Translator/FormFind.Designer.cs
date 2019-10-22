namespace SCI_Translator
{
    partial class FormFind
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.tbPattern = new System.Windows.Forms.TextBox();
            this.btFind = new System.Windows.Forms.Button();
            this.lbResults = new System.Windows.Forms.ListBox();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(31, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Text:";
            // 
            // tbPattern
            // 
            this.tbPattern.Location = new System.Drawing.Point(12, 25);
            this.tbPattern.Name = "tbPattern";
            this.tbPattern.Size = new System.Drawing.Size(366, 20);
            this.tbPattern.TabIndex = 1;
            // 
            // btFind
            // 
            this.btFind.Location = new System.Drawing.Point(384, 25);
            this.btFind.Name = "btFind";
            this.btFind.Size = new System.Drawing.Size(75, 23);
            this.btFind.TabIndex = 2;
            this.btFind.Text = "Find";
            this.btFind.UseVisualStyleBackColor = true;
            this.btFind.Click += new System.EventHandler(this.btFind_Click);
            // 
            // lbResults
            // 
            this.lbResults.FormattingEnabled = true;
            this.lbResults.Location = new System.Drawing.Point(12, 54);
            this.lbResults.Name = "lbResults";
            this.lbResults.Size = new System.Drawing.Size(447, 355);
            this.lbResults.TabIndex = 3;
            this.lbResults.MouseDoubleClick += new System.Windows.Forms.MouseEventHandler(this.lbResults_MouseDoubleClick);
            // 
            // FormFind
            // 
            this.AcceptButton = this.btFind;
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(481, 422);
            this.Controls.Add(this.lbResults);
            this.Controls.Add(this.btFind);
            this.Controls.Add(this.tbPattern);
            this.Controls.Add(this.label1);
            this.Name = "FormFind";
            this.ShowIcon = false;
            this.Text = "Search";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox tbPattern;
        private System.Windows.Forms.Button btFind;
        private System.Windows.Forms.ListBox lbResults;
    }
}