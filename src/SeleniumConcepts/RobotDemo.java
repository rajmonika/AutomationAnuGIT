package SeleniumConcepts;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class RobotDemo {

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
		
		Robot robo = new Robot();
		
		StringSelection ss = new StringSelection("C:\\Users\\Monika Raj\\Desktop\\Selenium\\Test Excel File.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		robo.setAutoDelay(3000);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.setAutoDelay(3000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@src='images/button_upload.gif']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();


	}

}
