package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assertions {
	
	WebDriver driver;
	
  @Test
  public void GoogleTitle() {
	  String title = driver.getTitle();
	  System.out.println("Title of the Page: "+title);
	  Assert.assertEquals(title, "Google", "Title is NOT matched");
  }
  
  @Test
  public void GoogleMail()
  {
	  boolean gmail = driver.findElement(By.linkText("Gmail")).isDisplayed();
	  System.out.println("Gmail Link is displayed: "+gmail);
	 // Assert.assertFalse(gmail, "Gmail link is NOT present");
	  Assert.assertTrue(gmail, "Gmail link is present");
  }
  
  @BeforeMethod
  public void LaunchBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

  }

  @AfterMethod
  public void CloseBrowser() throws Exception {
	  Thread.sleep(3000);
	  driver.close();
  
  }

}
