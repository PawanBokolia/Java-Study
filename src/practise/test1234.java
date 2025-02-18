package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class test1234 {

	public static void main(String[] args) {
	
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,5,5,7,8));
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int dub: number)
		{
			map.put(dub, map.getOrDefault(dub, 0));
		}
		
		for(int key :map.keySet())
		{
			System.out.println(key +"----->"+map.get(key));
		}
		
	}

}
