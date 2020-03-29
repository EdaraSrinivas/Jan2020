package pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test31 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Prompt.html");
		
		driver.findElement(By.xpath("//*[text()='Try it']")).click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.sendKeys("srinivas");
		
		// Click On OK
		alert.accept();
		
		//Click on Cancel
		//alert.dismiss();
		
		System.out.println(driver.findElement(By.id("demo")).getText());
		
		driver.close();	
	}
}
