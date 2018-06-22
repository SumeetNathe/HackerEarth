package com.datastructures;

import java.util.Scanner;

public class HappinessSumit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size, tcase, sum = 0;
		tcase = sc.nextInt();
		while (tcase-- > 0) {
			size = sc.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
				sum = sum + arr[i];
			}
			System.out.println(sum);
		}

	}

}
