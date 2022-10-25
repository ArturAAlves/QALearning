package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestBlock {
	
	@BeforeMethod
	public void BeforeMethods() {
		System.out.println("before BeforeMethod .......");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
	

	@BeforeClass
	public void beforeclassx() {
		System.out.println("before class .......");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}

	@Test
	public void firstTest() {
		System.out.println("myFirstTest");
	}

	@Test()
	public void secondTest() {
		System.out.println("mySecondTest");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running before");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Running afterTest");
	}

}
