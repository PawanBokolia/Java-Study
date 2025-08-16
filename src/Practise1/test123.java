package Practise1;

import java.util.HashMap;

public class test123 {

	public static void main(String []arg) {
		
		int arr[] = {1,2,3,43,454,5,5,5,};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int b : arr) 
		{
			map.put(b, map.getOrDefault(b, 0)+1);
		}
		
		System.out.println(map);
		
		
		
	}
}
