package testNG_SamplePackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClass {
	
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("Before Suite for Class \n");
	}

	@AfterSuite
	public void testAfterSuite() {
		System.out.println("After Suite for Class \n");
	}

	@BeforeTest
	public void testBeforeTest() {
		System.out.println("Before Test for Class \n");
	}

	@AfterTest
	public void testAfterTest() {
		System.out.println("After Test for Class \n");
	}
	
	@BeforeMethod
	public void testBeforeMethod() {
		System.out.println("Before Method for Class \n");
	}

	@AfterMethod
	public void testAfterMethod() {
		System.out.println("After Method for Class \n");
	}
	
	@Test
	public void testCase()
	{
		System.out.println("test cases for Class \n");
	}

}
