package com.appium.NativeApps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class Dialler {
	
	private AppiumDriver<AndroidElement> driver;

	@Test
			public void dialANumber() throws Exception {
			DesiredCapabilities capabilities = new DesiredCapabilities();
		    capabilities.setCapability("deviceName","OnePlus2");
		    capabilities.setCapability("platformVersion", "5.1.1");
		    capabilities.setCapability("appPackage", "com.android.dialer");
		    capabilities.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
		    driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
		    driver.quit();
	}
	}