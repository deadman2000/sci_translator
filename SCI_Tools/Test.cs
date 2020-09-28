using McMaster.Extensions.CommandLineUtils;
using SCI_Translator.Compression;
using SCI_Translator.Decompression;
using System;
using System.IO;
using System.Threading.Tasks;

namespace SCI_Tools
{
    partial class Program
    {
        // test -d D:\Dos\GAMES\QG_EGA\
        [Command("test", Description = "for testing")]
        class Test : PackageCommand
        {
            protected override Task Do()
            {
                var res = package.GetResouce("50.p56");
                //foreach (var res in package.Resources)
                {
                    var info = res.GetInfo();
                    if (info.Method == 2)
                    {
                        Console.WriteLine(res);

                        //Decompress(res);
                        //Compress(res);
                        CompDecomp(res);

                        //break;
                    }
                }

                return Task.CompletedTask;
            }

            private void Decompress(SCI_Translator.Resources.Resource res)
            {
                Decompressor.DEBUG = true;
                res.GetContent(false);
            }

            private void Compress(SCI_Translator.Resources.Resource res)
            {
                Compressor.DEBUG = true;
                var mem = new MemoryStream();
                var comp = res.GetInfo().GetCompressor();
                var content = res.GetContent(false);
                comp.Pack(content, mem);
            }

            private void CompDecomp(SCI_Translator.Resources.Resource res)
            {
                var mem = new MemoryStream();
                var comp = res.GetInfo().GetCompressor();
                var content = res.GetContent(false);
                int size = comp.Pack(content, mem);

                mem.Seek(0, SeekOrigin.Begin);

                Decompressor.DEBUG = true;
                res.GetInfo().GetDecompressor().Unpack(mem, size, content.Length);
            }

        }
    }
}
