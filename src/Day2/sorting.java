package Day2;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		int a[]={120,45,67,4,3,56,78,43};
		System.out.println("before sorting");
		
/*		for (int x:a)
  		 {
			System.out.println(x);
		 }
*/
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);                  	    // sorting 
		
		System.out.println("after sorting ");
		System.out.println(Arrays.toString(a));
		
		
	}

}
