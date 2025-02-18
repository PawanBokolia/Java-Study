package TypeCasting;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class TypeCastingobject2 {

	public static void main(String[] args) {
		
	//Rule1 :- conversion is valid or not 
	//The types of 'D' and 'C' must have some relationship (either parent to child or child to parent 
		
		
/*		Animal an=new Dog();
		Cat ct =(Cat) an;     //valid as per rule 1 
		
		Dog dg =new Dog ();
		Cat ct=(Cat) dg;  //invalid as per rule 1 


		
	//Rule 2 : Assignment is valid or not 
	//'C' must be either same or child of 'A'
		
		Animal an=new Dog ();
		Cat ct =(Cat) an;     //valid as per Rule 2 
	
		
		Animal an= new Dog();
		Cat ct = (Dog) an;   //invalid as per rule 2 

		
	//rule 3 : 
	//The underlying type of 'D' must be either same of child of 'C'
		
		Animal an=new Dog();
		Cat ct =(Cat) an;       //invalid as per rule 3 
*/		

		
		//Rule 1 ,2,3
		Animal an=new Dog();
		Dog dg =(Dog) an;   //
		
		
		
		
		
		
	}

}
