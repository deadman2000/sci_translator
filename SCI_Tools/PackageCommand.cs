using McMaster.Extensions.CommandLineUtils;
using SCI_Translator.Resources;
using System;
using System.ComponentModel.DataAnnotations;
using System.Threading.Tasks;

namespace SCI_Tools
{
    abstract class PackageCommand
    {
        [Option(Description = "Original game directory", ShortName = "d", LongName = "dir")]
        [Required]
        public string GameDir { get; set; }

        [Option(Description = "Translated game directory", ShortName = "t", LongName = "trans")]
        public string TranslateDir { get; set; }

        [Option(Description = "Disable read key pause", LongName = "no-wait", ShortName = "w")]
        public bool NoWait { get; set; }

        protected SCIPackage package;

        protected async Task OnExecute()
        {
            package = SCIPackage.Load(GameDir, TranslateDir);

            await Do();

            if (!NoWait)
            {
                Console.WriteLine("Press any key to continue...");
                Console.ReadKey();
            }
        }

        protected abstract Task Do();
    }
}
