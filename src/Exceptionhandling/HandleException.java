package Exceptionhandling;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		System.out.println("programing is started .......");
		Scanner sc=new Scanner (System.in);

		int num=sc.nextInt();
		
		try 
		{
		System.out.println(100/num); 
		}
		catch(ArithmeticException e)
		{
			System.out.println("invalid data");
		}
		
		
		
		System.out.println("program is completed ");
		System.out.println("program is exited");
				
	}

}
