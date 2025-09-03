package practise_Office;

import java.util.HashMap;

public class HavingOneValueBetweenDuplicate {

	public static void main(String args[]) {
		
		String input ="AABBBCDDDDE";
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char a : input.toCharArray())
		{
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		
		for(char a: map.keySet())
		{
			if(map.get(a)==1)
			{
				System.out.println(a +" --> "+map.get(a));
			}
		}
		
		
	}
	
}
