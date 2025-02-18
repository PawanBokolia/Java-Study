package javaproject2024;

import java.util.Scanner;

public class Project2 {
	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 677, 899, 890, 6, 34, 6, 6, 1, 1 };
		int count = 0;
		int b = 4;
		// Scanner sc = new Scanner(System.in);
		// int b = sc.nextInt();

		for (int x : a) {
			if (x == b) {
				count++;

			}
		}

		System.out.println("number of repition is " + count);

	}
}