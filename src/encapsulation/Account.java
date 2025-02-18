package encapsulation;

public class Account {
		private int accno;
		private String name;
		private double amount;
		public int getAccno() {
			return accno;
		}
		

	/*	void setAccno(int accno) 
	 	{
			this.accno = accno;  //this keyword is used to define the calss variable
		}

		int getAccno() 
		{
			return accno;
		}
	*/   
		//other method via eclips
		
		public void setAccno(int accno) {
			this.accno = accno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		
		
		
		
		
		
		
}
