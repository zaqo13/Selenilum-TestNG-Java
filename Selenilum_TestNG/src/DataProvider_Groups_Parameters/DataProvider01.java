package DataProvider_Groups_Parameters;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProvider01 {
	
	@DataProvider (name="data-providerAnotherClass")
	public Object[][] dpMethodClassSub()
	{
		return new Object[][] {{5,3,2}, {10,6,4}};
	}

}
