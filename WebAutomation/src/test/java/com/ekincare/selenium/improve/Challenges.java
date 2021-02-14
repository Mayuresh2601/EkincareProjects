package com.ekincare.selenium.improve;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ekincare.selenium.Base;
import com.ekincare.selenium.extentreport.CustomListner;

@Listeners(CustomListner.class)
public class Challenges extends Base{
	

	@BeforeMethod
	public void startTest() {
		
		initializeDriver();
	}
	
	@Test(priority = 47)
	public void improve() throws InterruptedException {
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[4]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[4]/div[2]/div/div[2]/div/div/div/div/div[1]/a[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Start Challenge")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Yes")).click();
		Thread.sleep(2000);

		
		driver.navigate().back();
		
		
	}
	
	@Test(priority = 48)
	public void improveStop() throws InterruptedException {
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[4]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[4]/div[2]/div/div[2]/div/div/div/div/div[1]/a[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Start Challenge")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Yes")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Stop']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
	}
	@Test(priority = 49)
	public void improveRestart() throws InterruptedException {
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[4]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[4]/div[2]/div/div[2]/div/div/div/div/div[1]/a[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Start Challenge")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Yes")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Restart']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	
	@AfterMethod
	public void endTest() throws InterruptedException {
		closeDriver();
	
	}
}
