using MongoDB.Bson.Serialization.Attributes;

namespace RobinHoodWeb.Model
{
    [BsonIgnoreExtraElements]
    public class Video
    {
        public string Game { get; set; }

        public string VideoId { get; set; }

        public int? Completed { get; set; }

        public int? Total { get; set; }

        public bool InProcess { get; set; }

        public bool Finished { get; set; }
    }
}
