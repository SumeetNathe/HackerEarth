import java.math.BigInteger;
import java.util.Scanner;

public class PerfectDiv {

	public static void main(String[] args) {
		int tcase;

		Scanner sc = new Scanner(System.in);
		tcase = sc.nextInt();
		while (tcase-- > 0) {

			BigInteger b;
			String num = sc.next();

			b = new BigInteger(num);
			/*BigInteger[] arr;
			arr=b.divideAndRemainder(BigInteger.valueOf(2));
			if(arr[1] == BigInteger.valueOf(0))
				System.out.println("YES");*/
			if(b.divideAndRemainder(BigInteger.valueOf(2))[1]==BigInteger.valueOf(0))
			{
				System.out.println("YES");
			}
			else
				System.out.println("NO");

			
		}

	}

}
