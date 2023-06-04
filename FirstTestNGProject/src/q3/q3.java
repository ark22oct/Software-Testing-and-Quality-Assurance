package q3;
import org.openqa.selenium.*;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class q3 {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching Safari browser");
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver"); //setting up safari driver and path: "safariDriver"
		driver = new SafariDriver(); //launches safari browser
		driver.get("http://www.facebook.com"); //opens the page/URL
	}
	
	@Test
	public void getTagName() {
		WebElement email = driver.findElement(By.name("email"));
		String tagName = email.getTagName();
		System.out.println("Tag name : " + tagName);
	}
	
	@AfterTest
	public void terminateBrowser(){
		driver.close();
	}
	
	
	/*
	public static void main(String[] args) {
    	System.setProperty("webdriver.Safari.driver","/usr/bin/safaridriver");
    	WebDriver driver = new SafariDriver();
        
        driver.get("http://www.facebook.com");
        
        WebElement email = driver.findElement(By.name("email"));
        
        String tagName = email.getTagName();
    
        System.out.println(tagName);
        
        driver.quit();
}
*/
	
}
