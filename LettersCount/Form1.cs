using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LettersCount
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            var letters = textBox1.Text.Where(c => Char.IsLetter(c))
                .GroupBy(c => c)
                .OrderBy(d => d.Key);

            StringBuilder sb = new StringBuilder();
            sb.AppendLine($"Символов: {letters.Count()}");
            foreach (var d in letters)
            {
                sb.AppendLine($"{d.Key}: {d.Count()}");
            }

            label1.Text = sb.ToString();
            textBox2.Text = String.Join("", textBox1.Text.Where(c => Char.IsLetter(c))
                .Distinct()
                .OrderBy(c => c));
        }
    }
}
