package Abstraction;

interface Shape
{
	int length=10;    //final and static 
	int width=20;     //final and static 
	
	void circle();   // abstract method 
	
	default void square() {
		System.out.println("this is default method ");  //default method 
	}
	
	static void rectancle() {
		System.out.println("this is static method  ");   // static method 
	}
}




public class Interfacedemo implements Shape{
	
	public void circle()     //public keyword is used because in interface all the methods are default public methods 
	{
		System.out.println("this is circle ");  
	}
	
	void Triangle() {
		System.out.println("this is a triangle");
	}
	

	public static void main(String[] args) {
		
		
		//scenario 1
/*		Interfacedemo idobj=new Interfacedemo();
		idobj.circle();
		idobj.square();
		
		Shape.rectancle();        //this can be use As static but we have to mention the interface name as it is a part of interface 
		idobj.Triangle();       // can access the method in the Interfacedemo class 
*/		
		
		
		//scenario 2 
		Shape sh = new Interfacedemo();
		sh.circle();          	//abstract 
		sh.square();   			// default
		Shape.rectancle(); 		// static 
		
		// sh.tringle ()  //this can not be call as it is not a part of the interface  
		
		System.out.println(Shape.length * Shape.width); //access static variable directly 
		
		
		
		
		
	}

}
