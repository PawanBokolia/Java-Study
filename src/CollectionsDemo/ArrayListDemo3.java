package CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		String arr[]= {"Dog","Cat","Elephant"};
		
		for(String value : arr)
		{
			System.out.println(value);
		}
		
		//Convert array into arraylist
		ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println(al);
	}

}
