package SeleniumConcepts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/b/Art-Craft-Supplies/14339/bn_1851051?_from=R40&_nkw=&_trksid=m570.l1313");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		
	/*	double d = 20.45;
		int i = (int)d;
		System.out.println(i); */
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("C:\\Users\\Monika Raj\\Desktop\\Selenium\\Softwares\\Anu.PNG"));
		
		Thread.sleep(3000);
		driver.close();


	}

}
