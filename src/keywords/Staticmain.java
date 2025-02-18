package keywords;


public class Staticmain {

	public static void main(String[] args) {
		
				System.out.println(Static_non_static.a);          // static methods can be used without objects 
				Static_non_static.m1();
			
				Static_non_static sd=new Static_non_static ();   // non static methods cannot be ussed without objects 
				sd.m();
	}

}
