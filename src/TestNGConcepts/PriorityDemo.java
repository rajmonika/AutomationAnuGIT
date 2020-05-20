package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class PriorityDemo {
	
	WebDriver driver;
  
	@Test (priority = 1)
  public void RadioButton() throws Exception 
	{
		driver.findElement(By.id("vfb-7-1")).click();
		Thread.sleep(3000);
		
		if(driver.findElement(By.id("vfb-7-1")).isDisplayed())
		{
			System.out.println("Radio button 1 is displayed");
		}
		else
		{
			System.out.println("Radio button 1 is NOT displayed");
		}
		
		WebElement rb3 = driver.findElement(By.id("vfb-7-3"));
		rb3.click();
		Thread.sleep(3000);
		
		WebElement rb2 = driver.findElement(By.id("vfb-7-2"));
		rb2.click();
		Thread.sleep(3000);
		
		if(rb2.isSelected())
		{
			System.out.println("Radio button 2 is selected");
		}
		else
		{
			System.out.println("Radio button 2 is NOT selected");
		}
		
		if(rb3.isSelected())
		{
			System.out.println("Radio button 3 is selected");
		}
		else
		{
			System.out.println("Radio button 3 is NOT selected");
		}	  
  }
  
  @Test (priority = 2)
  public void CheckBox() throws Exception
  {
	  WebElement cb1 = driver.findElement(By.id("vfb-6-0"));
		if(cb1.isEnabled())
		{
			System.out.println("Checkbox1 is Enabled");
			cb1.click();
		}
		else
		{
			System.out.println("Checkbox1 is NOT Enabled");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-6-2")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("vfb-6-1")).click();
		Thread.sleep(2000);
		
		List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement cb : boxes)
		{
			System.out.println(cb.getAttribute("value"));
		}
  
  }
  
  @BeforeMethod
  public void SetUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

  }

  @AfterMethod
  public void tearDown() throws Exception {
	  Thread.sleep(3000);
	  driver.close();
  }

}
