package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Duplicatenumber_sorting {

	public static void main(String[] args) {
		
			ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(11,115,6,1,1,2,3,4,2,4));
			
			HashMap <Integer,Integer> map = new HashMap <Integer,Integer>();
			
			for(int dub: list)
			{
				map.put(dub, map.getOrDefault(dub, 0)+1);
			}
			
			TreeMap<Integer,Integer> tree = new TreeMap<Integer,Integer>(map);
			
			for(int newmap: tree.keySet())
			{
				System.out.println(newmap+"-----> "+tree.get(newmap));
			}
			
			
	}

}
