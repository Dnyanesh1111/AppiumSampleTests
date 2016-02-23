package com.appium.WebApps;

import com.appium.NativeApps.MobileGestures;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

public class GoogleBaba {

			private AppiumDriver<AndroidElement> driver;
			private MobileGestures swipes;

			@BeforeTest
			public void launchCalculator() throws Exception {
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("deviceName", "OnePlus2");
				capabilities.setCapability("platformVersion", "5.1.1");
				capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
				driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
			}	
				
			@Test
				public void browserTest() throws Exception {
				driver.get("http://www.ptc.com");
			}
					
			@AfterTest
			public void closeDriver() throws Exception {
				driver.quit();
			}
			}

