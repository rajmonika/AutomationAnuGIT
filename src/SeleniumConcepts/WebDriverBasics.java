package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		driver.navigate().to("https://ebay.com");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println("Title of the page: "+title);
		
		System.out.println("Current URL of the window: "+driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		driver.close();
		//driver.quit();

	}

}
