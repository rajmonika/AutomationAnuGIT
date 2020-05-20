package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupDemo2 {
  
	@Test (groups = {"windows.regression"})
	  public void test1() {
			System.out.println("This is Test1");
	  }
		
		@Test (groups = {"windows.smoke"})
		  public void test2() {
				System.out.println("This is Test2");
		  }
		
		@Test (groups = {"windows.functional", "linux.regression"})
		  public void test3() {
				System.out.println("This is Test3");
		  }
		
		@Test (groups = {"linux.functional"})
		  public void test4() {
				System.out.println("This is Test4");
		  }
		
		@Test (groups = {"linux.smoke"})
		  public void test5() {
				System.out.println("This is Test5");
		  }
		
}
