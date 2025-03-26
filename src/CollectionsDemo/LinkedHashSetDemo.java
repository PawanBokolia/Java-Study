package CollectionsDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		
		LinkedHashSet<Integer> lset = new LinkedHashSet<>();	//insertion order is preserved
//		HashSet<Integer> lset = new HashSet<>();				//insertion order is not preserved
		
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
		
		
		System.out.println(lset);
		
		
		
		
		
	}
}
