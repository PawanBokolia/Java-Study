package study;
import java.util.Arrays;
public class Mutablevsimmutable {

	public static void main(String[] args) {
	
/*		int a[]= {20,60,10,15,30};
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);  //mutable 
		System.out.println(Arrays.toString(a));

		//immutable 
		String a = " pawan";
		System.out.println(a);
		a.concat(" to java ");  // immutable (store value on another string to see changes) 
		System.out.println(a);
*/		
		//String p = a.concat(a);  // this is how changes are seen 
		
		//Mutable -- StringBuffer / Stringbuffer 
		
		StringBuffer  s= new StringBuffer ("welcome") ;
		s.append(" To java ");
		System.out.println(s);
		
		
		
		
		
		
		
		
	}

}
