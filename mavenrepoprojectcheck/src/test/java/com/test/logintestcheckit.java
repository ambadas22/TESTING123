package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class logintestcheckit {
	
	@Test
	public void checkloginpage1() throws InterruptedException {
		
		System.out.println("dashboard test1");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.168.101:8091/WelcomePage.aspx");

		driver.findElement(By.id("txtUsername")).sendKeys("ittest");
		driver.findElement(By.id("txtPassword")).sendKeys("654");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);

		Assert.assertEquals("http://192.168.168.101:8091/WelcomePage.aspx", driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.quit();	
	}
	
	
}
	


