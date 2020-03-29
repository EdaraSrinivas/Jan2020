package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {

	public static void main(String[] args) {
		
		// Launch the firefox browser
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// Launch the application
		driver.get("http://www.facebook.com");
		
		// Registering an account
		
		// Enter the FirstName
		driver.findElement(By.id("u_0_m")).sendKeys("suresh");
		
		// Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("edara");
		
		// Mobile Number
		driver.findElement(By.name("reg_email__")).sendKeys("5498547674");
		
		// pwd
		driver.findElement(By.name("reg_passwd__")).sendKeys("sri@1345465");
		
		// gender - male
		driver.findElement(By.id("u_0_7")).click();
		
		// signUp
		driver.findElement(By.id("u_0_13")).click();
		
		

	}

}
