using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SCI_Translator.ImageEditor
{
    class SpriteFrame
    {
        private byte[,] _pixelMap;
        private int _width;
        private int _height;

        public SpriteFrame(int width, int height)
        {
            if (width <= 0 || height <= 0) throw new Exception("Invalid frame size");

            _width = width;
            _height = height;
            _pixelMap = new byte[width, height];
        }

        public SpriteFrame(SpriteFrame original)
        {
            _width = original._width;
            _height = original._height;
            _pixelMap = new byte[_width, _height];
            for (int x = 0; x < _width; x++)
                for (int y = 0; y < _height; y++)
                    _pixelMap[x, y] = original._pixelMap[x, y];
        }

        public byte this[int x, int y]
        {
            get { return _pixelMap[x, y]; }
            set { _pixelMap[x, y] = value; }
        }

        public int Width { get { return _width; } }

        public int Height { get { return _height; } }

        public void Resize(int w, int h)
        {
            byte[,] newMap = new byte[w, h];

            for (int y = 0; y < h && y < _height; y++)
                for (int x = 0; x < w && x < _width; x++)
                    newMap[x, y] = _pixelMap[x, y];

            _pixelMap = newMap;
            _width = w;
            _height = h;
        }

        public void ShiftLeft(byte c)
        {
            for (int x = 0; x < _width - 1; x++)
                for (int y = 0; y < _height; y++)
                    _pixelMap[x, y] = _pixelMap[x + 1, y];

            for (int y = 0; y < _height; y++)
                _pixelMap[_width - 1, y] = c;
        }

        public void ShiftRight(byte c)
        {
            for (int x = _width - 1; x > 0; x--)
                for (int y = 0; y < _height; y++)
                    _pixelMap[x, y] = _pixelMap[x - 1, y];

            for (int y = 0; y < _height; y++)
                _pixelMap[0, y] = c;
        }

        public void ShiftUp(byte c)
        {
            for (int x = 0; x < _width; x++)
                for (int y = 0; y < _height - 1; y++)
                    _pixelMap[x, y] = _pixelMap[x, y + 1];

            for (int x = 0; x < _width; x++)
                _pixelMap[x, _height - 1] = c;
        }

        public void ShiftDown(byte c)
        {
            for (int x = 0; x < _width; x++)
                for (int y = _height - 1; y > 0; y--)
                    _pixelMap[x, y] = _pixelMap[x, y - 1];

            for (int x = 0; x < _width; x++)
                _pixelMap[x, 0] = c;
        }
    }
}
