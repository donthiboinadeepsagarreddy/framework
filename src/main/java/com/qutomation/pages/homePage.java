package com.qutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	WebDriver driver;
	public homePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()=\"Time-Track\"]")
	WebElement timetrack;
	
	@FindBy(xpath="//a[text()=\"Projects & Tasks\"]")
	WebElement projectsandtasks;
	
	@FindBy(xpath="//a[text()=\"Reports\"]")
	WebElement reports;

	@FindBy(xpath="//a[text()=\"Users\"]")
	WebElement users;
	
	@FindBy(xpath="//a[text()=\"Work Schedule\"]")
	WebElement workschdule;
	
	@FindBy(xpath="//a[text()=\"Settings\"]")
	WebElement settings;
	
	@FindBy(xpath="//a[text()=\"My Account\"]")
	WebElement account;
	
	@FindBy(className ="logoutImg")
	WebElement logout;
	
	public void timetrack()
	{
		timetrack.click();;
	}
	public void projectsandtasks()
	{
		projectsandtasks.click();;
	}
	public void reports()
	{
		reports.click();;
	}
	public void workschdule()
	{
		workschdule.click();;
	}
	public void settings()
	{
		settings.click();;
	}
	public void account()
	{
		account.click();;
	}
	public void users()
	{
		users.click();;
	}
	public void logoutbtn()
	{
		logout.click();;
	}
	
}
