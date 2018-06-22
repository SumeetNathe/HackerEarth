import java.util.Scanner;

public class IdenticalStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tcase, flag = 0;
		String frst, second;
		tcase = sc.nextInt();

		while (tcase-- > 0) {
			char [] charA = new char[26];
			frst = sc.next();
			second = sc.next();
			char[] content = new char[100000];
			for (int i = 0; i < frst.length(); i++) {
				content[i] = frst.charAt(i);
			}
			if (frst.length() != second.length()) {
				flag = 0;
			} else {
				for (int i = 0; i < frst.length(); i++) {
					for (int j = 0; j < second.length(); j++) {
						for(int k=0;k<26;k++) {
							if (content[i] == (int) second.charAt(j)) {
								charA[k]++;
								flag = 1;
								break;
							} else {
								flag = 0;
							}
						}
						

					}
					break;
				}
			}

			if (flag == 1) {
				System.out.println("YES");
			}

			else if (flag != 1) {
				System.out.println("NO");
			}
		}

	}

}
