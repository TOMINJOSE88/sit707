package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		
		
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOMIN JOSE\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		try {
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element1 = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element1);
		// Send first name
		element1.sendKeys("Tominjj");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		WebElement element2 = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + element2);
		// Send first name
		element2.sendKeys("Josejj");
		
		WebElement element3 = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + element3);
		// Send first name
		element3.sendKeys("0456456456");
		
		WebElement element4 = driver.findElement(By.id("email"));
		System.out.println("Found element: " + element4);
		// Send first name
		element4.sendKeys("tominnhhhjose@gmail.com");
		
		WebElement element5 = driver.findElement(By.id("password"));
		System.out.println("Found element: " + element5);
		// Send first name
		element5.sendKeys("123");
		
		WebElement element6 = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + element6);
		// Send first name
		element6.sendKeys("123");
		
		
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		WebElement createAccountButton = driver.findElement(By.cssSelector("button[data-testid='account-action-btn']"));
		createAccountButton.click();
		
		
		sleep(5);
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Capture screenshot as OutputType.FILE
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Define destination file path
        File destinationFile = new File("screenshot.png");

        // Save the screenshot file
        Files.copy(screenshot.toPath(), destinationFile.toPath());

        System.out.println("Screenshot saved successfully: " + destinationFile.getAbsolutePath());

		
		// Sleep a while
		sleep(5);
		
		// close chrome driver
		driver.close();	
		
		} catch (IOException e) {
            System.out.println("There was an error saving the screenshot: " + e.getMessage());
            e.printStackTrace();
        } finally {
        	driver.quit();
            System.out.println("Browser closed.");
        }
	}
	
	public static void w3school_signup_page(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOMIN JOSE\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		try {
		// Load a webpage in chromium browser.
		driver.get(url);
		
		WebElement element4 = driver.findElement(By.xpath("//input[@placeholder='email']"));
		System.out.println("Found element: " + element4);
		// Send first name
		element4.sendKeys("tominnhhhjose@gmail.com");
		
		WebElement element5 = driver.findElement(By.xpath("//input[@placeholder='password']"));
		System.out.println("Found element: " + element5);
		// Send first name
		element5.sendKeys("123");
		
		WebElement element1 = driver.findElement(By.xpath("//input[@placeholder='first name']"));
		System.out.println("Found element: " + element1);
		// Send first name
		element1.sendKeys("Tominjj");
		
		WebElement element2 = driver.findElement(By.xpath("//input[@placeholder='last name']"));
		System.out.println("Found element: " + element2);
		// Send first name
		element2.sendKeys("Josejj");
		
		WebElement createAccountButton = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		createAccountButton.click();
		
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Define destination file path
        File destinationFile = new File("screenshot1.png");

        // Save the screenshot file
        Files.copy(screenshot.toPath(), destinationFile.toPath());

        System.out.println("Screenshot saved successfully: " + destinationFile.getAbsolutePath());
        
        sleep(2);
		
		}catch (IOException e) {
            System.out.println("There was an error saving the screenshot: " + e.getMessage());
            e.printStackTrace();
        } finally {
        	driver.quit();
            System.out.println("Browser closed.");
        }
	}
	
	
}
