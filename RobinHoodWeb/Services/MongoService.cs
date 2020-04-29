using Microsoft.Extensions.Options;
using MongoDB.Driver;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RobinHoodWeb.Services
{
    public class MongoService
    {
        public MongoService(IOptions<MongoDBSettings> op)
        {
            var client = new MongoClient(op.Value.ConnectionString);
            Database = client.GetDatabase("Translate");
        }

        public IMongoDatabase Database { get; }
    }
}
