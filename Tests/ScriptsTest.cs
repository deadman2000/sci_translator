using NUnit.Framework;
using SCI_Translator;
using SCI_Translator.Scripts;
using SCI_Translator.Scripts.Sections;
using System.Linq;

namespace Tests
{
    public class ScriptsTest
    {
        private const string GAME_DIR = @"..\..\..\..\Conquest\";

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
                    Assert.IsNotNull(r.Reference);
                }
            }
        }


        [Test]
        public void DisassembleAll()
        {
            CheckPackage(new SCIPackage(GAME_DIR), false);
        }

        [Test]
        public void DisassembleAllRus()
        {
            CheckPackage(new SCIPackage(GAME_DIR), true);
        }

        [Test]
        public void ParseAndBack()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);

            foreach (var res in package.Scripts)
            {
                var bytes = res.GetContent(false);
                var scr = new Script(res, bytes);
                var newbytes = scr.GetBytes();
                CollectionAssert.AreEqual(bytes, newbytes);
            }
        }

        [Test]
        public void SetAddressOnWrite()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);
            
            foreach (var r in package.Scripts)
            {
                var scr = r.GetScript(false);
                foreach (var e in scr.AllElements)
                    e.IsAddressSet = false;

                scr.GetBytes();

                foreach (var e in scr.AllElements)
                    Assert.IsTrue(e.IsAddressSet);
            }
        }

        [Test]
        public void RefsLifeCycle()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);

            foreach (var res in package.Scripts)
            {
                var bytes = res.GetContent(false);
                var scr = new Script(res, bytes);
                scr.GetBytes();

                foreach (var r in scr.AllRefs)
                {
                    Assert.IsTrue(r.IsSetup);
                    Assert.IsTrue(r.IsWrited);
                    Assert.IsTrue(r.IsOffsetWrited);
                }
            }
        }
    }
}