import java.util.Scanner;

public class RoyAndProPic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length, width, height, tcase;

		length = sc.nextInt();
		tcase = sc.nextInt();

		while (tcase-- > 0) {
			width = sc.nextInt();
			height = sc.nextInt();

			if(width==height && width>length) {
				System.out.println("ACCEPTED");

			}
			else if (length > width || length > height && width<=1) {
				System.out.println("UPLOAD ANOTHER");
			} else if (length < width || length < height) {
				System.out.println("CROP IT");
			} 
			else{
				System.out.println("ACCEPTED");

			}
		}

	}

}
