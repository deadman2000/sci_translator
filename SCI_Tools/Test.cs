using McMaster.Extensions.CommandLineUtils;
using Notabenoid;
using System;
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
            return Task.CompletedTask;
            }
        }
    }
}
