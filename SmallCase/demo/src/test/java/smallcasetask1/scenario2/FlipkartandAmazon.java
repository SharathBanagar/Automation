package smallcasetask1.scenario2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FlipkartandAmazon {

	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);
	
		
		dc.setCapability("appPackage", "com.android.chrome");
		dc.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
				
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android."
				+ "widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android."
				+ "widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget."
				+ "LinearLayout/android.widget."
				+ "LinearLayout/android.widget.RelativeLayout/android.widget.EditText").sendKeys("https://www.flipkart.com");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
				+ "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget."
				+ "FrameLayout[2]/android.widget.ListView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget."
				+ "LinearLayout/android.widget.TextView[2]").click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		driver.findElementByXPath("(//android.view.View[@content-desc=\"#search\"])[1]/android.widget.EditText").click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
				+ "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget"
				+ ".FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view."
				+ "View[1]/android.view.View[7]/android.view.View/android.view.View[1]/android.view.View").click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		//driver.findElementByXPath("(//android.view.View[@content-desc=\"#search\"])[1]/android.widget.EditText").sendKeys("fitbit");
		driver.findElementById("input-search").sendKeys("fitbit");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.view.View[@content-desc=\"fitbit fitbit in "
				+ "Smart Watches\"]/android.view.View/android.view.View[4]").click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
				+ "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget"
				+ ".FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android."
				+ "view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view."
				+ "View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view."
				+ "View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]").click();
		
		//driver.findElementByLinkText("Fitbit Versa 2 Smartwatch").click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String itemprice_flipkart =  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view."
				+ "ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view."
				+ "View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view."
				+ "View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]"
				+ "/android.view.View/android.view.View[1]").getText();
		System.out.println("The price of the item in Flipkart ="+itemprice_flipkart);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android."
				+ "widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget."
				+ "FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view."
				+ "View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view."
				+ "View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view."
				+ "View").click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String itempriceincart_flipkart = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
				+ "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android."
				+ "widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]"
				+ "/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view."
				+ "View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android."
				+ "view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/"
				+ "android.view.View").getText();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println("The price ot the item in Flipkart's cart ="+itempriceincart_flipkart);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElementsByXPath("");
		
		driver.quit();
		
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);
	
		
		dc.setCapability("appPackage", "com.android.chrome");
		dc.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
		
		URL url1 = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver1 = new AndroidDriver<WebElement>(url1,dc);
				
		driver1.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android."
				+ "widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android."
				+ "widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget."
				+ "LinearLayout/android.widget."
				+ "LinearLayout/android.widget.RelativeLayout/android.widget.EditText").sendKeys("https://wwww.amazon.com");
		
		
		
		driver1.findElementById("com.android.chrome:id/line_2").click();
		
		WebElement country = driver1.findElementById("icp-touch-link-country");
		
		((JavascriptExecutor) driver1).executeScript("arguments[0].scrollIntoView(true);", country);
		country.click();
		
		
		driver1.findElementById("icp-selected-country").click();
		
		
		driver1.findElementById("icp-selected-country_6").click();
		
		
		
		driver1.findElementByXPath("//android.view.View[@content-desc=\"Clear search keywords\"]").sendKeys("fitbit");
		
		
		//driver1.findElementByXPath("").sendKeys("fitbit");
		
		
		driver1.findElementByClassName("android.view.View").click();
		
		
		driver1.findElementByXPath("//android.view.View[@content-desc=\"Fitbit Versa 2 Health and Fitness "
				+ "Smartwatch with Heart Rate, Music, Alexa Built-In... 4.5 out of 5 stars 32,138 $198.95 Ships to "
				+ "India Amazon Certified: Alexa Built-in\"]/android"
				+ ".view.View[1]").click();
		
		
		String itemprice_amazon = driver1.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.\"\r\n" + 
				"				+ \"widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.\"\r\n" + 
				"				+ \"widget.FrameLayout[2]/androidx.recyclerview.widget").getText();
		System.out.println("Item price in Amazon ="+itemprice_amazon);
		
		WebElement addtocart = driver1.findElementByXPath("/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.\"\r\n" + 
				"				+ \"LinearLayout/android.widget.\"\r\n" + 
				"				+ \"LinearLayout/android.widget.RelativeLayout/android.widget.EditText");
		
		((JavascriptExecutor) driver1).executeScript("arguments[0].scrollIntoView(true);", addtocart);
		
		
		addtocart.click();
		
		String itempriceincart_amazon = driver1.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout\"\r\n" + 
				"				+ \"/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.\"\r\n" + 
				"				+ \"widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit").getText();
		
		System.out.println("The price of the item in Amazon's cart ="+itempriceincart_amazon);
		
		int a = Integer.parseInt(itempriceincart_amazon);
		int f = Integer.parseInt(itempriceincart_flipkart);
		
		if(a<f)
		{
			System.out.println("Amazon's price is cheaper than Flipkart's price ie,.." + a);
			System.out.println("It is recomended to buy at amazon at a price of :" +a);
		}
		else if(a>f)
		{
			System.out.println("Flipkart's price is cheaper than Amazon's price ie,.." + f);
			System.out.println("It is recomended to buy at Flipkart at a price of :" +f);
		}
		else if(a==f)
		{
			System.out.println("The pcice of the item at both Amazon and Flipkart is the same ie,.."+a);
		}
	}
	}
