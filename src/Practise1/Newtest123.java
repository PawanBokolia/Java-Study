package Practise1;

import java.util.ArrayList;
import java.util.Arrays;

public class Newtest123 {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,1,23,3,4,5,6};
		int arr2[] =new int [arr.length];
		
		int j=0;
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==0  || arr[i] !=arr[i-1])
			{
				arr2[j++]=arr[i];
			}
		}
		
		int arr3[] =Arrays.copyOf(arr2, j);
		int arr4[]= new int [arr3.length];

		System.out.println(Arrays.toString(arr3));
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int a : arr)
		{
			list.add(a);
		}
		
		for(int a : list)
		{
			if(!list1.contains(a))
			{
				list1.add(a);
			}
		}
		
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++)
		{
			list2.add(list1.get(list1.size()-1-i));
		}
		
		System.out.println(list2);
		
		for(int i =0;i<arr3.length;i++)
		{
			arr4[i]=arr3[arr3.length-1-i];
		}
		
		System.out.println(Arrays.toString(arr4));
		
		
		
	}

}
