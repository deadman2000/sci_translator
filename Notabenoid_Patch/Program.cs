using McMaster.Extensions.CommandLineUtils;
using System;
using System.ComponentModel.DataAnnotations;
using System.Threading.Tasks;

namespace Notabenoid_Patch
{
    internal class Program
    {
        public static int Main(string[] args)
            => CommandLineApplication.Execute<Program>(args);

        [Option(Description = "Game path", ShortName = "d")]
        [Required]
        public string GameDir { get; set; }
        
        [Option(Description = "Translate path", ShortName = "t")]
        public string TranslateDir { get; set; }

        [Option(Description = "Login for notabenoid", ShortName = "nl")]
        [Required]
        public string NotabenoidLogin { get; set; }

        [Option(Description = "Password for notabenoid", ShortName = "np")]
        [Required]
        public string NotabenoidPassword { get; set; }

        [Option(Description = "Disable translate lock", LongName = "no-lock")]
        public bool NoLock { get; set; } = false;

        private async Task OnExecute()
        {
            TranslateBuilder.NO_CACHE = NoLock;

            var builder = new TranslateBuilder(NotabenoidLogin, NotabenoidPassword, GameDir, TranslateDir);
            await builder.Build();

            Console.WriteLine("Completed");
            Console.ReadKey();
        }
    }
}
