set projectLocation=D:\TEST_WORKSPACE\frameworks
cd %projectLocation% 
set classpath=%projectLocation%\bin;%projectLocation%\lib\* 
java org.testng.TestNG %projectLocation%\classes.xml 
pause