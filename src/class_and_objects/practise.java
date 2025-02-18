package class_and_objects;

import java.util.Scanner;
public class practise {
	int sum(int a, int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		practise p=new practise();
		System.out.println("enter the number ");
		int value1=sc.nextInt();
		int value2=sc.nextInt();
		int value3=sc.nextInt();
		
		int result=p.sum(value1, value2, value3);
		System.out.println(result);
		sc.close();
		
		Student q =new Student();
		q.sid=109;
		q.sname="pawan";
		q.grad='A';
	
		q.printdata();
		
		
	}

}
