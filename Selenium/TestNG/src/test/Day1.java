package test;




import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	@Parameters({"URL"})
	@Test
	public void demo(String URL) {

		System.out.println(URL);
	}

	@Test
	public void demo2() {
		System.out.println("hello");
		Assert.assertFalse(true);
		
	}
}
