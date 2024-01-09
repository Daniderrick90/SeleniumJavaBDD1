package steps;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
		@BeforeSuite
		public void before_Suite() {
			
			System.out.println("This is before suite");
			
		}
		@BeforeTest
		public void before_Test() {
			
			System.out.println("This is before test");
			
		}
		@BeforeClass
		public void before_Class() {
			
			System.out.println("This is before class");
			
		}
		@BeforeMethod
		public void before_Method() {
			
			System.out.println("This is before Method");
			
		}
		@Test
		public void Test1() {
			
			System.out.println("This is Test1");
			
		}
		
		@Test
		public void Test2() {
			
			System.out.println("This is Test2");
			
		}
		@AfterMethod
		public void After_Method() {
			
			System.out.println("This is After Method");
			
		}
					
		@AfterClass
		public void After_Class() {
			
			System.out.println("This is After Class");
			
		}
		@AfterTest
		public void After_Test() {
			
			System.out.println("This is After test");
			
		}
		@AfterSuite
		public void After_suite() {
			
			System.out.println("This is After suite");
			
		}

}
