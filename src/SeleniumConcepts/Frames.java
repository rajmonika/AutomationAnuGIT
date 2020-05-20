package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.146228276.1006710899.1586747817-171527257.1568217872");
		Thread.sleep(3000);

		driver.switchTo().frame("login_page"); //name of the frame
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("user123");
		Thread.sleep(5000);
		
		driver.switchTo().frame("footer");
		driver.findElement(By.linkText("Privacy Policy")).click();
		
		driver.close();

	}

}
