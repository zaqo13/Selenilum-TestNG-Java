package TestNGPriority;
import org.testng.annotations.Test;

public class TestngPriority 
{

		@Test (priority = 1)
		public void b_method() {					//4th
			System.out.println("This is B method");
		}
			
		@Test (priority = 1)
		public void a_method() {					//3rd
			System.out.println("This is A method");
		}
			
		@Test	//@Test(enabled= false)==this @Test will get skipped from execution
		public void d_method() {					//2nd
			System.out.println("This is D Method");
		}
			
		@Test
		public void c_method() {					//1st
			System.out.println("This is C Method");
		}
}

	//priority not given @test will be execute first which will be base on alphabetic order
	//The test methods with no priority assigned have a default priority equal to 0. 
    //It means if we define no priorities, all the test methods will be assigned priority 0, and a similar priority case will apply.
