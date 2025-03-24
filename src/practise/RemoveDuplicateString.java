package practise;

import java.util.Arrays;

public class RemoveDuplicateString {

	public static void main(String args[]) {
		
		String arr[]= {"pawan","bokolia","test","automation","engineer"};
		String newName= "";
		int j =0;
		
		for(String a : arr)
		{
			newName = newName+a;
		}
		
		char arr1[] = newName.toCharArray();
		Arrays.sort(arr1);
		
		char arr2[]=new char[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			if(i==0 || arr1[i]!=arr1[i-1])
			{
				arr2[j++]=arr1[i];
			}
		}

		System.out.println(Arrays.toString(arr2));

		char []arr3= Arrays.copyOf(arr2, j);
		System.out.println(Arrays.toString(arr3));
		
		
		
		
		
	}
	
}
