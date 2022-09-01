package InheritanceBet_Groups_DependsOnMethods;
import org.testng.annotations.Test;


public class InheritedDependentTestMethodsInTestNG 
	{
	    @Test
	    public void OpenBrowser() 
	    {
	        System.out.println("BrowserOpened");
	    }
	    
	    @Test(groups = {"login&homepage"})
	    public void LogIn() {
	        System.out.println("Login Into The Account");  
	    }
	    
	    @Test(groups = {"login&homepage"})
	    public void ViewAcc() {
	        System.out.println("View Your Dashboardd");
	    }
	}
	 
