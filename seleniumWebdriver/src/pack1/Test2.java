package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Webdriver is an interface in selenium library files
		
		// Webdriver abstract methods are implemented in the browser class(es)
		
		// User can perform actions on the browser with the webdriver methods implemented in the browser class
		
		// Firefox
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// Launch the application by passing the URL
		driver.get("http://www.gmail.com");
		
		// All the browser classes are implementing the webdriver methods and inheriting the Object and RemoteWebDriver classes
		
		
		
	}

}
