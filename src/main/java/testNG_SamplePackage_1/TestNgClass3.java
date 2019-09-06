package testNG_SamplePackage_1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClass3 {

	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("Before Suite for Class 3\n");
	}

	@AfterSuite
	public void testAfterSuite() {
		System.out.println("After Suite for Class 3 \n");
	}

	@BeforeTest
	public void testBeforeTest() {
		System.out.println("Before Test for Class 3 \n");
	}

	@AfterTest
	public void testAfterTest() {
		System.out.println("After Test for Class 3 \n");
	}
	
	@BeforeMethod
	public void testBeforeMethod() {
		System.out.println("Before Method for Class 3 \n");
	}

	@AfterMethod
	public void testAfterMethod() {
		System.out.println("After Method for Class 3 \n");
	}
	
	@Test
	public void testCase3()
	{
		System.out.println("test cases for Class 3 \n");
	}
}
