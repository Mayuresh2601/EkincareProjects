package com.ekincare.selenium.health;


import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ekincare.selenium.Base;
import com.ekincare.selenium.extentreport.CustomListner;

@Listeners(CustomListner.class)
public class Insights extends Base {
	
	@BeforeMethod
	public void startTest() {
		
		initializeDriver();
	}

	@Test(priority=42)
	public void healthInsi() throws InterruptedException {
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Health")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Insights']")).click();
		Thread.sleep(2000);

	}
	
	@AfterMethod
	public void endTest() throws InterruptedException {
		closeDriver();
	
	}
}
