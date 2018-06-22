package com.datastructures;

import java.util.Scanner;
import java.util.Stack;

public class HandL {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		long size;
		size = sc.nextLong();
		int arr[] = new int[1000];
		
		Stack<Integer> s = new Stack<>();
		arr[0] = sc.nextInt();
		for(int i=1; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		//int temp = arr[]
		for(int i = 0;i<size;i++) {
			
			
			if(s.isEmpty())
				s.push(arr[i]);
			else {
				while(!s.isEmpty() && s.peek()<arr[i]) {
					s.pop();
				}
				s.push(arr[i]);
			}
		}
		int arrNew[] = new int[s.size()];
		int count=0;
		while(!s.isEmpty()) {
			int num = s.pop();
			arrNew[count++]=num;
		}
		for(int i = arrNew.length-1;i>=0;i--) {
			
			System.out.print(arrNew[i]+" ");
		}

	}

}
