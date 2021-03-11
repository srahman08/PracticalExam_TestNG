package test;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePage.BrowserFactory;
import basePage.Methods;
import basePage.PageInformation;

public class AutomationTestng extends Methods{

WebDriver driver;
	
@BeforeClass
public void browserCalling() {
	
driver = BrowserFactory.browser();

}
	@Test
	public void toggleTest() throws IOException, InterruptedException {
	
		PageInformation pageInfo= PageFactory.initElements(driver, PageInformation.class);
			
		pageInfo.addCategory();
		pageInfo.clickAddCategory();
		takeScreenshotAtEndOfTest(driver);
		Thread.sleep(2000);

		pageInfo.validatingErroMsg();
		takeScreenshotAtEndOfTest(driver);

		pageInfo.neverMindClick();
		Thread.sleep(2000);

		pageInfo.monthList();
	
	}
	
	 @AfterClass
			    public  void tearDown() throws InterruptedException {
				Thread.sleep(2000);
				driver.close();
	}
	 

}
