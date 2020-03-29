package pack1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test13 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.hotmail.com");
		
		// Verifying Cookies for the application
		
		Set<Cookie> cookie = driver.manage().getCookies();
		
		if(cookie.isEmpty()) {
			System.out.println("The application:"+driver.getTitle()+":doesn't have cookies");
		}
		else {
			System.out.println("The application:"+driver.getTitle()+":have cookies--"+driver.manage().getCookies().size());
		}

	}

}
