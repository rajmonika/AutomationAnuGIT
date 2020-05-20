package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	public static void main(String[] args) {

	/*	System.setProperty("webdriver.ie.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\IEDriverServer.exe");
		
WebDriver driver = new InternetExplorerDriver(); */
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.autoitscript.com/autoit3/docs/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	}

}
