package com.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class pages {

	WebDriver driver;
	
	@FindBy(xpath="//button[contains(text(),'✕')]")
	public static WebElement closebutton;
	
	@FindBy(tagName="a")
	public static List<WebElement> links;
	
	public pages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
