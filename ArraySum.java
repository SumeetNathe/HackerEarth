import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int size;
		 long sum = 0;
		 size = sc.nextInt();
		 long  [] arr = new long [size];
		 
		 for(int i = 0;i<size;i++) {
			 
			 arr[i] = sc.nextLong();
			 sum=sum + arr[i];
			 
		 }
		 System.out.println(sum);
	}

}
