package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetdemo {
	public static void main(String[]args) {
		
		//declaration
		
		HashSet myset =new HashSet();
		
		//Set myset=new HAshSet();
		//HashSet <String> myset=new HashSet();
		
		//Adding elements in to hashset 
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		
	//printing hashset
		System.out.println(myset);
		
		
		//Size of hashset 
		  System.out.println(myset.size());
		
	
		  
		//Removing element 
		myset.remove(10.5);
		System.out.println(myset);
		
		
		//inserting element ----- is not possible in hashset
		//Access specific element ------ is not possible
		
		
		
		//Convert HashSet------> ArrayList
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));
		
		
		
		
		//read all the element using enhanced for loop/ for each loop 
		//normal loop is not possible in hashset directly
		for(Object x: myset)
		{
			System.out.println(x);
		}
		

		
		
		//using iterator 
		Iterator<Object> it=myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Clear method is common
		//.isEmpty() is common 
		
		
		
		
		
		
		
	}
}
