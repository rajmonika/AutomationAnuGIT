package TestNGConcepts;

import org.testng.annotations.Test;

public class ExceptionHandling {
 
	@Test (expectedExceptions = Exception.class)
  public void test1() 
  {
		int i = 8/0;
		System.out.println(i);
  }
	
	@Test (expectedExceptions = Throwable.class)
	public void test2()
	{
		String X = "100A";
		int j = Integer.parseInt(X);
		System.out.println(j);
	}
	
	
}
