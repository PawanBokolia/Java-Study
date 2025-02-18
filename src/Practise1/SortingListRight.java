package Practise1;

import java.util.Arrays;

public class SortingListRight {

	public static void main(String[]args) {
		        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
		        System.out.println("Original Array: " + Arrays.toString(arr));

		        rearrangeEvenOdd(arr);
		        System.out.println("Rearranged Array: " + Arrays.toString(arr));
		    }

		    public static void rearrangeEvenOdd(int[] arr) {
		        int left = 0;
		        int right = arr.length - 1;

		        while (left < right) {
		            // Increment left pointer if it's already pointing to an even number
		            while (left < right && arr[left] % 2 == 0) {
		                left++;
		            }

		            // Decrement right pointer if it's already pointing to an odd number
		            while (left < right && arr[right] % 2 != 0) {
		                right--;
		            }

		            // Swap the odd number on the left with the even number on the right
		            if (left < right) {
		                int temp = arr[left];
		                arr[left] = arr[right];
		                arr[right] = temp;
		            }
		        }
		    }
		

		
		
	}

