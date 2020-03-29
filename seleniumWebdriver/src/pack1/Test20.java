package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test20 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Default Size:"+driver.manage().window().getSize());
		driver.get("http://www.gmail.com");
		
		int h1 = driver.findElement(By.xpath("//*[@type='email']")).getSize().getHeight();
		int w1 = driver.findElement(By.xpath("//*[@type='email']")).getSize().getWidth();
		System.out.println(h1+","+w1);
		
		Thread.sleep(4000);
		driver.manage().window().setSize(new Dimension(130,400));
	//	driver.manage().window().maximize();
		System.out.println("change size:"+driver.manage().window().getSize());
		
		int h2 = driver.findElement(By.xpath("//*[@type='email']")).getSize().getHeight();
		int w2 = driver.findElement(By.xpath("//*[@type='email']")).getSize().getWidth();
		System.out.println(h2+","+w2);
		
		if(h1==h2 && w1==w2) {
			System.out.println("UI is stable");
		}
		else {
			System.out.println("UI is not stable");
		}
		Thread.sleep(4000);
		driver.close();
	}

}
