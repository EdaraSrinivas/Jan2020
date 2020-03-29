package pack1;

import java.util.ArrayList;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test14 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.hotmail.com");
		
		// Verifying Cookies for the application
		
		ArrayList<Cookie> cookie = new ArrayList<Cookie>(driver.manage().getCookies());
		
		if(cookie.isEmpty()) {
			System.out.println("The application:"+driver.getTitle()+":doesn't have cookies");
		}
		else {
			System.out.println("The application:"+driver.getTitle()+":have cookies--"+driver.manage().getCookies().size());
			
			// Validating the cookie info
			
			String expectedDomain = ".live.com";
			
			for(int i=0;i<cookie.size();i++) {
				
				String actualDomain = cookie.get(i).getDomain();
				if(actualDomain.contains(expectedDomain)) {
					continue;
				}
				else {
					System.out.println("The domain value is not matching: expected--"+expectedDomain+": but having--"+actualDomain);
				}
			}
			System.out.println("All the Cookies are matching with the expected Domain:"+expectedDomain);
		}
		driver.close();
	}

}
