package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test27 {

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
			System.out.println("Username field data is valid -- +ve Pass");
		}
		else if(driver.findElement(By.xpath("//div[@class='LXRPh']/div/div")).isDisplayed()) {
			
			String expectedAlertMsg = "Couldn't find your Google Account";
			String actualAlertMsg = driver.findElement(By.xpath("//div[@class='LXRPh']/div/div")).getText();
			
			// Validating Alert Msg
			if(actualAlertMsg.equals(expectedAlertMsg)) {
				System.out.println("-ve Passed");
			}
			else {
				System.out.println("-ve fail");
			}
		}
		else {
			System.out.println("+ve Fail");
		}
			
		driver.close();
	}

}
