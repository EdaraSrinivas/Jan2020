package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test12 {

	public static void main(String[] args) throws InterruptedException {

		// Launch the firefox browser
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Launch the application
	//	driver.get("http://www.facebook.com");
		
		driver.navigate().to("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[text()='Forgotten account?']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.navigate().back(); // Home page
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.navigate().forward(); // forgotten account page
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
