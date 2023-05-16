package com.qa.testscripts;

import static org.testng.Assert.assertEquals;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.Pages.pages;

public class TC_001 extends TestBase{

	pages page;
	@Parameters({"Browser","Url"})
	@Test
	public void CountLinks(String Browser,String Url) throws InterruptedException
	{
		page = new pages(driver);
		page.closebutton.click();
		List<WebElement> linksize = page.links;
		System.out.print(linksize.size());
		List<WebElement> allLinks = page.links;
		for(WebElement i:allLinks)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
		}
	}
	//@Test
//	public void getallLinks() throws InterruptedException 
//	{
//		page = new pages(driver);
//		List<WebElement> allLinks = page.links;
//		for(WebElement i:allLinks)
//		{
//			System.out.println(i.getAttribute("href"));
//			System.out.println(i.getText());
//		}
//	}
}
