package AA.SeleniumFrameworkDesign.tests;

import static org.testng.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import AA.SeleniumFrameworkDesign.LandingPage;
import AA.SeleniumFrameworkDesign.tests.TestComponents.BaseTest;
import Data.DataReader;

public class StandAloneTest extends BaseTest {
	@Test(dataProvider = "getData")
//	public void submitOrder(String email, String password, String productName)
	public void submitOrder(HashMap<String, String> input) throws IOException, InterruptedException {

		System.out.println(input.get("email"));
		LandingPage landingPage = launchApplication();
		landingPage.login(input.get("email"), input.get("password"));

		Thread.sleep(500);

		List<WebElement> cards = getDriver().findElements(By.cssSelector(".card-body"));
		System.out.println(cards);
		WebElement selectedProduct = cards.stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals(input.get("product")))
				.findFirst().orElse(null);

		selectedProduct.findElement(By.cssSelector(".fa-shopping-cart")).click();

		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#toast-container")));

		getDriver().findElement(By.xpath("(//button[@routerlink='/dashboard/cart'])[1]")).click();
		Thread.sleep(500);

		List<WebElement> cartproducts = getDriver().findElements(By.cssSelector("li h3"));

		WebElement productInCart = cartproducts.stream()
				.filter(product -> product.getText().equals(input.get("product"))).findFirst().orElse(null);

		assertNotNull(productInCart);

		getDriver().findElement(By.xpath("(//button[normalize-space()='Checkout'])[1]")).click();
		getDriver().findElement(By.xpath("(//input[@placeholder='Select Country'])[1]")).sendKeys("por");

		Thread.sleep(500);

		getDriver().findElement(By.xpath("(//button[@type='button'])[1]")).click();
		getDriver().findElement(By.xpath("(//a[normalize-space()='Place Order'])[1]")).click();
		Thread.sleep(500);
		getDriver().findElement(By.cssSelector(".btn.btn-primary.mt-3.mb-3")).click();
		driver.quit();
	}

//	@DataProvider
//	public Object[][] getData() {
//
//		Object[][] data = new Object[2][3];
//
//		// 1st row
//		data[0][0] = "arturdoalves@gmail.com";
//		data[0][1] = "Sapo789789!";
//		data[0][2] = "ZARA COAT 3";
//
//		// 12st row
//		data[1][0] = "arturdoalves@gmail.com";
//		data[1][1] = "Sapo789789!";
//		data[1][2] = "ADIDAS ORIGINAL";
//
//		return data;
//
//	}

	@DataProvider
	public Object[][] getData() throws JsonMappingException, JsonIOException, JsonSyntaxException,
			JsonProcessingException, FileNotFoundException {

//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("email", "arturdoalves@gmail.com");
//		map.put("password", "Sapo789789!");
//		map.put("product", "ZARA COAT 3");
//
//		HashMap<String, String> map2 = new HashMap<String, String>();
//		map2.put("email", "arturdoalves@gmail.com");
//		map2.put("password", "Sapo789789!");
//		map2.put("product", "ADIDAS ORIGINAL");

		DataReader dataReader = new DataReader();
		List<HashMap<String, String>> dataValue = dataReader.getJsonDataToMap(
				"C:\\Users\\Arthur\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\test\\java\\Data\\PurchaseOrder.json");

		return new Object[][] { { dataValue.get(0) }, { dataValue.get(1) } };

	}

}
