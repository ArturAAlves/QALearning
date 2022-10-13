package pageObjects;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class PageSwitcher {
	public WebDriver driver;
	ArrayList<String> tabs;

	public PageSwitcher(WebDriver driver) {
		this.driver = driver;
		tabs = new ArrayList<String>(driver.getWindowHandles());
	}

	public void basePage() {
		driver.switchTo().window(tabs.get(0));
	}

	public void nextNextPage() {
		driver.switchTo().window(tabs.get(1));
	}
}
