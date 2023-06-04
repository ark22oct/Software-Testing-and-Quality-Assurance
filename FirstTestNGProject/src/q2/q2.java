package q2;
import org.openqa.selenium.*;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class q2 {
	public WebDriver driver;
	public String expected = null;
	public String actual = null;
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching Safari browser");
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver"); //setting up safari driver and path: "safariDriver"
		driver = new SafariDriver(); //launches safari browser
		driver.get("http://demo.guru99.com/test/newtours/"); //opens the page/URL
	}
	
	@Test
	public void verifyHomepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle);
	}
	
	@AfterTest
	public void terminateBrowser(){
		driver.close();
	}
}
