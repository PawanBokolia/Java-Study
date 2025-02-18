package keywords;

class Test 
{
	final int x = 100;
}

public class final_keyword {

	public static void main(String[] args) {
			
		Test t=new Test ();
	//	t.x=200;						// you cannot change tha value of the variable if use final keyword
		System.out.println(t.x);
	
		
		
		
		
	}

}
