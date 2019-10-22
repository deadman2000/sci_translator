using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Runtime.InteropServices;
using System.Reflection;
using System.ComponentModel;

namespace SCI_Translator
{
    static class NativeMethods
    {
        public static Cursor LoadCustomCursorSafe(string path, Cursor def)
        {
            try
            {
                return LoadCustomCursor(path);
            }
            catch
            {
                return def;
            }
        }

        public static Cursor LoadCustomCursor(string path)
        {
            IntPtr hCurs = LoadCursorFromFile(path);
            if (hCurs == IntPtr.Zero) throw new Win32Exception();
            Cursor curs = new Cursor(hCurs);
            // Note: force the cursor to own the handle so it gets released properly
            FieldInfo fi = typeof(Cursor).GetField("ownHandle", BindingFlags.NonPublic | BindingFlags.Instance);
            fi.SetValue(curs, true);
            return curs;
        }

        [DllImport("user32.dll", SetLastError = true, CharSet = CharSet.Auto)]
        private static extern IntPtr LoadCursorFromFile(string path);
    }
}
