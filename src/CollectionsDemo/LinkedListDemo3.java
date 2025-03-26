package CollectionsDemo;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String []args) {
		
		LinkedList<String> l = new LinkedList<>();
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");
		
		System.out.println(l);
		
		l.addFirst("tiger");
		l.addLast("Elephant");
		
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println("After removing first and last method"+l);
		
		
		
		
		
	}
}
