package Inheritance;

class bank
{
	double roi()
	{
		return 0;
	}
}

class ICICI extends bank
{
	double roi()
	{
		return 10.5;
	}
}

class SBI extends bank
{
	double roi()
	{
		return 11.5;
	}
}


public class Overridingdemo {

	public static void main(String[] args) {
		ICICI ic=new ICICI ();
		System.out.println(ic.roi());
		
		SBI sb=new SBI();
		System.out.println(sb.roi());
	}

}
