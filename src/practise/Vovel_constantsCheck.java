package practise;

import java.util.Scanner;

public class Vovel_constantsCheck {

	public static void main(String []args) {
		
		System.out.println("enter any String ");
		Scanner sc = new Scanner(System.in);
		String input =sc.next();
		
		char charArray[] =input.toCharArray();
		
		int count=0;
		int constant =0;
		for(char vovel:charArray)
		{
			if(vovel =='a'|| vovel=='e'|| vovel=='i' || vovel=='o'||vovel=='u')
				count++;
			else
			{
				constant++;
			}
			
		}
		
		if(count==0 && constant==0)
		{
			System.out.println("no vovel & constant is present ");
		}
		
		else if(count>0 && constant>0)
		{
			System.out.println("no of vovel "+count);
			System.out.println("no of constant "+constant);
		}
		
		else if(count>0)
		{
			System.out.println("no of vovel "+count);
		}
		
		else if(constant>0)
		{
			System.out.println("no of constant "+constant);
		}
	
		else
		{
			System.out.println("empty string");
		}
		
		
		sc.close();
		
	}
}
