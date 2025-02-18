package practise;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAList {

	public static void main(String args[]) {
	ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(12,3,22,55,68,9));
	ArrayList<Integer> rev = new ArrayList<Integer>();
	
	for(int i=0;i<number.size();i++)
	{
		 rev.add(number.get(number.size()-1-i));
	}
	
	System.out.println(rev);
	
	}
}
