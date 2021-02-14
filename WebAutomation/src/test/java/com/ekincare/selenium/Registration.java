package com.ekincare.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.linkText("Create an account")).click();
		Thread.sleep(2000);
		
//		WebElement EmailID= driver.findElement(By.name("email"));
//		EmailID.sendKeys("raksha1@yopmail.com");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("rakshaupase@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//footer/button")).click();
		Thread.sleep(4000);
		WebElement name = driver.findElement(By.xpath("//input[@type='text' and @placeholder='John Doe']"));
		name.sendKeys("shree");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//footer//button")).click();
		WebElement otp= driver.findElement(By.xpath("//input[@type='text' and @placeholder='Enter OTP']"));
		otp.sendKeys("337201");
		WebElement Pwd=driver.findElement(By.xpath("//input[@type='password' and  @name='password']"));
		Pwd.sendKeys("mayur123");
		WebElement ConfirmPwd=driver.findElement(By.xpath("//input[@type='password' and  @name='confirmPassword']"));
		ConfirmPwd.sendKeys("mayur123");
		
		
		OTP o = new OTP();
		o.handleOTP();
	}
	

   
    
}
