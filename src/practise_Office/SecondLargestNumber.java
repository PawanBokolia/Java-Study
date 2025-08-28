package practise_Office;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String args[]) {
		
		int input[] = {12,35,1,10,34,1};
		Arrays.sort(input);
		int largest = 0;
		int secondlargest =0;
		for(int i=1; i<input.length; i++)
		{
			if(input[i]>=input[i-1])
			{
				largest=input[i];
			}
		}
		
		System.out.println(largest);
		
		for(int i=0; i<input.length; i++)
		{
			if(input[i]> secondlargest && input[i] !=largest )
			{
				secondlargest = input[i];
			}
		}
		
		System.out.println(secondlargest);
		
	}
}
