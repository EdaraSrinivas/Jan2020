package pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("login")).sendKeys("");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		// Validating the alert information
		
		String expectedAlertMsg = "Please enter a valid user name";
		
		// HAndling the Alert Box
		
		Alert alert = driver.switchTo().alert();
		
		String actualAlertMsg = alert.getText();
		
		if(actualAlertMsg.equals(expectedAlertMsg)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		// Click OK on Alert
		alert.accept();
		
		driver.close();
		
		
	}

}
