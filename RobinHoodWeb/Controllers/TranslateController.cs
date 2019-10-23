using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;
using Notabenoid_Patch;
using System;
using System.IO;
using System.IO.Compression;
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
        public static readonly string DOWNLOAD_DIR = Path.Combine(Directory.GetCurrentDirectory(), @"downloads");
        public static readonly string TRANSLATED_ZIP_PATH = Path.Combine(DOWNLOAD_DIR, "CONQUESTS.ZIP");

        public static readonly TranslateBuilder Builder = new TranslateBuilder();

        public static string UPDATE_DATE = UpdateCreateDate();

        private static string UpdateCreateDate()
        {
            if (!File.Exists(TRANSLATED_ZIP_PATH))
                return null;
            return UPDATE_DATE = new FileInfo(TRANSLATED_ZIP_PATH).CreationTimeUtc.ToString();
        }

        public void PackageZIP()
        {
            File.Delete(TRANSLATED_ZIP_PATH);
            ZipFile.CreateFromDirectory(TranslateBuilder.TRANSLATE_GAME_DIR, TRANSLATED_ZIP_PATH, CompressionLevel.Optimal, true);
            UpdateCreateDate();
        }


        private readonly WebSocket webSocket;

        public TranslateConnection(WebSocket webSocket)
        {
            this.webSocket = webSocket;
        }

        internal async Task ReadCycle()
        {
            await Send(new
            {
                update_date = UPDATE_DATE,
                building = Builder.IsBuild
            });

            Builder.ReportProgress += ReportProgress;
            Builder.Completed += Finished;

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
                Builder.ReportProgress -= ReportProgress;
                Builder.Completed -= Finished;
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
            if (Builder.IsBuild) return;

            await Builder.Build();
            PackageZIP();
        }

        private async void ReportProgress(int progress) => await Send(new { progress });

        private async void Finished() => await Send(new { building = false, update_date = UPDATE_DATE });

    }
}
