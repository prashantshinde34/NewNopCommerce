package com.nopcommerce.common.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nopcommerce.base.BaseSetup;
import com.nopcommerce.common.pageobjects.Dashboard;

public class DisplayTopMenu extends BaseSetup{

	private WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=getDriver();
	}
	
	@Test
	public void DisplaytopMenu()
	{
		System.out.println(driver.getTitle());
		Dashboard d = new Dashboard(driver);
		d.topMenu();
		/*System.out.println("in top menu");
		WebElement dashboard_topMenu = driver.findElement(topMenu);
		List <WebElement> topMenu_dashboard =  dashboard_topMenu.findElements(By.tagName("li"));
		for(WebElement tm:topMenu_dashboard)
		{
			System.out.println(tm.getText());
		}*/
	}
}
