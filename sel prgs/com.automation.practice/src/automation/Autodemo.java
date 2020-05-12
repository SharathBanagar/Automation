package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Autodemo {

	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharath\\Desktop\\selenium-java-3.141.59\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.automationtesting.in/Index.html");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='btn2']")).click();
		
		Actions action = new Actions(driver);
		
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.linkText("More"))).build().perform();
		
		driver.findElement(By.linkText("File Upload")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div[3]")).click();
		//driver.findElement(By.cssSelector("#input-4")).click();
		
		
		 String imagesFilepath = "C:\\Users\\Sharath\\Pictures\\Saved Pictures\\";
	        String inputFilepath = "C:\\Users\\Sharath\\Pictures\\Saved Pictures\\";
	        Screen s = new Screen();
	        
	        Pattern fileInputTextBox = new Pattern(imagesFilepath + "textbox.PNG");
	        Pattern openButton = new Pattern(imagesFilepath + "open.PNG");
	        
	        Thread.sleep(3000);
	        
	        s.wait(fileInputTextBox,20);
	        s.type(fileInputTextBox,inputFilepath+"open.PNG");
	        s.click(openButton);

	}

}
