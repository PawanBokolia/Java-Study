package study2;

public class Practise4 {
	public static void main(String args[]) {
		
		String name ="My name is Pawan";
		
		String arr[] = name.split(" ");
		String app[] = new String[arr.length];
		
		StringBuilder word1 = new StringBuilder();

		for(int i=0; i<arr.length;i++)
		{
			app[i] = arr[arr.length-1-i];
			word1.append(app[i]+" ");
			word1.reverse().toString();			
		}
		
		word1.reverse().toString();
		System.out.println(word1);
		
		
	}
}
