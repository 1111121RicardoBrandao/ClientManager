@echo off
rmdir /S /Q  ..\tmp-build-tests 
mkdir ..\tmp-build-tests
REM del /S /Q ..\tmp-build-tests\*.class >nul
dir /B /S /O:N ..\test\*.java > c.lst
javac -cp ..\test;..\dist\ClientManager.jar;..\lib\junit-4.10.jar -d ..\tmp-build-tests @c.lst %1 %2 %3
del c.lst
@pause