package practise;

public class practise1 {
public static int q; 	//global variable which can be use to store value in loop 
	public static void main(String[] args) {
		int a[][]={ {12,23},{45,67},{89,98},{90,98},{23,12},{12,12}  };
		int count=0;
		int b=231;
		for (int z[]:a) {
			for(int x:z) {
					if (x==b) {
						q=x;
						count++;
					}
					
				}
		}
		System.out.println("element found "+q);
		System.out.println("number of element "+count);	
		
	}

}
