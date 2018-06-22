import java.util.Scanner;

public class Exceed42Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			num = sc.nextInt();
			if (num != 42) {
				System.out.println(num);
			}
		} while (num != 42);
	}
}
