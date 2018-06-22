package com.datastructures;

import java.util.Scanner;

public class MarkTheAnswer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		size = sc.nextInt();
		//System.out.println(size);
		int diffLevel = sc.nextInt();
		int count=0;
		int arr[] = new int[size];
		
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<size;i++) {
			if(arr[i]<=diffLevel) {
				count++;
			}
			if(i-count==1)
				break;
		}
		System.out.print(count);
		
 
	}

}
