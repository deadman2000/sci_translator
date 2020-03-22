using System;
using System.IO;

namespace SCI_Translator.Decompression
{
    public class DecompressorLZW : Decompressor
    {
        ushort _numbits;
        ushort _curtoken, _endtoken;
        LZWCompression _compression;

        public DecompressorLZW(LZWCompression compression)
        {
            _compression = compression;
        }

        protected override void GoUnpack()
        {
            _numbits = 9;
            _curtoken = 0x102;
            _endtoken = 0x1ff;

            switch (_compression)
            {
                case LZWCompression.CompLZW:	// SCI0 LZW compression
                    UnpackLZW();
                    break;
                case LZWCompression.CompLZW1: // SCI01/1 LZW compression
                    UnpackLZW1();
                    break;
                case LZWCompression.CompLZW1View:
                    UnpackLZW1();
                    reorderView();
                    break;
                case LZWCompression.CompLZW1Pic:
                    UnpackLZW1();
                    reorderPic();
                    break;
            }
        }

        private void UnpackLZW()
        {
            ushort token; // The last received value

            ushort[] tokenlist = new ushort[4096];
            ushort[] tokenlengthlist = new ushort[4096];

            while (!IsFinished())
            {
                token = (ushort)getBitsLSB((byte)_numbits);

                if (token == 0x101)
                {
                    return; // terminator
                }

                if (token == 0x100)
                { // reset command
                    _numbits = 9;
                    _endtoken = 0x1FF;
                    _curtoken = 0x0102;
                }
                else
                {
                    ushort tokenlastlength;
                    if (token > 0xff)
                    {
                        if (token >= _curtoken)
                            throw new IOException(String.Format("unpackLZW: Bad token {0:X4}", token));

                        tokenlastlength = (ushort)(tokenlengthlist[token] + 1);
                        if (_dwWrote + tokenlastlength > _szUnpacked)
                        {
                            // For me this seems a normal situation, It's necessary to handle it
                            Console.WriteLine("unpackLZW: Trying to write beyond the end of array(len={0}, destctr={1}, tok_len={2})", _szUnpacked, _dwWrote, tokenlastlength);
                            for (int i = 0; _dwWrote < _szUnpacked; i++)
                                PutByte(_dest[tokenlist[token] + i]);
                        }
                        else
                            for (int i = 0; i < tokenlastlength; i++)
                                PutByte(_dest[tokenlist[token] + i]);
                    }
                    else
                    {
                        tokenlastlength = 1;
                        if (_dwWrote >= _szUnpacked)
                            Console.WriteLine("unpackLZW: Try to write single byte beyond end of array");
                        else
                            PutByte((byte)token);
                    }
                    if (_curtoken > _endtoken && _numbits < 12)
                    {
                        _numbits++;
                        _endtoken = (ushort)((_endtoken << 1) + 1);
                    }
                    if (_curtoken <= _endtoken)
                    {
                        tokenlist[_curtoken] = (ushort)(_dwWrote - tokenlastlength);
                        tokenlengthlist[_curtoken] = tokenlastlength;
                        _curtoken++;
                    }

                }
            }
        }

        private void UnpackLZW1()
        {
            byte[] stak = new byte[0x1014];
            Tokenlist[] tokens = new Tokenlist[0x1004];

            byte lastchar = 0;
            ushort stakptr = 0, lastbits = 0;

            byte decryptstart = 0;
            ushort bitstring;
            ushort token;
            bool bExit = false;

            while (!IsFinished() && !bExit)
            {
                switch (decryptstart)
                {
                    case 0:
                        bitstring = (ushort)getBitsMSB(_numbits);
                        if (bitstring == 0x101)
                        {// found end-of-data signal
                            bExit = true;
                            continue;
                        }
                        PutByte((byte)bitstring);
                        lastbits = bitstring;
                        lastchar = (byte)(bitstring & 0xff);
                        decryptstart = 1;
                        break;

                    case 1:
                        bitstring = (ushort)getBitsMSB(_numbits);
                        if (bitstring == 0x101)
                        { // found end-of-data signal
                            bExit = true;
                            continue;
                        }
                        if (bitstring == 0x100)
                        { // start-over signal
                            _numbits = 9;
                            _curtoken = 0x102;
                            _endtoken = 0x1ff;
                            decryptstart = 0;
                            continue;
                        }

                        token = bitstring;
                        if (token >= _curtoken)
                        { // index past current point
                            token = lastbits;
                            stak[stakptr++] = lastchar;
                        }
                        while ((token > 0xff) && (token < 0x1004))
                        { // follow links back in data
                            stak[stakptr++] = tokens[token].data;
                            token = tokens[token].next;
                        }
                        lastchar = stak[stakptr++] = (byte)(token & 0xff);
                        // put stack in buffer
                        while (stakptr > 0)
                        {
                            PutByte(stak[--stakptr]);
                            if (_dwWrote == _szUnpacked)
                            {
                                bExit = true;
                                continue;
                            }
                        }
                        // put token into record
                        if (_curtoken <= _endtoken)
                        {
                            tokens[_curtoken].data = lastchar;
                            tokens[_curtoken].next = lastbits;
                            _curtoken++;
                            if (_curtoken == _endtoken && _numbits < 12)
                            {
                                _numbits++;
                                _endtoken = (ushort)((_endtoken << 1) + 1);
                            }
                        }
                        lastbits = bitstring;
                        break;
                }
            }
        }


        private void reorderView()
        {
            throw new NotImplementedException(); // TODO
        }

        private void reorderPic()
        {
            throw new NotImplementedException(); // TODO
        }

        struct Tokenlist
        {
            public byte data;
            public ushort next;
        };
    }

    public enum LZWCompression
    {
        CompLZW,
        CompLZW1,
        CompLZW1View,
        CompLZW1Pic
    }
}
