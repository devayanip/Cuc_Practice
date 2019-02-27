package com.test.Cucumber_pract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GettingCuc 
{
	WebDriver driver;
	
	@Given("^I have site$")
	public void i_have_site() throws Throwable 
	{
		  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		  
		  driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		  
		  driver.navigate().to("http://demosite.center/wordpress/wp-login.php");
	}

	@When("^I provide correct username and password$")
	public void i_provide_correct_username_and_password() throws Throwable 
	{
		Java_Class j=new Java_Class(driver);
	    j.cucumber();
	}

	@Then("^I am logged in$")
	public void i_am_logged_in() throws Throwable 
	{
		WebElement s=driver.findElement(By.id("wp-submit"));
		s.click();
	}
}
