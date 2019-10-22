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

            SCIPackage package;
            try
            {
                package = new SCIPackage(dir);
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
