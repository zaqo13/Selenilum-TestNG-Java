package DataProvider_Groups_Parameters;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParametersAtSuitLevel {
	
	
	@Test
	@Parameters ({"val1", "val2"})
	public void Sum(int v1, int v2) 
	{
	    int sum = v1 + v2;
	    System.out.println("The final sum of the given values is " + sum);
	}
	    
	 @Test
	 @Parameters ({"val1", "val2"})
	 public void Diff (int v1, int v2) 
	 {
	    int diff = v1 - v2;
	    System.out.println("The final difference of the given values is " + diff);
     }
}


//testng.xml for above code to provide val1, val2 to both @Test methods

//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="TestNG Parameters Suite">
//   <parameter name="val1" value="13" />
//   <parameter name="val2" value="7" />
//   <test name="Parameters01">
//      <classes>
//         <class name="DataProvider_Groups_Parameters.ParametersAtSuitLevel" />
//      </classes>
//   </test>
//</suite>
