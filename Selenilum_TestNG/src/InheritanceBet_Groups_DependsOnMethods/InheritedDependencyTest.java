package InheritanceBet_Groups_DependsOnMethods;

import org.testng.annotations.Test;


public class InheritedDependencyTest extends InheritedDependentTestMethodsInTestNG
	{
	
	    @Test(dependsOnMethods = { "login&homepage" })
	    public void UserProfile() 
	    {
	        System.out.println("Logged In");
	    }
	    
	    @Test(dependsOnMethods= {"UserProfile"})
	    public void CheckBalance()
	    {
	    	System.out.println("User balance is= ");
	    }
}


