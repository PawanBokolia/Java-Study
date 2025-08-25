package study1;

import java.util.Arrays;

public class Test1223 {

	public static void main(String args[]) {

		String name = "my name is pawan";
		String arr[] = name.split(" ");
		String arr1[] = new String[arr.length];
		StringBuffer output = new StringBuffer();

		for (String a : arr) 
		{
			for(int i =0; i<arr.length;i++)
			{
				arr1[i] = arr[arr.length-1-i];
			}
			
		}
		output.append(Arrays.toString(arr));
		System.out.println(output.toString());
		
	}
}