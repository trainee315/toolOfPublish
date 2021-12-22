@echo off
set filePath=%1
 
for /f  %%i in (%filePath%) do (
	set lastline=%%i
)
 
echo %lastLine%