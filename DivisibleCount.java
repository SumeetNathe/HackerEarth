import java.util.Scanner;

public class DivisibleCount {
	public static void main(String[] args) {
	
		int first,last,divisor,count=0;
		
		Scanner sc = new Scanner(System.in);
		
		first = sc.nextInt();
		last = sc.nextInt();
		divisor = sc.nextInt();
		
	while(first<=last) {
			if(first%divisor==0) {
				count++;
			}
			first++;
		}
		System.out.print(count);
		
	}

}
