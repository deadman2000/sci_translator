using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;

namespace RobinHoodWeb.Model
{
    public class TranslateString
    {

        [BsonId]
        public ObjectId Id { get; set; }

        public string Game { get; set; }
        
        public string Res { get; set; }
        
        public int Index { get; set; }
        
        public string En { get; set; }

        public string Tr { get; set; }

        public string NotaLink { get; set; }

        public string YTrans { get; set; }
    }
}
