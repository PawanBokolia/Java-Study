package practise_Office;

public class ReverseAStringWithSpace {
	public static void main (String args[]) {
		
		String input = "pawan is my name";
		String arr[] = input.split(" ");
		StringBuffer output = new StringBuffer();
		String arr1[] = new String[arr.length];
		for(int i=0; i<arr.length;i++)
		{
			arr1[i] = arr[arr.length-1-i];
			output.append(arr1[i]).append(" ");
		}
		
		System.out.println(output.toString());

	}
}
