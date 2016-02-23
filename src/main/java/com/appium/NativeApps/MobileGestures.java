package com.appium.NativeApps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

public class MobileGestures {

	private AppiumDriver<AndroidElement> driver;

	@BeforeTest
	public void launchCalculator() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "OnePlus2");
		capabilities.setCapability("platformVersion", "5.1.1");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", ".Calculator");
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
	}	
	
	@Test
	
			public void swipeLeft() throws Exception {
			driver.context("NATIVE_APP"); 
			Dimension size = driver.manage().window().getSize();
			System.out.println(size);
			int startx = (int) (size.width * 0.8);
			System.out.println("Started at X" + startx);
			int endx = (int) (size.width * 0.20); 
			System.out.println("Ended at X" + endx);
			int starty = size.height / 2; 
			System.out.println("Started at Y" + starty);
			System.out.println(size.height);
			System.out.println(size.width);
			driver.swipe(startx, starty, endx, starty, 1000);
			}
	
	@Test
			public void swipeRight() throws Exception {
				//Excerise to close Advanced menu of calc
			}
	
			
	@AfterTest
	public void closeDriver() throws Exception {
		driver.quit();
	}
	}
