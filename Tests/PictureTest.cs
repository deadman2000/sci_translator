using NUnit.Framework;
using SCI_Translator.Resources;
using SCI_Translator.Resources.Picture;
using System;
using System.Collections.Generic;
using System.Text;

namespace Tests
{
    public class PictureTest
    {
        [Test]
        public void ImagePackTest()
        {
            var package = Utils.LoadPackage();

            var res = package.GetResouce<ResPicture>(100);
            var pic = res.GetPicture(false);

            var newPic = new SCIPicture(pic.GetBytes());

            Assert.AreEqual(pic.Image, newPic.Image, "Image encode error");
        }
    }
}
