package com.amazonpage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Amazonpage {
	
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
				+ "LinearLayout/android.widget.RelativeLayout/android.widget.EditText").sendKeys("https://www.amazon.com");

}
}
