package com.ekincare.selenium;


import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomerProfile extends Base{
	
	 @BeforeTest
		public void startTest() {
			
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			
		}
		
	 @Test
	 public void CustomerProf() {
		 try {
			driver.get("https://app-test.ekincare.com/login");
				driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
				driver.findElement(By.name("password")).sendKeys("ekincare123");
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
				Thread.sleep(12000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[3]/div[2]/div/img")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[3]/div[2]/div/div/div[2]/p")).click();
				driver.findElement(By.xpath("//input[@data-testid='radio-3']//parent::label")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div[3]/button")).click();
				Thread.sleep(5000);
				driver.switchTo().frame(0);
				driver.findElement(By.id("contact")).sendKeys("6362323519");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@id='offers-container']/following-sibling::button")).click();
				Thread.sleep(800);
//			driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//*[@id=\"form-common\"]/div/div[1]/div[3]/div/div/div[2]/div/button[2]/div/div/div[1]")).click();
				Thread.sleep(800);
				driver.findElement(By.xpath("//*[@id=\"bank-item-HDFC\"]/label")).click();
				Thread.sleep(800);
				driver.findElement(By.xpath("//*[@id=\"footer\"]")).click();
				Thread.sleep(1000);
				
				String win = driver.getWindowHandle();
				driver.switchTo().window(win);
				
				WebElement s = driver.findElement(By.xpath("//button"));
				Actions action = new Actions(driver);
				action.moveToElement(s);

				

				action.click().perform();
//			Thread.sleep(500);
//			s.click();
//			Thread.sleep(500);
//			s.click();
//			driver.findElement(By.xpath("//span[@class='link']")).click();
//			driver.switchTo().window(win);
//			driver.findElement(By.xpath("//button")).click();
				Thread.sleep(4000);
//			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	 }
	 
	

	
}
