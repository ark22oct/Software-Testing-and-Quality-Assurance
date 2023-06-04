package q4;
import org.openqa.selenium.*;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class q4 {
	
	private WebDriver driver;
    
    @BeforeTest
    public void setUp() {
        // Set up the driver
        System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
        driver = new SafariDriver();
    }
    
    @Test
    public void testSampleTodoApp() {
        
    	// Go to the website
        driver.get("https://lambdatest.github.io/sample-todo-app/");
        
        // Find the "Second Item" checkbox and check it
        WebElement secondItemCheckbox = driver.findElement(By.xpath("//input[@value='todo-2']"));
        secondItemCheckbox.click();
        
        // Find the "Fourth Item" checkbox and check it
        WebElement fourthItemCheckbox = driver.findElement(By.xpath("//input[@value='todo-4']"));
        fourthItemCheckbox.click();
        
        // Find the blank field at the end, clear its content, and add your own name
        WebElement newTodoInput = driver.findElement(By.id("sampletodotext"));
        newTodoInput.clear();
        newTodoInput.sendKeys("Abdulrehman");
        
        // Submit the new todo item
        WebElement addButton = driver.findElement(By.id("addbutton"));
        addButton.click();
        
        // Wait for the page to update with the new item
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Verify that the new item was added
        WebElement newItemLabel = driver.findElement(By.xpath("//li[text()='Abdulrehman']"));
        assert newItemLabel.isDisplayed();
    }
    
    @AfterTest
    public void tearDown() {
        // Close the driver
        driver.quit();
    }


}
