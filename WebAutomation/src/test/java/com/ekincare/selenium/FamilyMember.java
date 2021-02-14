package com.ekincare.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class FamilyMember extends Base {
	
	@BeforeMethod
	public void startTest() {
		
		initializeDriver();
	}
	
	
//	@Test (priority = 0)
	public void familymember() throws InterruptedException {
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[3]/div[2]/div/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[3]/div[2]/div/div/div[3]/p")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("+ Add Family Member")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div/div[6]/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Rahul");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("25-8-2000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed without Number']")).click();
		Thread.sleep(2000);

		
	
	}
	
	@Test (priority = 1)
	public void family() throws InterruptedException {
	
	driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
	driver.findElement(By.name("password")).sendKeys("ekincare123");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//	driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
	Thread.sleep(12000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[3]/div[2]/div/img")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[3]/div[2]/div/div/div[3]/p")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("+ Add Family Member")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div/div[7]/div/div[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("firstName")).sendKeys("shree");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='date']")).sendKeys("20-9-1990");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div/div/input")).sendKeys("6362423799");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div/div/div[2]/button[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//h6[text()='X']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Get Started']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("140");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='weight']")).sendKeys("50");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='waist']")).sendKeys("32");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div[3]/button[2]")).click();
	Thread.sleep(2000);
	
//	driver.findElement(By.xpath("//button[@data-position='2']")).click();
//	Thread.sleep(500);
//	List<WebElement> ele1 = driver.findElements(By.xpath("//button[contains(@class,'sc-AxjAm sc-AxmLO bcnbrW sc-oUOMp cElNTS') and text()='Never']"));
//	WebElement e1 = ele1.get(0);
//	e1.click();
//	Thread.sleep(500);
//	WebElement e2 = ele1.get(1);
//	e2.click();
//	Thread.sleep(500);
//	driver.findElement(By.xpath("//button[text()='Next']")).click();
//	
//	List<WebElement> ele2 = driver.findElements(By.xpath("//button[@class='sc-AxjAm sc-AxmLO bcnbrW sc-oUOMp cElNTS' and text()='No Condition']"));
//	WebElement el1 = ele2.get(0);
//	el1.click();
//	Thread.sleep(500);
//	WebElement el2 = ele2.get(1);
//	el2.click();
//	Thread.sleep(500);
//	driver.findElement(By.xpath("//button[text()='Next']")).click();
//	Thread.sleep(500);
//	driver.findElement(By.xpath("//button[text()='Next']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("120");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='diastolic']")).sendKeys("80");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='fasting_blood_sugar']")).sendKeys("80");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[text()='Next']")).click();
//	Thread.sleep(2000);
//	List<WebElement> yesList1 = driver.findElements(By.xpath("//button[@class='sc-AxjAm sc-AxmLO bcnbrW sc-oUOMp cElNTS' and text()='Yes']"));
//	List<WebElement> noList1 = driver.findElements(By.xpath("//button[@class='sc-AxjAm sc-AxmLO bcnbrW sc-oUOMp cElNTS' and text()='No']"));
//	WebElement no1 = noList1.get(0);
//	no1.click();
//	Thread.sleep(500);
//	WebElement no2 = noList1.get(1);
//	no2.click();
//	Thread.sleep(500);
//	WebElement yes1 = yesList1.get(2);
//	yes1.click();
//	driver.findElement(By.xpath("//button[text()='Next']")).click();
//	
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[@id='anxiety']/div[2]/button[1]")).click();
//	Thread.sleep(500);
//	
//	driver.findElement(By.xpath("//div[@id='nervous_breakdown']/div[2]/button[2]")).click();
//	Thread.sleep(500);
//	driver.findElement(By.xpath("//div[@id='stress_eating']/div[2]/button[1]")).click();
//	Thread.sleep(500);
//	driver.findElement(By.xpath("//button[text()='Next']")).click();
//	Thread.sleep(500);
//	driver.findElement(By.xpath("//div[@id='whole_grains']/div[2]/button[4]")).click();
//	Thread.sleep(500);
//	driver.findElement(By.xpath("//div[@id='fruits_and_vegetables']/div[2]/button[4]")).click();
//	Thread.sleep(500);
//	driver.findElement(By.xpath("//div[@id='fried_foods_and_refined_carbohydrates']/div[2]/button[3]")).click();
//	Thread.sleep(500);
//	driver.findElement(By.xpath("//button[text()='Next']")).click();
//	Thread.sleep(500);
		

	}

	@AfterMethod
	public void endTest() throws InterruptedException {
		closeDriver();
	
	}
	
}
