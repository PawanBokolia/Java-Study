package study;

public class Equalsmethod_anddoubleequalstwo {
	public static void main(String[] args) {

		String a = new String("pawan");
		String b ="pawan";
		String c = b;

		System.out.println(a.equals(b));     // true
		System.out.println(a==b);          // false
		System.out.println(a.equals(c));     // true
		System.out.println(b==c);            // true
		System.out.println(b.equals(c));     //true
		
		
	}
}
