package com.ekincare.selenium.health;



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
public class MedicalReports extends Base{
	
	
	@BeforeMethod
	public void startTest() {
		
		initializeDriver();
	}
	
	@Test(priority=43)
	public void healthMRSelf() throws InterruptedException {
		
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Health")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[2]/div[2]/div/div[2]/div/div/div/div[1]/div[1]/a[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		WebElement u = driver.findElement(By.xpath("//input[@type='file']"));
		u.sendKeys("C:\\Dr.Divya_27-08-2019-18_13.pdf");
		Thread.sleep(2000);
		driver.findElement(By.linkText("VIEW")).click();
		
		driver.findElement(By.xpath("//li[@data-item-index='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-item-index='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()='Reports']")).click();
		
		Thread.sleep(2000);
		window = driver.getWindowHandle();
		WebElement dot = driver.findElement(By.xpath("//*[@id=\"drawer-root\"]/div/div[2]/div/div[2]/div/div"));
		dot.click();
		
		WebElement view = driver.findElement(By.xpath("//*[@id=\"drawer-root\"]/div/div[2]/div/div[2]/div/div/div[4]/div[1]"));
		view.click();
		
		Thread.sleep(3000);
		driver.switchTo().window(window);
		Thread.sleep(2000);
		dot.click();
		driver.findElement(By.xpath("//*[@id=\"drawer-root\"]/div/div[2]/div/div[2]/div/div/div[4]/div[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(window);
		driver.findElement(By.xpath("//h2[text()='Notes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"drawer-root\"]/div/div[2]/div/div[1]/div[1]/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Less")).click();
		
	}
	
	
	@Test(priority=44)
	public void healthMRSelfDelete() throws InterruptedException {
		
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Health")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[2]/div[2]/div/div[2]/div/div/div/div[1]/div[1]/a[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		WebElement u = driver.findElement(By.xpath("//input[@type='file']"));
		u.sendKeys("C:\\Dr.Divya_27-08-2019-18_13.pdf");
		Thread.sleep(2000);
		driver.findElement(By.linkText("DELETE")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=45)
	public void healthMRFamily() throws InterruptedException {
		
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Health")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[2]/div[2]/div/div[2]/div/div/div/div[1]/div[1]/a[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		List<WebElement> plus = driver.findElements(By.xpath("//input[@type='file']"));
		WebElement e1 = plus.get(1);
		Thread.sleep(2000);
		System.out.println(plus.size());
		e1.sendKeys("C:\\Dr.Divya_27-08-2019-18_13.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fileProgressd71d63d5f99ff2c338e3da1aa33be00c0\"]/div/div[2]/span[2]/div/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-item-index='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-item-index='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()='Reports']")).click();
		Thread.sleep(2000);
		window = driver.getWindowHandle();
		WebElement dot = driver.findElement(By.xpath("//*[@id=\"drawer-root\"]/div/div[2]/div/div[2]/div/div"));
		dot.click();
		
		WebElement view = driver.findElement(By.xpath("//*[@id=\"drawer-root\"]/div/div[2]/div/div[2]/div/div/div[4]/div[1]"));
		view.click();
		
		Thread.sleep(3000);
		driver.switchTo().window(window);
		Thread.sleep(2000);
		dot.click();
		driver.findElement(By.xpath("//*[@id=\"drawer-root\"]/div/div[2]/div/div[2]/div/div/div[4]/div[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(window);
		driver.findElement(By.xpath("//h2[text()='Notes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"drawer-root\"]/div/div[2]/div/div[1]/div[1]/img")).click();
		Thread.sleep(2000);
		
	}	
	
	@Test(priority=46)
	public void healthMRFamilyDelete() throws InterruptedException {
		
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Health")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[2]/div[2]/div/div[2]/div/div/div/div[1]/div[1]/a[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		List<WebElement> plus = driver.findElements(By.xpath("//input[@type='file']"));
		WebElement e1 = plus.get(1);
		Thread.sleep(2000);
		System.out.println(plus.size());
		e1.sendKeys("C:\\Dr.Divya_27-08-2019-18_13.pdf");
		Thread.sleep(2000);
		driver.findElement(By.linkText("DELETE")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(2000);
	
	
	}
	
	@AfterMethod
	public void endTest() throws InterruptedException {
		Thread.sleep(2000);
		closeDriver();
	
	}


	
}
