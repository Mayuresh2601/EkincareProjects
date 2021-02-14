package com.ekincare.selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OrderMedecineCheckBox extends Base{
	

	@BeforeTest
	public void startTest() {
		
		driver = new ChromeDriver();
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
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/div[4]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fileProgressd7399f3135aba12b7606b730d0850c2c0\"]/div/div[2]/button")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div[2]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input")).sendKeys("Test");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[4]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[5]/span[2]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div[2]/div/div[2]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[5]/input")).sendKeys("9876789765");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
		Thread.sleep(5000);
		
		String actual = driver.getTitle();
		
		Assert.assertEquals(actual, "ekincare - health benefits");
		
	}
	
	@AfterTest
	public void endTest() throws InterruptedException {
	Thread.sleep(6000);
	
	driver.close();
	
	
}
	
	

}
