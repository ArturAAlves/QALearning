
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class JavaScriptErrorTracking {
	static ChromeDriver driver = Utils.webDriverInitializer("chrome");
	static DevTools devTools = Utils.devToolsInitialzer(driver);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogEntries entry = driver.manage().logs().get(LogType.BROWSER);
		List<LogEntry> logList = entry.getAll();
		for (LogEntry e : logList) {
			System.out.println(e);
		}
	}

}
