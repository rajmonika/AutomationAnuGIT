package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownBox {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		
		Select sel = new Select(dropdown);
		
		WebElement firstOption = sel.getFirstSelectedOption();
		System.out.println("Default selected option of the Drop down list: "+firstOption.getText());
		
	    List<WebElement> options = sel.getOptions();
	    System.out.println("Count of items in the Drop down list: "+options.size());
	    
	    for(WebElement item : options)
	    {
	    	System.out.println(item.getText());
	    }
		
		sel.selectByIndex(4); //Books
		Thread.sleep(3000);
		
		sel.selectByVisibleText("Crafts");
		Thread.sleep(3000);
		
		sel.selectByValue("11233");
		Thread.sleep(3000);
		
		driver.close();

	}

}
