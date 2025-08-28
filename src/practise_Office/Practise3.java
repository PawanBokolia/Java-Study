package practise_Office;

public class Practise3 {

	public static void main(String args[]) {
		
		String input = "arrrrsettybbbcrscpq";
		StringBuffer output = new StringBuffer();
		
		int count =1;
		for(int i=1; i<input.length(); i++)
		{
			char character = input.charAt(i);
			if(input.charAt(i) == input.charAt(i-1))
			{
				count++;
			}
		
			else
			{
				if(count>1)
				{
					output.append(count);
				}
				output.append(character);			
				
				count =0;
			}
		}
		System.out.println(output);
	
	
	}
}
