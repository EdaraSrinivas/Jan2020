package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test41 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		
		List<String> winid = new ArrayList<String>(driver.getWindowHandles());
		
		for(int i=1;i<winid.size();i++) {
			driver.switchTo().window(winid.get(i)).close();
		}
		driver.switchTo().window(winid.get(0));
		driver.findElement(By.xpath("//div[@id='uploadBtnCont']")).click();
		
		Robot robot = new Robot();
		
		StringSelection str = new StringSelection("D:\\CV\\CV.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		// Authentication alerts
	
	}
}
