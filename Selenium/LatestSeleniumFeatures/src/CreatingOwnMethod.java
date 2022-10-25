
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v104.network.Network;
import org.openqa.selenium.devtools.v104.network.model.ConnectionType;
import org.openqa.selenium.devtools.v104.network.model.Response;

import com.google.common.collect.ImmutableMap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingOwnMethod {
	static ChromeDriver driver;
	static DevTools devTools;

	public static void main(String[] args) {
		// ChromeDriver
		webDriverInitializer("chrome");
		// ChromeDriver
		devToolsInitialzer();

		// Test With different resolutions - > Emulation.setDeviceMetricsOverride
		// resolutionSelector(driver, 500, 800, 50, false);

		// Test with different locations - >
		overrideGeolocation(driver, 17, 78, 1);

		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.addListener(Network.responseReceived(), response -> {
			Response res = response.getResponse();
			System.out.println(res.getStatus());
			// System.out.println(res.getUrl());
		});

		// define
		devTools.send(Network.emulateNetworkConditions(false, 3, 5000, 5000, Optional.of(ConnectionType.CELLULAR3G)));

		driver.get("https:google.com");
		driver.findElement(By.id("L2AGLb")).click();
		driver.findElement(By.cssSelector("input")).sendKeys("netflix");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
	}

		// private static Consumer response() {
		// // TODO Auto-generated method stub
		// return null;
	
		// }

	public static void resolutionSelector(ChromeDriver driver, int width, int height, int deviceScaleFactor,
			boolean mobile) {
		ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
		params.put("width", width);
		params.put("height", height);
		params.put("deviceScaleFactor", deviceScaleFactor);
		params.put("mobile", mobile);
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", params.build());
	}

	public static void overrideGeolocation(ChromeDriver driver, int latitude, int longitude, int accuracy) {
		ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
		params.put("latitude", latitude);
		params.put("longitude", longitude);
		params.put("accuracy", accuracy);
		driver.executeCdpCommand("Emulation.setGeolocationOverride", params.build());

	}

	// Initializers
	public static void webDriverInitializer(String browserName) {
		if (browserName == "chrome") {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

	}

	public static void devToolsInitialzer() {
		devTools = driver.getDevTools();
		devTools.createSession();
	}
}
