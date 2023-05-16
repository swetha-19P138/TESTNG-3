package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.Pages.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase {

	WebDriver driver;
	pages page;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void Setup(String Browser,String Url) throws InterruptedException
	{
		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		page = new pages(driver);
		driver.manage().window().maximize();
		driver.get(Url);
	}
	
}
