using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;
using System.Collections.Generic;

namespace RobinHoodWeb.Model
{
    [BsonIgnoreExtraElements]
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

        [BsonIgnoreExtraElements]
        public class StringVideo
        {
            [BsonElement("video_id")]
            public string VideoId { get; set; }

            [BsonElement("url")]
            public string Url { get; set; }

            [BsonElement("score")]
            public double Score { get; set; }

            [BsonElement("time")]
            public int Time { get; set; }

            public string Image => $"/media/frames/{VideoId}/{Time}.png";
        }

        public List<StringVideo> Videos { get; set; }
    }
}
