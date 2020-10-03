using McMaster.Extensions.CommandLineUtils;
using SCI_Translator.Resources;
using SCI_Translator.Resources.SCI1;
using System;
using System.IO;
using System.Linq;
using System.Threading.Tasks;

namespace SCI_Tools
{
    // test -d D:\Dos\GAMES\QG_EGA\
    [Command("test", Description = "for testing")]
    class Test : PackageCommand
    {
        protected override Task Do()
        {
            var data = package.GetResouce("0.V56").GetContent(false);
            return Task.CompletedTask;
        }

    }
}
