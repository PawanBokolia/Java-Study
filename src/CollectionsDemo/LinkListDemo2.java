package CollectionsDemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkListDemo2 {

	public static void main(String args[]) {
		
		LinkedList<String> l = new LinkedList<>();
		LinkedList<String> new_l = new LinkedList<>();
		
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		new_l.addAll(l);
		System.out.println(new_l);
		
		new_l.removeAll(l);
		System.out.println(new_l);
		
		//Sort 	//if you have homogenious data
		System.out.println("before sorting"+l);
		Collections.sort(l);
		System.out.println("After sorting"+l);
	
		//Reverse order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("after reverse"+l);
		
		//shuffling
		Collections.shuffle(l);
		System.out.println("After shuffling"+l);
		

	
	
		
		
	
	
	}
}
