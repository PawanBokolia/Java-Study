package Exceptionhandling;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("program started ......");
		System.out.println("program is in process......");
		
	
		//try throws keyword
		Thread.sleep(5000);
		
		
		
/*		try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
*/		
		
		
		
		System.out.println("program is finished ..........");
		System.out.println("program exited..........");
		
	}

}
