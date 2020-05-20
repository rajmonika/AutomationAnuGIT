package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		 driver.get("https://www.rentomojo.com/");
		 Thread.sleep(5000);
         
         driver.findElement(By.xpath("//span[@class='rm-city__selectorBoxLoca'][contains(text(),'Delhi')]")).click();
         Thread.sleep(4000);
         
         
         WebDriverWait wait=new WebDriverWait(driver, 40);         
         
         wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='Campaign__innerWrapper']/button"))));
         driver.findElement(By.xpath("//div[@class='Campaign__innerWrapper']/button")).click();

         /*  drv.get("https://gmail.com");
              // maximized the browser window
              drv.manage().window().maximize();
              drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       }
 
       @Test
       public void test() throws InterruptedException {
 
              // saving the GUI element reference into a "username" variable of WebElement type
              WebElement username = drv.findElement(By.id("Email"));
 
              // entering username
              username.sendKeys("shruti.shrivastava.in");
 
              // entering password
              drv.findElement(By.id("Passwd")).sendKeys("password");
 
              // clicking signin button
              drv.findElement(By.id("signIn")).click();
 
              // explicit wait - to wait for the compose button to be click-able
              WebDriverWait wait = new WebDriverWait(drv,30);
 
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
              // click on the compose button as soon as the "compose" button is visible
       drv.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
       } 
       */


	}

}
