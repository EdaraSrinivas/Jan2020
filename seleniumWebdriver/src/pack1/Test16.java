package pack1;

import java.util.ArrayList;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test16 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.hotmail.com");
		
		ArrayList<Cookie> cookie = new ArrayList<Cookie>(driver.manage().getCookies());
		
		String expectedCookieName = "ClientId";
		
		if(cookie.isEmpty()) {
			System.out.println("No Cookies are available");
		}
		else {
			System.out.println("Cookies are available:"+cookie.size());
			
			driver.manage().deleteCookieNamed(expectedCookieName);
			
			// validating deleted cookie
			
			cookie = new ArrayList<Cookie>(driver.manage().getCookies());
			
	/*		String actual = driver.manage().getCookieNamed(expectedCookieName).getName();
			
			if(actual.equals(null)) {
				
				System.out.println(expectedCookieName+": was deleted Successfully");
			}
			else {
				System.out.println(expectedCookieName+": was not deleted");
			}
	*/		
			
			for(int i=0;i<cookie.size();i++) {
			
				String actual = cookie.get(i).getName();
				if(actual.equals(expectedCookieName)) {
					System.out.println(expectedCookieName+": was not deleted");
					break;
				}
				else {
					System.out.println(actual);
					continue;
				}
			}
			System.out.println(expectedCookieName+": was deleted Successfully");	
		}
		
		driver.close();
	}

}
