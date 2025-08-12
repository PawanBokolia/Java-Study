package study2;

public class ImportantnumberMethod {

	public static void main(String[] args) {
	
		String arr ="paw6wan3and7";
		
		StringBuffer output = new StringBuffer();
		
		for(int i=0; i<arr.length();i++)
		{
			char character = arr.charAt(i);
			
			if(Character.isDigit(character))
			{
				char before =arr.charAt(i-1);
				int repeat = Character.getNumericValue(character);
				
				for(int j=0;j<repeat;j++)
				{
					output.append(before);
				}
			}
			else
			{
				output.append(character);
			}
			
			
		}
		System.out.println(output.toString());
		
		
		
		
	}
}
