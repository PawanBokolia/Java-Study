package practise;

import java.util.Scanner;

public class practise6 {
	public static void m1()
	{
	System.out.println("enter a number");
	}

	public static int m2(int a , int b) 
	{
		return a+b;
	}
	public static void main(String[] args) {
		m1();
	Scanner sc=new Scanner(System.in);
	int a =sc.nextInt();
	int b=sc.nextInt();
	int sum = m2(a,b);
	System.out.println(sum);

		
		
		
		
		
		
		
	}
}
