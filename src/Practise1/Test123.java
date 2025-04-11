package Practise1;

public class Test123 {

	public static void main (String args[]) {
		
		int arr[]= {1,3,4,1,990,12,3,456,12,90};
		
		int lg=arr[0];
		
		for(int a : arr)
		{
			if(lg < a )
			{
				lg=a;
			}
		}
		 System.out.println(lg);
		
	}
}