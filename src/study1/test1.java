package study1;

public class test1 {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	public static void main (String []args) {
		String input ="asdv3ojk5iio6";
		
		StringBuffer output = new StringBuffer();
		
		
		for(int i=0; i<input.length();i++)
		{
			char ch = input.charAt(i);
			
			if(Character.isDigit(ch))
			{
				int repeat = Character.getNumericValue(input.charAt(i));
				char value = input.charAt(i-1);
				
				for(int j=0;j<repeat;j++)
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
