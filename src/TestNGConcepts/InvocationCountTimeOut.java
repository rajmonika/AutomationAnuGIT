package TestNGConcepts;

import org.testng.annotations.Test;

public class InvocationCountTimeOut {
  
/*	@Test (invocationCount = 10)
  public void sum() 
  {
    int a = 10;
    int b = 20;
    int c = a + b;
    
    System.out.println("sum is: "+c);
		
  } */
	
	
	@Test (invocationTimeOut = 5)
	public void infiniteLoop()
	{
		int i = 1;
		while(i==1)
		{
			System.out.println(i);
		}
	}
}
