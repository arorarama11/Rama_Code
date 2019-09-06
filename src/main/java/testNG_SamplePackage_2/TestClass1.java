package testNG_SamplePackage_2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 extends Sample{

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@BeforeClass
	public void doBeforeClass() {
		System.out.println("testClass1: before class");
	}

	@BeforeMethod
	public void doBeforeMethod() {
		System.out.println("testClass1: before method");
	}

	@Test
	public void unitLevel1() {
		System.out.println("testClass1: Unit level1 testing");
	}

	@Test
	public void unitLevel2() {
		System.out.println("testClass1: Unit level2 testing");
	}
	
	@AfterMethod
	public void doAfterMethod() {
		System.out.println("testClass1: after method");
	}

	@AfterClass
	public void doAfterClass() {
		System.out.println("testClass1: after class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("before test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("before suite");
	}
}
