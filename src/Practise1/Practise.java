package Practise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Practise {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 3, 6, 5, 6, 3, 1, 2, 3, 4, 7 };

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int num : arr)
		{
			list.add(num);
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		int arry[]=new int[arr.length];
		int j =0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(i==0 || arr[i] != arr[i-1])
			{
				arry[j++] = arr[i];
			}
		}
		int ari[]=Arrays.copyOf(arry, j);
		System.out.println(Arrays.toString(ari));
		
		
		
		
		
		
//		ArrayList<Integer> mylist = new ArrayList<>();
//
//		for (Integer num : list) 
//		{
//			if (!mylist.contains(num)) 
//			{
//				mylist.add(num);
//			}
//		}
//		System.out.println(mylist);
//
//	
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (Integer a : arr) 
//		{
//			map.put(a, map.getOrDefault(a, 0) + 1);
//		}
//
//		for (Integer key : map.keySet())
//		{
//			System.out.println(key + " --- " + map.get(key));
//		}
//
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		System.out.println(map);
//
//		
//		Integer arr2 []= new Integer[arr.length]; 
//		for(int i=0;i<arr.length;i++)
//		{
//			arr2[i]=arr[arr.length-1-i];
//		}
//		
//		System.out.println(Arrays.toString(arr2));
//
//		Collections.sort(list);
//		System.out.println(list);
		
		
		
		
		
		
	}
}
