package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String args[]) {
		
		HashMap<Integer,String> m =new HashMap<>();
		
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "Tye");
		m.put(103, "X");
		m.put(106, "David");
		System.out.println(m);
		
		System.out.println(m.get(105));
		
		m.remove(106);			//remove pair 
		
		System.out.println(m);
		System.out.println(m.containsKey(101));					//true
		System.out.println(m.containsKey(106));					//false
		
		System.out.println(m.containsValue("Mary"));			//true
		System.out.println(m.containsValue("Y"));				//false
		
		
		System.out.println(m.isEmpty());  						//false as data is present in the HashMap
		
		System.out.println(m.keySet()); 						//Return all key as a set 
		
		System.out.println(m.values());         				//return all the value but not in set as duplicate are allowed and return as collection 
		
		System.out.println(m.entrySet());						//rerun all the entry as set object 
		
		
		for(Object a: m.keySet())
		{
			System.out.println(a);
		}
		
		for(Object a : m.values())
		{
			System.out.println(a);
		}
		
		for(Object a: m.keySet())
		{
			System.out.println(a+"  "+m.get(a));
		}
		
		//Entry Methods 
		//*********************
		
		for(Map.Entry<Integer, String> entry : m.entrySet())
		{
			System.out.println(entry.getKey()+"        "+entry.getValue());
		}
		
		
		//Iterator method
		Set s = m.entrySet();
		
		Iterator it =s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<Integer, String> entry=(Entry<Integer, String>) it.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		
		
		
	}
}
