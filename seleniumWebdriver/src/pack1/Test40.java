package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test40 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
	/*	action.contextClick(driver.findElement(By.linkText("Resizable"))).perform();
		
		action.sendKeys(Keys.ARROW_LEFT).perform();
		action.sendKeys(Keys.ARROW_DOWN).click().build().perform();
	*/	
	//	action.contextClick(driver.findElement(By.linkText("Resizable"))).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_DOWN).click().build().perform();
		
		action.doubleClick(driver.findElement(By.linkText("Resizable"))).perform();
	}
}
