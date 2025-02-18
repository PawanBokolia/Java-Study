package class_and_objects;

public class Employee {
	// variable
public	int eid;
public	String name;
public	String job;
public	int sal;

	// methods
public void display() {
		System.out.println(eid+"   "+name+ "   "+job+"   "+sal);
		
	//	System.out.println("employee id is "+eid);
	//	System.out.println("employee name is "+name);
	//	System.out.println("employe job is "+job);
	//	System.out.println("employe salary is "+sal);
	}
/*	public static void main(String[] args) {

		Employee emp1=new Employee();  //object 
		emp1.eid=100;
		emp1.name="john";
		emp1.job="manager";
		emp1.sal=50000;
		emp1.display();
		
		Employee emp2 = new Employee ();
		emp2.eid=101;
		emp2.name="pawan";
		emp2.job="QA";
		emp2.sal=26000;
		emp2.display();
		
		
		
		
	}
*/	
}
