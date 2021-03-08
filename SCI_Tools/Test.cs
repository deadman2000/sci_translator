using McMaster.Extensions.CommandLineUtils;
using SCI_Translator.Resources;
using System.Threading.Tasks;

namespace SCI_Tools
{
    // test -d D:\Dos\GAMES\QG_EGA\
    [Command("test", Description = "for testing")]
    class Test : PackageCommand
    {
        protected override Task Do()
        {
            package.GetResouce<ResMessage>(1885).GetMessages(false);
            return Task.CompletedTask;
        }

    }
}
