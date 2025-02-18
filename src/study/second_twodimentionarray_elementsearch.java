package study;

public class second_twodimentionarray_elementsearch {
	public static int p; 	//global variable which can be use to store value in loop 
	public static void main (String[]args) {
	
	int a[][]= {{45,67},{45,78},{45,70},{76,90} };
	int b=45;
	int count=0;
	for(int x[]:a)
	{
		for(int y:x) 
		{
			if (b==y) 
			{
				count++;
				p=y;
			}		
		}
	}
	
	if (b==p) 
	{
		System.out.println("element is = " +p);
		System.out.println("repetition of element in the arrays is "+count);
	}
	else 
	{
		System.out.println("element not found");
	}

}
}
