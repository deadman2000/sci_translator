﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;

namespace SCI_Translator
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

        internal void Translate(Dictionary<string, string> tr)
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
    }
}
