using System;

namespace Notabenoid_Patch
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            if (args.Length > 2)
                TranslateBuilder.GAME_DIR = args[2];

            if (args.Length > 1)
            {
                Environment.SetEnvironmentVariable("NN_LOGIN", args[0]);
                Environment.SetEnvironmentVariable("NN_PASSWORD", args[1]);
            }

            TranslateBuilder.NO_CACHE = Environment.GetEnvironmentVariable("NN_NOCACHE") != null;

            var builder = new TranslateBuilder();
            builder.Build().Wait();

            Console.WriteLine("Completed");
            Console.ReadKey();
        }
    }
}
