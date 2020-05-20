package SeleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int totRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println("Total number of rows in the table: "+totRows);
		
		int totCols = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		System.out.println("Total number of columns in the table: "+totCols);
		
		List<WebElement> CompanyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		
		for(WebElement Company : CompanyNames)
		{
			System.out.println(Company.getText());
		} 

		//table[@class='dataTable']/tbody/tr[i]/td[j]
		
		String firstPart = "//table[@class='dataTable']/tbody/tr[";
		String secondPart = "]/td[";
		String thirdPart = "]";
		
		for(int i=1; i<=totRows; i++)
		{
			for(int j=1; j<totCols; j++)
			{
				String finalPart = firstPart + i + secondPart + j + thirdPart;
				String data = driver.findElement(By.xpath(finalPart)).getText();
				System.out.print(data + " | ");
			}
			System.out.println();
		}
	}

}
