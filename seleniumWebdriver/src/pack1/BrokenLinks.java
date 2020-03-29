package pack1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		List<WebElement> actuallinks = driver.findElements(By.tagName("a"));
		System.out.println("Total actual Links:" + actuallinks.size());
		List<WebElement> activeLink = new ArrayList<WebElement>();

		for (WebElement link : actuallinks) {
			if (link.getAttribute("href") != null) {
				activeLink.add(link);
			}
		}
		System.out.println("Total active Links:" + activeLink.size());

		for (WebElement link : activeLink) {

			HttpURLConnection httpcon = (HttpURLConnection) new URL(link.getAttribute("href")).openConnection();
			httpcon.setReadTimeout(3000);
			String responseMsg = httpcon.getResponseMessage();
			if (responseMsg.equals("OK")) {
				System.out.println(httpcon.getResponseMessage());
			} else {
				System.out.println(link.getAttribute("href") + ":" + httpcon.getResponseMessage() +"-- Broken Link");
			}
			httpcon.disconnect();
		}
		driver.close();
	}
}
