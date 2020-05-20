package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliYoutube {

	public static void main(String[] args) throws FindFailed, InterruptedException  {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/watch?v=07d2dXHYb94");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Screen s = new Screen();

		Pattern pause = new Pattern("C:\\Users\\Monika Raj\\Desktop\\Selenium\\Images\\PauseBtn.PNG");
		Pattern settings = new Pattern("C:\\Users\\Monika Raj\\Desktop\\Selenium\\Images\\Settings.PNG");
		Pattern auto720 = new Pattern("C:\\Users\\Monika Raj\\Desktop\\Selenium\\Images\\Auto720.PNG");
		Pattern HD = new Pattern("C:\\Users\\Monika Raj\\Desktop\\Selenium\\Images\\1080HD.PNG");
		Pattern play = new Pattern("C:\\Users\\Monika Raj\\Desktop\\Selenium\\Images\\PlayBtn.PNG");
		Pattern expand = new Pattern("C:\\Users\\Monika Raj\\Desktop\\Selenium\\Images\\Expand.PNG");
		
		s.wait(pause, 2000);
		s.click(pause);
		Thread.sleep(2000);
		
		s.wait(settings, 2000);
		s.click(settings);
		Thread.sleep(2000);
		
		s.wait(auto720, 2000);
		s.click(auto720);
		Thread.sleep(2000);
		
		s.wait(HD, 2000);
		s.click(HD);
		Thread.sleep(2000);
		
		s.wait(play, 2000);
		s.click(play);
		Thread.sleep(2000);
		
		s.wait(expand, 2000);
		s.click(expand);
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
