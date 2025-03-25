package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String args[]) {
		
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList<String> al_dup = new ArrayList<>();
		
		//Add All Method
		al_dup.addAll(al);
		System.out.println(al_dup); 
		
		//remove all 
		al_dup.removeAll(al);
		System.out.println(al_dup);
		
		//Sort 
		Collections.sort(al);
		System.out.println(al);
		
		//sort in reverse order 
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		//Shuffling -collection 
		Collections.shuffle(al);
		System.out.println(al);
		
		
		
	}
}
