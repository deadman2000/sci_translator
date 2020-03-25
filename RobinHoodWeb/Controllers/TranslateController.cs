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

        public class TranslateRequest
        {
            public string Volume { get; set; }

            public string En { get; set; }

            public string Tr { get; set; }
        }

        [HttpPost]
        public async Task Post([FromBody] TranslateRequest request)
        {
            await _translateService.AddTranslate(request.Volume, request.En, request.Tr);
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
                    ProcessMessage(message);

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

        private void ProcessMessage(string message)
        {
            switch (message)
            {
                case "build":
                    new Task(async () =>
                    {
                        await _translateService.Build();
                        Finished();
                    }).Start();
                    break;
            }
        }

        private async void ReportProgress(int progress) => await Send(new { progress });

        private async void Finished() => await Send(new { building = false, update_date = _translateService.UpdateDate });
    }
}
