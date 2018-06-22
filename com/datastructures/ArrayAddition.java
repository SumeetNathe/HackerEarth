package com.datastructures;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		size = sc.nextInt();
		
		int frst [] = new int[size];
		int scnd [] = new int[size];
		//int third [] = new int[size];
		
		for(int i=0;i<size;i++) {
			frst[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			scnd[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print((frst[i]+scnd[i])+" ");
		}
		
	}

}
