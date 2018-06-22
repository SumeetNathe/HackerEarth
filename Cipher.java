import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		text = sc.next();
		int len = text.length();
		char [] copy = new char[len];
		while(len>=0) {
			//&&Integer.parseInt(text.charAt(i))
			
			for(int i=0;i<text.length();) {
				char temp = copy[i];
				System.out.println(temp);
				int asc = (int) temp;
				System.out.println(asc);
				while(asc>64&&asc<123) {
					asc=+4;
					System.out.println(asc);
					String remp = Character.toString ((char) asc);
					System.out.println(remp);
					copy[i]=remp.charAt(0);
					System.out.println(copy[i]);
					i++;
				}
					len--;		
			}
			for (int i = 0; i < copy.length; i++) {
				System.out.println(copy[i]);
			}
						
		}
	}

}
