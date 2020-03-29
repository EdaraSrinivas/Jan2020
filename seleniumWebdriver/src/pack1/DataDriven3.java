package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DataDriven3 {
	
	public static WebDriver driver;
	public static String actual;

	public static void main(String[] args) throws IOException, InterruptedException  {
		
		File file = new File("E:\\SampleData.xlsx");
		
		FileInputStream fi = new FileInputStream(file);
		
		XSSFWorkbook book = new XSSFWorkbook(fi);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int totalDataRows = sheet.getLastRowNum();
		
		for(int row=4;row<=totalDataRows;row++) {
			try {
				String browser = sheet.getRow(row).getCell(0).getStringCellValue();
				String appUrl = sheet.getRow(row).getCell(1).getStringCellValue();
				String userName = sheet.getRow(row).getCell(2).getStringCellValue();
				String password = sheet.getRow(row).getCell(3).getStringCellValue();
				String expected = sheet.getRow(row).getCell(4).getStringCellValue();
				
				if(browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
					driver = new FirefoxDriver();
				}
				else if(browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
					driver = new ChromeDriver();
				}
				else if(browser.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", "internetExplorerDriver.exe");
					driver = new InternetExplorerDriver();
				}
				else if(browser.equalsIgnoreCase("opera")) {
					System.setProperty("webdriver.opera.driver", "operadriver.exe");
					driver = new OperaDriver();
				}
				else if(browser.equalsIgnoreCase("Safari")) {

					driver = new SafariDriver();
				}
				
				driver.get(appUrl);
				
				// UserName
				driver.findElement(By.name("identifier")).sendKeys(userName);
				// Next
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(5000);
				// Validating the User data on Password field
				if(driver.findElement(By.xpath("//*[@type='password']")).isDisplayed()) {
					// Password
					driver.findElement(By.xpath("//*[@type='password']")).sendKeys(password);
					// Next
					driver.findElement(By.xpath("//span[text()='Next']")).click();
					Thread.sleep(5000);
					// validate the Password on title
					actual = driver.getTitle();
					sheet.getRow(row).createCell(5).setCellValue(actual);
					if(actual.contains(expected)) {
						sheet.getRow(row).createCell(6).setCellValue("Pass");
					}
					else if(driver.findElement(By.xpath("//div[@jsname='B34EJ']/span")).isDisplayed()) {
						actual = driver.findElement(By.xpath("//div[@jsname='B34EJ']/span")).getText();
						sheet.getRow(row).createCell(5).setCellValue(actual);
						
						if(actual.equalsIgnoreCase(expected)) {
							sheet.getRow(row).createCell(6).setCellValue("Pass");
						}
						else {
							sheet.getRow(row).createCell(6).setCellValue("Fail");
						}
					}
				}
				// Validating on Alert Msg  //div[@class='LXRPh']/div//span
				else if(driver.findElement(By.xpath("//div[@class='LXRPh']/div[2]/div")).isDisplayed()) {
					actual = driver.findElement(By.xpath("//div[@class='LXRPh']/div[2]/div")).getText();
					sheet.getRow(row).createCell(5).setCellValue(actual);
					
					if(actual.equalsIgnoreCase(expected)) {
						sheet.getRow(row).createCell(6).setCellValue("Pass");
					}
					else {
						sheet.getRow(row).createCell(6).setCellValue("Fail");
					}	
				}
				driver.close();
			}
			catch(Exception e) {
				FileOutputStream fo = new FileOutputStream(file);
				sheet.getRow(row).createCell(6).setCellValue(e.getMessage());
				book.write(fo);
			}	
		}
		
		FileOutputStream fo = new FileOutputStream(file);
		book.write(fo);
		
		book.close();
		fi.close();
		fo.close();
		
	}
}
