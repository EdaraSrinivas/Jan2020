package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("");
		
		WebElement table = driver.findElement(By.xpath("//table[@]/tbody"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<cols.size();j++) {
				String data = cols.get(j).getText();
				System.out.println(data);
			}
			System.out.println(i+":row data completed");
		}
		
		driver.quit();
	}
}
