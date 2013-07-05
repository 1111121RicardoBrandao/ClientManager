@echo off

echo Compiling...
call build

echo Creating archive...
call jar cmf makejar.mf ..\dist\ClientManager.jar -C ..\tmp-build ClientManager

pause
REM echo Removing temporary files...
REM call rmdir jar /Q /S
