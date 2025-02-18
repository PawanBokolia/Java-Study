package study;

public class Reverse_a_string {
	
	public static void main(String[]args) {
	// approach1 - length () , CharAt () ,concatenation ()
/*		
		  String s = "welcome"; 
		  String rev = ""; 
		  
		  for (int i = s.length() - 1; i >= 0;i--) 
		  { 
		  	rev = rev + (s.charAt(i)); 
		  }
		  System.out.println("Reverse of a string is = " + rev);
		 
		 
		// Approach2 - without using string method
		String s = "welcome";
		String rev = "";
		char a[] = s.toCharArray();
		for (int i = a.length-1; i >= 0; i--) {
				rev=rev+a[i];
		}

		System.out.println("reverse on an String is = "+rev);
	
		//Approach 3 using stringBuffer class 
		StringBuffer s=new StringBuffer ("welcome");
		System.out.println(s.reverse());
*/		
		//Approach 4 using Stringbuilder class 
			
		StringBuilder s=new StringBuilder("welcome");
		System.out.println("reverse a string "+s.reverse());
}
}