package com.bdd.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginSteps 
{
	WebDriver driver;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() 
	{
		System.out.println("Step 1 - User is on login page");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String uname, String pswd) 
	{
		System.out.println("Step 2 - User enters username & password");
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys(pswd);
	    
	}

	
	  @And("click on the login button") public void click_on_the_login_button() {
	  System.out.println("Step 3 - User click on login button");
	  driver.findElement(By.xpath("//button[@type='submit']")).click(); }
	 

	@Then("user should land on home page")
	public void user_should_land_on_home_page()
	{
		System.out.println("Step 4 - User lands on Home Page");
		driver.quit();
	    
	}
	

}
