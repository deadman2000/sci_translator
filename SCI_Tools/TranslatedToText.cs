using McMaster.Extensions.CommandLineUtils;
using System;
using System.IO;
using System.Threading.Tasks;

namespace SCI_Tools
{
    // tr_to_txt -d D:\Dos\GAMES\QG_VGA\ -t D:\Dos\GAMES\QG_VGA_RUS\
    [Command("tr_to_txt", Description = "Extract translate to text file")]
    class TranslatedToText : PackageCommand
    {
        protected override async Task Do()
        {
            var path = "translate.txt";
            File.Delete(path);
            
            var resources = package.GetTextResources();

            using (var f = new StreamWriter(path))
            {
                foreach (var res in resources)
                {
                    Console.WriteLine(res);
                    await f.WriteLineAsync(res.FileName);

                    var en = res.GetStrings(false);
                    var tr = res.GetStrings(true);
                    for (int i = 0; i < tr.Length; i++)
                    {
                        if (en[i] != tr[i])
                            await f.WriteLineAsync(tr[i]);
                    }
                }
            }
        }
    }
}
