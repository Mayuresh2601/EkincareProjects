package com.ekincare.selenium.benefits;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ekincare.selenium.Base;
import com.ekincare.selenium.extentreport.CustomListner;

@Listeners(CustomListner.class)
public class OrderMedicine extends Base {
	
	@BeforeMethod
	public void startTest() {
		
		initializeDriver();
	}
	
	@Test(priority=10)
	public void pastuploadself() throws InterruptedException, AWTException {
		
		
		System.out.println("PastUploadPrescriptionSelfWithoutAddress");
		
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123456");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
		
		
		Robot r = new Robot();
		r.mouseMove(1600, 400);
		
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
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
		driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9876799865");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
		Thread.sleep(2000);
	}
	
	
	
		@Test(priority=11)
		public void pastuploadselfwithaddress() throws InterruptedException, AWTException {
			
			System.out.println("PastUploadPrescriptonSelfWithAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
			
			
			Robot r = new Robot();
			r.mouseMove(1600, 400);
			
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9876789865");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(20000);
			
		}
		
		
		
		@Test(priority=12)
				public void pastuploadselfeditaddress() throws InterruptedException, AWTException {
					
					System.out.println("PastUploadPrescriptionSelfEditAddress");
					
					driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
					driver.findElement(By.name("password")).sendKeys("ekincare123456");
					driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//					driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
					Thread.sleep(12000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
					
					
					Robot r = new Robot();
					r.mouseMove(1600, 400);
					
					r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
					Thread.sleep(5000);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='Add']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='Continue']")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("Change")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("EDIT")).click();
					Thread.sleep(2000);
					WebElement home= driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input"));
					home.clear();
					home.sendKeys("raksha");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[5]/span[2]/div/button")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='SELECT']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9876789865");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
					Thread.sleep(20000);
					
				}
				
				@Test(priority=13)
				public void pastuploadselfDeleteplusAddaddress() throws InterruptedException, AWTException {
							
					System.out.println("PastUploadPrescriptionSelfDeleteAddress");
					
					driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
					driver.findElement(By.name("password")).sendKeys("ekincare123456");
					driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//					driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
					Thread.sleep(12000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
							
							
					Robot r = new Robot();
					r.mouseMove(1600, 400);
							
					r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
					Thread.sleep(5000);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='Add']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='Continue']")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("Change")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("DELETE")).click();
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div[2]/div/button")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/button")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input")).sendKeys("Shr");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='Home']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[5]/span[2]/div/button")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='SELECT']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9876798865");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
					Thread.sleep(2000);
		}
	
		@Test(priority=14)
		public void pastuploadselfdeleteaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadPrescriptionSelfDeleteAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
					
					
			Robot r = new Robot();
			r.mouseMove(1600, 400);
					
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
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
				
				
		
		@Test(priority=15)
		public void pastuploadFamilywithoutaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadedFamilyWithoutAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
					
					
			Robot r = new Robot();
			r.mouseMove(1600, 400);
					
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"fileProgress9bc5b4980108346c39b898f99e333c230\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Address']")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input")).sendKeys("Sh56");
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
			Thread.sleep(20000);
			
			
}		
		
		
		@Test(priority=16)
		public void pastuploadFamilywithaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadedFamilyWithAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
					
					
			Robot r = new Robot();
			r.mouseMove(1600, 400);
					
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"fileProgress9bc5b4980108346c39b898f99e333c230\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9826789865");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(20000);
			
			
				
		}
		
		
		@Test(priority=17)
		public void pastuploadFamilyEditaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadedFamilyEditAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
					
					
			Robot r = new Robot();
			r.mouseMove(1600, 400);
					
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"fileProgress9bc5b4980108346c39b898f99e333c230\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Change")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("EDIT")).click();
			Thread.sleep(2000);
			WebElement home= driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input"));
			home.clear();
			home.sendKeys("ra34");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[5]/span[2]/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='SELECT']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9876789865");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(20000);	
		
		}	
		
		
		@Test(priority=18)
		public void pastuploadFamilyDeletePlusAddaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadedFamilyDeleteAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
					
					
			Robot r = new Robot();
			r.mouseMove(1600, 400);
					
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"fileProgress9bc5b4980108346c39b898f99e333c230\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Change")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("DELETE")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Address']")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input")).sendKeys("Sh56");
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
			Thread.sleep(20000);
			
			
		}			
				
		@Test(priority=19)
		public void pastuploadFamilydeleteaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadedFamilyDeleteAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
					
					
			Robot r = new Robot();
			r.mouseMove(1600, 400);
					
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"fileProgress9bc5b4980108346c39b898f99e333c230\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Change")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("DELETE")).click();
			Thread.sleep(2000);
			
			
		}			
		
		
		
		@Test(priority=20)
		public void pastuploadSelfFamilywithoutaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadPrescriptionSelfFamilyWithoutAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
					
					
			Robot r = new Robot();
			r.mouseMove(1600, 400);
					
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"fileProgress9bc5b4980108346c39b898f99e333c230\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div[2]/div/button")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input")).sendKeys("rw6");
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
			Thread.sleep(20000);
			
		}	
	
		
		@Test(priority=21)
		public void pastuploadSelfFamilywithaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadPrescriptionSelfFamilyWithAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
					
					
			Robot r = new Robot();
			r.mouseMove(1600, 400);
					
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"fileProgress9bc5b4980108346c39b898f99e333c230\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9826789865");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(20000);
			
		
		}
		
		@Test(priority=22)
		public void pastuploadSelfFamilyDeletePlusAddaddress() throws InterruptedException, AWTException {
			
			System.out.println("PastUploadPrescriptionSelfFamilyDeleteAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
					
					
			Robot r = new Robot();
			r.mouseMove(1600, 400);
					
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"fileProgress9bc5b4980108346c39b898f99e333c230\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Change")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("DELETE")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div[2]/div/button")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input")).sendKeys("ru6");
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
			Thread.sleep(20000);
			
		
		}	
		
		
		
		
		@Test(priority=23)
		public void pastuploadSelfFamilydeleteaddress() throws InterruptedException, AWTException {
			
			System.out.println("PastUploadPrescriptionSelfFamilyDeleteAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
					
					
			Robot r = new Robot();
			r.mouseMove(1600, 400);
					
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Past Uploaded Prescriptions']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"fileProgress9bc5b4980108346c39b898f99e333c230\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Change")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("DELETE")).click();
			Thread.sleep(2000);
			
			
		
		}	
		
		
		@Test(priority=24)
		public void ordermedicinenamewithoutaddress() throws InterruptedException, AWTException {
			
			System.out.println("OrderMedicineNameWithoutAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
			
			
			Robot r = new Robot();
			r.mouseMove(1600, 400);
			
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/a")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[1]/div[1]/input")).sendKeys("test");
			Thread.sleep(1000);
			
			WebElement precription = driver.findElement(By.xpath("//*[@id=\"inputNumber\"]"));
			precription.clear();
			precription.sendKeys("10");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[4]/span[2]/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Address']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input")).sendKeys("s3");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Home']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[5]/span[2]/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='SELECT']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[5]/input")).sendKeys("8896545671");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(2000);
		
		
		}
		
		@Test(priority=25)
		public void ordermedicinenamewithaddress() throws InterruptedException, AWTException {
			
			System.out.println("OrderMedicineNameWithAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
			
			
			Robot r = new Robot();
			r.mouseMove(1600, 400);
			
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/a")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[1]/div[1]/input")).sendKeys("test");
			Thread.sleep(1000);
			
			WebElement precription = driver.findElement(By.xpath("//*[@id=\"inputNumber\"]"));
			precription.clear();
			precription.sendKeys("10");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[4]/span[2]/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[5]/input")).sendKeys("8896545671");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(2000);
			
		}
		
		
		@Test(priority=26)
		public void ordermedicinenameEditaddress() throws InterruptedException, AWTException {
			
			System.out.println("OrderMedicineNameEditAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
			
			
			Robot r = new Robot();
			r.mouseMove(1600, 400);
			
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/a")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[1]/div[1]/input")).sendKeys("test");
			Thread.sleep(1000);
			
			WebElement precription = driver.findElement(By.xpath("//*[@id=\"inputNumber\"]"));
			precription.clear();
			precription.sendKeys("10");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[4]/span[2]/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Change")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("EDIT")).click();
			Thread.sleep(2000);
			WebElement home= driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input"));
			home.clear();
			home.sendKeys("abc4");
//			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input")).sendKeys("abc4");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[5]/span[2]/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='SELECT']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[5]/input")).sendKeys("8896545671");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(2000);
			
		}
		
		@Test(priority=27)
		public void ordermedicinenameDeletePlusAddAddress() throws InterruptedException, AWTException {
			
			System.out.println("OrderMedicineNameDeleteAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
			
			
			Robot r = new Robot();
			r.mouseMove(1600, 400);
			
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/a")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[1]/div[1]/input")).sendKeys("test");
			Thread.sleep(1000);
			
			WebElement precription = driver.findElement(By.xpath("//*[@id=\"inputNumber\"]"));
			precription.clear();
			precription.sendKeys("10");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[4]/span[2]/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Change")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("DELETE")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Address']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input")).sendKeys("s8");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Home']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[5]/span[2]/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='SELECT']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[5]/input")).sendKeys("8896545671");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(2000);
			
		}
		
		
		@Test(priority=28)
		public void ordermedicinenameDeleteAddress() throws InterruptedException, AWTException {
			
			System.out.println("OrderMedicineNameDeleteAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
			
			
			Robot r = new Robot();
			r.mouseMove(1600, 400);
			
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/a")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[1]/div[1]/input")).sendKeys("test");
			Thread.sleep(1000);
			
			WebElement precription = driver.findElement(By.xpath("//*[@id=\"inputNumber\"]"));
			precription.clear();
			precription.sendKeys("10");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[4]/span[2]/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Change")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("DELETE")).click();
			Thread.sleep(2000);
			
			
		}
		
		
		@Test(priority=29)
		public void uploadmedicinewithoutaddress() throws InterruptedException, AWTException {
			
			System.out.println("UploadWithoutAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
			
			
			Robot r = new Robot();
			r.mouseMove(1600, 400);
			
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			
			WebElement u = driver.findElement(By.xpath("//input[@type='file']"));
			u.sendKeys("C:\\Dr.Divya_27-08-2019-18_13.pdf");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Address']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input")).sendKeys("shree3");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Home']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[5]/span[2]/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='SELECT']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[5]/input")).sendKeys("8896545671");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(2000);
			
		}
		
		
		
		@Test(priority=30)
		public void uploadmedicinewithaddress() throws InterruptedException, AWTException {
			
			System.out.println("UploadWithAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
			
			
			Robot r = new Robot();
			r.mouseMove(1600, 400);
			
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			Thread.sleep(2000);
			
			WebElement u = driver.findElement(By.xpath("//input[@type='file']"));
			u.sendKeys("C:\\Dr.Divya_27-08-2019-18_13.pdf");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[5]/input")).sendKeys("7778987654");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
		
		}
		
		@Test(priority=31)
		public void uploadmedicineDeleteAddaddress() throws InterruptedException, AWTException {
			
			System.out.println("UploadMedicineDeleteAddAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
//			driver.findElement(By.linkText("Order Medicines")).click();
//			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
			
			Robot r = new Robot();
			r.mouseMove(1600, 400);
			
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			
			WebElement u = driver.findElement(By.xpath("//input[@type='file']"));
			u.sendKeys("C:\\Dr.Divya_27-08-2019-18_13.pdf");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Change")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("DELETE")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Address']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[3]/input")).sendKeys("shree37");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Home']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div[2]/div/div/div[2]/div[5]/span[2]/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='SELECT']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[5]/input")).sendKeys("8896545671");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(2000);
			
			
		}		
		
		@Test(priority=32)
		public void uploadmedicineDeleteaddress() throws InterruptedException, AWTException {
			
			System.out.println("UploadMedicineDeleteAddress");
			
			driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123456");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
//			driver.findElement(By.linkText("Order Medicines")).click();
//			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a[1]/div[2]/div[1]")).click();
			
			Robot r = new Robot();
			r.mouseMove(1600, 400);
			
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(5000);
			
			WebElement u = driver.findElement(By.xpath("//input[@type='file']"));
			u.sendKeys("C:\\Dr.Divya_27-08-2019-18_13.pdf");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Change")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("DELETE")).click();
			Thread.sleep(2000);
			
		}		
	
	
	
	

	@AfterMethod
	public void endTest() throws InterruptedException {
		
		closeDriver();
	}
}
