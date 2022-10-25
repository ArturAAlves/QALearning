package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public HomePage homePage;
	public CartPage cartPage;
	public PageSwitcher pageSwitcher;
	public WebDriver driver;

	// populate driver
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

//	public  WebDriver returnDriver() {
//		return driver;
//	}

	// instanciate homepage
	public HomePage getHomePage() {
		homePage = new HomePage(driver);
		return homePage;
	}

	public CartPage cartPage() {
		cartPage = new CartPage(driver);
		return cartPage;
	}

//	public void pageSwitcher() {
//		pageSwitcher = new PageSwitcher(driver);
//	}
}
