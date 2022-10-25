package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Parameters({"URL"})
	@Test(timeOut = 3000)
	public void DataClients(String URL) {
		System.out.println(URL);
	}

	@Test(enabled = false)
	public void DataWorkers() {
		System.out.println("DataWorkers");
	}

	@Test(dependsOnMethods = { "DataClients" })
	public void DataAfiliates() {
		System.out.println("DataWorkers");
	}

	@BeforeMethod
	public void RunBefore() {
		System.out.println("RunBefore--------");
	}
}
