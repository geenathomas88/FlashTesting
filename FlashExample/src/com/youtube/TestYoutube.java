package com.youtube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.ColorsApplicationTest.FlashSeleniumWebDriver;

public class TestYoutube {
	@Test
	public void testVideo() throws InterruptedException{
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	FlashSeleniumWebDriver flashApp = new FlashSeleniumWebDriver(driver, "movie_player");
	
	driver.get("https://www.youtube.com/watch?v=lVxHUvi0liY");
	Thread.sleep(2000);
	
	while(Integer.parseInt(flashApp.call("getPlayerState"))==3){
		Thread.sleep(1000);
	}
	
	Thread.sleep(10000);
	flashApp.call("pauseVideo");
	Thread.sleep(5000);
	flashApp.call("playVideo");
	Thread.sleep(5000);
	
	flashApp.call("seekTo", "20", "true");
	Thread.sleep(5000);
	flashApp.call("mute");
	Thread.sleep(5000);
	flashApp.call("setVolume","50");
	Thread.sleep(5000);
	
	//driver.quit();
	}
}
