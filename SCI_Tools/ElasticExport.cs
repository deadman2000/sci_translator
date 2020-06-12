﻿using McMaster.Extensions.CommandLineUtils;
using Nest;
using System;
using System.Threading.Tasks;

namespace SCI_Tools
{
    // Экспорт оригинальных строк в Elasticsearch
    // to_elastic -d D:\Projects\SCI_Translator\Conquest\
    [Command("to_elastic", Description = "Find translate dublicates")]
    class ElasticExport : PackageCommand
    {
        class ElasticText
        {
            public string Resource { get; set; }
            public int Line { get; set; }
            public string Text { get; set; }
        }

        protected override async Task Do()
        {
            var settings = new ConnectionSettings(new Uri("http://192.168.99.100:9200"))
                .DefaultIndex("robin");

            var client = new ElasticClient(settings);

            foreach (var res in package.GetTextResources())
            {
                var strings = res.GetStrings(false);

                for (int i = 0; i < strings.Length; i++)
                {
                    var en = strings[i];
                    if (en.Length < 4) continue;

                    var txt = new ElasticText
                    {
                        Resource = res.ToString(),
                        Line = i,
                        Text = en
                    };
                    await client.IndexDocumentAsync(txt);
                }
            }
        }
    }
}