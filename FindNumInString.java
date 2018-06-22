import java.util.Scanner;

public class FindNumInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc;
		tc = sc.nextInt();

		while (tc-- > 0) {
			int count = 0;

			int len = sc.nextInt();

			String str = sc.next();
			for (int i = 0; i < str.length();) {
				if (Character.isDigit(str.charAt(i))) {
					while (i < str.length() && Character.isDigit(str.charAt(i))) {
						i++;
					}
					count++;
				} else {
					i++;
				}
			}
			System.out.println(count);
		}

	}

}
