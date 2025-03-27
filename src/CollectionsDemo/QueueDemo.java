package CollectionsDemo;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
	
		PriorityQueue<Object> q =new PriorityQueue<>();   		//only allow homogenious data
		//LinkedList<Object>q = new LinkedList<>();  			//only differnce is is allow hetroginous data 
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");	
		q.add(100); 							//only allow homogenious data

//		System.out.println(q);

		//get head element 
//		System.out.println(q.element());			//when queue is empty returns exception
//		System.out.println(q.peek());				//when queue is empty returns null
//		
		//Remove and return the header element 
//		System.out.println(q.remove());				//when queue is empty returns exception
//		System.out.println(q);
		
		
//		System.out.println(q.poll());				
//		System.out.println(q);						//when queue is empty returns null 
		

//		Iterator<String> it= q.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		for(Object ele:q)
		{
			System.out.println(ele);
		}
		
		
		
		
		
	}

}
