package com.automation.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	public static WebDriver driver;

	@BeforeClass
	public void login() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		System.out.println("first beforetest");
		//or
		String Browsername ="chrome";
		if(Browsername.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if(Browsername.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

	@BeforeMethod
	public void logintest() {
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		System.out.println("beforemethod");

	}

	
	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt=\"Logout\"]")).click();
		System.out.println("aftermethod");
	}

	@AfterClass
	public void exit() {
		System.out.println("aftertest");
		driver.quit();
	}

}
