using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator
{
    public class ResMapOffset
    {
        private ResType _type;
        private ushort _offset;
        private SCIPackage _package;
        private int _recCount;
        private List<Resource> _resources = new List<Resource>();

        public ResMapOffset(SCIPackage package, ResType type, ushort offset)
        {
            _package = package;
            _type = type;
            _offset = offset;
        }

        public SCIPackage Package { get { return _package; } }

        public ResType Type
        {
            get { return _type; }
            set { _type = value; }
        }

        public ushort Offset
        {
            get { return _offset; }
            set { _offset = value; }
        }

        public List<Resource> Resources { get { return _resources; } }

        public int RecordsCount
        {
            get { return _recCount; }
            set { _recCount = value; }
        }

        public override string ToString()
        {
            switch (_type)
            {
                case ResType.View: return "View";
                case ResType.Picture: return "Picture";
                case ResType.Script: return "Script";
                case ResType.Text: return "Text";
                case ResType.Sound: return "Sound";
                case ResType.Vocabulary: return "Vocabulary";
                case ResType.Font: return "Font";
                case ResType.Cursor: return "Cursor";
                case ResType.AudioPath: return "Audio path";
                case ResType.Bitmap: return "Bitmap";
                case ResType.Palette: return "Palette";
                case ResType.CDAudio: return "CD Audio";
                case ResType.Audio: return "Audio";
                case ResType.Sync: return "Sync";
                case ResType.Message: return "Message";
                case ResType.Map: return "Map";
                case ResType.Heap: return "Heap";
                default: throw new NotImplementedException();
            }
        }

        public string GetTypeKey()
        {
            switch (Type)
            {
                case ResType.View: return "character";
                case ResType.Picture: return "image";
                case ResType.Script: return "script";
                case ResType.Text: return "book";
                case ResType.Sound: return "music";
                case ResType.Audio:
                case ResType.AudioPath:
                case ResType.CDAudio: return "sound";
                case ResType.Font: return "font";
                case ResType.Cursor: return "cursor";
                case ResType.Palette: return "palette";
                default: return "file";
            }
        }

    }
}
