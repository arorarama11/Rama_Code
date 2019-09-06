package testNG_SamplePackage_2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {

	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test");
	}
	
	@Test(priority =0)
	public void test1()
	{
		System.out.println("priority 0 for parent method 1");
	}
	
	@Test(priority =1)
	public void test2()
	{
		System.out.println("priority 1 for parent method 2");
	}
	
	@Test(priority =-1)
	public void test3()
	{
		System.out.println("priority -1 for parent method 3");
	}
	
	@AfterTest
	public void afterTest1()
	{
		System.out.println("after test 1");
	}
}
