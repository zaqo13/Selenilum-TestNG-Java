package DataProvider_Groups_Parameters;
import org.testng.annotations.Test;

//you can create dependencies between groups in the XML file. 
//So, if you have multiple groups in the TestClass file, you can create the dependent tests in between them in the testNG.XML file.

public class TestngGroupsDependentTestInXMLSuite {

	    @Test(groups = {"viewacc"})
	    public void ViewAcc() {
	        System.out.println("View Your Dashboardd");
	    }
	 
	    @Test(groups = {"openbrowser"})
	    public void OpenBrowser() {
	        System.out.println("Browser Opened Successfully");
	    }
	 
	    @Test(groups = {"login"} )
	    public void LogIn() {
	        System.out.println("Login Into The Account");
	    }
	    
	    @Test(groups = {"logout"})	//(enabled= false):-skip the @Test
	    public void CloseAccount() {
	    	System.out.println("Closing The Account");
	    }
}

//final execution will be like== openbrowser then login then viewacc then CloseAccount
//we can do the above execution by adding dependencies tag in testng.xml as below!

//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
//<suite name="Test003" >
//   <test name="dependantXMLsuit" >
//   	<groups>
//   		<dependencies>
//   			<group depends-on= "openbrowser" name= "login"></group>	
//   			<group depends-on= "login" name= "viewacc"></group>
//   			<group depends-on= "viewacc" name= "logout"></group>
//				//above line states that the group named "viewacc" should depend upon the group with the name "logout".
//   		</dependencies>
//   		</groups>
//       <classes> 
//          <class name="DataProvider_Groups_Parameters.TestngDependentTestInXMLSuite" />
//       </classes>
//   </test>
// </suite>




