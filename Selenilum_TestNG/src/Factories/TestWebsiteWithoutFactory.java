package Factories;
//Without @Factory, by using @Parameters
//if you want to create a test method that will access a page on a Web site several times, and you want to invoke it with different values
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWebsiteWithoutFactory {
	public class TestWebServer {
		@Parameters ({ "number-of-times" })
		@Test
		public void accessPage(int numberOfTimes) {
		    while (numberOfTimes-- > 0) {
		     // access the web page
		    }
		  }
		}
}

// This can become quickly impossible to manage, so instead, you should use a factory!

//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="TestNG Without Factory">
// <test name="T1">
//	<parameter name="number-of-times" value="10"/>
//		<classes>
//  		<class name= "TestWebsite" />
//		</classes>
//	</test>
//
// <test name="T2">
//	<parameter name="number-of-times" value="20"/>
//		<classes>
//  		<class name= "TestWebsite"/>
//		</classes>
// </test>
//
// <test name="T3">
//		<parameter name="number-of-times" value="30"/>
//			<classes>
// 				<class name= "TestWebsite"/>
// 			</classes>
// </test>
//</suite>