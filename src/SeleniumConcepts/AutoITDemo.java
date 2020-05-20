package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class AutoITDemo {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://tinyupload.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Screen s = new Screen();
		
		Pattern browse = new Pattern("C:\\Users\\Monika Raj\\Desktop\\Selenium\\Images\\ChooseFile.PNG");
		
		s.wait(browse, 2000);
		s.click(browse);
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\Monika Raj\\Desktop\\Selenium\\AutoIT Scripts\\AutoItFileUpload_Anu.exe");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@src='images/button_upload.gif']")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
