package com.ekincare.selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OrderMedUploadCheckBox extends Base{
	
	@BeforeTest
	public void startTest() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void ordermedicine() throws InterruptedException {
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Order Medicines")).click();
		Thread.sleep(3000);
		
		WebElement u = driver.findElement(By.xpath("//input[@type='file']"));
		u.sendKeys("C:\\Dr.Divya_27-08-2019-18_13.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[5]/input")).sendKeys("7778987654");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
	
	
	}
	@AfterTest
	public void endTest() throws InterruptedException {
	Thread.sleep(6000);
	
	driver.close();
	
	
}

}
