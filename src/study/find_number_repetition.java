package study;

public class find_number_repetition {

	public static void main(String[] args) {
			int a[] = {12,15,14,12,15,14,5,6,8,1,1,2,2,12,12};
			int count=0;
			int num=12;
			for(int x:a) {
				if(num==x) {
					count++;
				}
			}
			System.out.println(count);
		
		}


	}

