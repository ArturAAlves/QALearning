
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_selectors {
	public static void main(String[] args) {
		
		//implicit wait
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.findElement(By.id("W0wltc")).click();

		driver.findElement(By.className("gLFyf")).sendKeys("helllo world");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.findElement(By.xpath("gNO89b")).click();
//		
		
//		driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]//input[@name=\"btnK\"]")).click();
//		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		driver.findElement(By.cssSelector("input.gNO89b[data-ved*='0ahUKEwjA0dCWx8H5AhVHUcAKHZvABXoQ4dUDCA0']")).click();
//		driver.findElement input.gNO89b
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.close();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		

	}

}
