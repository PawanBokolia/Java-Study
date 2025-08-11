package study2;

import java.util.*;

public class StringBuilderDemo {

	public static void main(String args[]) {

		String name = "my name is pawan";

		String words[] = name.split(" ");

		/*
		 * for(int i =0; i<word.length; i++) { reverseWord[i] = word[word.length-1-i]; }
		 * 
		 * System.out.println(Arrays.toString(reverseWord));
		 */
		StringBuilder result = new StringBuilder();

		for(String word : words)
		{
			 String reversedWord = new StringBuilder(word).reverse().toString();
			 result.append(reversedWord).append(" ");
			
		}
		
		
		System.out.println(result.toString());

		
		System.out.println("this is new text");
	}
}