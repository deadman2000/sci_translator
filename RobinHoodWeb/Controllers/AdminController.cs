using Microsoft.AspNetCore.Mvc;
using RobinHoodWeb.Model;
using RobinHoodWeb.Services;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using YTranslate;

namespace RobinHoodWeb.Controllers
{
    [ApiController]
    [Route("/api/[controller]")]
    public class AdminController : ControllerBase
    {
        private readonly TranslateService _translateService;
        private readonly TranslateStoreService _store;

        public AdminController(TranslateService translateService, TranslateStoreService store)
        {
            _translateService = translateService;
            _store = store;
        }

        /// <summary>
        /// Перенос ресурсов в БД
        /// </summary>
        /// <returns></returns>
        [HttpPost("tomongo")]
        public async Task<IActionResult> ToMongo()
        {
            var package = _translateService.GetPackage();

            List<TranslateString> strings = await _store.GetStrings("robin");

            foreach (var res in package.GetTextResources())
            {
                Console.WriteLine(res);
                var en = res.GetStrings(false);
                var tr = res.GetStrings(true);

                for (int i = 0; i < en.Length; i++)
                {
                    var translate = tr[i] == en[i] ? null : tr[i];

                    var str = strings.Find(s => s.Res == res.ToString() && s.Index == i);

                    if (str == null)
                        await _store.AddString("robin", res.ToString(), i, en[i], translate);
                    else if (str.Tr != translate)
                        await _store.Update(str, s => s.Tr, translate);
                }
            }

            return Ok();
        }

        [HttpPost("toelastic/{game}")]
        public async Task<IActionResult> ToElastic(string game, [FromServices] ElasticService elastic)
        {
            var strings = await _store.GetStrings(game);

            await elastic.Index(game, strings
                .Where(s => s.En.Length >= 4)
                .Select(s => new
                {
                    Resource = s.Res,
                    Line = s.Index,
                    Text = s.En
                }));

            return Ok();
        }

        /// <summary>
        /// Перенос Яндекс.Перевода в БД
        /// </summary>
        /// <returns></returns>
        [HttpPost("ytrans")]
        public async Task<IActionResult> YTrans()
        {
            var tranlations = GameTranslate.Load("ytrans.json");
            Dictionary<string, string> dict = new Dictionary<string, string>();
            tranlations.ForEach(t => dict[t.en] = t.ru);

            List<TranslateString> strings = await _store.GetStrings("robin");

            foreach (var s in strings)
            {
                if (dict.TryGetValue(s.En, out var val))
                {
                    await _store.Update(s, s => s.YTrans, val);
                }
            }

            return Ok();
        }

        [HttpPost("notalinks")]
        public async Task<IActionResult> NotaLinks()
        {
            List<TranslateString> strings = await _store.GetStrings("robin");

            if (_translateService.Book.Links == null)
                _translateService.Book.LoadLinks("links.json");

            foreach (var s in strings)
            {
                var link = _translateService.Book.GetLink(s.Res, s.En);
                if (link != null)
                {
                    await _store.Update(s, s => s.NotaLink, link);
                }
            }

            return Ok();
        }

        [HttpPost("add_video/{game}/{video_id}")]
        public async Task<IActionResult> AddVideo(string game, string video_id)
        {
            var video = await _store.GetVideo(game, video_id);
            if (video != null)
                return BadRequest("Video exists");

            await _store.AddVideo(game, video_id);
            return Ok();
        }
    }
}
