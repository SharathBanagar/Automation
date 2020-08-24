package SmallCase.task1s1;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class Flipkart
{
	public static void main(String[] args) throws MalformedURLException, AWTException, InterruptedException 
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
	/*driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
			+ "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget"
			+ ".FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android."
			+ "view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view."
			+ "View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view."
			+ "View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]").click();*/
	
	driver.findElementByLinkText("Fitbit Versa 2 Smartwatch").click();
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	String singleunitprice_flipkart =  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget."
			+ "LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view."
			+ "ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/"
			+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view."
			+ "View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view."
			+ "View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]"
			+ "/android.view.View/android.view.View[1]").getText();
	System.out.println("The price of the item for 1QTY ="+singleunitprice_flipkart);
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android."
			+ "widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget."
			+ "FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view."
			+ "View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view."
			+ "View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view."
			+ "View").click();
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android."
			+ "widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android."
			+ "view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android."
			+ "view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android."
			+ "view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/"
			+ "android.view.View").click();
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android."
			+ "widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget."
			+ "FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view."
			+ "View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view."
			+ "View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view."
			+ "View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view."
			+ "View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android."
			+ "view.View").click();
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	String twounitprice_flipkart = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
			+ "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android."
			+ "widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]"
			+ "/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view."
			+ "View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android."
			+ "view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/"
			+ "android.view.View").getText();
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	System.out.println("The price ot the item after adding the quantity ="+twounitprice_flipkart);
	
	
	
	
}
}

