package practise_Office;

public class Practise1 {

	public static void main(String args[]) {
		
//		String input ="paw6wan3and7";
		String input = "abcrssssssotuuuuuuuklpppppppp";
		StringBuffer output = new StringBuffer();
		int count =1;
		
		for(int i=1; i<input.length(); i++)
		{
			if(input.charAt(i) == input.charAt(i-1))
			{
				count++;
			}
			
			else 
			{
				if(count>1)
				{
					output.append(count-1);
				}
				output.append(input.charAt(i));
				count=1;
			}
		
		}
		
		if(count>1)
		{
			output.append(count-1);
		}
		output.append(input.charAt(input.length()-1));
		
		System.out.println(output.toString());
	
	
	
	}
}
