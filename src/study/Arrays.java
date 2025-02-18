package study;

public class Arrays {

		public static void main (String[]args) {
			
			//approach 1 
			
		/*	int a[]= new int[5];
			a[0]=100;
			a[1]=200;
			a[2]=500;
			a[3]=854;
			a[4]=123;
			
			//approach 2
			
			int a[]= {100,200,500,400,547,784};  //approach
			
			{
				System.out.println(a.length);    // length of an array
				System.out.println(a[1]);        // here 1 is index no. 
				
			}
			
			
			// reading all the value from array
		    // normal for loops
			
			int a[] ={100,200,300,400,500,};
			
			for (int i=0;i<5;i++) {             //you can use i<a.length or i<=a.length-1
				System.err.println(a[i]);
			}
			
			// enhanced for loop
			
			int a[] ={100,200,300,400,500,100,200,300,400,500,0,200,300,400,500};
			for(int x:a) {
				System.out.println(x);
			}
			
			// two dimensional array
			
			//approach 1
			int a[][]= new int [3][2];      //a[][]   []a[]  [][]a three notation
			
			a[0][0]=100;
			a[0][1]=200;
			
			a[1][0]=300;	
			a[1][1]=500;
			
			a[2][0]=600;
			a[2][1]=700;*/
			
			
			//approach 2
			int a[][]= { {100,200},
			             {500,600},
			             {452,758}
					
			};
			//find size if an array
			//System.out.println("length of rows " +a.length);        // show no. of rows 
			//System.out.println("number of columns "+a[0].length);   // shows no. of columns 
			//System.out.println(a[1][1]);                            // show single value of two dimensional array
			
			// normal for loops
			/*for(int r=0;r<=2;r++)
			{
				for(int c=0;c<=1;c++)
				{
					System.out.print(a[r][c]+" " );
				}*/
			
			// enhanced for loop
			for (int arr[]:a)
			{
				for(int x:arr)
				{
					System.out.println(x+" ");
				}
				System.out.println();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			}

			
		}





