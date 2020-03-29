package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Webdriver is an interface in selenium library files
		
		// Webdriver abstract methods are implemented in the browser class(es)
		
		// User can perform actions on the browser with the webdriver methods implemented in the browser class
		
		// Firefox
		
	//	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	//	FirefoxDriver driver = new FirefoxDriver();
		
	/*	// Chrome
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
	*/	
		
	/*	// IE
		
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		InternetExplorerDriver driver2 = new InternetExplorerDriver();
	*/	
		
		// Opera
		
				OperaOptions option = new OperaOptions();
				OperaOptions opt = option.setBinary("C:\\Users\\Srinivas\\AppData\\Local\\Programs\\Opera\\launcher.exe");
				
				System.setProperty("webdriver.opera.driver", "operadriver.exe");
				OperaDriver driver3 = new OperaDriver(opt);
		
		// Safari
		
		SafariDriver driver4 = new SafariDriver();
		
	}

}
