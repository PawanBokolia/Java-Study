package study;

public class search_of_an_element_linearsearch {
		public static void main(String[] args) {
			
			
			//normal loop  														//linear search 
			/*int a[] = {12,56,75,43,6788,4323,7534,85795,30,30};
			boolean status=false;
			int search_element=1;
			for (int i=0;i<a.length;i++) {
				if(a[i]==search_element) {
					System.out.println("number is found "+a[i]);
					status=true;
				     break;
			}
				
			
			}
			
			if(status==false)
			{
				System.out.println("element not found");
			}*/
			
			
			//enhanced loop used 
			int a[] = {12,56,75,43,6788,4323,7534,85795,30,30,0};
			boolean status=false;
			
			for(int x:a)
			{
				if(x==30) {
					System.out.println("element found");
					status=true;
					break;
				}
				
			}
			if(status==false) {
				System.out.println("element not found");
			}
			
		}

	}

	

