package TestNGConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
  
	@BeforeTest
	public void SetUp()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}
	
	@Test (dataProvider = "LoginData")
	public void Login(String Username, String Password) throws Exception
	{
		System.out.println(Username + " "+Password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Username);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Password);
		Thread.sleep(2000);
	}
	
	@DataProvider(name = "LoginData")
	public Object[][] getData() throws Exception
	{
		String excelPath = "C:\\Users\\Monika Raj\\Desktop\\Selenium\\Test Excel File.xlsx";
		String sheetName = "Sheet4";
		
		Object data[][] = testData(excelPath, sheetName);
		return data;
	}
	
	@Test
  public Object[][] testData (String excelPath, String sheetName) throws Exception {
		
		ExcelReadingMethods excel = new ExcelReadingMethods(excelPath, sheetName);
		
		int rowCount = excel.getRowCount(); //5
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount][colCount];
		
		for(int i=1; i<rowCount; i++)
		{
			for(int j=0; j<colCount; j++)
			{
				String cellData = excel.getCellData(i, j);
				System.out.print(cellData+ "|");
				data[i][j] = cellData;
			}
			System.out.println();
		}
		
		return data;
  }
}
