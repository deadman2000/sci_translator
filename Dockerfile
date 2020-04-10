FROM mcr.microsoft.com/dotnet/core/aspnet:3.1-buster-slim AS base
WORKDIR /app
EXPOSE 80


FROM mcr.microsoft.com/dotnet/core/sdk:3.1-buster AS build
# Node.js
RUN curl -sL https://deb.nodesource.com/setup_12.x | bash -
RUN apt-get install -y nodejs

WORKDIR /src
COPY ["RobinHoodWeb/*.csproj", "RobinHoodWeb/"]
COPY ["SCI_Lib/*.csproj", "SCI_Lib/"]
COPY ["Notabenoid/*.csproj", "Notabenoid/"]
COPY ["YTranslate/*.csproj", "YTranslate/"]
RUN dotnet restore "RobinHoodWeb/RobinHoodWeb.csproj"
COPY . .
WORKDIR "/src/RobinHoodWeb"
RUN dotnet build "RobinHoodWeb.csproj" -c Release -o /app/build


FROM build AS publish
RUN dotnet publish "RobinHoodWeb.csproj" -c Release -o /app/publish


FROM base AS final
WORKDIR /app
COPY --from=publish /app/publish .

COPY ./Conquest ./Conquest

ENV GAME_DIR /app/Conquest

ENTRYPOINT ["dotnet", "RobinHoodWeb.dll"]
