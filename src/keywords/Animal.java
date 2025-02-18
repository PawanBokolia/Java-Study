package keywords;

public class Animal {

	String colour = "white";

	void eat()
	{
		System.out.println("eating......");
	}
 }



class Dog extends Animal {
	String colour = "black";

	void displaucolour() 
	{
		System.out.println(super.colour);  //use this keyword for access immediate parent variable 
	}

	void eat() 
	{
		System.out.println("eating bread......");
		super.eat();  // use this keyword for access immediate parent methods 
	}
}