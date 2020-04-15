using McMaster.Extensions.CommandLineUtils;
using Notabenoid;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.IO;
using System.Text;
using System.Threading.Tasks;

namespace SCI_Tools
{
    // extr_en -nl dead_man -np **** -b 0
    [Command("extr_en", Description = "Find not translated lines and save its to file")]
    class ExtractEnWords
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

        protected async Task OnExecute()
        {
            var book = new NbBook(NotabenoidLogin, NotabenoidPassword, BookId);
            await book.ReadVolumes();

            foreach (var v in book.Volumes)
            {
                Console.WriteLine(v.Name);
                var tr = await book.GetTranslates(v.URL, true);
                foreach (var kv in tr)
                {
                    if (String.IsNullOrEmpty(kv.Value))
                        File.AppendAllText("en.txt", kv.Key + "\n");
                }
            }

            Console.WriteLine("Completed");
        }
    }
}
