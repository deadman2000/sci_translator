using Microsoft.AspNetCore.Mvc;
using RobinHoodWeb.Services;
using System.Threading.Tasks;

namespace RobinHoodWeb.Controllers
{
    [ApiController]
    [Route("/api/[controller]")]
    public class VolumeController : ControllerBase
    {
        private readonly TranslateStoreService _store;

        public VolumeController(TranslateStoreService store)
        {
            _store = store;
        }

        [HttpGet("{volumeName}")]
        public async Task<IActionResult> Get(string volumeName)
        {
            var rows = await _store.GetStrings("robin", volumeName);
            return Ok(rows);
        }
    }
}
