package practise_Office;

public class RemoveSpaceAndCountVovel {

	public static void main(String args[]) {

		String input  = "pawan bokolia";
		String a[] = input.split(" ");
		
		int vovel=0;
		int consonant=0;
		for(String b: a )
		{
			char c [] = b.toCharArray();
		 
			for(char d: c)
			{
				if(d=='a' ||d=='e'||d=='i'||d=='o'||d=='u')
				{
					vovel++;
				}
				else
				{
					consonant++;
				}
			}
		
		}
		System.out.println("voval : " +vovel);
		System.out.println("consonant :" +consonant);
		
	}

}
