package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Tracktrace
{
    public static void main(String args[])
    {
        try {
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharath\\Desktop\\selenium-java-3.141.59\\chromedriver\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver(capabilities);
			WebDriver driver = new ChromeDriver(capabilities);
			
			driver.manage().window().maximize();
			driver.get("http://14.142.50.123:7065/dms/login?user=baBxqTBryp37V%2Bo8OxdSEQ%3D%3D");
			
			Actions actions = new Actions(driver);
			//WebElement target = driver.findElement(By.className("mob-number"));
			//actions.moveToElement(target).perform();
			
			
			
			
			//Thread.sleep(3000);
			driver.findElement(By.id("mob-number")).click();
			//driver.findElement(By.xpath("//input[@class='gn-icon gn-icon-menu']")).click();
			
			//driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("saymyname");
			
			System.out.println(driver.getTitle());
		} catch (Exception e) 
        {
			e.printStackTrace();
		}
    }
}