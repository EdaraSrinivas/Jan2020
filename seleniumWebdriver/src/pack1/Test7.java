package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the firefox browser
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Launch the application
		driver.get("http://www.facebook.com");
		
		// forgotten account link
		
		driver.findElement(By.xpath("//*[text()='Forgotten account?']")).click();
		
		// Validating the forgotten account link
		
		String expected = "Please enter your email address or phone number to search for your account.";
		
		String actual = driver.findElement(By.xpath("//div[@class='identify_yourself_block']//div")).getText();
		
		if(actual.equals(expected)) {
			System.out.println("Navigate to the expected page");
		}
		else {
			System.out.println("Navigation page is not expected");
		}
		driver.close();
		
	}

}
