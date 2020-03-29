package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test32 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
		
	/*	// Closing the pop-up(
		
		if(driver.findElement(By.xpath("//*[text()='X']")).isDisplayed()) {
			driver.findElement(By.xpath("//*[text()='X']")).click();
		}
	*/	
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//div[@id='custom-button']/button")).click();
		
		driver.findElement(By.name("swlogin")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='login-button-options']/a[1]")).click();
		//Continue to NetBanking
		driver.findElement(By.xpath("//div[@class='full_container']/div[2]//a")).click();
		Thread.sleep(5000);
		
		// Customer ID
	//	driver.findElement(By.name("fldLoginUserId")).sendKeys("46999134");
		
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//span[@class='pwd_field']/input")).sendKeys("46999134");
		driver.findElement(By.xpath("//*[@alt='continue']")).click();
		
		driver.close();	
	}
}
