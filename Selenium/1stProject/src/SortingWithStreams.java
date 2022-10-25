import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortingWithStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

//		driver.findElement(By.cssSelector(".sort-icon.sort-ascending")).click();

		List<WebElement> vegAndFruitsList = driver.findElements(By.xpath("//tr//td[1]"));

		List<String> getText = vegAndFruitsList.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> sorted = getText.stream().sorted().collect(Collectors.toList());

		System.out.println(sorted);

//		Assert.assertNotEquals(sorted, sorted, "hello");

		List<Object> getPrice = vegAndFruitsList.stream().filter(s -> s.getText().contains("Potato"))
				.map(s -> getPrice(s)).collect(Collectors.toList());

		System.out.println(getPrice);

	}

	private static Object getPrice(WebElement s) {
		// TODO Auto-generated method stub
		
		
		System.out.println(s.getLocation());
		return s;
	}

}
