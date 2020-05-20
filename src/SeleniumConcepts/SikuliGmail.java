package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliGmail {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Screen s = new Screen();
		
		Pattern Gmail = new Pattern("GmailLink.PNG");
		Pattern CreateAC = new Pattern("CreateAcct.PNG");
		Pattern FN = new Pattern("FirstName.PNG");
		Pattern LN = new Pattern("LastName.PNG");
		Pattern Pwd = new Pattern("Password.PNG");

		s.wait(Gmail, 2000);
		s.click(Gmail);
		Thread.sleep(2000);

		s.wait(CreateAC, 2000);
		s.click(CreateAC);
		Thread.sleep(2000);
		
		s.wait(FN, 2000);
		s.type(FN, "Tom");
		Thread.sleep(2000);
		
		s.wait(LN, 2000);
		s.type(LN, "Jerry");
		Thread.sleep(6000);
		
		s.wait(Pwd, 4000);
		s.type(Pwd, "Hello123"+Key.TAB+"Hello123"+Key.ENTER);
		Thread.sleep(4000);
		
		driver.quit();
		

	}

}
