package com.ColorsApplicationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestColorsApp {

	@Test
	public void testColor() throws InterruptedException{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 
		 String URL = "http://flashselenium.t35.com/colors.html";
	}
}
