using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace SCI_Translator.Decompression
{
    public abstract class Decompressor
    {
        public static DecompressorLZW LZW1 = new DecompressorLZW(LZWCompression.CompLZW1);
        public static DecompressorLZW LZW = new DecompressorLZW(LZWCompression.CompLZW);
        public static DecompressorHuffman Huffman = new DecompressorHuffman();

        uint _dwBits;		///< bits buffer
        byte _nBits;		///< number of unread bits in _dwBits
        int _szPacked;	///< size of the compressed data
        protected int _szUnpacked;	///< size of the decompressed data
        protected int _dwRead;		///< number of bytes read from _src
        protected int _dwWrote;	///< number of bytes written to _dest
        FileStream _src;
        protected byte[] _dest;

        public byte[] Unpack(FileStream src, int nPacked, int nUnpacked)
        {
            _src = src;
            _szPacked = nPacked;
            _szUnpacked = nUnpacked;
            _nBits = 0;
            _dwRead = _dwWrote = 0;
            _dwBits = 0;

            _dest = new byte[nUnpacked];
            GoUnpack();
            return _dest;
        }

        protected abstract void GoUnpack();

        protected bool IsFinished()
        {
            return (_dwWrote == _szUnpacked) && (_dwRead >= _szPacked);
        }

        protected byte ReadByte()
        {
            int b = _src.ReadByte();
            if (b < 0) throw new IOException();
            _dwRead++;
            return (byte)b;
        }

        protected byte[] Read(int count)
        {
            byte[] buff = new byte[count];
            int c = _src.Read(buff, 0, count);
            if (c != count) throw new IOException();
            _dwRead += c;
            return buff;
        }

        protected void PutByte(byte b)
        {
            _dest[_dwWrote++] = b;
        }

        void fetchBitsMSB()
        {
            while (_nBits <= 24)
            {
                _dwBits |= ((uint)ReadByte()) << (24 - _nBits);
                _nBits += 8;
            }
        }

        protected byte getByteMSB()
        {
            return (byte)getBitsMSB(8);
        }

        protected uint getBitsMSB(ushort n)
        {
            if (_nBits < n)
                fetchBitsMSB();
            uint ret = _dwBits >> (32 - n);
            _dwBits <<= n;
            _nBits = (byte)(_nBits - n);
            return ret;
        }

        
        void fetchBitsLSB() {
	        while (_nBits <= 24) {
                _dwBits |= ((uint)ReadByte()) << _nBits;
		        _nBits += 8;
	        }
        }

        protected uint getBitsLSB(int n)
        {
            if (_nBits < n)
                fetchBitsLSB();
            uint ret = (uint)(_dwBits & ~((~0) << n));
            _dwBits >>= n;
            _nBits = (byte)(_nBits - n);
            return ret;
        }

    }
}
