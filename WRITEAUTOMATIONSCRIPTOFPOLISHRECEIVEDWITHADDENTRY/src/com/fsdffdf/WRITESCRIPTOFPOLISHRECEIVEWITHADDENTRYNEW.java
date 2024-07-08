package com.fsdffdf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WRITESCRIPTOFPOLISHRECEIVEWITHADDENTRYNEW {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("http://192.168.168.68:8083/WelcomePage.aspx");
		
		driver.findElement(By.id("txtUsername")).sendKeys("bhavin");
		driver.findElement(By.id("txtPassword")).sendKeys("456");

		driver.findElement(By.id("btnLogin")).click();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/div/div[2]/ul[1]/li[2]/a")).click();

		Actions act= new Actions(driver);
		
		WebElement polishreceived=driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/div/div[2]/ul[1]/li[2]/ul/li[6]/a"));

		 act.moveToElement(polishreceived).perform();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.linkText("Polish Received")).click();
		 
		 Thread.sleep(2000);
		 
		 WebElement frame3=driver.findElement(By.name("iframe-1"));

			driver.switchTo().frame(frame3);

			driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();//click on toggle button

			Thread.sleep(2000);
		
			// driver.findElement(By.xpath("//a[text()='Today']")).click();//click on today

			// driver.findElement(By.xpath("//a[text()='Yesterday']")).click();//click on Yesterday

			//driver.findElement(By.xpath("//a[text()='Curr. Month']")).click();//click on current month

			// driver.findElement(By.xpath("//a[text()='Prev. Month']")).click();//click on prev month

			//driver.findElement(By.xpath("//a[text()='Curr. Week']")).click();//click on current month

			//driver.findElement(By.xpath("//a[text()='Prev. Week']")).click();//click on prev week

			driver.findElement(By.xpath("//a[text()='Curr. FY']")).click();//click on current financial year

			//driver.findElement(By.xpath("//a[text()='Prev. FY']")).click();//click on prev financial year

			//driver.findElement(By.xpath("//a[text()='Calandar Year']")).click();//click on calender year

		
			driver.findElement(By.id("btnSearch")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("btnAdd")).click();
			

			driver.switchTo().defaultContent();

			WebElement frame4=driver.findElement(By.name("iframe-2"));

			driver.switchTo().frame(frame4);
		   Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/div/div[1]/div[3]/div/a/span[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/input")).sendKeys("%");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]/div")).click();//(click on cvdr box)
		
	    Thread.sleep(2000);
	
	    driver.findElement(By.xpath("/html/body/form/div[3]/div/div/div/div[2]/div/div[1]/div[4]/div/a/span[1]")).click();
	    Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[4]/div/input")).sendKeys("%");
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/div")).click();
	
	Thread.sleep(200);
	
	driver.findElement(By.id("txtQTY")).sendKeys("25");
	Thread.sleep(2000);
	
	driver.findElement(By.id("s2id_txtLOCATION")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[5]/ul/li[1]/div")).click();//(click on surat location)
	Thread.sleep(2000);
	
	
//	driver.findElement(By.xpath("/html/body/div[5]/ul/li[2]/div")).click();
//	Thread.sleep(2000);//(click on the mumbai location)
	
	
        driver.findElement(By.id("txtREMARK")).sendKeys("testing");
        
        Thread.sleep(2000);
      
      
       driver.findElement(By.id("btnSave")).click();
       Thread.sleep(2000);


//       driver.findElement(By.id("ContentPlaceHolder1_btnCancel")).click();
//      Thread.sleep(2000);
//	
	
	}
	
	

	
	
	
	
	
	

}
