package practise;

import java.util.Scanner;

		class emp{
			String name;
			int empno;
			String dep;
			
		}

		class salary extends emp{
			double a;
			double b;
			double inc (double a ,double b ) {
				return ((a-b)/b)*100;
				}
			final void display(){
				System.out.println("your name is "+name);
				System.out.println("your employee id "+empno);
				System.out.println("your department is "+dep);
				System.out.println("your current salary is "+b);
				System.out.println("your incremented salary is "+a);
			}
		}

		public class practise7 {
			public static void main (String []args) {
				Scanner sc=new Scanner(System.in);
				
				salary obj =new salary();
				System.out.println("enter your name ");
				obj.name=sc.next();
				System.out.println("enter employe id ");
				obj.empno=sc.nextInt();
				System.out.println("enter your department ");
				obj.dep=sc.next();
				System.out.println("enter your salary ");
				obj.b=sc.nextDouble();
				
				System.out.println("enter your incremented salary ");
				obj.a=sc.nextDouble();
				
				
				double increment =obj.inc(obj.a,obj.b);
				
				System.out.println("your increment is " +increment);
				obj.display();
				sc.close();
			}
			
		}




