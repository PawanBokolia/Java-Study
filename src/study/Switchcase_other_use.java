package study;

import java.util.Scanner;

public class Switchcase_other_use {
	public static void main(String[]args) {
		
	
	System.out.println("enter a day name ");
	Scanner sc = new Scanner(System.in);
	String day = sc.next();

	switch (day) {

	case "monday":
		System.out.println("day number is = 1");
		break;
	case "tuesday":
		System.out.println("day number is = 2");
		break;
	case "wednessday":
		System.out.println("day number is = 3");
		break;
	case "thursday":
		System.out.println("day number is = 4");
		break;
	case "friday":
		System.out.println("day number is = 5");
		break;
	case "saturday":
		System.out.println("day number is = 6");
		break;
	case "sunday":
		System.out.println("day number is = 7");
		break;
	default:
		System.out.println("invalid input ");

	}

}

}
