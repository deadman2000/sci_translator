namespace SCI_Translator.Decompression
{
    class DecompressorLZW1View : DecompressorLZW1
    {
        protected override void GoUnpack()
        {
            base.GoUnpack();
            _dest = ViewDecoder.DecodeView(_dest);
        }
    }
}
