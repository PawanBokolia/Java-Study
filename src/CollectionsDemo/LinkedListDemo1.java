package CollectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		//Declare 
//		LinkedList<Object> l = new LinkedList<>();
//		LinkedList<Integer> l = new LinkedList<>();
//		LinkedList<String> l = new LinkedList<>();
		
		LinkedList<Object> l = new LinkedList<>();
		
		//Add element 
		l.add(100);
		l.add("Welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println(l);
		
		//size
		System.out.println(l.size());
		
		//Remove 
		l.remove(3);
		System.out.println("After removing"+l);
		
		//Insert/adding element in the middle of the Linked list 
		l.add(3,"java");
		System.out.println("After inserting element "+l);
		
		//Reterving the value 
		System.out.println(l.get(3));
		
		//change the value
		l.set(5, "X");
		System.out.println("After changing the value "+l);
		
		//Contains()
		System.out.println(l.contains("java"));			//true
		System.out.println(l.contains("Python"));		//false
		
		//isEmpty
		System.out.println(l.isEmpty());
		
		
		//Reading element from LL using for loop
		for (int i = 0; i <l.size(); i++) 
		{
			System.out.println(l.get(i));
		}
		
		//Reading element from LL using for each loop
		for(Object a : l)
		{
			System.out.println(a);
		}
		
		//Iterator method 
		Iterator<Object> it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
	}

}
