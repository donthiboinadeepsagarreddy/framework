package com.qutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	public WebDriver driver;

	public loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "pwd")
	WebElement password;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement loginbtn;

	public void username() {
		username.sendKeys("admin");
	}

	public void password() {
		password.sendKeys("manager");
	}

	public void loginbtn() {
		loginbtn.click();
	}
}
