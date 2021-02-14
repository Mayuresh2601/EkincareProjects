package com.ekincare.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HealthCheTwoDepn extends Base {
	
	@BeforeTest
	public void startTest() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void healthtwodepn() throws InterruptedException {
		
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Health Checkups")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/label/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"drawer-root\"]/div[1]/div[2]/div/div[2]/div[2]/div[1]/div/div[3]/div/div/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"drawer-root\"]/div[1]/div[2]/div/div[3]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div[3]/div/div[2]/div/div[2]/div/label/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"drawer-root\"]/div[1]/div[2]/div/div[2]/div[2]/div[2]/div/div[3]/div/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"drawer-root\"]/div[1]/div[2]/div/div[3]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[3]/div[2]/div/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/button/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div/div[4]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div[2]/div/div/div/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div[4]/label/span/div/p[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div/div[3]/label/span/p")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div[2]/div/div/div[2]/div/input")).sendKeys("8812456787");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[3]/div[2]/div/div[2]/button")).click();
	
		
	}
	
	@AfterTest
	public void endTest() throws InterruptedException {
	Thread.sleep(6000);
	
	driver.close();
	
	}
	
	

}
