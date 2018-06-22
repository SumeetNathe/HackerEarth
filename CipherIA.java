import java.util.Scanner;

public class CipherIA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] text;

		text = sc.next().toCharArray();
		int k = sc.nextInt();
		for (int i = 0; i < text.length; i++) {

			if (text[i] >= 48 && text[i] <= 57) {
				text[i] = (char) (text[i] + k);
				if (text[i] > 57) {
					text[i] = (char) (text[i] % 57 + 47);
				}
			}

			else if (text[i] >= 65 && text[i] <= 90) {
				char[] newC = new char[text.length];
				newC[i] = (char) (text[i] + k);

				if ((int)newC[i] > 90) {
					int a = newC[i] % 10;
					text[i] = (char) (65 + --a);
				} else
					text[i] = (char) (text[i] + k);
			}

			else if (text[i] >= 97 && text[i] <= 122) {
				char[] newC = new char[text.length];
				newC[i] = (char) (text[i] + k);

				if (newC[i] > 122) {
					int a = newC[i] % 10;
					text[i] = (char) (97 + --a);
				} else
					text[i] = (char) (text[i] + k);

			}
		}

		System.out.println(new String(text));

	}

}
