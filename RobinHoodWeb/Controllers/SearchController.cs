using Microsoft.AspNetCore.Mvc;
using RobinHoodWeb.Services;
using System;
using System.Linq;
using System.Threading.Tasks;

namespace RobinHoodWeb.Controllers
{
    [ApiController]
    [Route("/api/[controller]")]
    public class SearchController : ControllerBase
    {
        private readonly TranslateStoreService _store;

        public SearchController(TranslateStoreService store)
        {
            _store = store;
        }

        [HttpGet]
        public async Task<IActionResult> Get(string q, string lang)
        {
            if (q == null)
                return Ok();

            bool? lng = lang?.Equals("en");

            var res = await _store.Search("robin", q, lng);

            return Ok(res.Select(s => new {
                s.Res,
                s.Index,
                s.En,
                s.NotaLink,
                s.YTrans,
                s.Videos,
                en_html = AddSpan(s.En, q),
                tr_html = AddSpan(s.Tr, q),
            }));
        }

        private string AddSpan(string text, string substring)
        {
            if (String.IsNullOrEmpty(text)) return "";

            int start = 0;

            while (true)
            {
                var beg = text.IndexOf(substring, start, StringComparison.InvariantCultureIgnoreCase);
                if (beg == -1)
                    break;

                var end = beg + substring.Length;

                text = text.Insert(end, "</span>").Insert(beg, "<span>");

                start = end + 7 + 6;
            }

            return text;
        }
    }
}
