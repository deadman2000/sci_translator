using McMaster.Extensions.CommandLineUtils;
using Notabenoid;
using System;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace SCI_Tools
{
    // Удаление дубликатов английского текста из Notabenoid
    // Применение перевода для дублирующегося текста
    // nota_dubl -d D:\Dos\GAMES\QG_VGA\ -t D:\Dos\GAMES\QG_VGA_RUS\ -nl dead_man -np **** -b 0
    [Command("nota_dubl", Description = "Find translate dublicates")]
    class NotaFindDublicates : PackageCommand
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
            await book.ReadVolumes();

            Console.WriteLine("Read parts...");
            var tasks = book.Volumes.Select(v => book.GetParts(v)).ToArray();
            await Task.WhenAll(tasks);
            Console.WriteLine("Complete");

            var parts = tasks.SelectMany(t => t.Result);

            // Групируем по исходному тексту
            var groups = parts.GroupBy(p => p.En).Where(g => g.Count() > 1);
            foreach (var byEn in groups)
            {
                // Группируем по главе
                var byVol = byEn.GroupBy(p => p.Volume).Where(g => g.Count() > 1);
                if (!byVol.Any()) continue;

                Console.WriteLine();
                Console.WriteLine(byEn.Key);
                Console.WriteLine();
                foreach (var volumeParts in byVol)
                {
                    var volume = volumeParts.Key;
                    Console.WriteLine(volume.Name);
                    Console.WriteLine(volume.URL);

                    if (volumeParts.Any(p => !String.IsNullOrWhiteSpace(p.Tr))) // Есть перевод
                    {
                        // Удаляем без перевода
                        var remTasks = volumeParts.Where(p => String.IsNullOrWhiteSpace(p.Tr))
                                                  .Select(p => book.Remove(p))
                                                  .ToArray();
                        await Task.WhenAll(remTasks);

                        // Удаляем лишние с переводом (оставляем первый в списке)
                        var translated = volumeParts.Where(p => !String.IsNullOrWhiteSpace(p.Tr));

                        remTasks = translated.TakeLast(translated.Count() - 1)
                                             .Select(p => book.Remove(p))
                                             .ToArray();
                        await Task.WhenAll(remTasks);
                    }
                    else
                    {
                        var remTasks = volumeParts.TakeLast(volumeParts.Count() - 1)
                                                  .Select(p => book.Remove(p))
                                                  .ToArray();
                        await Task.WhenAll(remTasks);
                    }

                    foreach (var p in volumeParts)
                    {
                        Console.WriteLine($"\t{p.Id} : {p.Tr}");
                    }
                }
            }

            // Чистим и групируем еще раз
            parts = parts.Where(p => !p.Removed);
            groups = parts.GroupBy(p => p.En).Where(g => g.Count() > 1);
            foreach (var byEn in groups)
            {
                if (!byEn.Any(p => !String.IsNullOrWhiteSpace(p.Tr))) continue; // Нет перевода - пропускаем
                if (byEn.All(p => !String.IsNullOrWhiteSpace(p.Tr))) continue; // Все переведены - пропускаем

                Console.WriteLine();
                Console.WriteLine(byEn.Key);
                Console.WriteLine();

                foreach (var p in byEn)
                {
                    Console.WriteLine(p.Url);
                    Console.WriteLine(p.Tr);
                    Console.WriteLine();
                }
                Console.WriteLine("========================");

                var tr = byEn.First(p => !String.IsNullOrWhiteSpace(p.Tr)).Tr;

                var tasksTr = byEn.Where(p => String.IsNullOrWhiteSpace(p.Tr))
                                  .Select(p => book.AddTranslate(p.Volume.Name, p.En, tr))
                                  .ToArray();
                await Task.WhenAll(tasksTr);
            }
        }
    }
}
