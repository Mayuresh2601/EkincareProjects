package com.ekincare.selenium.benefits;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ekincare.selenium.Base;
import com.ekincare.selenium.extentreport.CustomListner;

@Listeners(CustomListner.class)
public class DentalCheckups extends Base{
	
	
	@BeforeMethod
	public void startTest() {
		
		initializeDriver();
	}
	
	@Test(priority=9)
	public void dental() throws InterruptedException, AWTException {
	
	driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
	driver.findElement(By.name("password")).sendKeys("ekincare123456");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//	driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
	Thread.sleep(12000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[3]/a/div[2]/div[1]")).click();

	Robot r = new Robot();
	r.mouseMove(1600, 400);
	
	r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Select']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Continue']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Detect']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Continue']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Select']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div[2]/label/span/div/p[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div/div[5]/label/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("1234567889");;
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	Thread.sleep(10000);
	
	
	
	}
	
	
	@AfterMethod
	public void endTest() throws InterruptedException {
		closeDriver();
	
	}

}
