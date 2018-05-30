package com.nopcommerce.common.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nopcommerce.base.*;

public class Dashboard {
		
	private WebDriver driver;
	
	protected By topMenu = By.className("top-menu");
	
	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}
	

	public void topMenu()
	{
		System.out.println("in top menu");
		WebElement dashboard_topMenu = driver.findElement(topMenu);
		List <WebElement> topMenu_dashboard =  dashboard_topMenu.findElements(By.tagName("li"));
		for(WebElement tm:topMenu_dashboard)
		{
			System.out.println(tm.getText());
		}
	}
}
