package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test38 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
		
		Actions action = new Actions(driver);
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		int x = electronics.getLocation().getX();
		int y = electronics.getLocation().getY();
		
		//action.moveToElement(electronics,x,y).perform();
		
		action.moveByOffset(x, y).perform();
		
	//	action.moveToElement(driver.findElement(By.xpath("//*[text()='Power Banks']"))).click().perform();
		
		action.click(driver.findElement(By.xpath("//*[text()='Power Banks']"))).perform();
			
			
	}
}
