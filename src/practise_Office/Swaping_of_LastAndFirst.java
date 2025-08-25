package practise_Office;

public class Swaping_of_LastAndFirst {

	public static void main(String args[]) {
		
		String input = "Hello I am Pawan";
		StringBuffer output = new StringBuffer();

		String arr[] = input.split(" ");

		String temp =arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		
		for(int i=0; i<arr.length; i++)
		{
			output.append(arr[i]).append(" ");
		}
		
		System.out.println(output.toString());

		
		
		
		
	}
	
}
