package Practise1;

import java.util.Arrays;

public class AddingTwoArrays {

	public static void main(String[] args) {

		int arr[] = { 122, 122, 122, 4, 5, 67, 8, 90, 92, 1 };
		int arr1[] = { 122, 122, 122, 7, 4, 5, 67, 8, 90, 92, 1, 8 };

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr1.length; j++) 
			{
				if (arr1[j] != arr[i]) 
				{
					arr1[i] = arr[i];
				}
			}
		}

		System.out.println(Arrays.toString(arr1));
	}
}
