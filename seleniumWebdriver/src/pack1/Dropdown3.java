package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Userlanguage.html");
		
		String motherLang = "Telugu"; 
		
		Select val = new Select(driver.findElement(By.id("plang")));
		
		if(val.isMultiple()) {
			System.out.println("Multiple Selection dropdown");
			System.out.println("=================================");
			val.selectByVisibleText(motherLang);
			val.selectByVisibleText("English");
			val.selectByVisibleText("Hindi");
		}
		else {
			System.out.println("Single Selection dropdown");
			System.out.println("=================================");
			val.selectByVisibleText(motherLang);
		}
		
		List<WebElement> selectedValues = val.getAllSelectedOptions();
		
		for(WebElement value : selectedValues) {
			System.out.println(value.getText());
		}
		driver.close();
	}

}
