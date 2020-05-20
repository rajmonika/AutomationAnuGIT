package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		Thread.sleep(3000);
		
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
		
		driver.close();



	}

}
