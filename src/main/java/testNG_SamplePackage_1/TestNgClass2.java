package testNG_SamplePackage_1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgClass2 {

	
	@Test
	@Parameters("sampleparam")
	public void testCase2(String paramValue)
	{
		System.out.println("test cases in Class 2 \n" + paramValue);
	}
	
	@Test(dependsOnMethods = {"testCase2"}, alwaysRun=true)
	public void testCase1()
	{
		System.out.println("test cases in Class 2 depand on test case2");
	}
	
	@Test(threadPoolSize = 5, invocationCount =10)
	public void invocationCountTest()
	{
		System.out.println("invocationCountTest");
	}
	
	@Test(timeOut=1000)
	public void timeOutTest()
	{
		System.out.println("timeout");
	}
}
