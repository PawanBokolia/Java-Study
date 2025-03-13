package Practise1;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayActions {

	public static void main(String []args) {
		
		int arr[]= {1,5,4,89,7,2,65,1,3,5,0};
		int arr2[] = new int [arr.length];
		int p = arr[0];
		int j=0;

		// Remove duplicates
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(i==0 || arr[i] != arr[i-1])
			{
				arr2[j++]=arr[i];
			}
		}
		
		int arr3[]=Arrays.copyOf(arr2, j);
		System.out.println(Arrays.toString(arr3));
		
		
		// Reverse an array
		int arr4[]=new int[arr3.length];
		for(int i=0;i<arr3.length;i++)
		{
			arr4[i] = arr3[arr3.length-1-i];
		}
		
		System.out.println(Arrays.toString(arr4));
	
		// Count duplicate
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int a:arr)
		{
			map.put(a, map.getOrDefault(a,0)+1);
		}
		
		for(int a : arr)
		{
			System.out.println(a+"----"+map.get(a));
		}
		
		// Largest number
		for(int i=0;i<arr.length;i++)
		{
			if(p<arr[i])
			{
				p=arr[i];
			}
		}
		
		System.out.println("largest no is "+p);
	
		// Smallest number
		for(int i=0;i<arr.length;i++)
		{
			if(p>arr[i])
			{
				p=arr[i];
			}
		}
		
		System.out.println("smallest no. is "+p);
		
		
	}
}
