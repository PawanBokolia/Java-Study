package methods;

public class studentmain {

	public static void main(String[] args) {
		student stu = new student ();
		
/*		//1) using object reference variable 
		stu.sid=101;
		stu.sname="john";
		stu.grad='A';
		
		stu.printstudentdata();
*/		
		//2) using method 
		stu.setstudentdata(101, "pawan", 'A');
		stu.printstudentdata();
		
		
		
		
		
	}

}
