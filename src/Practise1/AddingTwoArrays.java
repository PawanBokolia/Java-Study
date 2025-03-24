package Practise1;

import java.util.ArrayList;
import java.util.Collections;

public class AddingTwoArrays {

	public static void main(String[] args) {

		int arr[] = { 122, 122, 122, 4, 5, 67, 8, 90, 92, 1 };
		int arr1[] = { 122, 122, 122, 7, 4, 5, 67, 8, 90, 92, 1, 8 };

		ArrayList<Integer>list = new ArrayList<>();
		
		for(int a: arr)
		{
			list.add(a);
		}
		
		for(int a : arr1)
		{
			if(!list.contains(a))
			{
				list.add(a);
			}
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		}
}
