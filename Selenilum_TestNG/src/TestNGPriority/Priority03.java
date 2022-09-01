package TestNGPriority;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority03 {
	
	@BeforeMethod 
	
	public void test()
	{
		System.out.println("BeforeMethod");
		
	}
	
	@BeforeClass
	public void beforClass()
	{
		System.out.println("BeforeClass");
	}
	
	@Test 
	public void test2()
	{
		System.out.println("Test2 priority p bydefault 0 // as both tests(test2, test1) are at zero level the so the numbering will be done on alphabetic order");
	}
	
	@Test (invocationCount = 2, dependsOnMethods = {"test5"}, priority = 1 )
	public void test3()
	{
		System.out.println("test3 p1   invocationCounts=2, dependsOnMethods=test5 // this method will execute right after their dependsOnMethods excute if he misses the que of priority");  //test5 p1 && dependsOnMethods=test5  then after the execution of dependsOnMethods method the actual dependsOnMethods applies on that method that method will execute and after that priority will get continue, not at the end of que in test annotation!
	}
	
	@Test (priority = 0)
	public void test1()
	{
		System.out.println("Test1 p0");	
	}
	
	
	@Test (priority = -6)
	public void test4 ()
	{
		System.out.println("test4 p-6");
	}
	
	
	@Test (priority = 4)
	public void test6 ()
	{
		System.out.println("test6 p4");
	}
	
	@Test (timeOut =  3000, priority = 3)
	public void test5 ()
	{
		System.out.println("test5 p3   timeout=3sec, output for another method/other method execution depends on result of this method");
		System.out.println("");
	}
	
	
	@Test (priority = 2)
	public void test7()
	{
		System.out.println("test7 p2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
	}
	
	
	}
