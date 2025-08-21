	package study2;
	
	public class Practise1 {
	
		public static void main(String args[]) {
	
			String input = "anccccbntttttnnoppppppppp";
			
			StringBuffer output = new StringBuffer();
			int count =1;
			
			for(int i=1; i<input.length(); i++)
			{
				if(i < input.length() && input.charAt(i) == input.charAt(i-1))
				{
					count++;
				}
				
				else 
				{
					if(count>1)
					{
						output.append(count-1);
					}
				
					output.append(input.charAt(i-1));
					
					count =1;
				}
			}
			
			System.out.println(output.toString());
			
			
			
			
			
				
		}
	}
