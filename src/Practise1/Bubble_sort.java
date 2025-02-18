package Practise1;

import java.util.Arrays;

public class Bubble_sort {

	public static void sort13(int [] num)
	{
		int a = num.length;
		for(int i=0 ;i<a-1; i++)
		{
			for(int j=0;j<a-i-1;j++)
			{
				  if (num[j] > num[j + 1]) 
				  {
	                    int temp = num[j];
	                    num[j] = num[j + 1];
	                    num[j + 1] = temp;
				  }
	
			}
		}
	}
	public static void main(String args[]) {

		int[] num = { 5, 6, 1, 2, 7, 8, 9, 4, 3 };
		sort13(num);
		System.out.println(Arrays.toString(num));
	}
}
