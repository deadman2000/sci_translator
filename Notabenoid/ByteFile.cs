using AngleSharp.Io.Dom;
using System;
using System.IO;

namespace Notabenoid
{
    class ByteFile : IFile
    {
        public ByteFile(string fileName, string type, byte[] data)
            : this(fileName, type, new MemoryStream(data))
        {
        }

        public ByteFile(string fileName, string type, MemoryStream body)
        {
            Name = fileName;
            Type = type;
            Body = body;
            LastModified = DateTime.Now;
        }

        public Stream Body { get; }

        public bool IsClosed => Body.CanRead == false;

        public DateTime LastModified { get; }

        public int Length => (int)Body.Length;

        public string Name { get; }

        public string Type { get; }

        public void Close() => Body.Close();

        public void Dispose() => Body.Dispose();

        public IBlob Slice(int start = 0, int end = int.MaxValue, string contentType = null)
        {
            var ms = new MemoryStream();
            Body.Position = start;
            var buffer = new byte[Math.Max(0, Math.Min(end, Body.Length) - start)];
            Body.Read(buffer, 0, buffer.Length);
            ms.Write(buffer, 0, buffer.Length);
            Body.Position = 0;

            return new ByteFile(Name, Type, ms);
        }
    }
}
