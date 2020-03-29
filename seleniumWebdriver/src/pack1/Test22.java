package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.findElement(By.linkText("Create an account")).click();
		
		Thread.sleep(4000);
		
		// ImplicitlyWait
		
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		
		
	}

}
