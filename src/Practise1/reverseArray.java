package Practise1;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseArray {
	public static void main (String args[]){
		
		ArrayList<Integer>number=new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,4,5,6,4,5,6,7,8,9));
		ArrayList<Integer>set=new ArrayList<Integer>();
		
		for(int i=0;i<number.size();i++)
		{
			set.add(number.get(number.size()-1-i));
		}
		
		System.out.println(set);
		
		
		
		
		
	}
}
