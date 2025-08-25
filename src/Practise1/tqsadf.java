package Practise1;

import java.util.HashMap;

public class tqsadf {

	public static void main(String[] args) {
		int arr[] = {1,2,1,2,43,5,6,6,0};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int a : arr )
		{
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		
		for(int key : map.keySet())
		{
			System.out.println(key+ "------>"+ map.get(key));
		}
		
		
		
		
		
		
		
	}

}
