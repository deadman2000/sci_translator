using Microsoft.AspNetCore.Mvc;
using RobinHoodWeb.Services;
using System;
using System.Linq;

namespace RobinHoodWeb.Controllers
{
    [ApiController]
    [Route("/api/[controller]")]
    public class VolumeController : ControllerBase
    {
        private readonly TranslateService _translateService;

        public VolumeController(TranslateService translateService)
        {
            _translateService = translateService;
        }

        [HttpGet("{volumeName}")]
        public IActionResult Get(string volumeName)
        {
            var rows = _translateService.AllStrings.Where(s => s.Res.Equals(volumeName, StringComparison.OrdinalIgnoreCase));
            return Ok(rows);
        }
    }
}
