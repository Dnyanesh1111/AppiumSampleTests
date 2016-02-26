

	package com.appium.MobileWeb;

	import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;


	public class PLMSTest {

		private AppiumDriver driver;

		@BeforeTest
		public void launchCalculator() throws Exception {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "OnePlus2");
			capabilities.setCapability("platformVersion", "5.1.1");
			capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),
					capabilities);

		}

		@Test
			public void addANumber() throws Exception {
			driver.get("https://precisionlms.ptc.com/app/pages/Login?0");
			Thread.sleep(5000);
			driver.findElement(By.id("lgUsername")).sendKeys("precisionlms12@plms.com");
			driver.findElement(By.id("lgPassword")).sendKeys("welcome");
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(7000);
			
			//assert driver.findElement(By.className("tmp1LoggedInAs")).getText().equals("Logged in as USER #12");
			assert driver.findElement(By.xpath("//p[contains(@class,'LoggedInAs')]")).getText().equals("Logged in as USER #12");
			
		}

		@AfterTest
		public void closeDriver() throws Exception {
			driver.quit();
		}

	}
}
