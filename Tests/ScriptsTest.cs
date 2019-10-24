using NUnit.Framework;
using SCI_Translator;
using SCI_Translator.Scripts;
using SCI_Translator.Scripts.Elements;
using SCI_Translator.Scripts.Sections;
using System.Linq;
using System.Text;

namespace Tests
{
    public class ScriptsTest
    {
        private const string GAME_DIR = @"..\..\..\..\Conquest\";

        [SetUp]
        public void Setup()
        {
            Encoding.RegisterProvider(CodePagesEncodingProvider.Instance);
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
            var relocations = scr.Sections.Where(s => s.Type == SectionType.Relocation).Select(s => (RelocationSection)s);
            foreach (var rel in relocations)
            {
                foreach (var r in rel.Refs)
                {
                    Assert.IsNotNull(r.Reference);

                    Assert.IsInstanceOf<RefToElement>(r.Reference);
                }
            }
        }


        [Test]
        public void DisassembleAll()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);
            CheckPackage(package, false);
        }

        [Test]
        public void DisassembleAllRus()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);
            CheckPackage(package, true);
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
                var newscr = new Script(res, newbytes);
                CollectionAssert.AreEqual(bytes, newbytes);
            }
        }
    }
}