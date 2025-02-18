package Day2;

import java.util.Scanner;

public class multiple_input_from_keyboad {
	public static void main(String[]args) {
		
	/*	System.out.println("Enter number 1");
		Scanner sc=new Scanner(System.in);		
		int num1=sc.nextInt();
		System.out.println("Enter number 2");
		int num2=sc.nextInt();
		System.out.println("Addition of two number is "+(num1+num2));   */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name ");
		String name=sc.next();
		System.out.println("enter your age ");
		int age=sc.nextInt();
		System.out.println("Enter your city ");
		String city=sc.next();
		
		System.out.println("your name is " +name);
		System.out.println("your age is "+age);
		System.out.println("your city is "+city);
		
		
		
		
		
		
		
		
	}
}
