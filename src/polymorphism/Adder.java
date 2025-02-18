package polymorphism;

public class Adder {
	int a = 10, b = 20;

	void sum()
	{ 
		System.out.println(a + b); 		// 1 method
	}

	 public void sum(int x, int y) 
	{
		System.out.println(x + y);		 // 2 method
	}

	void sum(int x, double y) 
	
	{ 
		System.out.println(x + y);		// 3 method
	}

	void sum(double x, int y)
	{
		System.out.println(x+y);
	}

	void sum(int x,long y)
	{
		System.out.println(x+y);
	}

}
