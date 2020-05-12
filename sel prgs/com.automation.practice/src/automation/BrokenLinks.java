package automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharath\\Desktop\\selenium-java-3.141.59\\chromedriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		driver.get("https://stackoverflow.com/questions/5726519/creating-and-storing-log-file-on-device-in-android");
		
		List<WebElement>links = driver.findElements(By.linkText("a"));
		
		System.out.println(links.size());
		
		for(int i =0;i<links.size();i++)
		{
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			
			HttpURLConnection httpConn = (HttpURLConnection)link.openConnection();
			
			Thread.sleep(2000);
			
			httpConn.connect();
			
			int rescode = httpConn.getResponseCode();
			
			if(rescode>=400)
			{
				System.out.println(url + " -  is broken link");
			}
			else
			{
				System.out.println(url + " -  is valid link");
			}
		}
	}

}
