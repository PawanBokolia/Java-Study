package class_and_objects;

public class constructordemo {
	int x,y;
	
	constructordemo()
	{      //Default constructor 
		
		x=100;
		y=200;
	}
	
	constructordemo(int a, int b )
	{ 									 
		x=a;						//parameterized constructor
		y=b;
	}
	void sum()
	{
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
	//	constructordemo sc=new constructordemo();  // invoke default constructor because parameters are not passed 
	//	sc.sum();
		
		constructordemo sd=new constructordemo(10,20);   //parameterized constructor
		sd.sum();
		
	}

}
