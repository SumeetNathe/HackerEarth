import java.util.Scanner;

public class CipherCorrect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] text;

		text = sc.next().toCharArray();
		int k = sc.nextInt();
		int k1 = k % 10;
		int k2 = k % 26;
		for (int i = 0; i < text.length; i++) {

			if (text[i] >= 48 && text[i] <= 57) {
				text[i] = (char) (text[i] + k1);
				if (text[i] > 57) {
					text[i] = (char) (text[i] - 10);
				}
			}

			else if (text[i] >= 65 && text[i] <= 90) {
				text[i] = (char) (text[i] + k2);
				if (text[i] > 90) {
					text[i] = (char) (text[i] - 26);
				}
			}

			else if (text[i] >= 97 && text[i] <= 122) {
				text[i] = (char) (text[i] + k2);
				if (text[i] > 122) {
					text[i] = (char) (text[i] - 26);
				}
			}
		}

		System.out.println(new String(text));

	}

}
