package TestNGConcepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependsMethodDemo {
  

	@Test (priority = 1)
  public void LoginPage(){
		System.out.println("Login Test");	
		int i = 5/0;
  }
	
	@Test (priority = 2, dependsOnMethods = "LoginPage")
	public void HomePage()
	{
		System.out.println("Home Page");
	}
	
	@Test (priority = 3)
	public void SearchPage()
	{
		System.out.println("Search Page");
	}
	
	@Test (priority = 4, dependsOnMethods =  "SearchPage")
	public void ProductPage()
	{
		System.out.println("Product Page");
	}
}
