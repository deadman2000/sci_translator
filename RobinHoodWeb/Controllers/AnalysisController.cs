using Microsoft.AspNetCore.Mvc;
using RobinHoodWeb.Services;
using System.Linq;
using System.Threading.Tasks;

namespace RobinHoodWeb.Controllers
{
    [ApiController]
    [Route("/api/[controller]")]
    public class AnalysisController : ControllerBase
    {
        private readonly TranslateService _translateService;
        private readonly TranslateStoreService _store;

        public AnalysisController(TranslateService translateService, TranslateStoreService store)
        {
            _translateService = translateService;
            _store = store;
        }

        [HttpGet]
        public async Task<IActionResult> Get()
        {
            var strings = await _store.GetStrings("robin");
            return Ok(strings.Where(s => s.Videos != null).SelectMany(s => s.Videos.Select(v => new
            {
                s.Index,
                s.Res,
                s.NotaLink,
                s.En,
                v.Image,
                v.Score,
                v.Url,
                v.VideoId,
                v.Time,
                v.Txt
            })).Where(v => v.Score < 12).OrderBy(v => v.Score));
        }
    }
}
