package pack1;

import java.util.ArrayList;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test18 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.hotmail.com");
		
		ArrayList<Cookie> cookie = new ArrayList<Cookie>(driver.manage().getCookies());
		System.out.println("Before adding cookie:"+cookie.size());
		
		// Adding cookie
		Cookie info = new Cookie("sri","sri@134567");
		driver.manage().addCookie(info);
		
		cookie = new ArrayList<Cookie>(driver.manage().getCookies());
		System.out.println("After adding cookie:"+cookie.size());
		System.out.println(driver.manage().getCookieNamed("sri"));
		
		driver.close();
		
	}

}
