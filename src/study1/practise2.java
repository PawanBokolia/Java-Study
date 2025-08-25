package study1;

public class practise2 {

	public static void main(String args[]) {
			
		String input ="232a231b467t";
		StringBuffer output = new StringBuffer();
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			
			if(Character.isAlphabetic(ch))
			{
				char value = input.charAt(i);
				int repeat = Character.getNumericValue(input.charAt(i-1));
					
				for(int j=0;j<repeat; j++)
				{
					output.append(value);
				}
			}
			else
			{
				output.append(ch);
			}
			
		}
		
		System.out.println(output);
		
		
		
		
		
		
		
	}
}	
