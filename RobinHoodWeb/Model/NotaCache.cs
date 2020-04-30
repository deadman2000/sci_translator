using MongoDB.Bson.Serialization.Attributes;

namespace RobinHoodWeb.Model
{
    [BsonIgnoreExtraElements]
    public class NotaCache
    {
        public string BookId { get; set; }
        public string Res { get; set; }
        public string Date { get; set; }
    }
}
