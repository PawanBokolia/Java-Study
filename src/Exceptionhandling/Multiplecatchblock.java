package Exceptionhandling;

public class Multiplecatchblock {

	public static void main(String[] args) {
		System.out.println("programe is started");

		String s=null;
		try 
		{
			System.out.println(s.length());
		}
/*		catch(ArithmeticException e)
		{
			System.out.println("handle Exception");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("handle Exception");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("handle Exception");
			System.out.println(e.getMessage());
		}
*/		
		catch(Exception e)
		{
			System.out.println("handle exception");
			System.out.println(e.getMessage());
		}
		
		System.out.println("program Finised......");
		
		
		
		
	}

}
