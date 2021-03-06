﻿using MongoDB.Driver;
using RobinHoodWeb.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Threading.Tasks;

namespace RobinHoodWeb.Services
{
    public class TranslateStoreService
    {
        private readonly IMongoCollection<TranslateString> _stringsCollection;
        private readonly IMongoCollection<Video> _videos;

        public TranslateStoreService(MongoService mongoService)
        {
            _stringsCollection = mongoService.Database.GetCollection<TranslateString>("Strings");
            _videos = mongoService.Database.GetCollection<Video>("Videos");
        }

        public IMongoCollection<TranslateString> Strings => _stringsCollection;

        public async Task AddString(string game, string resource, int index, string en, string tr)
        {
            await _stringsCollection.InsertOneAsync(new TranslateString
            {
                Game = game,
                Res = resource,
                Index = index,
                En = en,
                Tr = tr
            });
        }

        public async Task<List<TranslateString>> GetStrings(string game)
        {
            var cursor = await _stringsCollection.FindAsync(s => s.Game == game);
            return await cursor.ToListAsync();
        }

        public async Task<List<TranslateString>> GetStrings(string game, string resource)
        {
            var cursor = await _stringsCollection.FindAsync(s => s.Game == game && s.Res == resource);
            return await cursor.ToListAsync();
        }

        public async Task<IEnumerable<TranslateString>> Search(string game, string query, bool? isEn)
        {
            var query_low = query.ToLower();

            var strings = await GetStrings(game);
            var filtered = strings.Where(s => ((!isEn.HasValue || isEn == true) && s.En.ToLower().Contains(query_low))
                                           || ((!isEn.HasValue || isEn == false) && s.Tr != null && s.Tr.ToLower().Contains(query_low)));

            return filtered.Take(100);
        }


        public async Task Update<T>(TranslateString str, Expression<Func<TranslateString, T>> field, T value)
        {
            await _stringsCollection.UpdateOneAsync(s => s.Id == str.Id, Builders<TranslateString>.Update.Set(field, value));
        }



        public async Task AddVideo(string game, string videoId)
        {
            await _videos.InsertOneAsync(new Video
            {
                Game = game,
                VideoId = videoId
            });
        }

        public async Task<Video> GetVideo(string game, string videoId)
        {
            var cursor = await _videos.FindAsync(v => v.Game == game && v.VideoId == videoId);
            return await cursor.FirstOrDefaultAsync();
        }
    }
}
