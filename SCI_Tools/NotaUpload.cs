using McMaster.Extensions.CommandLineUtils;
using Notabenoid;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Text;
using System.Threading.Tasks;

namespace SCI_Tools
{
    // nota_upload -d D:\Dos\GAMES\QG_VGA\ -t D:\Dos\GAMES\QG_VGA_RUS\ -nl dead_man -np **** -b 0
    [Command("nota_upload", Description = "Upload texts from source and translated games to notabenoid.org")]
    class NotaUpload : PackageCommand
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

        protected override async Task Do()
        {
            NbBook book = new NbBook(NotabenoidLogin, NotabenoidPassword, BookId);
            await book.Upload(package);
        }
    }
}
