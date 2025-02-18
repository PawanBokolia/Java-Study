package practise;

import java.util.Arrays;

public class Reverse_an_array {

	public static void main(String[] args) {
		
		int number[]= {1,2,3,4,5,6,7,8,9};
		int rev[]=new int [number.length];
		
		
		for(int i=0; i<number.length ;i++)
		{
			rev[i]= number[number.length-1-i];
		}
		System.out.println(Arrays.toString(rev));
		
		
		
	}

}
