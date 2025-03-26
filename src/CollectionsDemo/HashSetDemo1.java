package CollectionsDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main (String args[]) {
		
//		HashSet<Object> hs = new HashSet<>();  //default capacity is 16 and load factor is 0.75
//		HashSet hs = new HashSet(100);  
//		HashSet<Object> hs = new HashSet<>(100,(float) 0.75); 
//		HashSet<Integer> hs = new HashSet<>();  
		
		HashSet<Object> hs = new HashSet<>();  
		
		//add objects/element into HashSet 
		hs.add(100);
		hs.add("welcome");
		hs.add(16.5);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);  //inserstion order is not preserved
		
		//remove
		hs.remove(16.5);
		System.out.println("After removing element"+hs);
		
		//contains
		System.out.println(hs.contains("welcome"));   	//true
		System.out.println(hs.contains(16.5));			//false
		
		//isEmpty
		System.out.println(hs.isEmpty());				//false
		
		
		//Reading objects/element from hashset using for each loop
		for(Object e:hs)
		{
			System.out.println(e);
		}
		
		
		//Reading objects/element from hashset using Iterator
		Iterator<Object> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
