package practise;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateinList_viaLoop {

	public static void main (String []args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //Arrays.asList(1,2,3,4,44,44,42,1,1)
		
		list.add(1);
		list.add(12);
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(3);
		
		
		ArrayList<Integer> unlist = new ArrayList<Integer>();
		
		for(Integer num:list)
		{
			if(!unlist.contains(num))
			{
				unlist.add(num);
			}
		}
		System.out.println(unlist);
		
	}
}
