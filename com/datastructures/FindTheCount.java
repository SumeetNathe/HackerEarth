package com.datastructures;

import java.util.Scanner;

public class FindTheCount {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int count=0;
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
			//System.out.println(arr[i]);
		}
		
		for(int i=0;i<size;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
