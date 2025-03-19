package Practise1;

import java.util.Arrays;

public class Newtest {

	public static void main(String []args) {
		
		
		int arr[] = {122,122,122,4,5,67,8,90,92};
		int arr1[]= new int[arr.length];
		int j=0;
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==0 || arr[i] !=arr[i-1])
			{
				arr1[j++] = arr[i];
			}
		}
		
		int arr3[]= Arrays.copyOf(arr1, j);
		System.out.println(Arrays.toString(arr3));
	}
}
