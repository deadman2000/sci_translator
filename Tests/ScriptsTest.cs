using NUnit.Framework;
using SCI_Translator.Resources;
using SCI_Translator.Scripts;
using SCI_Translator.Scripts.Elements;
using SCI_Translator.Scripts.Sections;
using System.Linq;

namespace Tests
{
    public class ScriptsTest
    {
        [SetUp]
        public void Setup()
        {
        }
        
        private void CheckPackage(SCIPackage package, bool translate)
        {
            foreach (var res in package.Scripts)
            {
                var scr = res.GetScript(translate);
                Assert.IsNotNull(scr);

                CheckScriptValid(scr);
            }
        }

        private void CheckScriptValid(Script scr)
        {
            // Проверка ссылок на ссылки
            foreach (var rel in scr.Sections.OfType<RelocationSection>())
            {
                foreach (var r in rel.Refs)
                {
                    var descr = $"Res: {scr.Resource} Ref at {r.Address:x4} Target: {r.TargetOffset:x4} Source: {r.Source}";
                    Assert.IsNotNull(r.Reference, descr);
                    Assert.IsInstanceOf<RefToElement>(r.Reference, descr);
                }
            }
        }

        [Test]
        public void DisassembleAll()
        {
            CheckPackage(Utils.LoadPackage(), false);
        }

        [Test]
        public void DisassembleAllRus()
        {
            CheckPackage(Utils.LoadPackage(), true);
        }

        [Test]
        public void ParseAndBack()
        {
            SCIPackage package = Utils.LoadPackage();

            foreach (var res in package.Scripts)
            {
                var bytes = res.GetContent(false);
                var newbytes = res.GetScript(false).GetBytes();
                CollectionAssert.AreEqual(bytes, newbytes);
            }
        }

        [Test]
        public void SetAddressOnWrite()
        {
            SCIPackage package = Utils.LoadPackage();
            
            foreach (var r in package.Scripts)
            {
                var scr = r.GetScript(false);
                foreach (var e in scr.AllElements)
                    e.IsAddressSet = false;

                scr.GetBytes();

                foreach (var e in scr.AllElements)
                    Assert.IsTrue(e.IsAddressSet, $"{e}");
            }
        }

        [Test]
        public void RefsLifeCycle()
        {
            SCIPackage package = Utils.LoadPackage();

            foreach (var res in package.Scripts)
            {
                var scr = res.GetScript(false);
                scr.GetBytes();

                foreach (var r in scr.AllRefs)
                {
                    var descr = $"{res} {r.Address:x4} {r.Source}";
                    Assert.IsTrue(r.IsSetup, descr);
                    Assert.IsTrue(r.IsWrited, descr);
                    Assert.IsTrue(r.IsOffsetWrited, descr);
                }
            }
        }
    }
}