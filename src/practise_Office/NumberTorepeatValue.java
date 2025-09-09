package practise_Office;

public class NumberTorepeatValue {
	
	public String repeatvalue(String input){

		StringBuffer output = new StringBuffer();
		for(int i=0;i<input.length();i++)
		{
			char character = input.charAt(i);
			
			if(Character.isDigit(character))
			{
				int repeat = Character.getNumericValue(character);
				char value = input.charAt(i-1);
				
				for(int j =0; j<repeat-1;j++)
				{
					output.append(value);
				}
			}
			else {
				output.append(character);
			}
		}

		return output.toString();
	
	
	}

	public static void main(String args[]) {
		NumberTorepeatValue p = new NumberTorepeatValue();
		
		System.out.println(p.repeatvalue("paaww4itu5"));
		
		
		
		
		
		
		
	}
}