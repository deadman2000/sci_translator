using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;
using RobinHoodWeb.Tools;
using System;
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
        [HttpGet]
        public async Task Get()
        {
            var context = ControllerContext.HttpContext;
            var isSocketRequest = context.WebSockets.IsWebSocketRequest;

            if (isSocketRequest)
            {
                WebSocket webSocket = await context.WebSockets.AcceptWebSocketAsync();
                var conn = new Connection(webSocket);
                await conn.ReadCycle();
            }
            else
            {
                context.Response.StatusCode = StatusCodes.Status400BadRequest;
            }
        }
    }

    internal class Connection
    {
        private readonly WebSocket webSocket;

        public Connection(WebSocket webSocket)
        {
            this.webSocket = webSocket;
        }

        internal async Task ReadCycle()
        {
            await Send(new
            {
                update_date = TranslateBuilder.UPDATE_DATE,
                building = TranslateBuilder.Inst.IsBuild
            });

            TranslateBuilder.Inst.ReportProgress += ReportProgress;
            TranslateBuilder.Inst.Completed += Finished;

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
            finally
            {
                TranslateBuilder.Inst.ReportProgress -= ReportProgress;
                TranslateBuilder.Inst.Completed -= Finished;
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
            if (TranslateBuilder.Inst.IsBuild) return;

            await TranslateBuilder.Inst.Build();
        }

        private async void ReportProgress(int progress) => await Send(new { progress });

        private async void Finished() => await Send(new { building = false, update_date = TranslateBuilder.UPDATE_DATE });

    }
}
