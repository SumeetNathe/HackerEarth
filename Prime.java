import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int num,count=0;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int j;		
		for(int i = 2; i <= num; i++)
		{
			for(j = 2; j <= i; j++)
			{
				if(i%j==0) {
					break;
				}
				
			}
			if(j==i)
				System.out.println(i);
			
		}

	}

}
