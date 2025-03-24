package Practise1;

import java.util.Arrays;

public class EvenAndOddinArray {

	public static void main (String args[]) {
		
		int arr[]= {1,3,4,5,6,7,53,2,90};
		int oddarr[]=new int[arr.length];
		int evenarr[]=new int[arr.length];
		int j=0;
		int k=0;
		int count =0;
		int count1=0;
		
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("number is even ");
				oddarr[j++]=arr[i];
				count++;
			}
			else
			{
				System.out.println("number is odd");
				evenarr[k++]=arr[i];
				count1++;
			}
			
		}
		
		int oddarr1[] = Arrays.copyOf(oddarr,j);
		int evenarr1[] = Arrays.copyOf(evenarr,k);
		
		System.out.println(Arrays.toString(oddarr1));
		System.out.println(Arrays.toString(evenarr1));
		
		System.out.println("count of even num are "+count);
		System.out.println("count of odd num are "+count1);
		
		
	}
}
