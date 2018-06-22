import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String test, reverse="";
		
		test = sc.next();
		//String cmp = new String(test);
		/*
		 * StringBuilder sb = new StringBuilder(test);
		 * 
		 * if((sb.reverse().toString()).equals(test)) { System.out.println("YES"); }
		 */
		for (int i = test.length()-1; i >= 0; i--) {
			reverse = reverse + test.charAt(i);

		}
		
		if(reverse.equals(test)) {
			System.out.println("YES");
		}
	}

}
