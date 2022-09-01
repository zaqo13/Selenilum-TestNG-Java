package testNGPract;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
 

public class IgnoringTest {
	
	@Ignore
	public class TestcaseSample {
	 
	    @Test
	    public void testMethod1() {
	    }
	 
	    @Test
	    public void testMethod2() {
	    }
	}

}


//@Ignore
//package com.testng.master;
// 
//import org.testng.annotations.Ignore;

// This causes all the @Test methods to be ignored in the package com.testng.master and all of its sub-packages. 