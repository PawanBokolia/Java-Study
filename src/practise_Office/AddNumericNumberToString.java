package practise_Office;

public class AddNumericNumberToString {

	public static void main(String args[]) {
		
		String input ="aaccciiippwsswsssw";
		int count =0;
		StringBuffer output = new StringBuffer();
		
		for(int i=1; i<input.length();i++)
		{
			
			if(input.charAt(i) == input.charAt(i-1))
			{
				count++;
			}
		
			else
			{
				 output.append(input.charAt(i - 1)); // fix here

				 if (count > 0) 
				 {
	                output.append(count);
	             }
	                count = 0;	               
			}
		
		}
		
		if(count>1)
		{
			output.append(input.charAt(input.length()-1)).append(count);
		}
		else
		{
			output.append(input.charAt(input.length()-1));
		}
	
		System.out.println(output);
		
	}
}

