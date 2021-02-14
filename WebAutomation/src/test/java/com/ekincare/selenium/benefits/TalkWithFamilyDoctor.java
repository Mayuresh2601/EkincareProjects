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
public class TalkWithFamilyDoctor extends Base{
	
	@BeforeMethod
	public void startTest() {
		
		initializeDriver();
	}
	
	@Test(priority=38)
	public void scheduleReschedule() throws InterruptedException, AWTException {
		
		System.out.println("TalkWithFamilyDocScheduleandReschudle");
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
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
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div[2]/div/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@color='green']/parent::div/following-sibling::div/following-sibling::div/following-sibling::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='10:30 AM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9686714453");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='CONFIRM CONSULTATION']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='RESCHEDULE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@color='green']/parent::div/following-sibling::div/following-sibling::div/following-sibling::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='06:00 PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9686714453");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='CONFIRM CONSULTATION']")).click();
		Thread.sleep(5000);
	
	}
	
	
	@Test(priority=39)
	public void scheduleCancel() throws InterruptedException, AWTException {
		
		System.out.println("TalkWithFamilyDocScheduleandCancel");
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
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
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div[2]/div/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@color='green']/parent::div/following-sibling::div/following-sibling::div/following-sibling::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='12:30 PM']")).click();
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
	

	@Test(priority=40)
	public void scheduleplusReschudleplusCancel() throws InterruptedException, AWTException {
		
		System.out.println("TalkWithFamilyDoctorReschudleandCancel");
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
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
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div[2]/div/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@color='green']/parent::div/following-sibling::div/following-sibling::div/following-sibling::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='04:00 PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9686714453");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='CONFIRM CONSULTATION']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/img")).click();
		Thread.sleep(15000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sc-fzXfQV dKNWDa' and text()='Notifications']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='test, your consultation is confirmed!']")).click();
		Thread.sleep(2000);
		

		Robot r2 = new Robot();
		r2.mouseMove(1600, 400);
		
		r2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='RESCHEDULE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@color='green']/parent::div/following-sibling::div/following-sibling::div/following-sibling::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='07:30 PM']")).click();
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

	
	
	@Test(priority=41)
	public void WithFamilymemberschedule() throws InterruptedException, AWTException {
		
		System.out.println("TalkwithfamilyDoctorWithFamilyMemberSchedule");
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
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
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div[2]/div/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@color='green']/parent::div/following-sibling::div/following-sibling::div/following-sibling::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='02:00 PM']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//h6[text()='Add Family']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='Priya '] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Vijay");;
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Next']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("09-10-1987");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Next']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Skip']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Proceed without Number']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//h6[text()='X']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9686714453");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='CONFIRM CONSULTATION']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='sc-AykKC sc-fzXfMz fGgIyo']")).click();
		Thread.sleep(2000);
	
	
	}
	
	
	
	@AfterMethod
	public void endTest() throws InterruptedException {
		closeDriver();
	
	}
	

}
