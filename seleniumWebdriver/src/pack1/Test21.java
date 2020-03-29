package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Default position:"+driver.manage().window().getPosition());
		driver.get("http://www.gmail.com");
		
		int x1 = driver.findElement(By.xpath("//*[@type='email']")).getLocation().getX();
		int y1 = driver.findElement(By.xpath("//*[@type='email']")).getLocation().getY();
		System.out.println(x1+","+y1);
		
		Thread.sleep(4000);
		driver.manage().window().setPosition(new Point(200,450));
		System.out.println("change size:"+driver.manage().window().getPosition());
		
		int x2 = driver.findElement(By.xpath("//*[@type='email']")).getLocation().getX();
		int y2 = driver.findElement(By.xpath("//*[@type='email']")).getLocation().getY();
		System.out.println(x2+","+y2);
		
		if(x1==x2 && y1==y2) {
			System.out.println("UI is stable");
		}
		else {
			System.out.println("UI is not stable");
		}
		Thread.sleep(4000);
		driver.close();
	}

}
