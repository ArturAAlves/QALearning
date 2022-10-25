package test;

import org.testng.annotations.Test;

public class SecondTestBlock {
	@Test
	public void firstTest() {
		System.out.println("myFirstTest");
	}

	@Test
	public void secoundTest() {
		System.out.println("mySecoundTest");
	}

	@Test(groups = { "smoke" })
	public void saas() {
		System.out.println("smoke2");
	}

}
