package com.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class MinFrequecyOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tcase = sc.nextInt();
		while (tcase-- > 0) {
			int countOcc = 0;
			int size = sc.nextInt();
			//int count[] = new int[size];
			long arr[] = new long[100001];
			for (int i = 1; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			long arrNew [] = new long[100001];
			Arrays.sort(arr);
			for (int i = 0; i < size;) {

				for (int j = i + 1; j < size; j++) {
					if(arr[i]==arr[j]) {
						countOcc++;
					}
				}
				System.out.println(countOcc);
			}

		}

	}

}
