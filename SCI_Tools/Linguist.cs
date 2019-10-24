using SCI_Translator;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;

namespace SCI_Tools
{
    public class Linguist
    {
        Dictionary<string, Context> _contextsByName = new Dictionary<string, Context>();
        List<Context> _contexts = new List<Context>();

        public Linguist()
        {
        }

        public Linguist(string path)
        {
            XmlDocument doc = new XmlDocument();
            doc.Load(path);

            foreach (XmlNode contextNode in doc.DocumentElement.ChildNodes)
            {
                string name = contextNode.SelectSingleNode("name").InnerText;
                var context = GetContext(name);

                foreach (XmlNode messageNode in contextNode.SelectNodes("message"))
                {
                    int line = int.Parse(messageNode.SelectSingleNode("location/@line").Value);
                    var message = context.GetMessage(line);
                    message.Source = messageNode.SelectSingleNode("source").InnerText;
                    message.Translate = messageNode.SelectSingleNode("translation").InnerText;
                }
            }
        }

        public Context GetContext(string name)
        {
            Context context;
            if (_contextsByName.TryGetValue(name, out context))
                return context;

            context = new Context(name);
            _contexts.Add(context);
            _contextsByName.Add(name, context);
            return context;
        }

        public void Save(string path)
        {
            XmlWriterSettings settings = new XmlWriterSettings();
            settings.Indent = true;
            settings.IndentChars = ("    ");
            settings.CloseOutput = true;

            using (XmlWriter writer = XmlWriter.Create(path, settings))
            {
                writer.WriteDocType("TS", null, null, null);
                writer.WriteStartElement("TS");
                writer.WriteAttributeString("version", "2.1");
                writer.WriteAttributeString("language", "ru_RU");

                foreach (var context in _contexts)
                {
                    writer.WriteStartElement("context");

                    writer.WriteStartElement("name");
                    writer.WriteString(context.Name);
                    writer.WriteEndElement();

                    foreach (var message in context.Messages)
                    {
                        writer.WriteStartElement("message");
                        writer.WriteAttributeString("id", String.Format("{0}:{1}", message.Context.Name, message.Line));

                        {
                            writer.WriteStartElement("location");
                            writer.WriteAttributeString("filename", message.Context.Name);
                            writer.WriteAttributeString("line", message.Line.ToString());
                            writer.WriteEndElement();
                        }

                        {
                            writer.WriteStartElement("source");
                            writer.WriteString(message.Source);
                            writer.WriteEndElement();
                        }

                        {
                            writer.WriteStartElement("translation");
                            if (message.Status == TranslateStatus.Unfinished)
                                writer.WriteAttributeString("type", "unfinished");

                            if (message.Translate != null)
                                writer.WriteString(message.Translate);

                            writer.WriteEndElement();
                        }

                        writer.WriteEndElement(); // message
                    }
                    writer.WriteEndElement(); // context
                }

                writer.WriteEndElement(); // TS

                writer.Flush();
            }
        }

        public void Translate(Dictionary<string, string> tr)
        {
            foreach (var c in _contexts)
                foreach (var m in c.Messages)
                {
                    string s;
                    if (tr.TryGetValue(m.Source, out s))
                    {
                        m.Translate = s;
                        m.Status = TranslateStatus.Completed;
                    }
                }
        }

        public class Context
        {
            public string Name;

            Dictionary<int, Message> _messageByLine = new Dictionary<int, Message>();
            public List<Message> Messages = new List<Message>();

            public Context(string name)
            {
                Name = name;
            }

            public Message GetMessage(int line)
            {
                Message message;
                if (_messageByLine.TryGetValue(line, out message))
                    return message;
                message = new Message(this, line);
                _messageByLine.Add(line, message);
                Messages.Add(message);
                return message;
            }
        }

        public class Message
        {
            public Context Context;
            public int Line;
            public string Source;
            public string Translate;
            public TranslateStatus Status;

            public Message(Context context, int line)
            {
                Context = context;
                Line = line;
            }
        }

        public enum TranslateStatus
        {
            Unfinished,
            Completed
        }



        public void FillSource(SCIPackage package)
        {
            HashSet<string> proceed = new HashSet<string>();

            foreach (var res in package.Resources)
            {
                if (res.Type != ResType.Text) continue;

                foreach (var r in res.Resources)
                {
                    if (proceed.Contains(r.FileName)) continue;
                    proceed.Add(r.FileName);

                    var context = GetContext(r.FileName);

                    var en = r.GetText(false);

                    for (int i = 0; i < en.Length; i++)
                    {
                        if (en[i].Length == 0) continue;

                        Linguist.Message message = context.GetMessage(i);
                        message.Source = en[i];
                    }
                }
            }
        }

        static Dictionary<string, string> ExtractTranslate(SCIPackage package)
        {
            Dictionary<string, string> translate = new Dictionary<string, string>();

            foreach (var r in package.Texts)
            {
                var en = r.GetText(false, false, false);
                var ge = r.GetText(false, true, false);
                var ru = r.GetText(true, true, false);

                for (int i = 0; i < en.Length; i++)
                {
                    if (ge[i].Equals(ru[i])) continue;

                    translate[en[i]] = ru[i];
                }
            }

            return translate;
        }

        public static void ExportTranslate(SCIPackage package, string path)
        {
            Linguist ling = new Linguist();

            HashSet<string> proceed = new HashSet<string>();

            foreach (var res in package.Resources)
            {
                if (res.Type == ResType.Text)
                {
                    foreach (var r in res.Resources)
                    {
                        if (proceed.Contains(r.FileName)) continue;
                        proceed.Add(r.FileName);

                        var context = ling.GetContext(r.FileName);

                        var en = r.GetText(false, false, false);
                        var ru = r.GetText(true, true, false);

                        for (int i = 0; i < en.Length; i++)
                        {
                            if (en[i].Length == 0) continue;

                            Linguist.Message message = context.GetMessage(i);
                            message.Source = en[i];

                            if (!en[i].Equals(ru[i]))
                            {
                                message.Translate = ru[i];
                                message.Status = Linguist.TranslateStatus.Completed;
                            }
                        }
                    }
                }
                else if (res.Type == ResType.Script)
                {

                }
            }

            ling.Save(path);
        }

        public void ApplyTranslate(SCIPackage package)
        {
            foreach (var res in package.Resources)
            {
                if (res.Type != ResType.Text) continue;

                foreach (var r in res.Resources)
                {
                    bool modified = false;
                    var context = GetContext(r.FileName);
                    var ru = r.GetText(true, true, false);

                    for (int i = 0; i < ru.Length; i++)
                    {
                        var msg = context.GetMessage(i);

                        if (!String.IsNullOrEmpty(msg.Translate))
                            ru[i] = msg.Translate;
                        modified = true;
                    }

                    if (modified)
                        r.SetText(ru, false);
                }
            }
        }


        public static void PrepareTranslate()
        {
            Linguist l = new Linguist();

            SCIPackage pEn = new SCIPackage(Program.GAME_DIR);
            l.FillSource(pEn);

            SCIPackage pGer = new SCIPackage(@"../../../ConquestG/");
            var tr = ExtractTranslate(pGer);
            //pGer.FillTranslate(l);

            l.Translate(tr);

            l.Save("D:/translate_ru.ts");
        }

        public static void ApplyTranslate()
        {
            SCIPackage pEn = new SCIPackage(Program.GAME_DIR);
            Linguist l = new Linguist("translate_ru.ts");
            l.ApplyTranslate(pEn);
        }
    }
}
