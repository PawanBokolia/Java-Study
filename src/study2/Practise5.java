package study2;

public class Practise5 {

	public static void main(String args[]) {
/*		
		String input = "My name is pawan";
		String arr[] = input.split(" ");
		ArrayList<String> list = new ArrayList<>();
		
		StringBuffer output = new StringBuffer();		
		for(int i=0; i<arr.length; i++)
		{
			list.add(arr[arr.length-1-i]);
		}
		
		System.out.println(list);
		
		for(String a : list )
		{
			char reverse[] = a.toCharArray();
			char arr1[] = new char[reverse.length];
			
			for(int i=0; i<reverse.length; i++)
			{
				arr1[i] = reverse[reverse.length-1-i];
			}
			output.append(arr1).append(" ");
		}
		
		System.out.println(output.toString());

*/		
	
/*		// Dont change the order and reverse 
		StringBuffer output = new StringBuffer();		
		for(int i=0; i<arr.length; i++) 
		{
			char charArray[] = arr[i].toCharArray();
			char reverse [] = new char[charArray.length];
			
			for(int j=0; j<charArray.length; j++)
			{
				reverse[j] = charArray[charArray.length-1-j];
			}
			
			
			output.append(reverse).append(" ");
			
		}
		
		System.out.println(output);
*/			

/*		
		// get bfore number and duplicate the character
		String input = "123a697b098p";
		StringBuffer output = new StringBuffer();	
		for(int i=0; i<input.length(); i++)
		{
			char character = input.charAt(i);
			
			if(Character.isAlphabetic(character))
			{
				int repeat = Character.getNumericValue(input.charAt(i-1));
				char value = character;
				
				for(int j=0; j<repeat; j++)
				{
					output.append(value);
				}
			}
			else 
			{
				output.append(character);
			}
		}
		System.out.println(output);
		
*/			
		
		
/*		// number to multiple character
		String input = "abcrs5otu6klp7";
		StringBuffer output = new StringBuffer();
		for(int i=0; i<input.length(); i++)
		{
			char charcter = input.charAt(i);
			
			if(Character.isDigit(charcter))
			{
				int repeat = Character.getNumericValue(charcter);
				char value = input.charAt(i-1);
				
				for(int j =0; j<repeat; j++)
				{
					output.append(value);
				}
			}
			else
			{
				output.append(charcter);
			}
		}
		
		System.out.println(output);
*/		
		String input = "abcrssssssotuuuuuuuklpppppppp";
		StringBuffer output = new StringBuffer();
		int count =1;
		for(int i=1; i<input.length(); i++)
		{
			char character = input.charAt(i-1);
			
			if(input.charAt(i)==input.charAt(i-1))
			{
				count++;
			}
			else
			{
				if(count>1)
				{
					output.append(count-1);
				}	
				output.append(character);
				count =1;
			}
		}
		
				
		if (count > 1) 
		{
		    output.append(count-1);
		}
		output.append(input.charAt(input.length() - 1));

		System.out.println(output);
		
	
		
		
		
		
		
		
		
		
		
	}
}
