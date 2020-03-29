package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test39 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		
		List<WebElement> fr = driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(fr.get(0));
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
	//	action.dragAndDrop(source, target).perform();
	//	action.dragAndDropBy(source, target.getLocation().getX(), target.getLocation().getY()).perform();
		
	//	action.clickAndHold(source).perform();
	//	action.release(target).perform();
		
		action.moveToElement(source).clickAndHold().perform();
		action.moveToElement(target).release().perform();
		
		
	}
}
