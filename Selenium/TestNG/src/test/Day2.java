package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void loginClients() {
		System.out.println("loginClients");
	}
	@Test
	public void loginWorkers() {
		System.out.println("loginWorkers");
	}
	@Test
	public void loginAfiliates() {
		System.out.println("loginAfiliates");
	}
	
	@Test
	public void ugaBudsa() {
		System.out.println("uga1");
	}
	
	@Test
	public void ugaBudsass() {
		System.out.println("uga2");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
}
