
package practise_Office;

import java.util.Arrays;

public class ShiftingAllZeroToRight {

public static void main(String[] args) {

	int[] inputArray = { 1, 0, 2, 0, 3, 0, 0, 0 };
	
	int newArray[] = new int[inputArray.length];
	

	int count = 0;
	for (int number : inputArray) 
	{
		if (number != 0) 
		{
			newArray[count] = number;
			count++;
		}
	}
	
	System.out.println(Arrays.toString(newArray));

}
}