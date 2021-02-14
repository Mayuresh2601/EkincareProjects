package com.ekincare.selenium.improve;

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
public class Events extends Base{

	@BeforeMethod
	public void startTest() {
		
		initializeDriver();
	}

	@Test(priority=50)
	public void eventsGoing() throws InterruptedException, AWTException {
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[4]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Events']")).click();
		
		Robot r = new Robot();
		r.mouseMove(1600, 400);
		
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Know more")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='l (150 remaining)']/preceding-sibling::input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Going']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='sc-AykKC sc-fzXfMz bfFunN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()='My Events']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=51)
	public void eventsnotGoing() throws InterruptedException, AWTException {

	driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
	driver.findElement(By.name("password")).sendKeys("ekincare123456");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//	driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
	Thread.sleep(12000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[4]/div[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Events']")).click();
	
	Robot r = new Robot();
	r.mouseMove(1600, 400);
	
	r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//h2[text()='My Events']")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Know more")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Not Going']")).click();
	Thread.sleep(2000);
	
	}
	
	@Test(priority=52)
	public void eventsNotsure() throws InterruptedException, AWTException {
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[4]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Events']")).click();
		
		Robot r = new Robot();
		r.mouseMove(1600, 400);
		
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Know more")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='l (150 remaining)']/parent::div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Not Sure']")).click();
		Thread.sleep(2000);
	
	}
	
	@AfterMethod
	public void endTest() throws InterruptedException {
		closeDriver();
	
	}
	
}
