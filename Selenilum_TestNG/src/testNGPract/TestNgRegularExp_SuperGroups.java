package testNGPract;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestNgRegularExp_SuperGroups {
	
//here both groups(demo1 & demo2) will run by giving regular exp for groups_nam.* i.e. <include name= demo.*>
	
		WebDriver driver;
	    String title = "Automation Testing Project";
	    
	   
	    @Test
	    public void a_starting_point(){
	    	System.out.println("This is the starting point of the test");
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	    	//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	    	driver = new ChromeDriver();
//	    	driver.get("https://xyz.com/");
	    }
	    
	    
	    @Test(groups = { "demo1" })	
	    public void checkTitle() {	
	       String testTitle = "Automation Testing Project";
//	       String originalTitle = driver.getTitle();
	       System.out.println("Ttile checked!");
	       Assert.assertEquals("Automation Testing Project", testTitle);
	    }	
	    
	    @Test(groups = { "demo2" })	
	    public void click_element() {	
//	       driver.findElement(By.xpath("xpath")).click();
	       System.out.println("Home Page heading is displayed!");
	    }
	       
	    @Test(dependsOnGroups= {"demo1", "demo2"})
	    public void logout() {
	    	System.out.println("logging out the system");
	    }
	 
}


//here both groups(demo1 & demo2) will run by giving reg exp for groups name i.e. <include name= "demo.*">

//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
//<suite name="Test002" >
//   <test name="regularExp" >
//   		<groups>
//   			<run>
//   				<include name = "demo.*"></include>		//demo1 & demo2 groups @Test will get here!
//   			</run>
//   		</groups>
//       <classes> 
//          <class name="testNGPract.TestNgRegularExp_SuperGroups" />
//       </classes>
//   </test>
// </suite>

//in below if we replace include with exclude then that groups @Test will not execute!

//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
//<suite name="Test002" >
// <test name="regularExp" >
// 		<groups>
// 			<run>
// 				<exclude name = "demo.*"></exclude>			//demo1 & demo2 groups @Test will not execute!
// 			</run>
// 		</groups>
//     <classes> 
//        <class name="testNGPract.TestNgRegularExp_SuperGroups" />
//     </classes>
// </test>
//</suite>


//TestNG Groups Inside Groups

//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
//<suite name="Test002" >
//   <test name="Supergroup" >
//   	<groups>
//   		<define name = "SuperGroup">
//   			<include name = "demo1"></include>
//				<include name= "demo2"></include>
//   		</define>
//   		<run>
//   			<include name = "SuperGroup"></include>
//   		</run>
//   	</groups>
//       <classes> 
//          <class name="testNGPract.TestNgRegularExp_SuperGroups" />
//       </classes>
//   </test>
// </suite>
