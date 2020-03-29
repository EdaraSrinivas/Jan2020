package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the firefox browser
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Launch the application
		driver.get("http://www.facebook.com");
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		List<WebElement> ele = driver.findElements(By.id("privacy-lin"));
		System.out.println(ele.size());
		
		driver.close();
	}

}
