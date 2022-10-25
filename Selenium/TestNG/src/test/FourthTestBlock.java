package test;

import org.testng.annotations.Test;

public class FourthTestBlock {
	@Test(groups = { "smoke" })
	public void firstTest() {
		System.out.println("smoke");
	}

	@Test
	public void secoundTest() {
		System.out.println("mySecoundTest");
	}

	@Test
	public void ThirdTest() {
		System.out.println("myThirdTest");
	}

}
