using SCI_Translator.Pictures;
using SCI_Translator.Resources;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MessageBoxEditor
{
    public partial class Form1 : Form
    {
        Encoding encoding = Encoding.GetEncoding(866);

        const int PADDING_LEFT = 4;
        const int PADDING_RIGHT = 4;
        const int PADDING_TOP = 4;
        const int PADDING_BOTTOM = 6;
        const int LINE_MARGIN = 3;

        public Form1()
        {
            InitializeComponent();

            var args = Environment.GetCommandLineArgs();
            if (args.Length < 2)
            {
                MessageBox.Show("Path to game dir must be in command line arguments");
                Environment.Exit(1);
            }

            var package = SCIPackage.Load(args[1]);
            cbFont.DataSource = package.GetResouces<ResFont>().ToList();
            cbFont.SelectedItem = package.GetResouce<ResFont>(300);
        }

        ResFont _fntRes;
        SCIFont _fnt;
        int _fontHeight;

        SCIFont SelectedFont()
        {
            if (cbFont.SelectedItem == _fntRes) return _fnt;

            _fntRes = (ResFont)cbFont.SelectedItem;
            _fnt = _fntRes.GetFont(false);
            _fontHeight = _fnt.Frames[(int)'A'].Height;

            return _fnt;
        }

        void DrawMessage()
        {
            var font = SelectedFont();
            var text = tbMessage.Text;
            int w = (int)nudWidth.Value;
            int h = 240;

            var bitmap = new Bitmap(w, h);
            var g = Graphics.FromImage(bitmap);
            g.FillRectangle(new SolidBrush(Color.White), 0, 0, w, h);

            int tx = PADDING_LEFT;
            int ty = PADDING_TOP;

            var lines = text.Split(new string[] { Environment.NewLine }, StringSplitOptions.None);

            foreach (var l in lines)
            {
                var bytes = encoding.GetBytes(l);

                for (int i = 0; i < bytes.Length; i++)
                {
                    if (l[i] == ' ')
                    {
                        var s = font[bytes[i]];
                        while (i < bytes.Length && l[i] == ' ') // Вставляем пробелы в начале строки
                        {
                            i++;
                            tx += s.Width;
                        }
                        i--;
                        continue;
                    }

                    //while (i < bytes.Length && l[i] == ' ') i++; // Пропускаем все пробелы
                    //if (i == bytes.Length) break;

                    // Определяем слово
                    int j = i; // Индекс конца файла
                    int ww = 0; // Ширина слова
                    while (j < bytes.Length && l[j] != ' ')
                    {
                        ww += font[bytes[j]].Width;
                        j++;
                    }

                    if (tx + ww >= w) // Слово не вмещается на эту строку - переносим на следующую
                    {
                        tx = PADDING_LEFT;
                        ty += _fontHeight + LINE_MARGIN;
                        i--;
                        continue;
                    }

                    // Рисуем слово
                    var str = l.Substring(i, j - i);
                    for (int n = i; n < j; n++)
                    {
                        Console.WriteLine(l[n]);
                        var s = font[bytes[n]];
                        s.Draw(bitmap, tx, ty);
                        tx += s.Width;
                    }
                    i = j - 1;
                }

                tx = PADDING_LEFT;
                ty += _fontHeight + LINE_MARGIN;
            }

            pictureBox1.Image = bitmap;
        }

        private void btRefresh_Click(object sender, EventArgs e) => DrawMessage();

        private void tbMessage_TextChanged(object sender, EventArgs e) => DrawMessage();

        private void btClipboard_Click(object sender, EventArgs e)
        {
            if (pictureBox1.Image == null) return;
            Clipboard.SetImage(pictureBox1.Image);
        }

    }
}
