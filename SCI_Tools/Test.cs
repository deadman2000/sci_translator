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
            protected override async Task Do()
            {
                NbBook book = new NbBook("dead_man", "***", "77921");
                book.LoadLinks(@"D:\Projects\SCI_Translator\RobinHoodWeb\links.json");

                foreach (var res in package.Texts)
                {
                    var lines = res.GetText(false);
                    foreach (var en in lines)
                    {
                        var link = book.GetLink(res.ToString(), en);
                        if (link == null)
                            Console.WriteLine($"{res}  {en}");
                    }
                }

                foreach (var res in package.Scripts)
                {
                    var scr = res.GetScript(false);
                    var lines = scr.AllStrings;
                    foreach (var str in lines)
                    {
                        var en = str.Value;
                        var link = book.GetLink(res.ToString(), en);
                        if (link == null)
                            Console.WriteLine($"{res}  {en}");
                    }
                }

                Console.WriteLine();
            }
        }
    }
}
