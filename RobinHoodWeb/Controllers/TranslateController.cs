using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;
using RobinHoodWeb.Services;
using System;
using System.IO;
using System.Net.WebSockets;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace RobinHoodWeb.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class TranslateController : ControllerBase
    {
        private readonly TranslateService _translateService;

        public TranslateController(TranslateService translateService)
        {
            _translateService = translateService;
        }

        [HttpGet]
        public async Task Get()
        {
            var context = ControllerContext.HttpContext;
            var isSocketRequest = context.WebSockets.IsWebSocketRequest;

            if (isSocketRequest)
            {
                WebSocket webSocket = await context.WebSockets.AcceptWebSocketAsync();
                var conn = new TranslateConnection(_translateService, webSocket);
                await conn.ReadCycle();
            }
            else
            {
                context.Response.StatusCode = StatusCodes.Status400BadRequest;
            }
        }
    }

    internal class TranslateConnection
    {
        private readonly WebSocket webSocket;
        private readonly TranslateService _translateService;

        public TranslateConnection(TranslateService translateService, WebSocket webSocket)
        {
            _translateService = translateService;
            this.webSocket = webSocket;
        }

        internal async Task ReadCycle()
        {
            await Send(new
            {
                update_date = _translateService.UpdateDate,
                building = _translateService.Builder.IsBuild
            });

            _translateService.Builder.ReportProgress += ReportProgress;

            try
            {
                var buffer = new byte[1024 * 4];
                WebSocketReceiveResult result = await webSocket.ReceiveAsync(new ArraySegment<byte>(buffer), CancellationToken.None);
                while (!result.CloseStatus.HasValue)
                {
                    var message = Encoding.UTF8.GetString(buffer, 0, result.Count);
                    await ProcessMessage(message);

                    result = await webSocket.ReceiveAsync(new ArraySegment<byte>(buffer), CancellationToken.None);
                }
                await webSocket.CloseAsync(result.CloseStatus.Value, result.CloseStatusDescription, CancellationToken.None);
            }
            catch { }
            finally
            {
                _translateService.Builder.ReportProgress -= ReportProgress;
            }
        }

        private async Task Send(object data)
        {
            var arraySegment = new ArraySegment<byte>(Encoding.UTF8.GetBytes(JsonConvert.SerializeObject(data)));
            await webSocket.SendAsync(arraySegment, WebSocketMessageType.Text, true, CancellationToken.None);
        }

        private async Task ProcessMessage(string message)
        {
            switch (message)
            {
                case "build":
                    await Build();
                    break;
            }
        }

        private async Task Build()
        {
            if (_translateService.Builder.IsBuild) return;

            if (await _translateService.Builder.Build())
            {
                _translateService.UpdateStrings();
                _translateService.PackageZIP();
            }
            else if (!File.Exists(TranslateService.TRANSLATED_ZIP_PATH))
            {
                _translateService.PackageZIP();
            }

            Finished();
        }

        private async void ReportProgress(int progress) => await Send(new { progress });

        private async void Finished() => await Send(new { building = false, update_date = _translateService.UpdateDate });

    }
}
