using McMaster.Extensions.CommandLineUtils;
using SCI_Translator.Resources;
using System.ComponentModel.DataAnnotations;
using System.Threading.Tasks;

namespace SCI_Tools
{
    abstract class PackageCommand : BaseCommand
    {
        [Option(Description = "Original game directory", ShortName = "d", LongName = "dir")]
        [Required]
        public string GameDir { get; set; }

        [Option(Description = "Translated game directory", ShortName = "t", LongName = "trans")]
        public string TranslateDir { get; set; }

        protected SCIPackage package;

        protected override async Task Execute()
        {
            package = SCIPackage.Load(GameDir, TranslateDir);

            await Do();
        }

        protected abstract Task Do();
    }
}
