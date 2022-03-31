package testNGPracice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite is Running");
	}
	@AfterSuite 
	public void afterSuite() {
		System.out.println("After Suite is Running");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test is Running");
	}
	@AfterTest 
	public void afterTest() {
		System.out.println("After Test is Running");
	}
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Before Groups is Running");
	}
	@AfterGroups 
	public void afterGroups() {
		System.out.println("After Groups is Running");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class is Running");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class is Running");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method is Running");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method is Running");
	}
	@Test
	public void test1() {
		System.out.println("Test 1 is Running");
	}

	@Test
	public void test2() {
		System.out.println("Test 2 is Running");
	}
	
}
