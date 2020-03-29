package pack1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test25 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.findElement(By.linkText("Create an account")).click();
		
		WebElement expectedElement = driver.findElement(By.xpath(""));
		
		ArrayList<String> winid = new ArrayList<String>(driver.getWindowHandles());
		
		for(int i=0;i<=winid.size();i++) {
			
			driver.switchTo().window(winid.get(i));
			if(expectedElement.isDisplayed()) {
				break;
			}
			else {
				continue;
			}
		}
		System.out.println("Cursor switched to the window having expected Element :"+expectedElement);
		expectedElement.click();

		driver.close();
	}

}
