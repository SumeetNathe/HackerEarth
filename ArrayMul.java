import java.util.Scanner;

public class ArrayMul {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		long res = sc.nextLong();
		//long[] arr = new long[n];
		for(int i=1;i<n;i++) {
			res = res * sc.nextLong();
			res = res %(1000000007);
		}
		
		
		
		System.out.println(res);
	}
}
