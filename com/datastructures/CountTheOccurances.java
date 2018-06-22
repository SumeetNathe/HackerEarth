package com.datastructures;

import java.util.Scanner;

public class CountTheOccurances {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		/*
		 * while (size >= 0) { arr[size] = sc.nextInt(); size--; }
		 */
		
		int quer = sc.nextInt();
		while (quer-- > 0) {
			int count = 0;
			int temp = sc.nextInt();
			for (int i = 0; i < size; i++) {
				if (arr[i] == temp) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(count);
				//count = 0;
			} else
				System.out.println("NOT PRESENT");

		}
	}

}
