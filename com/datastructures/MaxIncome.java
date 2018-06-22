package com.datastructures;

import java.util.Scanner;

public class MaxIncome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tcase = sc.nextInt();
		while (tcase-- > 0) {
			int size, rs;
			size = sc.nextInt();
			rs = sc.nextInt();
			int arr[] = new int[size];

			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			int count = 1;
			int temp = arr[0];
			//System.out.println(temp);
			for (int i = 1; i < size; i++) {
				if (temp < arr[i]) {
					temp=arr[i];
					//System.out.println(temp);

					count++;
				}
			}
			System.out.println(count * rs);
		}

	}

}
