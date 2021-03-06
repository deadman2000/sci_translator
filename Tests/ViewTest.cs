﻿using NUnit.Framework;
using SCI_Translator.Resources;
using SCI_Translator.Resources.View;
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

namespace Tests
{
    class ViewTest
    {
        [Test]
        public void SuccessRecompressView()
        {
            var package = Utils.LoadPackage();

            //var r = package.GetResouce("95.p56");
            foreach (var r in package.GetResouces<ResView>())
            {
                var info = r.GetInfo();

                if (info.Method != 3) continue;

                var comp = info.GetCompressor();
                var decomp = info.GetDecompressor();

                var unpack = r.GetContent(false);
                var compressed = comp.Pack(unpack);

                var ms = new MemoryStream(compressed);
                var uncompressed = decomp.Unpack(ms, compressed.Length, unpack.Length);

                //Assert.AreEqual(unpack, uncompressed, $"Decompress error in {r.FileName}");

                var originalView = new SCIView(unpack);
                var reorderView = new SCIView(uncompressed);

                Assert.AreEqual(originalView.Palette[3..], reorderView.Palette[3..]);

                Assert.AreEqual(originalView.Loops.Count, reorderView.Loops.Count);

                for (int i = 0; i < originalView.Loops.Count; i++)
                {
                    var ol = originalView.Loops[i];
                    var rl = reorderView.Loops[i];

                    Assert.AreEqual(ol.Cells.Count, rl.Cells.Count);

                    for (int j = 0; j < ol.Cells.Count; j++)
                    {
                        var oc = ol.Cells[j];
                        var rc = rl.Cells[j];

                        Assert.AreEqual(oc.Width, rc.Width);
                        Assert.AreEqual(oc.Height, rc.Height);
                        Assert.AreEqual(oc.PlacementX, rc.PlacementX);
                        Assert.AreEqual(oc.PlacementY, rc.PlacementY);
                        Assert.AreEqual(oc.TransparentColor, rc.TransparentColor);
                    }
                }
            }
        }

    }
}
