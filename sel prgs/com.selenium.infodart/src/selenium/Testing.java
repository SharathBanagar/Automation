package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing 
{
	WebDriver driver;
	public void invokeBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharath\\Desktop\\selenium-java-3.141.59\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get("http://www.gmail.com");
			driver.findElement(By.id("identifierId")).sendKeys("sharathbanagar63@gmail.com");
			driver.findElement(By.className("CwaK9")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("saymyname");
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[3]/header/div"
					+ "[2]/div[2]/div[2]/form/div/table/tbody/tr/td/table/tbody/tr/td/div/input[1]")).sendKeys("amazon");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	

	public static void main(String[] args) 
	{
		 Testing obj = new Testing(); 
		 obj.invokeBrowser();
	}

	}


