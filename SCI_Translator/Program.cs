using SCI_Translator.Resources;
using System;
using System.IO;
using System.Reflection;
using System.Windows.Forms;

namespace SCI_Translator
{
    internal static class Program
    {
        /// <summary>
        /// Главная точка входа для приложения.
        /// </summary>
        [STAThread]
        private static void Main(string[] args)
        {
            string dir = Path.GetDirectoryName(Assembly.GetExecutingAssembly().Location);
            if (args.Length > 0) dir = args[0];
            string translate = null;
            if (args.Length > 1) translate = args[1];

            SCIPackage package;
            try
            {
                package = SCIPackage.Load(dir);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
                return;
            }

            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new FormMain(package));
        }
    }
}
