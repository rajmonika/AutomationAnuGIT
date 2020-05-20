package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class MultipleBrowser {
	
	WebDriver driver;
	
  @Test
  public void GoogleTitle() {
	  driver.get("https://www.google.com");
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	 
	  String title = driver.getTitle();
	  System.out.println("Title of the Page: "+title);
  }
  
  @Parameters("browserName")
  @BeforeMethod
  public void LaunchBrowser(String browserName) {
	  
	  if(browserName.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		
	  }
	  else if(browserName.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		 
	  }
  }

  @AfterMethod
  public void CloseBrowser() throws Exception {
	  Thread.sleep(3000);
	  driver.close();
  
  }
}
