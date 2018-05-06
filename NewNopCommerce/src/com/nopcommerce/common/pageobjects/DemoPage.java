package com.nopcommerce.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoPage {
	
	protected WebDriver driver;
	private By logInLink = By.linkText("Log in");
	
	public DemoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LogInPage clickLoginLink()
	{
		System.out.println("Clicking on Login in Link");
		WebElement logInLinkElement = driver.findElement(logInLink);
		logInLinkElement.click();
		return new LogInPage(driver);
	}
	
	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyBasePageTitle() {
		String expectedPageTitle="	nopCommerce - Shopping Cart Demo & Shopping Cart Solution";
		return getPageTitle().contains(expectedPageTitle);
	}
}
