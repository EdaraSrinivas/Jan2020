package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {

	public static void main(String[] args) {
		
		// Launch the firefox browser
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// Launch the application
		driver.get("http://www.facebook.com");
		
		// Forgotten account
		
	//	driver.findElement(By.linkText("Forgotten account?")).click();
		
	//	driver.findElement(By.partialLinkText("account?")).click();
		
	//	driver.findElement(By.partialLinkText("Forgotten")).click();
		
		driver.findElement(By.linkText("account?")).click();
	}

}
