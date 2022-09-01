package Factories;

import org.testng.annotations.Test;

public class WebTest {
	  private int m_numberOfTimes;
	 
	  public WebTest(int numberOfTimes) 
	  {
		  m_numberOfTimes = numberOfTimes;
	  }
	 
	  @Test
	  public void testServer() 
	  {
		  System.out.println("m_numberOfTimes = " +m_numberOfTimes);
		  for (int i = 0; i < m_numberOfTimes; i++) 
		  {
			  // access the webpage
		  }
	  }
}

//testng.xml only needs to reference the class that contains the factory method, since the test instances themselves will be created at runtime:
