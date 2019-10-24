using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;
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
                var conn = new TranslateConnection(webSocket);
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

        public TranslateConnection(WebSocket webSocket)
        {
            this.webSocket = webSocket;
        }

        internal async Task ReadCycle()
        {
            await Send(new
            {
                update_date = Global.UPDATE_DATE,
                building = Global.Builder.IsBuild
            });

            Global.Builder.ReportProgress += ReportProgress;

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
                Global.Builder.ReportProgress -= ReportProgress;
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
            if (Global.Builder.IsBuild) return;

            if (await Global.Builder.Build())
            {
                Global.UpdateStrings();
                Global.PackageZIP();
            }

            Finished();
        }

        private async void ReportProgress(int progress) => await Send(new { progress });

        private async void Finished() => await Send(new { building = false, update_date = Global.UPDATE_DATE });

    }
}
