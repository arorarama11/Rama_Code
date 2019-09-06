package testNG_SamplePackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClass1 {


	@BeforeTest
	public void testBeforeTest() {
		System.out.println("Before Test for Class 1 \n");
	}

	@AfterTest
	public void testAfterTest() {
		System.out.println("After Test for Class 1 \n");
	}
	
	@BeforeMethod
	public void testBeforeMethod() {
		System.out.println("Before Method for Class 1 \n");
	}

	@AfterMethod
	public void testAfterMethod() {
		System.out.println("After Method for Class 1 \n");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("test cases in Class 1");
	}
}
