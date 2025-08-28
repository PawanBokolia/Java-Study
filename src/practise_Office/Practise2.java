package practise_Office;

public class Practise2 {

	public static int output (int  input)
	{
		while(input >=10)
		{
			int sum =0;
			while (input>0)
			{
				sum += input%10;
				input /= 10;
			}
			input = sum;
		}
		return input ;
	}
	
	
	
	public static void main(String args[]) {
		System.out.println( output(87098));
		
		
		
		
	}
}
