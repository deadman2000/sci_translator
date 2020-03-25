using McMaster.Extensions.CommandLineUtils;
using Notabenoid;
using System.ComponentModel.DataAnnotations;
using System.Threading.Tasks;

namespace SCI_Tools
{
    // nota_patch -nl dead_man -np **** -b 0
    [Command("nota_patch", Description = "Apply translate from notabenoid.org to game")]
    class NotaPatch : PackageCommand
    {
        [Option(Description = "Login for notabenoid", ShortName = "nl")]
        [Required]
        public string NotabenoidLogin { get; set; }

        [Option(Description = "Password for notabenoid", ShortName = "np")]
        [Required]
        public string NotabenoidPassword { get; set; }

        [Option(Description = "Book ID", ShortName = "b")]
        [Required]
        public string BookId { get; set; }

        [Option(Description = "Disable translate cache", LongName = "no-cache", ShortName = "c")]
        public bool NoCache { get; set; } = false;

        protected override async Task Do()
        {
            TranslateBuilder.NO_CACHE = NoCache;

            var builder = new TranslateBuilder(NotabenoidLogin, NotabenoidPassword, BookId, GameDir, TranslateDir);
            await builder.Build();
        }
    }
}
