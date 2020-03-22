﻿namespace SCI_Translator.Scripts.Sections
{
    public enum SectionType : ushort
    {
        None = 0,
        Object = 1,
        Code = 2,
        String = 5,
        Class = 6,
        Export = 7,
        Relocation = 8,
        Preload = 9,
        LocalVariables = 10
    }
}
