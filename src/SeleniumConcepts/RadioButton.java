package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		Thread.sleep(3000);
		
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
		
		
		//Verification methods - isDisplayed(), isEnabled(), isSelected() ---- Return type is either true or false
		
		driver.close();
		
		



	}

}
