package com.ekincare.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewUser extends Base {
	
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
		driver.findElement(By.name("mobile")).sendKeys("testFeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Get Started")).click();
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='sc-AxjAm sc-pHIBf jMCshk']"));
		WebElement girlpic = elements.get(1);
		girlpic.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("2000-2-2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("140");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='weight']")).sendKeys("50");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='waist']")).sendKeys("32");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@data-position='2']")).click();
		Thread.sleep(500);
		List<WebElement> ele1 = driver.findElements(By.xpath("//button[contains(@class,'sc-AxjAm sc-AxmLO bcnbrW sc-oUOMp cElNTS') and text()='Never']"));
		WebElement e1 = ele1.get(0);
		e1.click();
		Thread.sleep(500);
		WebElement e2 = ele1.get(1);
		e2.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		
		List<WebElement> ele2 = driver.findElements(By.xpath("//button[@class='sc-AxjAm sc-AxmLO bcnbrW sc-oUOMp cElNTS' and text()='No Condition']"));
		WebElement el1 = ele2.get(0);
		el1.click();
		Thread.sleep(500);
		WebElement el2 = ele2.get(1);
		el2.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("120");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='diastolic']")).sendKeys("80");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='fasting_blood_sugar']")).sendKeys("80");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(2000);
		List<WebElement> yesList1 = driver.findElements(By.xpath("//button[@class='sc-AxjAm sc-AxmLO bcnbrW sc-oUOMp cElNTS' and text()='Yes']"));
		List<WebElement> noList1 = driver.findElements(By.xpath("//button[@class='sc-AxjAm sc-AxmLO bcnbrW sc-oUOMp cElNTS' and text()='No']"));
		WebElement no1 = noList1.get(0);
		no1.click();
		Thread.sleep(500);
		WebElement no2 = noList1.get(1);
		no2.click();
		Thread.sleep(500);
		WebElement yes1 = yesList1.get(2);
		yes1.click();
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='anxiety']/div[2]/button[1]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@id='nervous_breakdown']/div[2]/button[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='stress_eating']/div[2]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='whole_grains']/div[2]/button[4]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='fruits_and_vegetables']/div[2]/button[4]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='fried_foods_and_refined_carbohydrates']/div[2]/button[3]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(500);
			
	}
	
	@AfterTest
	public void endTest() throws InterruptedException {
	Thread.sleep(6000);
	
	driver.close();
	
	
}

}
