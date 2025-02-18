package keywords;
		
		final class test1     //keyword used
		{
			final void m()   //keyword used 
			{
				System.out.println("this is m method for test1");
			}
		}
		
		class test2 extends test1 // this method cannot be extend as child class because of final keyword
		{
			void m()       // this method cannot be override because of final keyword
			{
				System.out.println("this is m mrthod for test2");
			}
		}
		
		
		public class finalkeyword2 {
		
			public static void main(String[] args) {
			
		
			}

}
