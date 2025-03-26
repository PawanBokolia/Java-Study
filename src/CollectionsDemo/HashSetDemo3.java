package CollectionsDemo;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		
		//union, Intersection, Difference
		
		HashSet<Integer> set1 = new HashSet<>(); 
		set1.add(1);
		set1.add(2);	
		set1.add(3);
		set1.add(4);
		set1.add(5);

		System.out.println("HasHSet 1:"+set1);
	
		HashSet<Integer> set2 = new HashSet<>(); 
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		//union 
//		set1.addAll(set2);
//		System.out.println("Union"+set1);
//		
//		//Intersection common element from set1 and set2
//		set1.retainAll(set2);
//		System.out.println("intersection"+set1);
		
		//difference
//		set1.removeAll(set2);
//		System.out.println("difference "+set1);
		
		//SubSet 
		System.out.println(set1.containsAll(set2));
		
		
		
		
		
	}

}
