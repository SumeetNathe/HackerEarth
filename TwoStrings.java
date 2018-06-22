import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int tcase;
		tcase = sc.nextInt();
		
		while(tcase-->0) {
			String str1 = sc.next();
			String str2 = sc.next();
			char alpha[] = null;
			
			for(int i=0;i<26;i++) {
				alpha [i]= 0;
				
				//alpha[str1.charAt(i)-97]++;
				
			}
			for(int i=0;i<26;i++) {
				System.out.println(alpha[str1.charAt(i)-97]++);
				
			}
		}

	}

}
