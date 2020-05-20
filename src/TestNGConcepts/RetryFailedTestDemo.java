package TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGConcepts.TestNGListeners.class)
public class RetryFailedTestDemo {
 
	
	@Test (retryAnalyzer = TestNGConcepts.RetryAnalyzerListener.class)
  public void test1() {
		System.out.println("This is Test1");
		Assert.assertTrue(false);
  }
	
	@Test
	public void test2()
	{
		System.out.println("This is Test2");
	}
}
