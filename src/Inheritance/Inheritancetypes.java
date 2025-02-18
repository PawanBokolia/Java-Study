package Inheritance;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A    // using extends keyword for access class A
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}	

class C extends B   //multi level inheritance 
{
	int c;
	void print()
	{
		System.out.println(c);
	}
}
	


public class Inheritancetypes {
	
	public static void main(String[] args) {
	
/*		B obj=new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.display();
		obj.show();
*/
		
		C cobj= new C();
		cobj.a=100;
		cobj.b=200;
		cobj.c=300;
		
		cobj.display();
		cobj.show();
		cobj.print();
	
	}

}
