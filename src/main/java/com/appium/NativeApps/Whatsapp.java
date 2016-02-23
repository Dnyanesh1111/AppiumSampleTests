package com.appium.NativeApps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

/**
 * Hello world!
 *
 */
public class Whatsapp {
	
	private AppiumDriver<AndroidElement> driver;

	@Test
			public void WhatsApp() throws Exception {
			DesiredCapabilities capabilities = new DesiredCapabilities();
		    capabilities.setCapability("deviceName","OnePlus2");
		    capabilities.setCapability("platformVersion", "5.1.1");
		    capabilities.setCapability("appPackage", "com.whatsapp");
		    capabilities.setCapability("appActivity", "com.whatsapp.Main");
		    driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
		    driver.quit();
	}

}
