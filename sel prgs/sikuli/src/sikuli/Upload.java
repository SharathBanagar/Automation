package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Upload 
{
	
	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharath\\Desktop\\selenium-java-3.141.59\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		
		//Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div[3]")).click();
		
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
	

