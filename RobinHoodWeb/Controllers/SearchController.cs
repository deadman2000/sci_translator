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
        public IActionResult Get(string q)
        {
            if (q == null)
                return Ok();

            var query_low = q.ToLower();
            return Ok(Global.AllStrings
                .Where(s => s.Text.ToLower().Contains(query_low))
                .Take(100)
                .Select(s=> new {
                    ru = s.Ru,
                    res = s.Resource,
                    text = AddSpan(s.Text, q)
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
