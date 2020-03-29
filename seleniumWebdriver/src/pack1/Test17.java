package pack1;

import java.util.ArrayList;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test17 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.hotmail.com");
		
		ArrayList<Cookie> cookie = new ArrayList<Cookie>(driver.manage().getCookies());
		
		if(cookie.isEmpty()) {
			System.out.println("No Cookies are available");
		}
		else {
			System.out.println("Cookies are available:"+cookie.size());
			
			driver.manage().deleteAllCookies();
			
			// Validating all the cookies are deleted or not?
			cookie = new ArrayList<Cookie>(driver.manage().getCookies());
			
			if(cookie.isEmpty()) {
				System.out.println("All the cookies are deleted");
			}//Validating all the cookies are deleted or not?
			else {
				System.out.println("Cookies are not deleted:"+cookie.size());
			}
		}
		
		driver.close();
	}

}
