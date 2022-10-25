import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);

		WebElement tBody = driver.findElement(By.xpath("(//tbody)[1]"));

		List<WebElement> tableRows = tBody.findElements(By.tagName("tr"));

		List<WebElement> tableColumns = tBody.findElements(By.cssSelector("tr th"));

		System.out.println("Number of courses is " + (tableRows.size() - 1));

		System.out.println("Number of Columns is " + (tableColumns.size()));

		List<WebElement> row3 = tBody.findElements(By.xpath("(//tr)[4]"));

		String row3Text = "";
		for (WebElement table5Content : row3) {
			row3Text += table5Content.getText() + " ";
		}

		System.out.println(row3Text);
	}

}
