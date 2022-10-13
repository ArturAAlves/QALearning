package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.xpath("example.search");
	By productName = By.xpath("example.productName");

	public void quickSearch(String name) {

	}
}
