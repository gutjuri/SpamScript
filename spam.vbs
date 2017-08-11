Set wshShell = wscript.CreateObject("WScript.Shell")
Dim i
i = 1
wscript.sleep 5000
do
wscript.sleep 100
wshshell.sendkeys WScript.Arguments(0)+"~"
i = i+1
loop until i > CInt(WScript.Arguments(1))
