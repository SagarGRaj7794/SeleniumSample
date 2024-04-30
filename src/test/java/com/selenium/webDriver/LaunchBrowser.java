package com.selenium.webDriver;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LaunchBrowser {

	WebDriver driver;
	
	@Test
	public void launchBrowser() {
		
		driver=new ChromeDriver();
		
		driver.get("https://groww.in/mutual-funds");
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
