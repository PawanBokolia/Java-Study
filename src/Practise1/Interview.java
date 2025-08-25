package Practise1;

import java.util.Arrays;

public class Interview {

	public static void main(String args[]) {

		String a = "pawan";

		char rev[] = a.toCharArray();
		char rev2[] = new char[a.length()];
		int j=0;
		for(int i=0;i<a.length();i++)
		{
			rev2[j++] =rev[rev.length-1-i];
		}

		System.out.println(Arrays.toString(rev2));
	}
}