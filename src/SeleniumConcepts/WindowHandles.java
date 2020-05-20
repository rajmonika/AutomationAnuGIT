package SeleniumConcepts;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		
		System.out.println("Window ID of the main window: "+driver.getWindowHandle());
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String win : windows)
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title+ "----"+win);
			Thread.sleep(3000);
			
			if(title.equals("Amazon"))
			{
				System.out.println("closing the Amazon window");
				driver.close();
			}
		}
		
		//driver.quit();
		
		


	}

}
