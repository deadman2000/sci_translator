namespace SCI_Translator
{
    partial class FormSelectDir
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
            this.tbGameDir = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.tbTranslateDir = new System.Windows.Forms.TextBox();
            this.btSelectOriginal = new System.Windows.Forms.Button();
            this.btSelectTranslate = new System.Windows.Forms.Button();
            this.btOpen = new System.Windows.Forms.Button();
            this.btClose = new System.Windows.Forms.Button();
            this.ofdResMap = new System.Windows.Forms.OpenFileDialog();
            this.SuspendLayout();
            // 
            // tbGameDir
            // 
            this.tbGameDir.Location = new System.Drawing.Point(16, 32);
            this.tbGameDir.Name = "tbGameDir";
            this.tbGameDir.Size = new System.Drawing.Size(404, 20);
            this.tbGameDir.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(16, 16);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(88, 13);
            this.label1.TabIndex = 1;
            this.label1.Text = "Original game dir:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(16, 64);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(162, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Translate game dir (not required):";
            // 
            // tbTranslateDir
            // 
            this.tbTranslateDir.Location = new System.Drawing.Point(16, 80);
            this.tbTranslateDir.Name = "tbTranslateDir";
            this.tbTranslateDir.Size = new System.Drawing.Size(404, 20);
            this.tbTranslateDir.TabIndex = 2;
            // 
            // btSelectOriginal
            // 
            this.btSelectOriginal.Location = new System.Drawing.Point(424, 31);
            this.btSelectOriginal.Name = "btSelectOriginal";
            this.btSelectOriginal.Size = new System.Drawing.Size(75, 23);
            this.btSelectOriginal.TabIndex = 1;
            this.btSelectOriginal.Text = "Select";
            this.btSelectOriginal.UseVisualStyleBackColor = true;
            this.btSelectOriginal.Click += new System.EventHandler(this.btSelectOriginal_Click);
            // 
            // btSelectTranslate
            // 
            this.btSelectTranslate.Location = new System.Drawing.Point(424, 79);
            this.btSelectTranslate.Name = "btSelectTranslate";
            this.btSelectTranslate.Size = new System.Drawing.Size(75, 23);
            this.btSelectTranslate.TabIndex = 3;
            this.btSelectTranslate.Text = "Select";
            this.btSelectTranslate.UseVisualStyleBackColor = true;
            this.btSelectTranslate.Click += new System.EventHandler(this.btSelectTranslate_Click);
            // 
            // btOpen
            // 
            this.btOpen.Location = new System.Drawing.Point(344, 120);
            this.btOpen.Name = "btOpen";
            this.btOpen.Size = new System.Drawing.Size(75, 23);
            this.btOpen.TabIndex = 4;
            this.btOpen.Text = "Open";
            this.btOpen.UseVisualStyleBackColor = true;
            this.btOpen.Click += new System.EventHandler(this.btOpen_Click);
            // 
            // btClose
            // 
            this.btClose.DialogResult = System.Windows.Forms.DialogResult.Cancel;
            this.btClose.Location = new System.Drawing.Point(424, 120);
            this.btClose.Name = "btClose";
            this.btClose.Size = new System.Drawing.Size(75, 23);
            this.btClose.TabIndex = 5;
            this.btClose.Text = "Close";
            this.btClose.UseVisualStyleBackColor = true;
            // 
            // ofdResMap
            // 
            this.ofdResMap.Filter = "SCI Resource Map|RESOURCE.MAP";
            this.ofdResMap.RestoreDirectory = true;
            // 
            // FormSelectDir
            // 
            this.AcceptButton = this.btOpen;
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.CancelButton = this.btClose;
            this.ClientSize = new System.Drawing.Size(513, 152);
            this.Controls.Add(this.tbTranslateDir);
            this.Controls.Add(this.tbGameDir);
            this.Controls.Add(this.btClose);
            this.Controls.Add(this.btOpen);
            this.Controls.Add(this.btSelectTranslate);
            this.Controls.Add(this.btSelectOriginal);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog;
            this.Name = "FormSelectDir";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Opening...";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox tbGameDir;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox tbTranslateDir;
        private System.Windows.Forms.Button btSelectOriginal;
        private System.Windows.Forms.Button btSelectTranslate;
        private System.Windows.Forms.Button btOpen;
        private System.Windows.Forms.Button btClose;
        private System.Windows.Forms.OpenFileDialog ofdResMap;
    }
}