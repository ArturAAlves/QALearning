
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);

		WebElement autoCompleteBox = driver.findElement(By.id("autocomplete"));
		autoCompleteBox.sendKeys("ind");

		Thread.sleep(1000);

		List<WebElement> optionList = driver.findElements(By.className("ui-menu-item-wrapper"));
		System.out.println(optionList);

		for (WebElement optionItem : optionList) {
			System.out.println(optionItem);
			if (optionItem.getText().contentEquals("India")) {
				optionItem.click();
			}
		}
		String inputedText = autoCompleteBox.getAttribute("value");

		if (inputedText.contentEquals("India")) {
			System.out.println("test passed!");
		} else {
			System.out.println("test not passed!");
		}

	}

}
