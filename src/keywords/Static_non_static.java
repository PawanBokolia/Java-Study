package keywords;

public class Static_non_static {

	static int a =10;
	int b=20;
	
	static void m1() 	// static method 
	{
		System.out.println("this is m1 staic method......");
	}
	
	void m2() 			// non static method 
	{
		System.out.println("this is m2 non static method......");
	}
	
	void m() 			//non static method point 3  
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	
	
//	public static void main(String []args ) {
//		System.out.println(a);
//		System.out.println(b);  					// can't call without using object 
//		m1();
//		Static_non_static sd=new Static_non_static ();
//		sd.m();
		
		
		
		
	}
	
	

