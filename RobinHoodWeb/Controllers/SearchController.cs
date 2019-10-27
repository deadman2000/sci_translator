using Microsoft.AspNetCore.Mvc;
using System;
using System.Linq;

namespace RobinHoodWeb.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class SearchController : ControllerBase

    {
        [HttpGet]
        public IActionResult Get(string q, string lang)
        {
            if (q == null)
                return Ok();

            bool isRu = "ru".Equals(lang);

            var query_low = q.ToLower();
            return Ok(Global.AllStrings
                .Where(s => ((lang == null || !isRu) && s.En.ToLower().Contains(query_low))
                         || ((lang == null ||  isRu) && s.Ru.ToLower().Contains(query_low))
                )
                .Take(100)
                .Select(s=> new {
                    res = s.Resource,
                    en_text = AddSpan(s.En, q),
                    ru_text = AddSpan(s.Ru, q)
                }));
        }

        private string AddSpan(string text, string substring)
        {
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
