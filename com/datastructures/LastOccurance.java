package com.datastructures;

import java.util.Scanner;

public class LastOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tcase;
		int size;
		tcase = sc.nextInt();
		while (tcase-- > 0) {

			size = sc.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}

			int j;
			int quer = sc.nextInt();
			while (quer-- > 0) {
				int temp = sc.nextInt();
				for (j = size - 1; j >= 0; j--) {
					// System.out.println(j);

					if (arr[j] == temp) {
						System.out.println(j + 1);
						// j--;
						break;
					}

				}
				if (j == -1)
					System.out.println("-1");
				/*
				 * if(flag==1) { System.out.println(i); }
				 */

			}
		}

	}

}
