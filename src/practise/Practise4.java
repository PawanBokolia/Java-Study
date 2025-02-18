package practise;

import java.util.Arrays;
import java.util.Scanner;

public class Practise4 {
	public static String p;
		public static void main(String[] args) {
			String a[] = { "pawan", "sachin", "yogesh", "happy", "ronak","pawan" };
			System.out.println(Arrays.toString(a));
			System.out.println(a.length);
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a name");
			String b = sc.next();
			int count = 0;

			for (String x : a) {
				if (b==x) {
					count++;
					
				}
			}
				System.out.println("Element is = " + b);
				System.out.println(count);
		
	
		
}
}
