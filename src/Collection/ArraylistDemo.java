package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {
	public static void main(String[] args) {

		ArrayList mylist=new ArrayList();
		
		//Adding data into ArrayList
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
/*		//Size if Arraylist 
		System.out.println("Size of an ArrayList "+mylist.size());
		
		
		//printing arraylist 
		System.out.println(mylist);
		
		
		//remove element from arraylist 
		mylist.remove(5);      //5 is the index number 
		System.out.println("After removing"+mylist);
		
		//insert element in the arraylist 
		mylist.add(2, "java");
		System.out.println("after insertion "+mylist);
		
		
		//Modify element int the arrayslist (modify/replace)
		mylist.set(2, "python");
		System.out.println("after replace "+mylist);
		
		
		//access specific element from arraylist
		mylist.get(3);
		System.out.println(mylist.get(3));
		
		
		//Reading all the element from arraylist 
		
		//using normal for loop
		for (int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		
		
		//using enhance /using for each loop
		for (Object x:mylist)
		{
			System.out.println(x);
		}
		
		
		//using iterator 
		Iterator <Object> it= mylist.iterator();  // <Object> type is optional
		
		while(it.hasNext())
		{
		  System.out.println(it.next());
		}
		
		
		//Checking arraylist is empty or not 
		System.out.println("is arraylist is empty"+mylist.isEmpty());
		
*/		
		//Remove all/multiple elements from arraylist 
		ArrayList mylist2=new ArrayList(); //create another arraylist
		
		mylist2.add(100);
		mylist2.add("welcome");
		
		mylist.removeAll(mylist2);
		System.out.println("After removing " +mylist);
		
		
		
		//Remove all the element /clear 
		mylist.clear();
		System.out.println(mylist.isEmpty());
		
		
		
		
	}

}
