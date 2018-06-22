import java.util.Scanner;

public class PerfectDivide {

	public static void main(String[] args) {
		int tcase;
		String num;
		Scanner sc  = new Scanner(System.in);
		tcase = sc.nextInt();
		 while(tcase --> 0) {
			 
				 num=sc.next();
				 String temp = Character.toString(num.charAt(num.length()-1)).toString();
				 int n = Integer.parseInt(temp);
			 
			
			 if(n%2==0) {
				 System.out.println("YES");
			 }
			 else{
				 System.out.println("NO");
			 }
		 }

	}

}
