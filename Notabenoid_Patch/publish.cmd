dotnet publish -r %1 -c Release -o publish/%1/

XCOPY patch.bat publish\%1\
XCOPY README.TXT publish\%1\

XCOPY /E ..\Conquest publish\%1\Conquest\
