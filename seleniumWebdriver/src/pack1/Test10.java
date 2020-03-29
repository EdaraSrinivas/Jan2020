package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the firefox browser
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Launch the application
		driver.get("http://www.facebook.com");
		
		// Verifying the hidden element
		
		String expected_hidden = "Re-enter email address";
		
		if(driver.getPageSource().contains(expected_hidden)) {
			System.out.println("Expected element is available as hidden");
		}
		else {
			System.out.println("Expected element is not available");
		}
		
	/*	String actual = driver.getPageSource();
		
		if(actual.contains(expected_hidden)) {
			System.out.println("Expected element is available as hidden");
		}
		else {
			System.out.println("Expected element is not available");
		}
		
	*/	
		driver.close();
		
	}
}
