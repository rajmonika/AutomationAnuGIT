package SeleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.expedia.ca/?pwaLob=wizard-hotel-pwa-v2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@id='d1-btn']")).click();
		Thread.sleep(3000);
		
		String month = "July 2020";
		String exp_date = "20";
		
		while(true)
		{
		String text = driver.findElement(By.xpath("//h2[@class='uitk-new-date-picker-month-name uitk-type-medium']")).getText();
		
		if(text.equals(month))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//div[@class='uitk-calendar']//button[2]")).click();
			Thread.sleep(2000);
		}
		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='uitk-calendar']//div[1]//table[1]//tbody[1]//tr//td//button"));
		
		for(WebElement ele:allDates)
		{
			String date = ele.getAttribute("data-day");
			
			if(date.equals(exp_date))
			{
				ele.click();
				Thread.sleep(2000);
				break;
			}
		}
		
		driver.findElement(By.xpath("//span[contains(text(),'Done')]")).click();
		Thread.sleep(3000);
		
		
		

	}

}
