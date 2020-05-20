package TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGConcepts.TestNGListeners.class)
public class TestNGListenerDemo {
	
	WebDriver driver;
  
	@Test
  public void test1() {
		System.out.println("This is Test1");
  }
	
	@Test
	public void test2() throws Exception
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		  System.out.println("Title of the Page: "+title);
		  Thread.sleep(3000);
		  driver.close();

	}
	@Test
	public void test3()
	{
		System.out.println("This is Test3");
		System.out.println(2/0);
	}
	
	@Test (dependsOnMethods = "test3")
	public void test4()
	{
		System.out.println("This is Test4");
	}
}
