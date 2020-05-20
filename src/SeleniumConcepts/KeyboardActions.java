package SeleniumConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		
		WebElement link = driver.findElement(By.xpath("//a[@class='nav-item'][contains(text(),'Documentation')]"));
		
		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(link).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(3000);
		
Set<String> windows = driver.getWindowHandles();
		
		for(String win : windows)
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title+ "----"+win);
			Thread.sleep(3000);
			
	}
		
		
		driver.quit();

	}

}
