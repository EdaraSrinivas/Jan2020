package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.fb.com");
		
		// Month dropdown
		
		Select se = new Select(driver.findElement(By.id("month")));
		
		se.selectByVisibleText("Jul");
		
		se.selectByValue("10"); // OCT
		
		se.selectByIndex(0); // Month
		
		se.deselectByVisibleText("Month");
	}

}
