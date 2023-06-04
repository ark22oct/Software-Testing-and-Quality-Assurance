package q6;

import org.openqa.selenium.*;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class q6 {
	
	@Test
	public void executeSessionOne() {
		
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		WebDriver driver = new SafariDriver();
		driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("Driver 1");
        driver.quit();
	}
	
	@Test
	public void executeSessionTwo() {
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		WebDriver driver = new SafariDriver();
		driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        driver.quit();
	}
	
	@Test
	public void executeSessionThree() {
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		WebDriver driver = new SafariDriver();
		driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
        driver.quit();
	}
	
	
	
	/*public String baseUrl = "http://demo.guru99.com/V4/";
	String driverPath = "/usr/bin/safaridriver";
	public WebDriver driver;
	
	@Test
	public void executeSessionOne() {
		//System.out.println("launching Safari browser");
		System.setProperty("webdriver.safari.driver", driverPath); //setting up safari driver and path: "safariDriver"
		driver = new SafariDriver(); //launches safari browser
		driver.get(baseUrl); //opens the page/URL
        driver.findElement(By.name("uid")).sendKeys("Driver 1"); //find user name text box and fill it
	}
	
	@Test
	public void executeSessionTwo() {
		//System.out.println("launching Safari browser");
		System.setProperty("webdriver.safari.driver", driverPath); //setting up safari driver and path: "safariDriver"
		driver = new SafariDriver(); //launches safari browser
		driver.get(baseUrl); //opens the page/URL
        driver.findElement(By.name("uid")).sendKeys("Driver 2"); //find user name text box and fill it
	}
	
	@Test
	public void executeSessionThree() {
		//System.out.println("launching Safari browser");
		System.setProperty("webdriver.safari.driver", driverPath); //setting up safari driver and path: "safariDriver"
		driver = new SafariDriver(); //launches safari browser
		driver.get(baseUrl); //opens the page/URL
        driver.findElement(By.name("uid")).sendKeys("Driver 3"); //find user name text box and fill it
	}*/
	
	
}
