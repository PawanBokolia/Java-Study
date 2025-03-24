package practise;

import java.util.Arrays;

public class CountString {

	public static void main(String args[]) {

		String name="pawan";
		char c[] = new char[name.length()];
		int count = 0;

		for(int i=0;i<name.length();i++)
		{
			c[i]=name.charAt(i);
			count++;
		}
		
		System.out.println(Arrays.toString(c));
		System.out.println(count);
		

	}
}	
