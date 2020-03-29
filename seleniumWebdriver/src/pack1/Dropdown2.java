package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.fb.com");
		
		// Month dropdown
		
		Select se = new Select(driver.findElement(By.id("month")));
		
		List<WebElement> options = se.getOptions();
		
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		driver.close();
	}

}
