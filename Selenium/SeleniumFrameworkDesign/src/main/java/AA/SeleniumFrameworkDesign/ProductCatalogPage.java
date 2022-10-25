package AA.SeleniumFrameworkDesign;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class ProductCatalogPage extends AbstractComponents {
	WebDriver driver;

	public ProductCatalogPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "card-body")
	List<WebElement> cardList;

//	public void (String email, String password) {
////		userEmail.sendKeys(email);
////		userPassword.sendKeys(password);
////		loginBtn.click();
//	}

	public String getSscreenshot(String testCaseName) throws IOException {

		TakesScreenshot sS = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file

		File SrcFile = sS.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

		return System.getProperty(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");

	}
}
