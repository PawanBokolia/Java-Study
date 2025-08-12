package study2;

public class ReverseStringAtSamePosition {

	static char arr[];
	
	public static void main(String ags[]) {
		
		String name ="pawan is my name";

		String arr1[] = name.split(" ");
	
		StringBuffer output = new StringBuffer();
	
		for(String a: arr1)
		{
			char arr[] = a.toCharArray();
			char reverse[] =new char[a.length()];
			
			for(int i=0;i<arr.length;i++)
			{
				reverse[i] = arr[arr.length-1-i];
			}
			
			output.append(reverse).append(" ");
		}
		
		System.out.println(output.toString());
		
		
		
		
		
		
	}
}
