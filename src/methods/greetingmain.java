package methods;

public class greetingmain {
public static void main (String[]args) {
	greetings gr = new greetings();
	gr.m1();
	
	gr.m2();
	
	//System.out.println(gr.m2());  // another method 
	
	gr.m3("john");
	
	String s2=gr.m4("john");
	System.out.println(s2);
}
}
