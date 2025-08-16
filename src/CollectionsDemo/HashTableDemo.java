package CollectionsDemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
//		Hashtable t =new Hashtable();    //capcatiy is 11 and load factor 0.75 
//		Hashtable t= new Hashtable(intial capacity); //create hashtable object with some capacity 
//		Hashtable t = new Hashtable(intial capacity,fill ration);
		
		Hashtable<Integer,String> t= new Hashtable<>();
	
		t.put(101, "John");
		t.put(102, "David");
		t.put(103, "Smith");
//		t.put(null, "X");
//		t.put(104, null);
		System.out.println(t);
		
		System.out.println(t.get(103));
		
		t.remove(101);
		
		System.out.println(t);
		
		System.out.println(t.containsKey(102));			//true 
		System.out.println(t.containsKey(105));			//fasle
		
		System.out.println(t.containsValue("David"));	//true
		System.out.println(t.containsValue("A"));	 	//false
		
		System.out.println(t.isEmpty());  				//false
		
		System.out.println(t.keySet());					//all keys as set  return type 
		System.out.println(t.values());					//all values as collection return type
		
		
//		for(int a : t.keySet())
//		{
//			System.out.println(a+"  "+t.get(a));
//		}
		
		
		//Entry specific methods
		
		for(Map.Entry<Integer, String> entry :t.entrySet())
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		
		Set s = t.entrySet();
		Iterator its =s.iterator();
		while(its.hasNext())
		{
			Map.Entry entry= (Entry) its.next();
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		
		
		
	}

}
