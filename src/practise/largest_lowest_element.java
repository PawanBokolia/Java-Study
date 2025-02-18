package practise;

public class largest_lowest_element {
	public static void main(String[] args) {
	
		int element []= {1,2,3,4,78,2,60,70,80,1,0,100,};

		int a = element[0];
		int b= element[0];
		for(int i =0; i<element.length;i++)
		{
			if(element[i]>a)
			{
				a=element[i];
			}
		}
		System.out.println("The largest element in the array is: " + a);
		
		for(int i=0;i<element.length;i++)
		{
			if(element[i]<b)
			{
				b=element[i];
			}
		}
		
		System.out.println("The smallest element in the array is: " + b);
		
		
		
		
		
		
		
	}
}