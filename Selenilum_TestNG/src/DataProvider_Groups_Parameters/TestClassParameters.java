package DataProvider_Groups_Parameters;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;





public class TestClassParameters {
	
	private WebDriver driver;	//WebDriver diver reference creation taking place here
	
	@BeforeSuite
	public void popup() {
		
		Reporter.log("Reporter.log(str):@BeforeSuite =choosing env properties,initiating logger,ExtentReport, ,popups/setting before the starting of Browser eg. asking/making permissions for eg.- mic,video,location,notification, ", true);
		
	}
	
	
	@BeforeTest
	public void launchBrowserMain() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();

//		System.setProperty("webdriver.gecko.driver","E:\\firefox_geko\\geckodriver.exe" );
//		driver= new FirefoxDriver();
		
		Reporter.log("all WebDriver driver related operations carried out here!");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Reporter.log("@BeforeTest = to launch the Browser, to apply eplycit wait if required & driver.manage()'s browser window handling eg.- maximixing, ", true);
	}
	
	@BeforeClass
	public void urlObjOfClass() 
	{	
//		driver.get("URL");		//to navigate particular URL(website) and wait till page load
//		driver.navigate().to("URL");			//to navigate to particular URL and does not wait to page load but It maintains browser history/cookies to navigate back or forward.
		Reporter.log("@BeforeClass =  url, object creation ");
	}
	

	@BeforeMethod
	public void loginGroww() {
		
		Reporter.log("@BeforeMethod = mostly login related//something which is common for all @Test methods which will be written below ", true);
	}
	
	
	
	
	@Test ( priority = 0)		//invocationCount = 2, can apply here if we want to execute this @Test for twice 
	@Parameters ({"company1"})
	public void accessingParameters (String company1)  {
//	<parameter name="company1" value="tata motors"/>		//edit in the testNG.xml file
		
		Reporter.log("I got @Parameters name- company1 whose value is = "+company1);
		
	}
	
	
	@AfterMethod
	public void logout() 
	{ 
//		homepage.logout();
		Reporter.log("AfterMethod = screenShot//to logout the account//something which is similer after every @Test method's executions! ", true);
//		Files.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("E:\\Screenshot\\"+i+".jpg"));		//i value will change as per date&time and-or some names! by putting them in for loop!
//		screenshot code comes here to take screenshot of failed @test testcase.		
//		and its main function will be written in utility class, we will be inheriting their properties then.
	}
	
	@AfterClass
	public void objDistroy() 
	{
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


//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="RegrationSuit01" >
//<parameter name="company1" value="tata motors"/>
//  <test name="ChromeTest">
//    <classes>
//      <class name="DataProvider_Groups_Parameters.TestClassParameters"/>
//    </classes>
//  </test> 
//</suite>




