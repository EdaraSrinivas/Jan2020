package pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/gmail/about/#");
		
		driver.findElement(By.xpath("//div[@class='h-c-header__cta']//li[3]/a")).click();
		Thread.sleep(4000);
		
		List<String> winid = new ArrayList<String>(driver.getWindowHandles());
		
		for(int i=1;i<winid.size();i++) {
			driver.switchTo().window(winid.get(i));
			
			if(driver.findElement(By.xpath("//input[@id='firstName']")).isDisplayed()) {
				System.out.println("Switches to the target window - title is:"+driver.getTitle());
				break;
			}
			else {
				continue;
			}
		}
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("hello");
		
		driver.quit();
	}

}
