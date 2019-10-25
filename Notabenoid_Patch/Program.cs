using System;

namespace Notabenoid_Patch
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            TranslateBuilder.GAME_DIR = @"./Conquest/";
            if (args.Length > 2)
                TranslateBuilder.GAME_DIR = args[2];

            Environment.SetEnvironmentVariable("NN_LOGIN", args[0]);
            Environment.SetEnvironmentVariable("NN_PASSWORD", args[1]);

            var builder = new TranslateBuilder();
            builder.Build().Wait();

            Console.WriteLine("Completed");
            Console.ReadKey();
        }
    }
}
