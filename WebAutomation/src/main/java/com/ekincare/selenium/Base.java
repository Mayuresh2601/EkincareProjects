package com.ekincare.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	protected static WebDriver driver;
	protected static String window;
	
	static {
		
		WebDriverManager.chromedriver().setup();
	}
	
	public void initializeDriver() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://app-test.ekincare.com/login");
		
	}

	
	public void closeDriver() throws InterruptedException {
		
	Thread.sleep(6000);
	driver.quit();
	}
	
	
	
	
	
}





