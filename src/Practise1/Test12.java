package Practise1;

public class Test12 {
	int x;
	int y;

	Test12() 
	{
		x = 100;
		y = 200;
	}
	
	Test12(int a, int b)
	{
		x=a;
		y=b;
	}

	void sum()
	{
		System.out.println(x+y);
	}
	
	
	
	
	public static void main(String[] args) {

		Test12 cd = new Test12(10,20);
		
		Test12 cd1 = new Test12();
		cd1.sum();
		
		
		
		
		
		
		
	}

}
