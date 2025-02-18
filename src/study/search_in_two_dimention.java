package study;

public class search_in_two_dimention {
	public static void main(String[]args) {
		
		int a[][]= {{1,90,45},{678,876,9},{5,2,8},{90,1,12}};
		int c=90;
		//int count=0;
		boolean status=false;
		
		
		for (int z[]:a) {
			for(int x:z) {
				if(x==c) {
					System.out.println("element found");
					status=true;
				}break;
				
			}//break;
		}
		if(status == false) {
			System.out.println("element not found");
		}
			
			
			
	}
	}

