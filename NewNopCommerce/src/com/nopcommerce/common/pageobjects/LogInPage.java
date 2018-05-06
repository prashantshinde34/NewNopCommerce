package com.nopcommerce.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	
	private WebDriver driver;
	
	private By headerPageText = By.xpath("//*[@id='aspnetForm']/div[3]/div[3]/div/div/div/div/div[1]/h1");
	private By userTextBox = By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_UserName");
	private By passwordTextBox = By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_Password");
	private By logInButton =By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerLogin$LoginForm$LoginButton");
	
	public LogInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getLogInPageTitle()
	{
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public boolean verifyLogInPageTitle()
	{
		String expectedTitle = "Login - nopCommerce";
		return getLogInPageTitle().contains(expectedTitle);
		
	}
	public boolean verifyLogInPageText()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement headertext = driver.findElement(headerPageText);
		String pageText = headertext.getText();
		System.out.println(pageText);
		String expctedPageText = "Welcome, Please Sign In!";
		return pageText.equalsIgnoreCase(expctedPageText);
	}
	
	public void enterUserName(String userName)
	{
		System.out.println(userName);
		WebElement userTxtBox = driver.findElement(userTextBox);

		userTxtBox.sendKeys(userName);
	}
	
	public void enterPassword(String password)
	{
		System.out.println(password);
		WebElement passwordTxtBox = driver.findElement(passwordTextBox);
		passwordTxtBox.sendKeys(password);
	}
	public WebElement logInButton()
	{
		WebElement logInBtn = driver.findElement(logInButton);
		return logInBtn;
	}
	
//
}
