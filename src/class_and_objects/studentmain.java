package class_and_objects;

public class studentmain {

	public static void main(String[] args) {
		Student stu1=new Student ();
		stu1.sid=101;
		stu1.sname="kunal";
		stu1.grad='A';
		stu1.printdata();
		 
		Student stu2 =new Student ();
		stu2.sid=102;
		stu2.sname="happy";
		stu2.grad='B';
		stu2.printdata();
		
		System.out.println();
		
		Employee emp1=new Employee();
		emp1.eid=109;
		emp1.name="john";
		emp1.job="clerk";
		emp1.sal=10000;
		emp1.display();
		
		System.out.println();
		
		Employee emp2= new Employee();
		emp2.eid=1098;
		emp2.name="rohit";
		emp2.job="clerk";
		emp2.sal=10987;
		emp2.display();
		
		
		
		
		
		
		

	}

}
