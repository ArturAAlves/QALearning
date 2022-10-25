import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://jqueryui.com/droppable/";
		driver.get(url);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		WebElement draggable = driver.findElement(By.id("draggable"));
		draggable.click();

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		// dragAndDrop() method for dragging the element from source to //destination
		Actions a = new Actions(driver);

		a.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();
		
//		.demo-frame
	}

}
