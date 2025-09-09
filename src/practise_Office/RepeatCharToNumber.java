package practise_Office;

public class RepeatCharToNumber {

	public String multipleCharinString(String input)
	{
		StringBuffer output = new StringBuffer();
		int count=0;
		for(int i=1; i<input.length(); i++)
		{
			char character = input.charAt(i);
			
			if(input.charAt(i)== input.charAt(i-1))
			{
				count++;
			}
			else
			{
				if(count >0)
				{
				output.append(count);
				}
				output.append(character);
				count =0;
			}
		}
		
		if(count >1)
		{
			output.append(count);
		}
		
		return output.toString();
	}	
	
	
	public static void main(String[] args) {
		
		RepeatCharToNumber t = new RepeatCharToNumber();
		System.out.println(t.multipleCharinString("pasjjjjrrrritttoiiiii"));
	}

}
