package pack1;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test35 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		// ImplicitlyWait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// ExplicitWait - action
		WebDriverWait wait = new WebDriverWait(driver,10); // Default the time interval is Seconds
		wait.until(ExpectedConditions.alertIsPresent());
					// OR
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name(""))));
		
		// FluentWait - exception
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
		wait1.withTimeout(Duration.ofSeconds(10))
		.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoSuchElementException.class,WebDriverException.class);

		driver.close();	
	}
}
