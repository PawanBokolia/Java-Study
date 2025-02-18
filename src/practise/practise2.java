package practise;

import java.util.Scanner;

public class practise2 {
public static void main(String[]args) {
	
	/*Scanner sc=new Scanner (System.in);
	
	System.out.println("enter a name" );
	String name=sc.next();
	String weekday;
	switch(weekday) {
	case monday: "week day 1 " ; break;
	case tuesday: "week day 2 " ; break;
	case wednessday: "week day 3 " ; break;
	case Thursday: "week day 4 " ; break;
	case Friday: "week day 5 " ; break;
	case Saturday: "week day 6 " ; break;
	case Sunday: "week day 7 " ; break;
	Default :"invalid input ";
	}
	System.out.println(weekday);*/

	
	
	
	  
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a weekday: ");
	        String weekday = sc.nextLine();
	        int dayNumber;

	        switch (weekday) {
	            case "monday":
	                dayNumber = 1;
	                break;
	            case "tuesday":
	                dayNumber = 2;
	                break;
	            case "wednesday":
	                dayNumber = 3;
	                break;
	            case "thursday":
	                dayNumber = 4;
	                break;
	            case "friday":
	                dayNumber = 5;
	                break;
	            case "saturday":
	                dayNumber = 6;
	                break;
	            case "sunday":
	                dayNumber = 7;
	                break;
	            default:
	                dayNumber = -1;
	                break;
	        }
	        if (dayNumber != -1) {
	        	System.out.println(dayNumber);
	        	}
	        else {
	        	System.out.println("invalid");
	        }
	    }
	
	
	
	}
	

