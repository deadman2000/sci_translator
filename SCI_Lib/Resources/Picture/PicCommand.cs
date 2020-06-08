﻿using System;

namespace SCI_Translator.Resources.Picture
{
    class PicCommand
    {
        public PicOpCode OpCode { get; private set; }

        public byte[] Args { get; private set; }

        public PicCommand(PicOpCode opcode)
        {
            OpCode = opcode;

            if (SCIPicture.LOG) Console.WriteLine($"Code {opcode}");
        }

        public PicCommand(PicOpCode opcode, byte[] args)
        {
            OpCode = opcode;
            Args = args;

            if (SCIPicture.LOG) Console.WriteLine($"Code {opcode} len: {Args.Length}");
        }

        public virtual void Write(ByteBuilder bb)
        {
            if (Args != null)
                bb.AddBytes(Args);
        }
    }
}
