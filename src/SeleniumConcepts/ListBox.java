package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html");
		Thread.sleep(3000);

		WebElement listbox = driver.findElement(By.xpath("//select[@class='form-control pickListSelect pickData']"));
		
		Select sel = new Select(listbox);
		
		sel.selectByIndex(1);//Sophia
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Laura");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Giovanna");
		Thread.sleep(2000);
		
		List<WebElement> allItems = sel.getAllSelectedOptions();
		
		for(WebElement items : allItems)
		{
			System.out.println(items.getText());
		}
		
		sel.deselectByIndex(5);
		Thread.sleep(2000);
		
		sel.deselectByVisibleText("Sophia");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='pAdd btn btn-primary btn-sm']")).click();
		
		//sel.deselectAll();
		Thread.sleep(3000);
		
		driver.close();


	}

}
