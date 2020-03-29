package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the firefox browser
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Launch the application
		driver.get("http://www.facebook.com");
		
	/*	List<WebElement> ele = driver.findElements(By.xpath("//*[@type='hidden']"));
		System.out.println(ele.size());
		driver.close();
	*/	
		
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(elements.size());
		
		for(int i=0;i<elements.size();i++) {
			
		/*	if(elements.get(i).getAttribute("aria-label")==null) {
				continue;
			}
			else {
				System.out.println(i+":Element is available:"+elements.get(i).getAttribute("aria-label"));
			}
		*/	
			if(elements.get(i).getAttribute("aria-label").contains("Re-enter email address")) {
				System.out.println("Element is available:"+elements.get(i).getAttribute("aria-label"));
				break;
			}
		}
		driver.close();
	}
}
