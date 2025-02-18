package practise;

import java.util.Arrays;

public class RemoveDuplicationInArray_loop {

	public static void main (String []args) {
		int number[]= {1,2,1,2,3,45,5,5,};
		int unarray[]= new int [number.length];
		int j=0;
		Arrays.sort(number);
		for(int i=0;i<number.length;i++)
		{
			if(i==0 || number[i]!=number[i-1] )
			{
				unarray[j++]=number[i];
			}
		}
		int unarray2[]= Arrays.copyOf(unarray, j);
		System.out.println(Arrays.toString(unarray2));
		
		
	}
}
