package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		
		WebElement Elec = driver.findElement(By.linkText("Electronics"));
		
		act.moveToElement(Elec).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("iPhone")).click();
		Thread.sleep(4000);
		
		driver.close();

	}

}
