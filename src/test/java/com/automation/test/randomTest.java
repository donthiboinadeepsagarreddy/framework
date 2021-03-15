package com.automation.test;

import org.testng.annotations.Test;

import com.automation.base.base;
import com.qutomation.pages.homePage;
import com.qutomation.pages.loginpage;

public class randomTest extends base {
	@Test
	public void homepagetest() throws InterruptedException {
		homePage page = new homePage(driver);
		page.timetrack();
		Thread.sleep(3000);
		System.out.println("clicked on timetrack");
		page.projectsandtasks();
		Thread.sleep(3000);
		System.out.println("clicked on projects and tasks");
		page.reports();
		Thread.sleep(3000);
		System.out.println("clicked on reports");
		page.users();
		Thread.sleep(3000);
		System.out.println("clicked on users");
		page.workschdule();
		Thread.sleep(3000);
		System.out.println("clicked on workschdule");
		page.settings();
		Thread.sleep(3000);
		System.out.println("clicked on settings");
		page.account();
		Thread.sleep(3000);
		System.out.println("clicked on account");
		page.logoutbtn();
		Thread.sleep(3000);
		System.out.println("clicked on logout");
		// ***********************************************//
		loginpage login = new loginpage(driver);
		login.username();
		login.password();
		login.loginbtn();

	}

}
