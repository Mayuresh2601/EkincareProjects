package com.ekincare.selenium;

import java.awt.AWTException;
import java.awt.Button;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.KeyValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Benefits extends Base {
	
	@BeforeTest
	public void startTest() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
	//Benifits Anual health checkups self0
	@Test(priority=0)
	public void selfBenefits() throws InterruptedException, AWTException {
		
		System.out.println("AnnualHealthcheckupsForSelf");
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[1]/a[1]/div[2]/div[1]")).click();
		
		Robot r = new Robot();
		r.mouseMove(1600, 400);
		
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(text(),'Book customized')]/following-sibling::button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Self']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//button[text()='Add']"));
		WebElement add = elements.get(3);
		add.click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sc-AxjAm sc-AxmLO gswsys sc-pkryX dKCOua']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='01']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='08-09 AM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("1234567889");;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(10000);
		
	
	
	}
	
	//Benifits self+Family member1
	
	@Test(priority=1)
	public void FamilyselfBenefits() throws InterruptedException, AWTException {
		
		System.out.println("AnnualHealthCheckupsForSelfandfamily");
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div[2]/div/a[3]/div[2]/div/div[2]/div/div/div/div[1]/div[1]/a[1]/div[2]/div[1]")).click();
		
		Robot r = new Robot();
		r.mouseMove(1600, 400);
		
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(text(),'Book customized')]/following-sibling::button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Self']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//button[text()='Add']"));
		WebElement add = elements.get(3);
		add.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sc-AxjAm sc-AxmLO gswsys sc-pkryX dKCOua']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='01']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='08-09 AM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9876554321");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='sc-fznMAR gSVBBi']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(5000);
	
	}
	
	//past upload prescription self without address2
//	@Test(priority=2)
	public void pastuploadself() throws InterruptedException, AWTException {
		
		
		System.out.println("PastUploadPrescriptionSelfWithoutAddress");
		
		driver.get("https://app-test.ekincare.com/login");
		driver.findElement(By.name("mobile")).sendKeys("testfeb24620@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("ekincare123");
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
		driver.findElement(By.xpath("//button[@class='sc-AxjAm sc-AxmLO gswsys sc-pkryX dKCOua']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='sc-AxjAm sc-fzoLsD sc-pdbHO iLJBzh']")).sendKeys("Shree");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Home']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'cSpJmD')]/button[text()='SAVE ADDRESS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='SELECT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9876789865");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
		Thread.sleep(2000);
	}
	
	
	//past upload prescription selfwith address3
//		@Test(priority=3)
		public void pastuploadselfwithaddress() throws InterruptedException, AWTException {
			
			System.out.println("PastUploadPrescriptonSelfWithAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
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
		
		
		//past upload prescription edit address4
//				@Test(priority=4)
				public void pastuploadselfeditaddress() throws InterruptedException, AWTException {
					
					System.out.println("PastUploadPrescriptionSelfEditAddress");
					
					driver.get("https://app-test.ekincare.com/login");
					driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
					driver.findElement(By.name("password")).sendKeys("ekincare123");
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
					driver.findElement(By.xpath("//div[contains(@class,'cSpJmD')]/button[text()='SAVE ADDRESS']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='SELECT']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9876789865");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
					Thread.sleep(20000);
					
					
					
					
	
		
				}
	//past upload prescription delete address5
//		@Test(priority=5)
		public void pastuploadselfdeleteaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadPrescriptionSelfDeleteAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
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
				
				
	//past uploaded family without address6
		
//		@Test(priority=6)
		public void pastuploadFamilywithoutaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadedFamilyWithoutAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
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
			driver.findElement(By.xpath("//*[@id=\"fileProgressddf37fa3e4ecbbf8d6258da7c04cd8dc0\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Address']")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//button[@class='sc-AxjAm sc-AxmLO gswsys sc-pkryX dKCOua']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='sc-AxjAm sc-fzoLsD sc-pdbHO iLJBzh']")).sendKeys("Sh56");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Home']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(@class,'cSpJmD')]/button[text()='SAVE ADDRESS']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='SELECT']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9876789865");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(20000);
			
			
}		
		
		//past upload Family withaddress7
		
//		@Test(priority=7)
		public void pastuploadFamilywithaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadedFamilyWithAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
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
			driver.findElement(By.xpath("//*[@id=\"fileProgressddf37fa3e4ecbbf8d6258da7c04cd8dc0\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9826789865");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(20000);
			
			
				
		}
		//past upload Family edit address8
		
//		@Test(priority=8)
		public void pastuploadFamilyEditaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadedFamilyEditAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
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
			driver.findElement(By.xpath("//*[@id=\"fileProgressddf37fa3e4ecbbf8d6258da7c04cd8dc0\"]/div/div[2]/button")).click();
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
			driver.findElement(By.xpath("//div[contains(@class,'cSpJmD')]/button[text()='SAVE ADDRESS']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='SELECT']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9876789865");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(20000);	
		
		}	
		//past upload Family delete address9
		
//		@Test(priority=9)
		public void pastuploadFamilydeleteaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadedFamilyDeleteAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
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
			driver.findElement(By.xpath("//*[@id=\"fileProgressddf37fa3e4ecbbf8d6258da7c04cd8dc0\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Change")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("DELETE")).click();
			Thread.sleep(2000);
			
			
		}			
		
		//Past upload self+upload without address10
		
//		@Test(priority=10)
		public void pastuploadSelfFamilywithoutaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadPrescriptionSelfFamilyWithoutAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
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
			driver.findElement(By.xpath("//*[@id=\"fileProgressddf37fa3e4ecbbf8d6258da7c04cd8dc0\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Address']")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//button[@class='sc-AxjAm sc-AxmLO gswsys sc-pkryX dKCOua']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='sc-AxjAm sc-fzoLsD sc-pdbHO iLJBzh']")).sendKeys("rw6");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Home']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(@class,'cSpJmD')]/button[text()='SAVE ADDRESS']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='SELECT']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9876789865");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(20000);
			
		}	
	
		//past upload self+family with address11
		
//		@Test(priority=11)
		public void pastuploadSelfFamilywithaddress() throws InterruptedException, AWTException {
					
			System.out.println("PastUploadPrescriptionSelfFamilyWithAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
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
			driver.findElement(By.xpath("//*[@id=\"fileProgressddf37fa3e4ecbbf8d6258da7c04cd8dc0\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("9826789865");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(20000);
			
		
		}
		
		//self+family delete address12
		
//		@Test(priority=12)
		public void pastuploadSelfFamilydeleteaddress() throws InterruptedException, AWTException {
			
			System.out.println("PastUploadPrescriptionSelfFamilyDeleteAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
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
			driver.findElement(By.xpath("//*[@id=\"fileProgressddf37fa3e4ecbbf8d6258da7c04cd8dc0\"]/div/div[2]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Change")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("DELETE")).click();
			Thread.sleep(2000);
			
			
		
		}	
		
		//order medicine name without address
//		@Test(priority=13)
		public void ordermedicinenamewithoutaddress() throws InterruptedException {
			
			System.out.println("OrderMedicineNameWithoutAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.linkText("Order Medicines")).click();
			Thread.sleep(1000);
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
			driver.findElement(By.xpath("//div[contains(@class,'cSpJmD')]/button[text()='SAVE ADDRESS']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='SELECT']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[5]/input")).sendKeys("8896545671");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(2000);
		
		
		}
		//order medicine with address
//		@Test(priority=14)
		public void ordermedicinenamewithaddress() throws InterruptedException {
			
			System.out.println("OrderMedicineNameWithAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.linkText("Order Medicines")).click();
			Thread.sleep(1000);
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
		
		//edit address
//		@Test(priority=15)
		public void ordermedicinenameEditaddress() throws InterruptedException {
			
			System.out.println("OrderMedicineNameEditAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.linkText("Order Medicines")).click();
			Thread.sleep(1000);
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
			driver.findElement(By.xpath("//div[contains(@class,'cSpJmD')]/button[text()='SAVE ADDRESS']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='SELECT']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[5]/input")).sendKeys("8896545671");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(2000);
			
		}
		//order medicine name delete address 
		
//		@Test(priority=16)
		public void ordermedicinenameDeleteAddress() throws InterruptedException {
			
			System.out.println("OrderMedicineNameDeleteAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.linkText("Order Medicines")).click();
			Thread.sleep(1000);
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
		
		//upload without address
		
//		@Test(priority=17)
		public void uploadmedicinewithoutaddress() throws InterruptedException {
			
			System.out.println("UploadWithoutAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.linkText("Order Medicines")).click();
			Thread.sleep(3000);
			
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
			driver.findElement(By.xpath("//div[contains(@class,'cSpJmD')]/button[text()='SAVE ADDRESS']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='SELECT']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[5]/input")).sendKeys("8896545671");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
			Thread.sleep(2000);
			
		}
		
		//upload medicine with address
		
//		@Test(priority=18)
		public void uploadmedicinewithaddress() throws InterruptedException {
			
			System.out.println("UploadWithAddress");
			
			driver.get("https://app-test.ekincare.com/login");
			driver.findElement(By.name("mobile")).sendKeys("ashwini@ekincare.com");
			driver.findElement(By.name("password")).sendKeys("ekincare123");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//footer/button[contains(@class,'sc-Ax')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div/footer/button")).click();
			Thread.sleep(12000);
			driver.findElement(By.linkText("Order Medicines")).click();
			Thread.sleep(3000);
			
			WebElement u = driver.findElement(By.xpath("//input[@type='file']"));
			u.sendKeys("C:\\Dr.Divya_27-08-2019-18_13.pdf");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[5]/input")).sendKeys("7778987654");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[8]/span[2]/div/button")).click();
		
		}
		
		
		
		
	@AfterTest
	public void endTest() throws InterruptedException {
	Thread.sleep(6000);
	
	driver.close();
	
	}
	

}
