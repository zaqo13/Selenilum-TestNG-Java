package DataProvider_Groups_Parameters;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;






public class TestClassDataProvider {
	
	private WebDriver driver;	//WebDriver diver reference creation taking place here
	private SoftAssert soft;;
	
	@BeforeSuite
	public void popup() {
		
		Reporter.log("Reporter.log(str):@BeforeSuite =choosing env properties,initiating logger,ExtentReport, ,popups/setting before the starting of Browser eg. asking/making permissions for eg.- mic,video,location,notification, ", true);
		
	}
	

//	@BeforeTest
//	public void launchBrowserMain() {
//		
//		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
//		driver=new ChromeDriver();
//
////		System.setProperty("webdriver.gecko.driver","E:\\firefox_geko\\geckodriver.exe" );
////		driver= new FirefoxDriver();
//		
//		Reporter.log("all WebDriver driver related operations carried out here!");
//		
//		driver.manage().window().maximize();
//		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		Reporter.log("@BeforeTest = to launch the Browser, to apply implicit wait if required & driver.manage()'s browser window handling eg.- maximixing, ", true);
//	}
//	
//	
	@BeforeClass
	public void urlObjOfClass() 
	{	
//		driver.get("URL");	//to navigate particular URL(website) and wait till page load
//		driver.navigate().to("URL");			//to navigate to particular URL and does not wait to page load but It maintains browser history/cookies to navigate back or forward.
		soft = new SoftAssert();
		Reporter.log("@BeforeClass =  url, object creation ");
	}
	
	@BeforeMethod
	public void login() {
		
		Reporter.log("@BeforeMethod = mostly login related//something which is common for all @Test methods which will be written below ", true);
	}
	


//DataProvider
	
	@DataProvider (name="data-providerSwitch")
	public Object[][] dpMethodSwitch(Method m)
	{
		switch (m.getName())		//returning the array depending on method name calling!
		{
			case "Sum": return new Object[][] {{2,3,5}, {5,7,12}};
			case "Diff": return new Object[][] {{5,3,2}, {10,6,4}};
		}	
		
	return null;
	}
		
	
	@DataProvider (name = "data-providerAdd")
	public Object[][] dpMethodAdd()
	{
		return new Object[][] {{2, 3 , 5}, {5, 7, 12}};
	}
	
	
		
	@Test (priority= 4, dataProvider = "data-providerAdd", dependsOnGroups= {"dpSwitch"})
	public void dpAddition (int a, int b, int result) 
	{
		int sum = a + b;
		soft.assertEquals(result, sum);
	}
	
	
	//dependsOnGroup:- only after complete execution of group dpSwitch @Test will execute
	
	@Test (priority= 0, dataProvider="data-providerAnotherClass", dataProviderClass= DataProvider01.class)
	public void dpSubstraction(int a, int b, int result)

	{
		int sub= a-b;
		soft.assertEquals(result, sub);
	}
	
	//dependsOnMethods:- only after complete execution of method dpTest01() this @test will execute!

	@Test (priority= 2, dataProvider= "data-providerSwitch", dependsOnMethods= {"Diff"}, groups= {"dpSwitch"})
	public void Sum(int a, int b, int result)
	{
		int sum = a+b;
		soft.assertEquals(result, sum);
	}
	
	
	@Test (priority= 1, dataProvider="data-providerSwitch", groups= {"dpSwitch"})
	public void Diff(int a, int b, int result)
	{
		int sub= a-b;
		soft.assertEquals(result, sub);
	}
	

	
	@AfterMethod
	public void logout() 
	{ 
		Reporter.log("AfterMethod = screenShot//to logout the account//something which is similer after every @Test method's executions! ", true);
//		Files.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("E:\\Screenshot\\"+i+".jpg"));		//i value will change as per date&time and-or some names! by putting them in for loop!
//		screenshot code comes here to take screenshot of failed @test testcase.		
//		and its main function will be written in utility class, we will be inheriting their properties then.
	}
	
	@AfterClass
	public void objDistroy() 
	{
		soft.assertAll();
		Reporter.log("AfterClass = to distroy all objects that has been created above! ", true);
	}
	
	@AfterTest
	public void quiteBrowser() 
	{
		//driver.quit();	//.quit():- quits the driver, closing every associated window also of that browser.
		//driver.close();	//.close():- closes the currently focused window/tab only!
		Reporter.log("@AfterTest = to close the Browser! ");
	}
	
	@AfterSuite
	public void sldfjs() 
	{	
		Reporter.log("Ending of suite");
	}

}

//testNG.xml files for above code



//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="RegrationSuit01" >
//  <test name="ChromeTest">
//  	<groups>
//  		<run>
//  			<include name= "dpSwitch"></include>
//  		</run>
//  	</groups>
//    <classes>
//      <class name="DataProvider_Groups_Parameters.TestClassDataProvider"/>
//    </classes>
//  </test> 
//</suite>
