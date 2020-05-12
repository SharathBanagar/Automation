package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) 
	{
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharath\\Desktop\\selenium-java-3.141.59\\chromedriver\\chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			driver.get("http://14.142.50.123:7065/dms/login?user=baBxqTBryp37V%2Bo8OxdSEQ%3D%3D");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class='gn-icon gn-icon-menu']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@href='invoicesummary']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//option[@value='1341']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='invNo']")).sendKeys("1020035584");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@id='search_button']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("#progressBar > svg > image:nth-child(7)")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("#progressBar > svg > image:nth-child(11)")).click();
			
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

}
