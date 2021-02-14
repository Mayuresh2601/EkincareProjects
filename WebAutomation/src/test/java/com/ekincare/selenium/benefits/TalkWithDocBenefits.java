package com.ekincare.selenium.benefits;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ekincare.selenium.Base;
import com.ekincare.selenium.extentreport.CustomListner;

@Listeners(CustomListner.class)
public class TalkWithDocBenefits extends Base {
	
	@BeforeMethod
	public void startTest() {
		
		initializeDriver();
	}
	
	
	//Talk with doc without family from benefits
	
	@Test(priority=33)
    public void TalkwithDoc() throws InterruptedException, AWTException {
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24120@yopmail.com");
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
		driver.findElement(By.xpath("//input[@class='sc-AykKC sc-fzXfLP cKdQOg']")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='TALK WITH DOCTOR']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//p[text()='CANCEL REQUEST']")).click();
		Thread.sleep(2000);
		
	}
    
	@Test(priority=34)
    public void TalkwithDocWithFamilyMember() throws InterruptedException, AWTException {
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24120@yopmail.com");
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
		driver.findElement(By.xpath("//p[text()='Select member']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='Anu ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='SELECT MEMBER']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='sc-AykKC sc-fzXfLP cKdQOg']")).sendKeys("Headache");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='TALK WITH DOCTOR']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//p[text()='CANCEL REQUEST']")).click();
		Thread.sleep(2000);
		
	}
	
//	talk with doc with family from benefits
	
    @Test(priority=35)
    public void TalkwithDocwithAddFamilyMember() throws InterruptedException, AWTException {
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24120@yopmail.com");
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
		driver.findElement(By.xpath("//p[text()='Change']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='Add Family']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='Brother']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Tanu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("01-2-1960");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9691158277");
		Thread.sleep(2000);
		WebElement register=driver.findElement(By.xpath("//button[text()='Register']"));
		register.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='X']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//h6[text()='Tanu ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='SELECT MEMBER']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='sc-AykKC sc-fzXfLP cKdQOg']")).sendKeys("fever");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='TALK WITH DOCTOR']")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//p[text()='CANCEL REQUEST']")).click();
		Thread.sleep(2000);
		
		
	}
	
	//Talk with doc without family from home page
    
    @Test(priority=36)
    public void TalkwithDocwithouFamilyHomepage() throws InterruptedException, AWTException {
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("testfeb24120@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Talk With Doctor")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Cough and Cold']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='TALK WITH DOCTOR']")).click();
		Thread.sleep(40000);
		driver.findElement(By.xpath("//p[text()='CANCEL REQUEST']")).click();
		Thread.sleep(2000);
		
    }	
    
    //Talk with doc with family from home page
    
    @Test(priority=37)
    public void TalkwithDocwithFamilyHomepage() throws InterruptedException, AWTException {
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24120@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Talk With Doctor")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[text()='Aches and pain']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='TALK WITH DOCTOR']")).click();
		Thread.sleep(40000);
		driver.findElement(By.xpath("//p[text()='CANCEL REQUEST']")).click();
		Thread.sleep(2000);
		
		
    
}
    
    @AfterMethod
	public void endTest() throws InterruptedException {
		closeDriver();
	
	}
	
}
