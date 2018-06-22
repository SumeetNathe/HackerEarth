package com.datastructures;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ArrayDelay {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int tcase;
		tcase = sc.nextInt();
		while (tcase-- > 0) {
			int size, kval;

			size = sc.nextInt();

			kval = sc.nextInt();

			int arr[] = new int[size];
			int count = 0;
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}

			/*for (int i = 0; i < size;) {
				if (arr[i] >= kval) {
					i++;
					// count=1;
				} else {
					
					TimeUnit.SECONDS.sleep(1);
					//count++;
					arr[i] = arr[i] + 1;
					i++;
				}
				count++;
				
			}*/
			
			Arrays.sort(arr);
			if(arr[0]<kval)
				System.out.println(kval-arr[0]);
			else 
				System.out.println(0);
		}

	}

}
