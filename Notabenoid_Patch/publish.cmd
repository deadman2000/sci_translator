RD /S /Q publish

dotnet publish -c Release -o publish/

XCOPY patch.bat publish\
XCOPY README.TXT publish\

XCOPY /E ..\Conquest publish\Conquest\
