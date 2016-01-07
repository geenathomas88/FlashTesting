package com.permadi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.ColorsApplicationTest.FlashSeleniumWebDriver;

public class TestPermadi {
	@Test
	public void testColor() throws InterruptedException{
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	FlashSeleniumWebDriver flashApp = new FlashSeleniumWebDriver(driver, "myFlashMovie");
	driver.get("http://permadi.com/tutorial/flashjscommand/");
	flashApp.call("Play");
	Thread.sleep(3000);
	flashApp.call("StopPlay");
	
	System.out.println(flashApp.call("GetVariable", "/:message"));
	flashApp.call("SetVariable", "/:message","hello there");
	System.out.println(flashApp.call("GetVariable", "/:message"));
	
	driver.quit();
	}
}
