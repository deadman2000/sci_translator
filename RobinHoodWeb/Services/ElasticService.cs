using Microsoft.Extensions.Options;
using Nest;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace RobinHoodWeb.Services
{
    public class ElasticService
    {
        private readonly ElasticClient _client;

        public ElasticService(IOptions<ElasticSettings> op)
        {
            var settings = new ConnectionSettings(new Uri(op.Value.ConnectionString));
            _client = new ElasticClient(settings);
        }

        public async Task Index(string indexName, IEnumerable<object> documents)
        {
            await _client.Indices.DeleteAsync(indexName);
            await _client.IndexManyAsync(documents, indexName);
        }
    }
}
