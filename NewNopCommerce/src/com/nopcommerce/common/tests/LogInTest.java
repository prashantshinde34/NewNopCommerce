package com.nopcommerce.common.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nopcommerce.base.*;
import com.nopcommerce.common.pageobjects.DemoPage;
import com.nopcommerce.common.pageobjects.LogInPage;

public class LogInTest extends BaseSetup {
	
	private WebDriver driver;
	private LogInPage logInPage;
//	private LogInPage logInPage1;
	private DemoPage demoPage;
	
	@BeforeClass
	public void setup()
	{
		driver=getDriver();
	}
	
	@Test
	public void verifyLogInFunction()
	{
		
		System.out.println("Loggin In to nopCommerce site");
		demoPage = new DemoPage(driver);
		logInPage = demoPage.clickLoginLink();
		logInPage.getLogInPageTitle();
		Assert.assertTrue(logInPage.verifyLogInPageTitle(), "Sign In page title doesn't match");
		Assert.assertTrue(logInPage.verifyLogInPageText(), "Page text not matching");

		logInPage.enterUserName("pra");
		logInPage.enterPassword("Testing@123");
		logInPage.logInButton().click();
	}
}
