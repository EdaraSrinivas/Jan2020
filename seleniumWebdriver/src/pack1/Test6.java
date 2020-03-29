package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the firefox browser
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Launch the application
		driver.get("http://www.naukri.com");
		
		driver.close();
	//	driver.quit();
	}

}
