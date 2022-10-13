package cucumber;

import java.io.IOException;

import pageObjects.PageObjectManager;

public class TestContext {

//	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	// driver intializer
	public TestBase testBase;

	public void contextSetup() throws IOException {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
	}

}
