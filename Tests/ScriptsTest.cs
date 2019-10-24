using NUnit.Framework;
using SCI_Translator;
using SCI_Translator.Scripts;
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

        [Test]
        public void DisassembleAll()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);
            var scripts = package.Resources
                .SelectMany(r => r.Resources)
                .Where(r => r.Type == ResType.Script);

            foreach (var res in scripts)
            {
                Assert.IsNotNull(
                    res.GetScript(false));
            }
        }

        [Test]
        public void DisassembleAllRus()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);
            var scripts = package.Resources
                .SelectMany(r => r.Resources)
                .Where(r => r.Type == ResType.Script);

            foreach (var res in scripts)
            {
                Assert.IsNotNull(
                    res.GetScript(true));
            }
        }

        [Test]
        public void ParseAndBack()
        {
            SCIPackage package = new SCIPackage(GAME_DIR);
            var scripts = package.Resources
                .SelectMany(r => r.Resources)
                .Where(r => r.Type == ResType.Script);

            foreach (var res in scripts)
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