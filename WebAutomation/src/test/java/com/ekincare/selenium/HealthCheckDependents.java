package com.ekincare.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HealthCheckDependents extends Base {
	
	@BeforeMethod
	public void startTest() {
		
		initializeDriver();
	}
		
		@Test
		public void healthdepn() throws InterruptedException {
			
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.linkText("Health Checkups")).click();
			driver.findElement(By.xpath("//span[@class='sc-fznMAR gSVBBi']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Select' and @class='sc-AxjAm sc-AxmLO bhfRQJ']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Continue' and @class='sc-AxjAm sc-AxmLO iuBgGu']")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[3]/div[2]/div/div/button")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div/div[4]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div[2]/div/div/div/div[2]/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div[2]/label/span/div/p[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/label/span/p")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div[2]/div/div/div[2]/div/input")).sendKeys("1234567890");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[3]/div[2]/div/div[2]/button")).click();
		

		}
		@AfterMethod
		public void endTest() throws InterruptedException {
			closeDriver();
		
		}
		
}
