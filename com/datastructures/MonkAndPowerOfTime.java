package com.datastructures;

import java.util.Scanner;

public class MonkAndPowerOfTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int idealArr [] = new int[n];
		
		for(int i = 0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<n;i++) {
			idealArr[i] = sc.nextInt();
		}
		
	}

}
