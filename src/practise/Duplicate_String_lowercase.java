package practise;

import java.util.HashMap;

public class Duplicate_String_lowercase {
	
	
	public static void main(String []agrs) {
		
		String name[] = {"pawan","sarthak","pawan","Pawan"};
		
		for(int i=0; i<name.length;i++)
		{
			name[i]=name[i].toLowerCase();
		}
		
		HashMap<String,Integer> list = new HashMap<String,Integer>();
		
		for(String list1:name)
		{
			list.put(list1, list.getOrDefault(list1, 0)+1);
		}
		
		for(String key : list.keySet())
		{
			
			System.out.println(key+"   ->  "+list.get(key));
		}
		
		
		
		
		
	}
	
}
