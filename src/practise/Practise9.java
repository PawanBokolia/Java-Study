package practise;

public class Practise9 {

	public static void main (String []args) {
	
		int[] a = {1,2,2,2,4,5};
		int count=0;
		int num=2;
		for(int i =0 ;i<a.length-1;i++)
		{
			if(a[i]==num)
			{
				count++;
			}

		}
	
		System.out.println("number of repition of "+num + " is " +count);		
		
		
		
	}
}