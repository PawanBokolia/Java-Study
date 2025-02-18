package TypeCasting;

//UpCasting -converting value from smaller ---->larger 

//int --->long 
//float--->double


//DownCasting - converting value from larger ---->smaller 

//long---->int
//double----->float



public class TypeCastingConcept {
	public static void main(String[]args) {
		
		//upcasting - automatic------smaller to larger
/*
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		
		float floatvalue=10.5F;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		
		
*/		
		//Downcasting - manually ----larger to smaller 
		
		long longvalue=10000;
		int intvalue=(int) longvalue;
		
		double doublevalue=123.33;
		float floatvalue=(float) doublevalue;
		
		
		//problem with downcasting 
		
		double f=10.5;
		int i =(int) f;
		System.out.println(i);  // output is 10
		
		
		
		
	}
	
}
