package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupsDemo {
  
	@Test (groups = {"regression"})
  public void test1() {
		System.out.println("This is Test1");
  }
	
	@Test (groups = {"smoke"})
	  public void test2() {
			System.out.println("This is Test2");
	  }
	
	@Test (groups = {"functional", "regression"})
	  public void test3() {
			System.out.println("This is Test3");
	  }
	
	@Test (groups = {"functional"})
	  public void test4() {
			System.out.println("This is Test4");
	  }
	
	@Test (groups = {"regression", "smoke"})
	  public void test5() {
			System.out.println("This is Test5");
	  }
	
	@Test (groups = {"functional", "smoke"})
	  public void test6() {
			System.out.println("This is Test6");
	  }
	
	@Test (groups = {"sanity"})
	  public void test7() {
			System.out.println("This is Test7");
	  }
}
