package Practise1;

import java.util.ArrayList;
import java.util.Arrays;

public class Test123 {

	public static void main (String args[]) {
		
		int arr[]= {1,2,3,4,1,4,5,67,9};
		int arr1[]=new int[arr.length];
		int j=0;
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==0 ||arr[i]!=arr[i-1])
			{
				arr1[j++]=arr[i];
			}
		}
		
		int arr2[]=Arrays.copyOf(arr1, j);
		System.out.println(Arrays.toString(arr2));
	
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
	
		for(int a :arr)
		{
			if(!list.contains(a))
			{
				list.add(a);
			}
		}
		
		System.out.println(list);

		for(int i=0;i<list.size();i++)
		{
			list2.add(list.get(list.size()-1-i));
		}
		
		
		
		
		System.out.println(list2);
		
		
	}
}