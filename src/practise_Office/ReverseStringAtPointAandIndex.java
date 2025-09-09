package practise_Office;

public class ReverseStringAtPointAandIndex {

	public static void main(String[] args) {
		
		String input = "pawan is my name";
		String arr[] = input.split(" ");
		
		StringBuffer output = new StringBuffer();
		
		for(String a : arr)
		{
			char newarray[] = a.toCharArray();
			
			for(int j=a.length()-1; j>=0; j--)
			{
					output.append(newarray[j]);
			}
			
			output.append(" ");
		}
		
		StringBuffer output1 = new StringBuffer();
		
		String arr1[] = output.toString().split(" ");
		for(int i =arr1.length-1; i>=0; i-- )
		{
			output1.append(arr1[i]).append(" ");
		}
		
		
		
		System.out.println(output1);
		
		
		
		
		

	}

}
