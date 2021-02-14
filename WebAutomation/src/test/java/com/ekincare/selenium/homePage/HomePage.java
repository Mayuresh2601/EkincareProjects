package com.ekincare.selenium.homePage;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ekincare.selenium.Base;
import com.ekincare.selenium.extentreport.CustomListner;

@Listeners(CustomListner.class)
public class HomePage extends Base {
	
	@BeforeMethod
	public void startTest() {
		
		initializeDriver();
	}
	
//	@Test(priority=0)
	public void talkWithDoctor() throws InterruptedException, AWTException {
		
		System.out.println("TalkWithFamilyDocSchedule");
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Talk with Family Doctor")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div[2]/div/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@color='green']/parent::div/following-sibling::div/following-sibling::div/following-sibling::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='01:30 PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9686714453");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='CONFIRM CONSULTATION']")).click();
		Thread.sleep(2000);

}
	
//	@Test(priority=1)
	public void HealthCheckups() throws InterruptedException {
		
		System.out.println("Health checkups for self");
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Health Checkups")).click();
		
		driver.findElement(By.xpath("//button[text()='Select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Detect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='24']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='11-12 AM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("6362323567");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(5000);
			
	}
	
//	@Test(priority=2)
	public void orderMedicinepastuploadself() throws InterruptedException, AWTException {
		
		
		System.out.println("OrderMedicinePastUploadPrescriptionSelfWithoutAddress");
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Order Medicines")).click();
		driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='Add Prescriptions']"));
		Thread.sleep(2000);
		WebElement u = driver.findElement(By.xpath("//input[@type='file']"));
		u.sendKeys("C:\\Dr.Divya_27-08-2019-18_13.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add Address']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input")).sendKeys("Shree");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Home']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[5]/span[2]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='SELECT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9876789865");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
		Thread.sleep(2000);
	}
	
//	@Test(priority=3)
	public void orderMedicinepastuploadselfDeleteAddress() throws InterruptedException, AWTException {
		
		
		System.out.println("OrderMedicinePastUploadPrescriptionSelfDeleteAddress");
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Order Medicines")).click();
		driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h6[text()='Add Prescriptions']"));
		Thread.sleep(2000);
		WebElement u = driver.findElement(By.xpath("//input[@type='file']"));
		u.sendKeys("C:\\Dr.Divya_27-08-2019-18_13.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Change")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("DELETE")).click();
		Thread.sleep(2000);
	
	}
	
	
//	@Test(priority=4)
	public void dentalCheckups() throws InterruptedException {
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Dental Checkups")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Detect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='23']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='11-12 AM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("1234567889");;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(10000);
	
	
	
	
	
	}
	
	@Test(priority=5)
	public void Visioncheckups() throws InterruptedException {
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.linkText("Vision Checkups")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Detect']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='24']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='12-01 PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9984567889");;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(10000);
	
	}
	

	@AfterMethod
	public void endTest() throws InterruptedException {
		closeDriver();
	
	}
	
}
