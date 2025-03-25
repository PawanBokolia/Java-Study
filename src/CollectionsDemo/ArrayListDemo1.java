package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
	
		//Declarre Arraylist
//		ArrayList al = new ArrayList();
//		ArrayList<Integer> al = new ArrayList<>();
//		ArrayList<String> al = new ArrayList<>();
		
		ArrayList<Object> al = new ArrayList<>();
		al.add("welcome");
		al.add(100);
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		
		//Size
		System.out.println(al.size());
		
		//remove
		al.remove(1);  				//1 is the index
		al.remove("welcome");  		//using element
		
		System.out.println("after removing "+al);
		
		//Insertion
		al.add(2,"Python");
		
		System.out.println("after insertion"+al);
		
		//retrive specific value
		System.out.println(al.get(2));
		
		//replace value
		al.set(2, "C#");
		
		System.out.println(al);
		
		//Search - return true/false
		System.out.println(al.contains("C#"));		//true
		System.out.println(al.contains("java"));	//false
		
		
		//isEmpty
		System.out.println(al.isEmpty());
		
		
		
		// 1) using for loop
		System.out.println("reading data using for loop.........");
		
		for(int i=0; i<al.size(); i++)
		{
		System.out.println(al.get(i));
		}
		
		// 2) for each loop
		System.out.println("reading data using for each loop.........");
		
		for(Object a : al)
		{
			System.out.println(a);
		}
		
		// 3) iterator()
		System.out.println("reading data using for iterator.........");
		
		Iterator<Object> it =al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
