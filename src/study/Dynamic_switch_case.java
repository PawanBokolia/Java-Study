package study;

import java.util.Scanner;

public class Dynamic_switch_case {

	
		 public static void main (String[]args) {
			 System.out.println("enter a day" );
			 Scanner sc=new Scanner(System.in);
			 String weekday=sc.next();
			 switch (weekday) {
			 case "monday": System.out.println("weekday is 1 "); break;
			 case "tuesday": System.out.println("weekday is 2 ");break;
			 case "wednessday": System.out.println("weekday is 3 ");break;
			 case "thursday": System.out.println("weekday is 4 ");break;
			 case "friday": System.out.println("weekday is 5 ");break;
			 case "saturday": System.out.println("weekday is 6 ");break;
			 case "sunday": System.out.println("weekday is 7 ");break;
			 default: System.out.println("invalid");
			 
			 }
			 
	}

}
