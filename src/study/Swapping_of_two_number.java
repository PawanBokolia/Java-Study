package study;

public class Swapping_of_two_number {


		public static void main(String[] args) {

			//swapping of two number  //first method
			
			/*int a =10, b=90;
			System.out.println("before swaping");
			
			System.out.println("before swapping "+a);
			System.out.println("before swapping "+b);
			
			
			System.out.println();
			
			int temp=a;
			a=b;
			b=temp;
			
			System.out.println("after swaping ");
			
			System.out.println("after swapping "+a);
			System.out.println("after swapping "+b);*/
			
			
			//second method
			int a=20, b=30;
            System.out.println("before swaping");
			
			System.out.println("before swapping "+a);
			System.out.println("before swapping "+b);
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.err.println();
			System.out.println("after swaping ");
			
			System.out.println("after swapping "+a);
			System.out.println("after swapping "+b);
			
			
			
			
			
		}

	}



