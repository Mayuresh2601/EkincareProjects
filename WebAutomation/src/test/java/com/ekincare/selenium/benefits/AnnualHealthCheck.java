package com.ekincare.selenium.benefits;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ekincare.selenium.Base;
import com.ekincare.selenium.extentreport.CustomListner;

@Listeners(CustomListner.class)
public class AnnualHealthCheck extends Base{
	
	@BeforeMethod
	public void startTest() {
		
		initializeDriver();
	}
	
	
	@Test(priority=6)
	public void selfBenefits() throws InterruptedException, AWTException {
		
		System.out.println("AnnualHealthcheckupsForSelf");
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[1]/a[1]/div[2]/div[1]")).click();
		
		Robot r = new Robot();
		r.mouseMove(1600, 400);
		
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(text(),'Book customized')]/following-sibling::button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Self']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//button[text()='Add']"));
		WebElement add = elements.get(3);
		add.click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Detect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='16']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='01-02 PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("1234567889");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='sc-fznMAR gSVBBi']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(10000);
		
	
	
	}
	

	
	@Test(priority=7)
	public void FamilyselfBenefits() throws InterruptedException, AWTException {
		
		System.out.println("AnnualHealthCheckupsForSelfandfamily");
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[1]/a[1]/div[2]/div[1]")).click();
		
		Robot r = new Robot();
		r.mouseMove(1600, 400);
		
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(text(),'Book customized')]/following-sibling::button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Self']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//button[text()='Add']"));
		WebElement add = elements.get(3);
		add.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Detect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='16']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='10-11 AM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9876554321");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='sc-fzXfNh cnQLcv']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(5000);
	
	}
	
	@Test(priority=8)
	public void FamilyBenefits() throws InterruptedException, AWTException {
		
		System.out.println("AnnualHealthCheckupsForSelfandfamily");
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[1]/a[1]/div[2]/div[1]")).click();
		
		Robot r = new Robot();
		r.mouseMove(1600, 400);
		
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(text(),'Book customized')]/following-sibling::button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Family Member']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/div[2]/div/div/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//button[text()='Add']"));
		WebElement add = elements.get(3);
		add.click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Detect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='16']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='09-10 AM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("1234567889");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='sc-fznMAR gSVBBi']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(10000);
	
	}
	
	@AfterMethod
	public void endTest() throws InterruptedException {
		closeDriver();
	
	}
	

}
