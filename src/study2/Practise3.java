package study2;

import java.util.Arrays;

public class Practise3 {

	public static void main(String args[]) {

		String name = "My name is pawan";
		
		String split[] = name.split(" ");
		StringBuffer output = new StringBuffer();
		
		for(String a : split)
		{
			char character[] = a.toCharArray();
			char reverse[] = new char[character.length]; 
			
			for(int i=0;i<character.length;i++)
			{
				reverse[i] = character[character.length-1-i];
			}
			output.append(reverse).append(" ");
		}
		
		
		System.out.println(output);
		
		String split2 [] = output.toString().split(" ");
		String reverse2 [] = new String[split2.length];
		
		for(int i =0 ;i<split2.length;i++)
		{
			reverse2[i] = split2[split2.length-1-i];
		}
		
		
		
		
		System.out.println(Arrays.toString(reverse2));
		
	}
}
