package com.ekincare.selenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Login extends Base {
	
//	public static WebDriver driver;
	
	@BeforeTest
	public void startTest() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	//valid username and valid password
	@Test(priority=3)
	public void Validcred() {
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
//		System.out.println(driver.getTitle());
		String expectedres= "ekincare - health benefits";
		String actualres=driver.getTitle();
		assertEquals(actualres, expectedres);
	}
	 
	//valid username invalid password
//	@Test(priority=2)
	public void LoginInvalidpwd() throws InterruptedException {
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
		driver.findElement(By.name("password")).sendKeys("ekincare");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(5000);
	}
	
	//invalid username valid password
//		@Test(priority=1)
		public void LoginInvaliduser() throws InterruptedException {
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ash@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(5000);
		}
	
	//invalid username invalid password
//		@Test(priority=0)
		public void LoginInvaliduserpwd() throws InterruptedException {
					
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashw@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare1");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(5000);
	}
			
	
	
	@AfterTest
	public void endTest() throws InterruptedException {
		
		Thread.sleep(10000);
		driver.close();
	}
}
