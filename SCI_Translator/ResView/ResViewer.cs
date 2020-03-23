using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using SCI_Translator.Resources;

namespace SCI_Translator.ResView
{
    class ResViewer : UserControl
    {

        protected Resource _res;
        private bool _translated;

        public Resource Resource { get { return _res; } }

        public void Save()
        {
            if (_translated)
                SaveContent();
        }

        protected virtual void SaveContent()
        {
            _res.SaveTranslate();
        }

        public ResViewer()
        {
            InitializeComponent();
            Dock = DockStyle.Fill;
        }

        public void Activate(Resource res, bool translated)
        {
            _res = res;
            _translated = translated;
            Reload();
        }

        protected void Reload()
        {
            ShowResource(_res, _translated);
        }

        protected virtual void ShowResource(Resource res, bool translated)
        {
        }

        public virtual void FocusRow(int value)
        {
        }

        /// <summary> 
        /// Требуется переменная конструктора.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary> 
        /// Освободить все используемые ресурсы.
        /// </summary>
        /// <param name="disposing">истинно, если управляемый ресурс должен быть удален; иначе ложно.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Код, автоматически созданный конструктором компонентов

        /// <summary> 
        /// Обязательный метод для поддержки конструктора - не изменяйте 
        /// содержимое данного метода при помощи редактора кода.
        /// </summary>
        private void InitializeComponent()
        {
            components = new System.ComponentModel.Container();
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
        }

        #endregion
    }
}
