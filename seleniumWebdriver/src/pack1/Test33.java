package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test33 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("Application URL");
		
		List<WebElement> frame = driver.findElements(By.tagName("frame"));
		
		for(int i=0;i<=frame.size();i++) {
			
			driver.switchTo().frame(i);
			
			if(driver.findElement(By.id("")).isDisplayed()) {
				break;
			}
			else {
				driver.switchTo().defaultContent();
				continue;
			}
		}
		driver.findElement(By.id("")).sendKeys("");
		
		driver.close();	
	}
}
