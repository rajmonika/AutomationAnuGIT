package JavaConcepts;

public class TestADD {
	
	int a,b,c;
	
	public void add()
	{
		a = 100;
		b = 1000;
		c = a + b;
		System.out.println("Sum is: "+c);
	}

	public static void main(String[] args) {

		TestADD obj = new TestADD();
		
		obj.add();
		
		System.out.println("Check for Differences");

	}

}
