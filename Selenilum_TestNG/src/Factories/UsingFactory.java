package Factories;

import org.testng.annotations.Factory;

public class UsingFactory {
	
	@Factory
	public Object[] createInstances() {
		
		Object[] result = new Object[10]; 
		for (int i = 0; i < 10; i++) 		//will execute for 10 time
		{
			result[i] = new WebTest(i*10);
			System.out.println("Result = "+result[i]);
		}
		
		return result;
	}
}

//testng.xml only needs to reference the class that contains the factory method, since the test instances themselves will be created at runtime:


//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="TestNG Without Factory">
//<test name="T1">
//	<parameter name="number-of-times" value="10"/>
//		<classes>
//			<class name= "Factories.UsingFactory" />
//		</classes>
//</test>
//</suite>