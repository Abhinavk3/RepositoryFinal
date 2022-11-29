package com.cucumber_demo.Hungama;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Test {

	WebDriver dr;

	@Given("Open the Browser with url")
	public void open_the_browser_with_url() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIIT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 dr = new ChromeDriver();
		 dr.get("http://localhost:3000/");
		 Thread.sleep(10000);
	}
	@Then("click on the SignUp button")
	public void click_on_the_sign_up_button() throws InterruptedException {
		 dr.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/p")).click();
		 Thread.sleep(10000);


	}
	@Then("Provide the input")
	public void provide_the_input() throws InterruptedException {
		dr.findElement(By.name("firstName")).sendKeys("Abhinav");
		dr.findElement(By.name("lastName")).sendKeys("Kumar");
		dr.findElement(By.name("location")).sendKeys("Delhi");
		dr.findElement(By.name("occupation")).sendKeys("Developer");
		Thread.sleep(20000);
		dr.findElement(By.xpath("//*[@id=\':r1:\'][1]")).sendKeys("abhi@gmail.com");
		dr.findElement(By.xpath("//*[@id=\':r3:\'][1]")).sendKeys("abhi1");

	}
	@Then("click on Register button option")
	public void click_on_register_button_option() throws InterruptedException {
		dr.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/button")).click();
		
		
	}
	@Then("Provide the input for email  password")
	public void provide_the_input_for_email_password() throws InterruptedException {
		Thread.sleep(10000);
		dr.findElement(By.xpath("//*[@id=\':r1:\']")).sendKeys("abhi@gmail.com");
		Thread.sleep(10000);
		dr.findElement(By.xpath("//*[@id=\':r3:\']")).sendKeys("abhi1");
	    
	}
	@Then("click on Login  button")
	public void click_on_login_button() throws InterruptedException {
		Thread.sleep(10000);
		dr.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/button")).click();
		
		Thread.sleep(10000);
		
		//POST - Thoughts
		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/input")).sendKeys("Hey its me Abhinav !!");
		 Thread.sleep(10000);
		 
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[2]/button")).click();
		 Thread.sleep(10000);
		 //Dark-mode
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button")).click();
		 
		 Thread.sleep(10000);
		 
		 //Light-mode
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button")).click();
		 
		 //Photo-post
		 Thread.sleep(20000);
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[2]/div[1]")).click();
		 Thread.sleep(20000);
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/input")).click();
			
			Thread.sleep(10000);
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/input")).sendKeys("Picture of the day..");
		 
		Thread.sleep(10000); 
		
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[3]/button")).click();
		 
		 Thread.sleep(10000); 
		 
		 //Profile visit
		 
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div[1]/div/div[2]/h4")).click();
		 
		 Thread.sleep(10000);
		 
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/p")).click();
		 
		 Thread.sleep(10000);
		 
		 //Log-Out
		 
		 dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div")).click();
		 Thread.sleep(10000);
		 
		 dr.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]")).click();
		 
		 Thread.sleep(10000);
		 
		 
		 
		 
		 
		
	}



}
