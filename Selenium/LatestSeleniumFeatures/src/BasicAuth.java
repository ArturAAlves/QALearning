
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.Credentials;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v104.network.Network;
import org.openqa.selenium.devtools.v104.network.model.Headers;

import com.google.common.base.Predicate;

public class BasicAuth {

	static ChromeDriver driver = Utils.webDriverInitializer("chrome");
	static DevTools devTools = Utils.devToolsInitialzer(driver);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Enable network
		devTools.send(Network.enable(Optional.of(0), Optional.of(0), Optional.of(0)));

//		// Create hashmap for storing key value pair
//		Map<String, Object> header = new HashMap<>();
//
//		// Create authentication string- please replace with your application username
//		// and password - in current case guest is username and password as well.
//		String basicAuth = "Basic "
//				+ new String(new Base64().encode(String.format("%s:%s", "guest", "guest").getBytes()));
//
//		// add Authorization as key and basicAuth as value
//		header.put("Authorization", basicAuth);
//
//		// add authentication as part of header
//		devTools.send(Network.setExtraHTTPHeaders(new Headers(header)));
//
//		// please replace this with your application url
//		driver.get("https://jigsaw.w3.org/HTTP/");
//
//		// click on link and your request should be authenticated
//
//		driver.findElement(By.linkText("Basic Authentication test")).click();
		Predicate<URI> uriPredicate = uri -> uri.getHost().contains("jigsaw");
		((HasAuthentication) driver).register(uriPredicate, UsernameAndPassword.of("guest", "guest"));
		driver.get("https://jigsaw.w3.org/HTTP/");

		driver.findElement(By.linkText("Basic Authentication test")).click();
	}

}
