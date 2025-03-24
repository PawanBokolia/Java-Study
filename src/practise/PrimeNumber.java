package practise;

public class PrimeNumber {


	static boolean ispimeno(int a)
	{
		if(a<=1)
		{
			return false;
		}
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			return false;
		}
		return true;
	}
	
	public static void main (String args[]) {
	
		int arr[]= {2,5,6,7,6,8,9};
		
		for(int a : arr)
		{
			if(ispimeno(a))
			{
				System.out.println("prime no ");
			}
			
			else 
			{
				System.out.println("not prime number");
			}
			
		}
		
		
		
		
		
	}
}
