package SeleniumConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika Raj\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("window.location='https://www.ebay.com/'");
		Thread.sleep(3000);
		
		js.executeScript("document.getElementById('gh-ac').value='Mobile'");
		
		js.executeScript("document.getElementById('gh-btn').click()");
		
	/*	String URL = js.executeScript("return document.URL;").toString();
		System.out.println("URL of the page: "+URL);
		
		String title = js.executeScript("return document.title;").toString();
		System.out.println("Title of the page: "+title);
		
		//Refreshing the page
		js.executeScript("history.go(0)");
		Thread.sleep(2000); */
		
		//Scrolling to the bottom of the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//Scrolling to the Top of the page
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//Scrolling till particular height ---- bottom
		js.executeScript("window.scrollBy(0,9000)");
		Thread.sleep(3000);
		
		//Scrolling till particular height ---- top
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(3000);
		
		//Scrolling till particular element
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.partialLinkText("Phone MTK6797 10 Core")));
		Thread.sleep(3000);
		
		//Zoom in
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(3000);
		
		//Zoom out
		js.executeScript("document.body.style.zoom='130%'");
		Thread.sleep(3000);
		
		driver.close();				

	}

}
