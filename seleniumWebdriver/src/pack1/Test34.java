package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test34 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		// Display the all link text
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Total links:"+link.size());
		
		for(WebElement ele:link) {
			System.out.println(ele.getText());
		}
		driver.close();	
	}
}
