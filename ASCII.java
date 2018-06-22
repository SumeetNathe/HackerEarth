import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		char newc = c.charAt(0);
		int n = (int) newc;
		System.out.println(n);
	}

}
