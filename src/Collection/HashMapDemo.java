package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		
		//Declaration
		
		//HashMap hm=new HashMap();  //you can use any kind of data if you use this type of declaration 
		//Map hm =new HashMap();
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(101, "john");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104,"Scott");
		hm.put(102, "David");
		
/*		System.out.println(hm);
		
		//Size of the hashmap
		System.out.println(hm.size());
		
		
		//remove pair
		hm.remove(103);    //103 is key of the pair 
		System.out.println("after removing the pair "+hm);
		
		
		//access value of the key 
		System.out.println(hm.get(102));  //102 is the key 
		
		
		//get all the value of the key 
		System.out.println(hm.keySet());
		
		
		//get all the value from hashmap 
		System.out.println(hm.values());
		
		
		
		// key along with the value 
		System.out.println(hm.entrySet());
		
		
		
		//Reading data from Hashmap 
		//using for ..each / enhanced 
		
		for (int k : hm.keySet())
		{
			System.out.println(k+" "+hm.get(k));
		}
		
		
*/			
		//using interator 
		Iterator<Entry<Integer, String>>  it=hm.entrySet().iterator();
		
		
		while(it.hasNext())
		{
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
		
		
		
		//clear and is empty is same 
		
		
	}

}
