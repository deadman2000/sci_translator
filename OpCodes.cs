
        public string NameOld
        {
            get
            {
                if (_type > 0x7f)
                {
                    string name;
                    switch ((_type >> 5) & 0x03)
                    {
                        case 0: name = "l"; break;
                        case 1: name = "s"; break;
                        case 2: name = "+"; break;
                        case 3: name = "-"; break;
                        default: throw new NotImplementedException();
                    }

                    if ((_type & (1 << 3)) > 0)
                        name += 's';
                    else
                        name += 'a';

                    switch ((_type >> 1) & 0x03)
                    {
                        case 0: name += "g"; break;
                        case 1: name += "l"; break;
                        case 2: name += "t"; break;
                        case 3: name += "p"; break;
                        default: throw new NotImplementedException();
                    }

                    return name;
                }

                switch (_type)
                {
                    case 0x00:
                    case 0x01: return "bnot";
                    case 0x02:
                    case 0x03: return "add";
                    case 0x04:
                    case 0x05: return "sub";
                    case 0x06:
                    case 0x07: return "mul";
                    case 0x08:
                    case 0x09: return "div";
                    case 0x0a:
                    case 0x0b: return "mod";
                    case 0x0c:
                    case 0x0d: return "shr";
                    case 0x0e:
                    case 0x0f: return "shl";
                    case 0x10:
                    case 0x11: return "xor";
                    case 0x12:
                    case 0x13: return "and";
                    case 0x14:
                    case 0x15: return "or";
                    case 0x16:
                    case 0x17: return "neg";
                    case 0x18:
                    case 0x19: return "not";
                    case 0x1a:
                    case 0x1b: return "eq?";
                    case 0x1c:
                    case 0x1d: return "ne?";
                    case 0x1e:
                    case 0x1f: return "gt?";
                    case 0x20:
                    case 0x21: return "ge?";
                    case 0x22:
                    case 0x23: return "lt?";
                    case 0x24:
                    case 0x25: return "le?";
                    case 0x26:
                    case 0x27: return "ugt?";
                    case 0x28:
                    case 0x29: return "uge?";
                    case 0x2a:
                    case 0x2b: return "ult?";
                    case 0x2c:
                    case 0x2d: return "ule?";
                    case 0x2e:
                    case 0x2f: return "bt";
                    case 0x30:
                    case 0x31: return "bnt";
                    case 0x32:
                    case 0x33: return "jmp";
                    case 0x34:
                    case 0x35: return "ldi";
                    case 0x36:
                    case 0x37: return "push";
                    case 0x38:
                    case 0x39: return "pushi";
                    case 0x3a:
                    case 0x3b: return "toss";
                    case 0x3c:
                    case 0x3d: return "dup";
                    case 0x3e:
                    case 0x3f: return "link";
                    case 0x40:
                    case 0x41: return "call";
                    case 0x42:
                    case 0x43: return "callk";
                    case 0x44:
                    case 0x45: return "callb";
                    case 0x46:
                    case 0x47: return "calle";
                    case 0x48:
                    case 0x49: return "ret";
                    case 0x4a:
                    case 0x4b: return "send";
                    case 0x50:
                    case 0x51: return "class";
                    case 0x54:
                    case 0x55: return "self";
                    case 0x56:
                    case 0x57: return "super";
                    case 0x58:
                    case 0x59: return "&rest";
                    case 0x5a:
                    case 0x5b: return "lea";
                    case 0x5c:
                    case 0x5d: return "selfID";
                    case 0x60:
                    case 0x61: return "pprev";
                    case 0x62:
                    case 0x63: return "pToa";
                    case 0x64:
                    case 0x65: return "aTop";
                    case 0x66:
                    case 0x67: return "pTos";
                    case 0x68:
                    case 0x69: return "sTop";
                    case 0x6a:
                    case 0x6b: return "ipToa";
                    case 0x6c:
                    case 0x6d: return "dpToa";
                    case 0x6e:
                    case 0x6f: return "ipTos";
                    case 0x70:
                    case 0x71: return "dpTos";
                    case 0x72:
                    case 0x73: return "lofsa";
                    case 0x74:
                    case 0x75: return "lofss";
                    case 0x76:
                    case 0x77: return "push0";
                    case 0x78:
                    case 0x79: return "push1";
                    case 0x7a:
                    case 0x7b: return "push2";
                    case 0x7c:
                    case 0x7d: return "pushSelf";
                    default: return String.Format("0x{0:X2}", _type);
                }
            }
        }
