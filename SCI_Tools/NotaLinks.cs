using McMaster.Extensions.CommandLineUtils;
using Notabenoid;
using System;
using System.ComponentModel.DataAnnotations;
using System.Threading.Tasks;

namespace SCI_Tools
{
    // nota_links -nl dead_man -np **** -b 77921
    [Command("nota_links", Description = "Collect and save links from notabenoid.org to file")]
    class NotaLinks
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

        [Option(Description = "Output file (default links.json)", ShortName = "o")]
        public string Output { get; set; } = "links.json";

        protected async Task OnExecute()
        {
            NbBook book = new NbBook(NotabenoidLogin, NotabenoidPassword, BookId);
            await book.GatheringLinks(Output);

            Console.WriteLine("Press any key to continue...");
            Console.ReadKey();
        }
    }
}
