import java.util.Scanner;

public class ArrayAndQuerry {

	public static void main(String[] args) {
		int size, quer;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		quer = sc.nextInt();
		
		

		int[] arrsum = new int[size+1];
		
		
		for (int i = 1; i <= size; i++) {
			arrsum[i] = arrsum[i - 1] + sc.nextInt();
		}

		for (int i = 1; i <=quer; i++) {
			int f = sc.nextInt();
			int l = sc.nextInt();

			System.out.println((arrsum[l] - arrsum[f-1]) / (l + 1 - f));
		}
	}
}
