package practise_Office;

import java.util.HashMap;

public class DuplicatesArePresentInArrayOrNot {

	public static boolean duplicate(int[] nums) {
	  	boolean output = false;

			HashMap<Integer, Integer> map = new HashMap<>();
			int count = 1;
			for(int a : nums) 
			{
				map.put(a, map.getOrDefault(a, 0) + 1);
			}

			for(int a : map.keySet()) 
			{
				if (map.get(a)>1)
				{
					count++;
				}
	        }	
				
	            if(count >1)
				{
					output =true;	
				}
				
	            System.out.println(output);
	            return output;
	}

	
	public static void main(String args[]) {

		duplicate(new int[] {2,1,1,3,1,2,3,1,4 });
	}

}
