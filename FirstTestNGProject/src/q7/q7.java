package q7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class q7 {
	
	private WebDriver driver;
    private String baseUrl = "https://www.linkedin.com/login";
    private String expectedUrl = "https://www.linkedin.com/feed/";
    private String username = "ark22oct@gmail.com";
    private String password = "imbA#2791";
  
    @BeforeTest
    public void setUp() {
        // Set up the driver
        System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
        driver = new SafariDriver();
        driver.get(baseUrl);
    }
    
    @Test
    public void testLogin() throws InterruptedException {
    	WebElement usernameField = driver.findElement(By.id("username"));
    	WebElement passwordField = driver.findElement(By.id("password"));
    	WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
    	
    	usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        
        Thread.sleep(5000); // wait for page to load
        
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Login failed: URL doesn't match expected URL.");
    }
    
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    
}
