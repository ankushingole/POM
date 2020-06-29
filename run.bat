set projectLocation=D:\Workspace\POM_PageFactory_OrangeHRM
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause