package com.test.Cucumber_pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Java_Class 
{
	WebDriver driver;
	
	public Java_Class(WebDriver driver2) 
	{
		this.driver=driver2;
	}
	public void cucumber()
	{
		  WebElement a=driver.findElement(By.id("user_login"));
		  a.sendKeys("admin");
		  
		  WebElement p=driver.findElement(By.id("user_pass"));
		  p.sendKeys("demo123");
	}
}
