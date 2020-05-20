package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("SE_home_autocomplete")).sendKeys("automat");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='ddn-scrollable']/div/div/li[2]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(4000);
		
		driver.close();


	}

}
