﻿using McMaster.Extensions.CommandLineUtils;
using SCI_Translator.Resources;
using System.Drawing;
using System.Threading.Tasks;

namespace SCI_Tools
{
    [Command("replace_pic", Description = "Replace picture background")]
    class ReplacePic : PackageCommand
    {
        [Option(Description = "Picture number", LongName = "picture", ShortName = "p")]
        public ushort Picture { get; set; }

        [Option(Description = "Bitmap path", LongName = "bmp", ShortName = "b")]
        public string BitmapPath { get; set; }

        protected override Task Do()
        {
            var bmp = new Bitmap(BitmapPath);
            //var bmp = Image.FromFile(BitmapPath);
            
            var res = package.GetResouce<ResPicture>(Picture);
            var pic = res.GetPicture(false);
            pic.SetBackground(bmp);
            res.SetPicture(pic);

            return Task.CompletedTask;
        }
    }
}
