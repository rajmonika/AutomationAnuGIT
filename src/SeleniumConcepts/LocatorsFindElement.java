package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsFindElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Count of links under tagname a: "+links.size());
		
		for(WebElement l : links)
		{
			if(! l.getText().equals(""))
			{
			System.out.println(l.getText());
			}
		}
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("books");
		
	/*	driver.findElement(By.id("gh-ac")).sendKeys("mobiles");
		Thread.sleep(2000);
		
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.name("_nkw")).sendKeys("iPhone");
		
		driver.findElement(By.partialLinkText("Note9 SM-N960U")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Learn more")).click();
		//Thread.sleep(2000); 
		
		driver.findElement(By.cssSelector("[class='gh-tb ui-autocomplete-input'][label='Search for anything'][role='combobox'][type='text']")).sendKeys("books");
		Thread.sleep(2000);*/
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_r')]"));
		

		driver.quit();
	}

}
