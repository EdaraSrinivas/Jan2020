package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test36 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		Actions actions = new Actions(driver);
		
		driver.findElement(By.name("firstname")).sendKeys("sri");
		actions.sendKeys(Keys.TAB).perform();
	//	actions.sendKeys("edara");
		
		driver.switchTo().activeElement().sendKeys("edara");
		
		actions.sendKeys(Keys.ENTER).perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys("s").build().perform();
		actions.keyUp(Keys.CONTROL).perform();
		
		actions.keyDown(Keys.CONTROL).keyDown(Keys.ALT).sendKeys(Keys.DELETE).build().perform();
		actions.keyUp(Keys.ALT).keyUp(Keys.CONTROL).build().perform();
		
		driver.close();	
	}
}
