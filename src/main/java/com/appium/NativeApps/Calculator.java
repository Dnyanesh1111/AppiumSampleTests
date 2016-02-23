package com.appium.NativeApps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

/**
 * Hello world!
 * 
 */
public class Calculator {

	private AppiumDriver<AndroidElement> driver;

	@BeforeTest
	public void launchCalculator() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "OnePlus2");
		capabilities.setCapability("platformVersion", "5.1.1");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", ".Calculator");
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),
				capabilities);

	}

	@Test
		public void addANumber() throws Exception {
		//Find Element by id
		AndroidElement num1 = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
		num1.click();
		
		AndroidElement add = driver.findElement(By.xpath("//android.widget.Button[@content-desc='plus']"));
		add.click();
		
		AndroidElement num2 = driver.findElement(By.name("5"));
		num2.click();
		
		AndroidElement equals = driver.findElement(By.name("="));
		equals.click();
	
		String result = driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
		Assert.assertEquals(result, "10");
		
	}

	@AfterTest
	public void closeDriver() throws Exception {
		driver.quit();
	}

}