package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DuplicationFromArrayList {

	public static void main (String []args) {
		
	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,1,6,7,8,99,9,9,9,5,6,24));	

	HashMap<Integer,Integer> hashlist= new HashMap<Integer,Integer>();
		
	for(int i=0 ;i<list.size();i++)
	{
	
		hashlist.put( list.get(i) , hashlist.getOrDefault(list.get(i),0)+1);
	}
	
		
	for(int key1 :hashlist.keySet())
	{
		if(hashlist.get(key1)==1)
		{
			hashlist.put(key1, 0);
		}
		System.out.println(key1  +"- >>  " +hashlist.get(key1));
		
	}
	
	
	}
}
