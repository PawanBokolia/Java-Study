package study2;

public class FirstWordStaticOtherReverseOrder extends StringBuilderDemo {
	
	public static void main(String args[]) {

		String name="Hello world hello";
		
		String arr[] = name.split(" ");
		
		StringBuffer output = new StringBuffer();
		
		output.append(arr[0]).append(" ");
		
		for(int i=arr.length-1; i>0; i--)
		{
			output.append(arr[i]).append(" ");
		}
	
		System.out.println(output.toString());
		
		
		
		
	}
}
	

