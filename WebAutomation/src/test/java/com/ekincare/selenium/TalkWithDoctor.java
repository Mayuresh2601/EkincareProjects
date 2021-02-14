package com.ekincare.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TalkWithDoctor extends Base {
		
		
		@BeforeTest
		public void startTest() {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
		}
		
		@Test
		public  void Doctor() throws InterruptedException {
		
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("testFeb2420@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Talk with Family Doctor")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter here']")).sendKeys("fever");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='sc-AxjAm sc-fznxsB sc-pkHCh dNYUeV']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div[2]/div/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div[1]/div[1]/div[1]/div/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div[1]/div[1]/div[2]/div/div/button[@data-position='11']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div[1]/div[2]/input")).sendKeys("6362323517");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div[1]/div[3]/button")).click();
	
		}
		
		@AfterTest
		public void endTest() throws InterruptedException {
		Thread.sleep(6000);
		
		driver.close();
		
		}
}
