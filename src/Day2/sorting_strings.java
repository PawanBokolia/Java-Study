package Day2;

import java.util.Arrays;

public class sorting_strings {

	public static void main(String[] args) {
		char a[]= {'s','r','t','p'};
		System.out.println("before sorting" +Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("after sorting "+Arrays.toString(a));
		
		
		String b[]= {"Pawan","Happy","Rsihi","Sachin"};
		System.out.println("before sorting" +Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("before sorting" +Arrays.toString(b));

	}

}
