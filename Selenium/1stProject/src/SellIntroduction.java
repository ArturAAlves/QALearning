import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SellIntroduction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// invoking Browser
		// Chrome - ChromeDriver -> methods
		// Invoke Chromedriver.exe -> chrome browser
		
		//chrome
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//-------------------------
		
		//firefox
		//System.setProperty("webdriver.EdgeDriver.driver", "C:\\Users\\Arthur\\Desktop\\QA\\selenium webdriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Edge
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Arthur\\Desktop\\QA\\selenium webdriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		
		driver.get("https://www.sapo.pt");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
