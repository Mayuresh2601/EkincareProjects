package com.ekincare.selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TalkwithFamilyDoc extends Base {

	@BeforeTest
	public void startTest() {
		
		initializeDriver();
	}
	
	
//	@Test(priority=0)
	public void Login() throws InterruptedException, AWTException {
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("shree123@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[2]/div[2]/div[1]")).click();
		
		
		Robot r = new Robot();
		r.mouseMove(1600, 400);
		
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='sc-AxjAm sc-fznxsB cJDFRB']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[3]/div[2]/div[5]/p/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Got it!']")).click();
		Thread.sleep(2000);
	}
	//schedule+reschedule
	
	@Test(priority=0)
	public void scheduleReschedule() throws InterruptedException, AWTException {
		
		System.out.println("TalkWithFamilyDocScheduleandReschudle");
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("testfeb24720@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[2]/div[2]/div[1]")).click();
		
		
		Robot r = new Robot();
		r.mouseMove(1600, 400);
		
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='sc-AxjAm sc-fznxsB sc-pjtZy iUwwzD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='26']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='04:00 PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9686714453");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='CONFIRM CONSULTATION']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='RESCHEDULE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='26']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='05:30 PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9686714453");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='CONFIRM CONSULTATION']")).click();
		Thread.sleep(5000);
	
	}
	
	//schedule+cancel
	
	@Test(priority=1)
	public void scheduleCancel() throws InterruptedException, AWTException {
		
		System.out.println("TalkWithFamilyDocScheduleandCancel");
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("testfeb24720@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[2]/div[2]/div[1]")).click();
		
		
		Robot r = new Robot();
		r.mouseMove(1600, 400);
		
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='sc-AxjAm sc-fznxsB sc-pjtZy iUwwzD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='26']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='09:30 PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9686714453");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='CONFIRM CONSULTATION']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='CANCEL APPOINTMENT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Yes, Cancel']")).click();
		Thread.sleep(3000);
		
		
		
	
	}
	//schedule for reschedule and cancel

	@Test(priority=2)
	public void schedule() throws InterruptedException, AWTException {
		
		System.out.println("TalkWithFamilyDoctorReschudleandCancel");
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("testfeb24720@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[2]/div[2]/div[1]")).click();
		
		
		Robot r = new Robot();
		r.mouseMove(1600, 400);
		
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='sc-AxjAm sc-fznxsB sc-pjtZy iUwwzD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='26']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='09:00 PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9686714453");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='CONFIRM CONSULTATION']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='sc-AxjAm sc-fznxsB sc-oUbIU sc-pbLXc gUBkTs']")).click();
		Thread.sleep(15000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sc-fzppip iJxxvB' and text()='Notifications']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='ashwini, your consultation is confirmed!']")).click();
		Thread.sleep(2000);
		

		Robot r2 = new Robot();
		r2.mouseMove(1600, 400);
		
		r2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='RESCHEDULE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='26']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='10:30 PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9686714453");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='CONFIRM CONSULTATION']")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[text()='CANCEL APPOINTMENT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Yes, Cancel']")).click();
		Thread.sleep(3000);
	
			
}
//family member is there
	
	
	@Test(priority=3)
	public void WithFamilymemberschedule() throws InterruptedException, AWTException {
		
		System.out.println("TalkwithfamilyDoctorWithFamilyMemberSchedule");
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("testfeb24720@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[2]/div[2]/div[1]")).click();
		
		
		Robot r = new Robot();
		r.mouseMove(1600, 400);
		
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='sc-AxjAm sc-fznxsB sc-pjtZy iUwwzD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='26']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='02:00 PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='sc-AxjAm sc-fzqNJr sc-qZrXg LIEwL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='sc-AxjAm sc-fzqNJr dziLj']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Vijay");;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("09-10-1987");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Skip']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed without Number']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='X']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9686714453");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='CONFIRM CONSULTATION']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='sc-AxjAm sc-fznxsB cJDFRB']")).click();
		Thread.sleep(2000);
	
	
	}
	


	@AfterTest
	public void endTest() throws InterruptedException {
		closeDriver();
	
	}
}