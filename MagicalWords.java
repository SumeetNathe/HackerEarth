import java.util.Scanner;

public class MagicalWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char text [];
		
		text = sc.next().toCharArray();
		for(int i = 0;i<=text.length;) {
			int ascii = text[i];
			for(int j= 1;j<=ascii/2;j++) {
				if(ascii%j!=0) {
					System.out.println((char)text[i]);
				}
				else {
					i++;
					break;
				}
			}
		}

	}

}
