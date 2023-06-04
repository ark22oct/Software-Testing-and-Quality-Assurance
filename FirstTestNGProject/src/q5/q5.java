package q5;

import org.openqa.selenium.*;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class q5 {
	
	WebDriver driver;
	
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		driver = new SafariDriver();
	}
	
	@Test(priority=1)
	public void launchGoogle() {
		driver.get("http://www.google.com"); //opens the page/URL
	}
	
	@Test(priority=2)
	public void performSearchAndClick1stLink() throws InterruptedException {
		
		 // Find the search field and enter "Facebook"
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("Facebook");
		search.submit();
		
		// Wait for the search results to load
		
		Thread.sleep(5000);
		
		  // Click the first search result link
		WebElement firstLink = driver.findElement(By.xpath("(//div[@class='g']//a)[1]"));
		firstLink.click();
		
	}
	
	@Test(priority=3)
	public void FaceBookTitleVerification() {
		// Verify the title of the Google search page
		
		 String expectedTitle = "Facebook - Google Search";
		 String actualTitle = driver.getTitle();
		 assert actualTitle.contains(expectedTitle);
		 
	}
	
	@Test (priority=4)
	public void driverExit() {
		driver.quit();
	}
}
	