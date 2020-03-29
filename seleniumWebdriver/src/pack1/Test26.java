package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.name("identifier")).sendKeys("srinivas");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		// Validating the user data based on the pwd field
		
		if(driver.findElement(By.xpath("//*[@type='password']")).isDisplayed()) {
			System.out.println("Username field data is valid -- Pass");
		}
		else {
			System.out.println("Username field data is incorrect -- Fail");
		}
		
		driver.close();
	}

}
