package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions", stepNotifications = true, monochrome = true, plugin = {
		"pretty", "html:target/cucumber.html", "junit:target/cukes.xml" })
public class JunitRunner {
}
