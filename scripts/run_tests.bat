@echo TEST CLIENT CLASS
@java -cp ..\tmp-build-tests;..\dist\ClientManager.jar;..\lib\junit-4.10.jar org.junit.runner.JUnitCore clientmanager.ClientTest
@pause